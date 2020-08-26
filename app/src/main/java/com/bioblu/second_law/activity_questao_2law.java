package com.bioblu.second_law;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
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

import com.bioblu.R;
import com.bioblu.controllers.OuvinteTelaTutorial;
import static com.bioblu.main.activity_voiceRate.FILE_NAME;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;


public class activity_questao_2law extends AppCompatActivity {
    public int screenWidth;
    private TextToSpeech textToSpeech;
    private int velocidade;
    private TextView textView_Questao;
    private String questao;
    private String res;

    private TextView textView1, textView2, textView3, textView4, textView5,
            textView6, textView7, textView8, textView9, textView10, textView11,
            textView12, textView13, textView14, textView15, textView16;
    private TextView  textViewF2_1, textViewF2_2, textViewF2_3, textViewF2_4, textViewP1, textViewP2;
    private ImageView imageViewF2_1, imageViewF2_2, imageViewF2_3, imageViewF2_4, imageViewP1, imageViewP2;
    private String result1 = "";
    private String result2 = "";
    private String result3 = "";
    private String result4 = "";
    private String aux0 = "", aux01 = "", aux = "", aux1 = "";

    private String [] genesParental = new String[8];
    private String [] geneP = new String[4];
    private String [] resultadoGene = new String[8];
    private String [] resultado = new String[4];
    private String [] valor_matriz = new String[32];
    private String [] lista_genes = new String[16];
    private String [] classificacao = new String[16];
    String gene_selecionado;
    String [] gene_selecionado1 = new String[4];

    private int yx = 0, l1 = 0, l2 = 1, l3 = 2, l4 = 3, l5 = 4, l6 = 5, l7 = 6, l8 = 7, l9 = 8,
            l10 = 9, l11 = 10, l12 = 11, l13 = 12, l14 = 13, l15 = 14;
    private int i = -1;
    private int ix = -1;
    private int fx = -1;
    TextView[] cursor =  new TextView[16];

    private String [][] matriz_resultado = new String[4][4];
    private String [][] matriz_final = new String[4][4];

    private SensorManager sensorManager;
    private Sensor proximitySensor;
    private SensorEventListener proximitySensorListener;

