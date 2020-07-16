package com.bioblu.first_law;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bioblu.controllers.OuvinteDeToque;
import com.bioblu.R;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

import static com.bioblu.main.activity_voiceRate.FILE_NAME;

public class activity_questao extends AppCompatActivity {
    /*criando variáveis para ImageView */
    private TextView textViewFilho1, textViewFilho2, textViewFilho3, textViewFilho4, textView4  , cruzamento;
    public ImageView filho1, filho2, filho3, filho4;
    public int screenWidth;
    public int screenHeight;
    private String d, d1, c1, d2, c2, d3, c3, d4, c4,g1 ,g2 ,g3 ,g4;
    private String numero_questao, res , conteudoQuestao;
    private String resposta[] = new String[4];
    int y;
    private TextToSpeech textToSpeech;
    public float velocidade;
    private String questao;
    private SensorManager sensorManager;
    private Sensor proximitySensor;
    private SensorEventListener proximitySensorListener;
    private String questao_1;
    private String questao_2;
    private String questao_3;
    private String questao_4;
    private String questao_5;
    private String questao_6;
    private String questao_7;
    private String questao_8;
    private String questao_9;
    private String questao_10;
    private String questao_11;
    private String questao_12;
    private String questao_13;
    private String questao_14;
    private String questao_15;
    private String questao_16;
    private String questao_17;
    private String questao_18;
    private String questao_19;
    private String questao_20;
    private String questao_21;
    private String questao_22;
    private String questao_23;
    private String questao_24;
    private String questao_25;
    private String questao_26;
    private String questao_27;
    private String questao_28;
    private String questao_29;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao);
        Bundle dados = getIntent().getExtras();

        textViewFilho1 = findViewById(R.id.tetxViewF1_questao1law);
        textViewFilho2 = findViewById(R.id.tetxViewF2_questao1law);
        textViewFilho3 = findViewById(R.id.tetxViewF3_questao1law);
        textViewFilho4 = findViewById(R.id.tetxViewF4_questao1law);
        textView4 = findViewById(R.id.textView_questao1law);
        cruzamento = findViewById(R.id.textViewCRUZ);
        filho1 = findViewById(R.id.imageViewF1_questao1law);
        filho2 = findViewById(R.id.imageViewF2_questao1law);
        filho3 = findViewById(R.id.imageViewF3_questao1law);
        filho4 = findViewById(R.id.imageViewF4_questao1law);
        questao_1 = getString(R.string.questao_1);
        questao_2 = getString(R.string.questao_2);
        questao_3 = getString(R.string.questao_3);
        questao_4 = getString(R.string.questao_4);
        questao_5 = getString(R.string.questao_5);
        questao_6 = getString(R.string.questao_6);
        questao_7 = getString(R.string.questao_7);
        questao_8 = getString(R.string.questao_8);
        questao_9 = getString(R.string.questao_9);
        questao_10 = getString(R.string.questao_10);
        questao_11 = getString(R.string.questao_11);
        questao_12 = getString(R.string.questao_12);
        questao_13 = getString(R.string.questao_13);
        questao_14 = getString(R.string.questao_14);
        questao_15 = getString(R.string.questao_15);
        questao_16 = getString(R.string.questao_16);
        questao_17 = getString(R.string.questao_17);
        questao_18 = getString(R.string.questao_18);
        questao_19 = getString(R.string.questao_19);
        questao_20 = getString(R.string.questao_20);
        questao_21 = getString(R.string.questao_21);
        questao_22 = getString(R.string.questao_22);
        questao_23 = getString(R.string.questao_23);
        questao_24 = getString(R.string.questao_24);
        questao_25 = getString(R.string.questao_25);
        questao_26 = getString(R.string.questao_26);
        questao_27 = getString(R.string.questao_27);
        questao_28 = getString(R.string.questao_28);
        questao_29 = getString(R.string.questao_29);


        /* tratamento de erro da api de fala */
        textToSpeech = new TextToSpeech(activity_questao.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                ler_velocidade();
                if (status != TextToSpeech.ERROR) {
                    textToSpeech.setLanguage(Locale.getDefault());
                    textToSpeech.setSpeechRate(velocidade);
                    textToSpeech.speak(questao, TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });


        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        proximitySensor = sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);

        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        proximitySensorListener = new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent sensorEvent) {
                if(sensorEvent.values[0] < proximitySensor.getMaximumRange()){
                    textToSpeech.speak("", TextToSpeech.QUEUE_FLUSH, null);
                }
            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int i) {

            }
        };


        sensorManager.registerListener(proximitySensorListener, proximitySensor, 2* 1000* 1000);

        /** Pega o Tamanho da tela do Celular Para a Classe OuvinteDeToque**/
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        screenWidth = displayMetrics.widthPixels;
        screenHeight = displayMetrics.heightPixels;
        y = 12;
        questao = dados.getString("q");
        res = dados.getString("r");
        numero_questao = dados.getString("questao");
        conteudoQuestao = dados.getString("cruzamento");
        textView4.setText(questao);
        cruzamento.setText(conteudoQuestao);

        resposta = res.split(",");
        initTela();

    }

    @SuppressLint("ClickableViewAccessibility")
    private void initTela() {

        RelativeLayout Rlayout = findViewById(R.id.relativeLayout_solve_and_send_question);

        Rlayout.setOnTouchListener(new OuvinteDeToque(this, screenWidth, y) {

            @Override
            public void LGesture() {
                finish();
                Intent intent = new Intent(getApplicationContext(), activity_menu.class);
                startActivity(intent);
            }

            @Override
            public void doubleTap(){
                textToSpeech.speak(questao_1+" "+escolhafala, TextToSpeech.QUEUE_FLUSH, null);
                if (x >= 1 && escolha != null) {
                    if (x == 1) {
                        c1 = escolha;
                    } else if (x == 2) {
                        d1 = escolha;
                        g1 = c1 + d1;
                        if (c1.equals("A") && d1.equals("A")) {

                            if (g1.equals(resposta[0])) {
                                filho1.setImageResource(R.drawable.quadrado_normal);
                                textViewFilho1.setText("AA");
                                textToSpeech.speak(questao_2, TextToSpeech.QUEUE_FLUSH, null);
                                textToSpeech.speak(questao_5, TextToSpeech.QUEUE_FLUSH, null);
                                ho++;
                            }else {
                                x = x - 2;
                                textToSpeech.speak(questao_6, TextToSpeech.QUEUE_FLUSH, null);
                            }
                        } else if (c1.equals("a") && d1.equals("A") || c1.equals("A") && d1.equals("a")) {

                            if (g1.equals(resposta[0])) {
                                filho1.setImageResource(R.drawable.quadrado_normal);
                                textViewFilho1.setText("Aa");
                                textToSpeech.speak(questao_3, TextToSpeech.QUEUE_FLUSH, null);
                                textToSpeech.speak(questao_5, TextToSpeech.QUEUE_FLUSH, null);
                                he++;
                            }else {
                                x = x - 2;
                                textToSpeech.speak(questao_7, TextToSpeech.QUEUE_FLUSH, null);
                            }
                        } else if (c1.equals("a") && d1.equals("a")) {

                            if (g1.equals(resposta[0])) {
                                filho1.setImageResource(R.drawable.quadrado_preenchido);
                                textViewFilho1.setText("aa");
                                re++;
                                textToSpeech.speak(questao_4, TextToSpeech.QUEUE_FLUSH, null);
                                textToSpeech.speak(questao_5, TextToSpeech.QUEUE_FLUSH, null);
                            }else{
                                x = x - 2;
                                textToSpeech.speak(questao_8, TextToSpeech.QUEUE_FLUSH, null);
                            }
                        }
                    } else if (x == 3) {
                        c2 = escolha;
                    } else if (x == 4) {
                        d2 = escolha;
                        g2 = c2 + d2;
                        if (c2.equals("A") && d2.equals("A")) {

                            if (g2.equals(resposta[1])) {
                                filho2.setImageResource(R.drawable.quadrado_normal);
                                textViewFilho2.setText("AA");
                                textToSpeech.speak(questao_2, TextToSpeech.QUEUE_FLUSH, null);
                                textToSpeech.speak(questao_5, TextToSpeech.QUEUE_FLUSH, null);
                                ho++;
                            } else {
                                x = x - 2;
                                textToSpeech.speak(questao_6, TextToSpeech.QUEUE_FLUSH, null);
                            }
                        } else if (c2.equals("a") && d2.equals("A") || c2.equals("A") && d2.equals("a")) {

                            if (g2.equals(resposta[1])) {
                                filho2.setImageResource(R.drawable.quadrado_normal);
                                textViewFilho2.setText("Aa");
                                textToSpeech.speak(questao_3, TextToSpeech.QUEUE_FLUSH, null);
                                textToSpeech.speak(questao_5, TextToSpeech.QUEUE_FLUSH, null);
                                he++;
                            }else {
                                x = x - 2;
                                textToSpeech.speak(questao_7, TextToSpeech.QUEUE_FLUSH, null);
                            }
                        } else if (c2.equals("a") && d2.equals("a")) {

                            if (g2.equals(resposta[1])) {
                                filho2.setImageResource(R.drawable.quadrado_preenchido);
                                textViewFilho2.setText("aa");
                                re++;
                                textToSpeech.speak(questao_4, TextToSpeech.QUEUE_FLUSH, null);
                                textToSpeech.speak(questao_5, TextToSpeech.QUEUE_FLUSH, null);
                            } else {
                                x = x - 2;
                                textToSpeech.speak(questao_8, TextToSpeech.QUEUE_FLUSH, null);
                            }
                        }
                    } else if (x == 5) {
                        c3 = escolha;
                    } else if (x == 6) {
                        d3 = escolha;
                        g3 = c3 + d3;
                        if (c3.equals("A") && d3.equals("A")) {

                            if (g3.equals(resposta[2])) {
                                filho3.setImageResource(R.drawable.quadrado_normal);
                                textViewFilho3.setText("AA");
                                textToSpeech.speak(questao_2, TextToSpeech.QUEUE_FLUSH, null);
                                textToSpeech.speak(questao_5, TextToSpeech.QUEUE_FLUSH, null);
                                ho++;
                            } else {
                                x = x - 2;
                                textToSpeech.speak(questao_6, TextToSpeech.QUEUE_FLUSH, null);
                            }
                        } else if (c3.equals("a") && d3.equals("A") || c3.equals("A") && d3.equals("a")) {

                            if (g3.equals(resposta[2])) {
                                filho3.setImageResource(R.drawable.quadrado_normal);
                                textViewFilho3.setText("Aa");
                                textToSpeech.speak(questao_3, TextToSpeech.QUEUE_FLUSH, null);
                                textToSpeech.speak(questao_5, TextToSpeech.QUEUE_FLUSH, null);
                                he++;
                            }else {
                                x = x - 2;
                                textToSpeech.speak(questao_7, TextToSpeech.QUEUE_FLUSH, null);
                            }
                        } else if (c3.equals("a") && d3.equals("a")) {

                            if (g3.equals(resposta[2])) {
                                filho3.setImageResource(R.drawable.quadrado_preenchido);
                                textViewFilho3.setText("aa");
                                re++;
                                textToSpeech.speak(questao_4, TextToSpeech.QUEUE_FLUSH, null);
                                textToSpeech.speak(questao_5, TextToSpeech.QUEUE_FLUSH, null);
                            } else {
                                x = x - 2;
                                textToSpeech.speak(questao_8, TextToSpeech.QUEUE_FLUSH, null);
                            }
                        }

                    } else if (x == 7) {
                        c4 = escolha;
                    } else if (x == 8) {
                        d4 = escolha;
                        g4 = c4 + d4;
                        if (c4.equals("A") && d4.equals("A")) {

                            if (g4.equals(resposta[3])) {
                                filho4.setImageResource(R.drawable.quadrado_normal);
                                textViewFilho4.setText("AA");
                                textToSpeech.speak(questao_2, TextToSpeech.QUEUE_FLUSH, null);
                                textToSpeech.speak(questao_5, TextToSpeech.QUEUE_FLUSH, null);
                                ho++;
                            } else {
                                x = x - 2;
                                textToSpeech.speak(questao_6, TextToSpeech.QUEUE_FLUSH, null);
                            }
                        } else if (c4.equals("a") && d4.equals("A") || c4.equals("A") && d4.equals("a")) {

                            if (g4.equals(resposta[3])) {
                                filho4.setImageResource(R.drawable.quadrado_normal);
                                textViewFilho4.setText("Aa");
                                textToSpeech.speak(questao_3, TextToSpeech.QUEUE_FLUSH, null);
                                textToSpeech.speak(questao_5, TextToSpeech.QUEUE_FLUSH, null);
                                he++;
                            }else {
                                x = x - 2;
                                textToSpeech.speak(questao_7, TextToSpeech.QUEUE_FLUSH, null);
                            }
                        } else if (c4.equals("a") && d4.equals("a")) {

                            if (g4.equals(resposta[3])) {
                                filho4.setImageResource(R.drawable.quadrado_preenchido);
                                textViewFilho4.setText("aa");
                                re++;
                                textToSpeech.speak(questao_4, TextToSpeech.QUEUE_FLUSH, null);
                                textToSpeech.speak(questao_5, TextToSpeech.QUEUE_FLUSH, null);
                            } else {
                                x = x - 2;
                                textToSpeech.speak(questao_8, TextToSpeech.QUEUE_FLUSH, null);
                            }

                            d = c1 + d1 + "," + c2 + d2 + "," + c3 + d3 + "," + c4 + d4;
                            d = d.trim();
                            ho = (ho / 4) * 100;
                            he = (he / 4) * 100;
                            re = (re / 4) * 100;
                            homoD = (int) ho;
                            heteD = (int) he;
                            reces = (int) re;
                            System.out.println(ho + "," + he + "," + re);
                            if (res.intern() == d.intern()) {
                                if (homoD > 0 & heteD > 0 & reces > 0) {
                                    textToSpeech.speak(questao_9 +" "+ homoD +" "+questao_10 +" "+ heteD +" "+questao_11 +" "+ reces +" "+questao_14 +" "+ questao_15, TextToSpeech.QUEUE_ADD, null);
                                } else if (homoD > 0 & heteD > 0) {
                                    textToSpeech.speak(questao_9 +" "+ homoD +" "+questao_10 +" "+ heteD +" "+questao_11 +" "+ questao_15, TextToSpeech.QUEUE_ADD, null);
                                } else if (homoD > 0 & reces > 0) {
                                    textToSpeech.speak(questao_9 +" "+ homoD +" "+questao_10 +" "+ reces +" "+questao_14 +" "+questao_15, TextToSpeech.QUEUE_ADD, null);
                                } else if (heteD > 0 & reces > 0) {
                                    textToSpeech.speak(questao_9 +" "+ + heteD +" "+questao_11 +" "+ reces +" "+questao_14 +" "+questao_15, TextToSpeech.QUEUE_ADD, null);
                                } else if (homoD > 0) {
                                    textToSpeech.speak(questao_9 +" "+ + homoD +" "+questao_12 +" "+questao_15, TextToSpeech.QUEUE_ADD, null);
                                } else if (heteD > 0) {
                                    textToSpeech.speak(questao_9 +" "+ + heteD +" "+questao_13 +" "+ questao_15, TextToSpeech.QUEUE_ADD, null);
                                } else if (reces > 0) {
                                    textToSpeech.speak(questao_9 +" "+ + reces +" "+questao_14 +" "+questao_15, TextToSpeech.QUEUE_ADD, null);
                                }
                            } else {


                            }
                        }
                    }
                }else {
                    x--;
                }
            }

            @Override
            public void onLongPressQuestao() {
                if (numero_questao.equals("1")) {
                    textToSpeech.speak(questao_16, TextToSpeech.QUEUE_ADD, null);
                    textToSpeech.speak(questao_17, TextToSpeech.QUEUE_ADD, null);
                } else if (numero_questao.equals("2")) {
                    textToSpeech.speak(questao_18, textToSpeech.QUEUE_ADD, null);
                    textToSpeech.speak(questao_19, TextToSpeech.QUEUE_ADD, null);
                } else if (numero_questao.equals("3")) {
                    textToSpeech.speak(questao_20, textToSpeech.QUEUE_ADD, null);
                    textToSpeech.speak(questao_21, TextToSpeech.QUEUE_ADD, null);
                } else if (numero_questao.equals("4")) {
                    textToSpeech.speak(questao_22, textToSpeech.QUEUE_ADD, null);
                    textToSpeech.speak(questao_23, TextToSpeech.QUEUE_ADD, null);
                } else if (numero_questao.equals("5")) {
                    textToSpeech.speak(questao_24, textToSpeech.QUEUE_ADD, null);
                    textToSpeech.speak(questao_25, TextToSpeech.QUEUE_ADD, null);
                }
            }

            @Override
            public void onSwipeTopE() {
                textToSpeech.speak(questao_26, TextToSpeech.QUEUE_FLUSH, null);
                /** Cruzamento feito pelo User**/
                escolha = "A";
                escolhafala = "A "+ questao_28;
            }

            @Override
            public void onSwipeBottomE() {
                textToSpeech.speak(questao_26, TextToSpeech.QUEUE_FLUSH, null);
                /** Cruzamento feito pelo User**/
                escolha = "A";
                escolhafala = "A "+ questao_28;
            }

            @Override
            public void onSwipeTopD() {
                textToSpeech.speak(questao_27, TextToSpeech.QUEUE_FLUSH, null);
                /** Informando o Cruzamento a ser feito**/
                escolha = "a";
                escolhafala = "a "+ questao_29;
            }

            @Override
            public void onSwipeBottomD () {
                textToSpeech.speak(questao_27, TextToSpeech.QUEUE_FLUSH, null);
                /** Informando o Cruzamento a ser feito**/
                escolha = "a";
                escolhafala = "a "+ questao_29;
            }
        });
    }



    /*método para ler a velocidade de voz definida pelo usuário*/
    public void ler_velocidade() {
        FileInputStream fis = null;
        try {

            fis = openFileInput(FILE_NAME);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            String text = br.readLine();
            velocidade = Integer.parseInt(String.valueOf(text));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Override
    protected void onDestroy() {
        if(textToSpeech != null) {
            textToSpeech.stop();
            textToSpeech.shutdown();
        }
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        sensorManager.unregisterListener(proximitySensorListener);
        textToSpeech.stop();
        if(textToSpeech != null) {
            textToSpeech.stop();
            textToSpeech.shutdown();
        }
        super.onPause();
    }
}