    String questao2_1;
    String questao2_2;
    String questao2_3;
    String questao2_4;
    String questao2_5;
    String questao2_6;
    String questao2_7;
    String questao2_8;
    String questao2_9;
    String questao2_10;
    String questao2_11;
    String questao2_12;
    String questao2_13;
    String questao2_14;
    String questao2_15;
    String questao2_16;
    String questao2_17;
    String questao2_18;
    String questao2_19;
    String questao2_20;
    String questao2_21;
    String questao2_22;
    String questao2_23;
    String questao2_24;
    String questao2_25;
    String questao2_26;
    String questao2_27;
    String questao2_28;
    String questao2_29;
    String questao2_30;
    String questao2_31;
    String questao2_32;
    String questao2_33;
    String questao2_34;
    String questao2_35;
    String questao2_36;
    String questao2_37;
    String questao2_38;
    String questao2_39;
    String questao2_40;
    String questao2_41;
    String questao2_42;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao_2law);

        questao2_1 = getString(R.string.questao2_1);
        questao2_2 = getString(R.string.questao2_2);
        questao2_3 = getString(R.string.questao2_3);
        questao2_4 = getString(R.string.questao2_4);
        questao2_5 = getString(R.string.questao2_5);
        questao2_6 = getString(R.string.questao2_6);
        questao2_7 = getString(R.string.questao2_7);
        questao2_8 = getString(R.string.questao2_8);
        questao2_9 = getString(R.string.questao2_9);
        questao2_10 = getString(R.string.questao2_10);
        questao2_11 = getString(R.string.questao2_11);
        questao2_12 = getString(R.string.questao2_12);
        questao2_13 = getString(R.string.questao2_13);
        questao2_14 = getString(R.string.questao2_14);
        questao2_15 = getString(R.string.questao2_15);
        questao2_16 = getString(R.string.questao2_16);
        questao2_17 = getString(R.string.questao2_17);
        questao2_18 = getString(R.string.questao2_18);
        questao2_19 = getString(R.string.questao2_19);
        questao2_20 = getString(R.string.questao2_20);
        questao2_21 = getString(R.string.questao2_21);
        questao2_22 = getString(R.string.questao2_22);
        questao2_23 = getString(R.string.questao2_23);
        questao2_24 = getString(R.string.questao2_24);
        questao2_25 = getString(R.string.questao2_25);
        questao2_26 = getString(R.string.questao2_26);
        questao2_27 = getString(R.string.questao2_27);
        questao2_28 = getString(R.string.questao2_28);
        questao2_29 = getString(R.string.questao2_29);
        questao2_30 = getString(R.string.questao2_30);
        questao2_31 = getString(R.string.questao2_31);
        questao2_32 = getString(R.string.questao2_32);
        questao2_33 = getString(R.string.questao2_33);
        questao2_34 = getString(R.string.questao2_34);
        questao2_35 = getString(R.string.questao2_35);
        questao2_36 = getString(R.string.questao2_36);
        questao2_37 = getString(R.string.questao2_37);
        questao2_38 = getString(R.string.questao2_38);
        questao2_39 = getString(R.string.questao2_39);
        questao2_40 = getString(R.string.questao2_40);
        questao2_41 = getString(R.string.questao2_41);

        Bundle dados = getIntent().getExtras();
        textView_Questao = findViewById(R.id.textView_questao2law);
        //instância dos elementos parentais
        textViewP1 = findViewById(R.id.textViewP1);
        textViewP2 = findViewById(R.id.textViewP2);
        imageViewP1 = findViewById(R.id.imageViewP1);
        imageViewP2 = findViewById(R.id.imageViewP2);

        //instância dos elementos f2
        textViewF2_1 = findViewById(R.id.textViewF2_1);
        textViewF2_2 = findViewById(R.id.textViewF2_2);
        textViewF2_3 = findViewById(R.id.textViewF2_3);
        textViewF2_4 = findViewById(R.id.textViewF2_4);
        imageViewF2_1 = findViewById(R.id.imageViewF2_1);
        imageViewF2_2 = findViewById(R.id.imageViewF2_2);
        imageViewF2_3 = findViewById(R.id.imageViewF2_3);
        imageViewF2_4 = findViewById(R.id.imageViewF2_4);

        //instancia de elementos do quadro de punnet
        cursor[0] = textView1 = findViewById(R.id.filho1_2law);
        cursor[1] = textView2 = findViewById(R.id.filho2_2law);
        cursor[2] = textView3 = findViewById(R.id.filho3_2law);
        cursor[3] = textView4 = findViewById(R.id.filho4_2law);
        cursor[4] = textView5 = findViewById(R.id.filho5_2law);
        cursor[5] = textView6 = findViewById(R.id.filho6_2law);
        cursor[6] = textView7 = findViewById(R.id.filho7_2law);
        cursor[7] = textView8 = findViewById(R.id.filho8_2law);
        cursor[8] = textView9 = findViewById(R.id.filho9_2law);
        cursor[9] = textView10 = findViewById(R.id.filho10_2law);
        cursor[10] = textView11 = findViewById(R.id.filho11_2law);
        cursor[11] = textView12 = findViewById(R.id.filho12_2law);
        cursor[12] = textView13 = findViewById(R.id.filho13_2law);
        cursor[13] = textView14 = findViewById(R.id.filho14_2law);
        cursor[14] = textView15 = findViewById(R.id.filho15_2law);
        cursor[15] = textView16 = findViewById(R.id.filho16_2law);

        //Pega o Tamanho da tela do Celular Para a Classe OuvinteDeToque
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        screenWidth = displayMetrics.widthPixels;
        questao = dados.getString("q");

        result1 = dados.getString("r0");
        result2 = dados.getString("r1");
        aux0 = result1 + result2;
        result3 = dados.getString("r2");
        result4 = dados.getString("r3");
        aux01 = result3 + result4;


        /* tratamento de erro da api de fala */
        textToSpeech = new TextToSpeech(activity_questao_2law.this, new TextToSpeech.OnInitListener() {
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

        textView_Questao.setText(questao);

        if (result1.equals(result1.toLowerCase()) && result2.equals(result2.toLowerCase())) {
            textViewP1.setText(aux0);
            imageViewP1.setImageResource(R.drawable.quadrado_preenchido);
        } else {
            textViewP1.setText(aux0);
            imageViewP1.setImageResource(R.drawable.quadrado_normal);
        }

        if (result3.equals(result3.toLowerCase()) && result3.equals(result3.toLowerCase())) {
            textViewP2.setText(aux01);
            imageViewP2.setImageResource(R.drawable.quadrado_preenchido);
        } else {
            textViewP2.setText(aux01);
            imageViewP2.setImageResource(R.drawable.quadrado_normal);
        }


        initTela();
    }


    @SuppressLint("ClickableViewAccessibility")
    private void initTela() {
        RelativeLayout Relativelayout = findViewById(R.id.relativeLayout_questao_2law);
        Relativelayout.setOnTouchListener(new OuvinteTelaTutorial(getApplicationContext(), screenWidth) {
            @Override
            public void LGesture() {
                finish();
                Intent intent = new Intent(getApplicationContext(), activity_menu_2law.class);
                startActivity(intent);
            }

            @Override
            public void onSwipeTopE() {
                if (gene_x >= 0 && gene_x < 25) {
                    escolhaGeneP = result1;
                    textToSpeech.speak( questao2_1 + result1 + questao2_2, TextToSpeech.QUEUE_FLUSH, null);
                    escolhafala = result1 + questao2_3;
                } else if (gene_x > 24) {
                    if (ix == 0 & i > 0) {
                        yx--;
                        i--;
                        caminhar();
                    } else if (i > 0) {
                        i--;
                        ix--;
                    } else {
                        i = 0;
                        ix = 0;
                    }
                    cursor[ix].setBackgroundResource(R.drawable.linha_horizontal);
                    cursor[ix + 1].setBackgroundColor(Color.TRANSPARENT);
                    textToSpeech.speak(questao2_6 + i + classificacao[i], TextToSpeech.QUEUE_FLUSH, null);
                }

            }

            @Override
            public void onSwipeBottomE() {
                if (gene_x >= 0 && gene_x < 25) {

                    escolhaGeneP = result2;
                    textToSpeech.speak(questao2_1 + result2 + questao2_2, TextToSpeech.QUEUE_FLUSH, null);
                    escolhafala = result2 + questao2_3;

                } else if (gene_x >= 24) {
                    if (i == lista_genes.length - 1) {
                        i = lista_genes.length - 1;

                    } else if (ix == 15 & i <= lista_genes.length) {
                        yx++;
                        i++;
                        caminhar();
                    } else if (i < lista_genes.length) {
                        i++;
                        ix++;
                    }
                    cursor[ix].setBackgroundResource(R.drawable.linha_horizontal);
                    textToSpeech.speak( questao2_6 + i  + classificacao[i], TextToSpeech.QUEUE_FLUSH, null);
                    if (ix > 0) {
                        cursor[ix - 1].setBackgroundColor(Color.TRANSPARENT);
                    }
                }

            }

            @Override
            public void onSwipeTopD() {
                if (gene_x >= 0 && gene_x < 25) {
                    escolhaGeneP = result3;
                    textToSpeech.speak(questao2_1 + result3 + questao2_4, TextToSpeech.QUEUE_FLUSH, null);
                    escolhafala = result3 + questao2_5;

                } else if (gene_x >= 24) {
                    if (ix == 0 & i > 0) {
                        yx--;
                        i--;
                        caminhar();
                    } else if (i > 0) {
                        i--;
                        ix--;
                    } else {
                        i = 0;
                        ix = 0;
                    }
                    cursor[ix].setBackgroundResource(R.drawable.linha_horizontal);
                    cursor[ix + 1].setBackgroundColor(Color.TRANSPARENT);
                    textToSpeech.speak(questao2_6  + i + classificacao[i], TextToSpeech.QUEUE_FLUSH, null);
                }
            }

            @Override
            public void onSwipeBottomD() {
                if (gene_x >= 0 && gene_x < 25) {
                    escolhaGeneP = result4;
                    textToSpeech.speak(questao2_1 + result4 + questao2_4, TextToSpeech.QUEUE_FLUSH, null);
                    escolhafala = result4 + questao2_5;
                }  else if (gene_x >= 24) {
                    if (i == lista_genes.length - 1) {
                        i = lista_genes.length - 1;

                    } else if (ix == 15 & i <= lista_genes.length) {
                        yx++;
                        i++;
                        caminhar();
                    } else if (i < lista_genes.length) {
                        i++;
                        ix++;
                    }
                    cursor[ix].setBackgroundResource(R.drawable.linha_horizontal);

                    textToSpeech.speak(questao2_6 + i + classificacao[i], TextToSpeech.QUEUE_FLUSH, null);

                    if (ix > 0) {
                        cursor[ix - 1].setBackgroundColor(Color.TRANSPARENT);
                    }
                }
            }


            @Override
            public void doubleTap() {
                textToSpeech.speak(questao2_7 +escolhafala, TextToSpeech.QUEUE_FLUSH, null);
                if (escolhaGeneP != null) {

                    textToSpeech.speak(questao2_7 +escolhafala, TextToSpeech.QUEUE_FLUSH, null);
                    if (gene_x == 0) {
                        resultadoGene[0] = escolhaGeneP;
                        escolhaGeneP = null;
                        textToSpeech.speak(questao2_8, TextToSpeech.QUEUE_ADD, null);
                    } else if (gene_x == 1) {
                        resultadoGene[1] = escolhaGeneP;
                        escolhaGeneP = null;
                        resultado[0] = resultadoGene[0] + resultadoGene[1];
                        textViewF2_1.setText(resultado[0]);
                        if (resultadoGene[0].equals(resultadoGene[0].toUpperCase()) && resultadoGene[1].equals(resultadoGene[1].toUpperCase())) {
                            imageViewF2_1.setImageResource(R.drawable.quadrado_normal);
                            gene_selecionado1[0] = questao2_9;
                        } else if (resultadoGene[0].equals(resultadoGene[0].toUpperCase()) && resultadoGene[1].equals(resultadoGene[1].toLowerCase())) {
                            imageViewF2_1.setImageResource(R.drawable.quadrado_normal);
                            gene_selecionado1[0] = questao2_10;
                        } else if (resultadoGene[0].equals(resultadoGene[0].toLowerCase()) && resultadoGene[1].equals(resultadoGene[1].toUpperCase())) {
                            imageViewF2_1.setImageResource(R.drawable.quadrado_normal);
                            gene_selecionado1[0] = questao2_10;
                        } else {
                            imageViewF2_1.setImageResource(R.drawable.quadrado_preenchido);
                            gene_selecionado1[0] = questao2_11;
                        }

                    } else if (gene_x == 2) {
                        textToSpeech.speak(questao2_12, TextToSpeech.QUEUE_ADD, null);
                        resultadoGene[2] = escolhaGeneP;
                        escolhaGeneP = null;
                        textToSpeech.speak(questao2_13, TextToSpeech.QUEUE_ADD, null);
                    } else if (gene_x == 3) {
                        resultadoGene[3] = escolhaGeneP;
                        escolhaGeneP = null;
                        resultado[1] = resultadoGene[2] + resultadoGene[3];
                        textViewF2_2.setText(resultado[1]);
                        if (resultadoGene[2].equals(resultadoGene[2].toUpperCase()) && resultadoGene[3].equals(resultadoGene[3].toUpperCase())) {
                            imageViewF2_2.setImageResource(R.drawable.quadrado_normal);
                            gene_selecionado1[1] = questao2_9;
                        } else if (resultadoGene[2].equals(resultadoGene[2].toUpperCase()) && resultadoGene[3].equals(resultadoGene[3].toLowerCase())) {
                            imageViewF2_2.setImageResource(R.drawable.quadrado_normal);
                            gene_selecionado1[1] = questao2_10;
                        } else if (resultadoGene[2].equals(resultadoGene[2].toLowerCase()) && resultadoGene[3].equals(resultadoGene[3].toUpperCase())) {
                            imageViewF2_2.setImageResource(R.drawable.quadrado_normal);
                            gene_selecionado1[1] = questao2_10;
                        } else {
                            imageViewF2_2.setImageResource(R.drawable.quadrado_preenchido);
                            gene_selecionado1[1] = questao2_11;
                        }
                    } else if (gene_x == 4) {
                        textToSpeech.speak(questao2_14, TextToSpeech.QUEUE_ADD, null);
                        resultadoGene[4] = escolhaGeneP;
                        escolhaGeneP = null;
                        textToSpeech.speak(questao2_15, TextToSpeech.QUEUE_ADD, null);
                    } else if (gene_x == 5) {
                        resultadoGene[5] = escolhaGeneP;
                        escolhaGeneP = null;
                        resultado[2] = resultadoGene[4] + resultadoGene[5];
                        textViewF2_3.setText(resultado[2]);
                        if (resultadoGene[4].equals(resultadoGene[4].toUpperCase()) && resultadoGene[5].equals(resultadoGene[5].toUpperCase())) {
                            gene_selecionado1[2] = questao2_9;
                            imageViewF2_3.setImageResource(R.drawable.quadrado_normal);
                        } else if (resultadoGene[4].equals(resultadoGene[4].toUpperCase()) && resultadoGene[5].equals(resultadoGene[5].toLowerCase())) {
                            gene_selecionado1[0] = questao2_10;
                            imageViewF2_3.setImageResource(R.drawable.quadrado_normal);
                        } else if (resultadoGene[4].equals(resultadoGene[4].toLowerCase()) && resultadoGene[5].equals(resultadoGene[5].toUpperCase())) {
                            imageViewF2_3.setImageResource(R.drawable.quadrado_normal);
                            gene_selecionado1[0] = questao2_10;
                        } else {
                            gene_selecionado1[2] = questao2_11;
                            imageViewF2_3.setImageResource(R.drawable.quadrado_preenchido);
                        }
                    } else if (gene_x == 6) {
                        textToSpeech.speak(questao2_16, TextToSpeech.QUEUE_ADD, null);

                        resultadoGene[6] = escolhaGeneP;
                        escolhaGeneP = null;
                        textToSpeech.speak(questao2_17, TextToSpeech.QUEUE_ADD, null);
                    } else if (gene_x == 7) {
                        resultadoGene[7] = escolhaGeneP;
                        escolhaGeneP = null;
                        resultado[3] = resultadoGene[6] + resultadoGene[7];
                        textViewF2_4.setText(resultado[3]);
                        if (resultadoGene[6].equals(resultadoGene[6].toUpperCase()) && resultadoGene[7].equals(resultadoGene[7].toUpperCase())) {
                            imageViewF2_4.setImageResource(R.drawable.quadrado_normal);
                            gene_selecionado1[0] = questao2_9;
                        } else if (resultadoGene[6].equals(resultadoGene[6].toUpperCase()) && resultadoGene[7].equals(resultadoGene[7].toLowerCase())) {
                            imageViewF2_4.setImageResource(R.drawable.quadrado_normal);
                            gene_selecionado1[0] = questao2_10;
                        } else if (resultadoGene[6].equals(resultadoGene[6].toLowerCase()) && resultadoGene[7].equals(resultadoGene[7].toUpperCase())) {
                            imageViewF2_4.setImageResource(R.drawable.quadrado_normal);
                            gene_selecionado1[0] = questao2_10;
                        } else {
                            imageViewF2_4.setImageResource(R.drawable.quadrado_preenchido);
                            gene_selecionado1[0] = questao2_11;
                        }

                        /* tratar matriz resultado */
                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {
                                matriz_final[i][j] = resultado[i] + resultado[j];
                            }
                        }

                        textToSpeech.speak(questao2_18, TextToSpeech.QUEUE_ADD, null);
                        // colocar os genes gerados aqui
                        /** Quadro de Punnet aqui **/
                    } else if (gene_x == 8) { /* linha 0, coluna 0*/
                        valor_matriz[0] = escolhaGeneP;
                        textToSpeech.speak(questao2_19, TextToSpeech.QUEUE_ADD, null);
                    } else  if (gene_x == 9) {
                        valor_matriz[1] = escolhaGeneP;
                        matriz_resultado[0][0] = valor_matriz[0] + valor_matriz[1];
                        textToSpeech.speak(questao2_20, TextToSpeech.QUEUE_ADD, null);
                    } else if (gene_x == 10) { /* linha 0, coluna 1*/
                        valor_matriz[2] = escolhaGeneP;
                        textToSpeech.speak(questao2_21, TextToSpeech.QUEUE_ADD, null);
                    } else if (gene_x == 11) {
                        valor_matriz[3] = escolhaGeneP;
                        lista_genes[0] = valor_matriz[0] + valor_matriz[1] + valor_matriz[2] + valor_matriz[3];
                        matriz_resultado[0][1] = valor_matriz[2] + valor_matriz[3];
                        textView1.setText(lista_genes[0]); // final primeiro alelo

                        if (lista_genes[0].equals(matriz_final[0][0])) {
                            textToSpeech.speak(questao2_22, TextToSpeech.QUEUE_ADD, null);
                        } else {
                            textToSpeech.speak(questao2_23, TextToSpeech.QUEUE_ADD, null);
                            gene_x -= 4;
                        }

                    } else if (gene_x == 12) { /* linha 0, coluna 1*/
                        valor_matriz[4] = escolhaGeneP;
                        textToSpeech.speak(questao2_24, TextToSpeech.QUEUE_ADD, null);
                    } else if (gene_x == 13) {
                        textToSpeech.speak(questao2_25, TextToSpeech.QUEUE_ADD, null);
                        valor_matriz[5] = escolhaGeneP;
                        escolhaGeneP = null;
                        matriz_resultado[0][2] = valor_matriz[4] + valor_matriz[5];


                    } else if (gene_x == 14) { /* linha 0, coluna 2*/
                        textToSpeech.speak(questao2_26, TextToSpeech.QUEUE_ADD, null);
                        valor_matriz[6] = escolhaGeneP;
                        escolhaGeneP = null;
                    } else if (gene_x == 15) {
                        textToSpeech.speak(questao2_27, TextToSpeech.QUEUE_ADD, null);
                        valor_matriz[7] = escolhaGeneP;
                        lista_genes[1] = valor_matriz[4] + valor_matriz[5] + valor_matriz[6] + valor_matriz[7];
                        matriz_resultado[0][3] = valor_matriz[6] + valor_matriz[7];
                        textView2.setText(lista_genes[1]);

                        if (lista_genes[1].equals(matriz_final[0][1])) {
                            textToSpeech.speak(questao2_28, TextToSpeech.QUEUE_ADD, null);
                        } else {
                            textToSpeech.speak(questao2_29, TextToSpeech.QUEUE_ADD, null);
                            gene_x -= 8;
                        } // tratar outros dois

                    }  else if (gene_x == 16) { /* linha 0, coluna 3*/
                        valor_matriz[8] = escolhaGeneP;
                        textToSpeech.speak(questao2_30, TextToSpeech.QUEUE_ADD, null);
                    } else  if (gene_x == 17) {
                        valor_matriz[9] = escolhaGeneP;
                        matriz_resultado[1][0] = valor_matriz[8] + valor_matriz[9];
                        textToSpeech.speak(questao2_31, TextToSpeech.QUEUE_ADD, null);
                    } else if (gene_x == 18) { /* linha 0, coluna 1*/
                        valor_matriz[10] = escolhaGeneP;
                        textToSpeech.speak(questao2_32, TextToSpeech.QUEUE_ADD, null);
                    } else if (gene_x == 19) {
                        valor_matriz[11] = escolhaGeneP;
                        lista_genes[2] = valor_matriz[8] + valor_matriz[9] + valor_matriz[10] + valor_matriz[11];
                        matriz_resultado[1][1] = valor_matriz[2] + valor_matriz[3];
                        textView3.setText(lista_genes[2]); // final primeiro alelo

                        if (lista_genes[2].equals(matriz_final[0][2])) {
                            textToSpeech.speak(questao2_33, TextToSpeech.QUEUE_ADD, null);
                        } else {
                            textToSpeech.speak(questao2_34, TextToSpeech.QUEUE_ADD, null);
                            gene_x -= 4;
                        } // tratar outros dois

                    }else if (gene_x == 20) { /* linha 0, coluna 4*/
                        valor_matriz[12] = escolhaGeneP;
                        textToSpeech.speak(questao2_35, TextToSpeech.QUEUE_ADD, null);
                    } else if (gene_x == 21) {
                        textToSpeech.speak(questao2_36, TextToSpeech.QUEUE_ADD, null);
                        valor_matriz[13] = escolhaGeneP;
                        escolhaGeneP = null;
                        matriz_resultado[1][2] = valor_matriz[12] + valor_matriz[13];


                    } else if (gene_x == 22) { /* linha 0, coluna 2*/
                        textToSpeech.speak(questao2_37, TextToSpeech.QUEUE_ADD, null);
                        valor_matriz[14] = escolhaGeneP;
                        escolhaGeneP = null;
                    } else if (gene_x == 23) {
                        textToSpeech.speak(questao2_38, TextToSpeech.QUEUE_ADD, null);
                        valor_matriz[15] = escolhaGeneP;
                        lista_genes[3] = valor_matriz[12] + valor_matriz[13] + valor_matriz[14] + valor_matriz[15];
                        matriz_resultado[1][3] = valor_matriz[14] + valor_matriz[15];
                        textView4.setText(lista_genes[3]);

                        if (lista_genes[3].equals(matriz_final[0][3])) {
                            textToSpeech.speak(questao2_39, TextToSpeech.QUEUE_ADD, null);
                        } else {
                            textToSpeech.speak(questao2_40, TextToSpeech.QUEUE_ADD, null);
                            gene_x -= 4;
                        }}



                    else if (gene_x == 24) {

                        textView5.setText(matriz_final[1][0]);
                        textView6.setText(matriz_final[1][1]);
                        textView7.setText(matriz_final[1][2]);
                        textView8.setText(matriz_final[1][3]);
                        textView9.setText(matriz_final[2][0]);
                        textView10.setText(matriz_final[2][1]);
                        textView11.setText(matriz_final[2][2]);
                        textView12.setText(matriz_final[2][3]);
                        textView13.setText(matriz_final[3][0]);
                        textView14.setText(matriz_final[3][1]);
                        textView15.setText(matriz_final[3][2]);
                        textView16.setText(matriz_final[3][3]);

                        lista_genes[4] = matriz_final[1][0];
                        lista_genes[5] = matriz_final[1][1];
                        lista_genes[6] = matriz_final[1][2];
                        lista_genes[7] = matriz_final[1][3];
                        lista_genes[8] = matriz_final[2][0];
                        lista_genes[9] = matriz_final[2][1];
                        lista_genes[10] = matriz_final[2][2];
                        lista_genes[11] = matriz_final[2][3];
                        lista_genes[12] = matriz_final[3][0];
                        lista_genes[13] = matriz_final[3][1];
                        lista_genes[14] = matriz_final[3][2];
                        lista_genes[15] = matriz_final[3][3];

                        classificacao[0] = gene_selecionado1[0] + " e " + gene_selecionado1[0];
                        classificacao[1] = gene_selecionado1[0] + " e " + gene_selecionado1[1];
                        classificacao[2] = gene_selecionado1[0] + " e " + gene_selecionado1[2];
                        classificacao[3] = gene_selecionado1[0] + " e " + gene_selecionado1[3];
                        classificacao[4] = gene_selecionado1[1] + " e " + gene_selecionado1[0];
                        classificacao[5] = gene_selecionado1[1] + " e " + gene_selecionado1[1];
                        classificacao[6] = gene_selecionado1[1] + " e " + gene_selecionado1[2];
                        classificacao[7] = gene_selecionado1[1] + " e " + gene_selecionado1[3];
                        classificacao[8] = gene_selecionado1[2] + " e " + gene_selecionado1[0];
                        classificacao[9] = gene_selecionado1[2] + " e " + gene_selecionado1[1];
                        classificacao[10] = gene_selecionado1[2] + " e " + gene_selecionado1[2];
                        classificacao[11] = gene_selecionado1[2] + " e " + gene_selecionado1[3];
                        classificacao[12] = gene_selecionado1[3] + " e " + gene_selecionado1[0];
                        classificacao[13] = gene_selecionado1[3] + " e " + gene_selecionado1[1];
                        classificacao[14] = gene_selecionado1[3] + " e " + gene_selecionado1[2];
                        classificacao[15] = gene_selecionado1[3] + " e " + gene_selecionado1[3];


                        textToSpeech.speak(questao2_41, TextToSpeech.QUEUE_ADD, null);

                    }
                }




            }


            @Override
            public void caminhar() {
                textView1.setText(String.valueOf(lista_genes[l1 + yx]));
                textView2.setText(String.valueOf(lista_genes[l2 + yx]));
                textView3.setText(String.valueOf(lista_genes[l3 + yx]));
                textView4.setText(String.valueOf(lista_genes[l4 + yx]));
                textView5.setText(String.valueOf(lista_genes[l5 + yx]));
                textView6.setText(String.valueOf(lista_genes[l6 + yx]));
                textView7.setText(String.valueOf(lista_genes[l7 + yx]));
                textView8.setText(String.valueOf(lista_genes[l8 + yx]));
                textView9.setText(String.valueOf(lista_genes[l9 + yx]));
                textView10.setText(String.valueOf(lista_genes[l10 + yx]));
                textView11.setText(String.valueOf(lista_genes[l11 + yx]));
                textView12.setText(String.valueOf(lista_genes[l12 + yx]));
                textView13.setText(String.valueOf(lista_genes[l13 + yx]));
                textView14.setText(String.valueOf(lista_genes[l14 + yx]));
                textView15.setText(String.valueOf(lista_genes[l15 + yx]));
            }


            @Override
            public void onLongPressTutorial() {
                textToSpeech.speak(questao, TextToSpeech.QUEUE_ADD, null);
            }

        });
    }



    @Override
    protected void onDestroy() {
        if (textToSpeech != null) {
            textToSpeech.stop();
            textToSpeech.shutdown();
        }
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        sensorManager.unregisterListener(proximitySensorListener);
        textToSpeech.stop();
        if (textToSpeech != null) {
            textToSpeech.stop();
            textToSpeech.shutdown();
        }
        super.onPause();
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
}
