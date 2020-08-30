package com.bioblu.second_law;
import com.bioblu.R;
import com.bioblu.controllers.OuvinteTelaTutorial;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Locale;

public class activity_tutorial_polialelia extends AppCompatActivity {
    private TextToSpeech textToSpeech;
    /**
     * Sintetiza a fala do texto para reprodução imediata ou para criar um arquivo de som
     **/
    private TextView textViewFilho1, textViewFilho2, textViewFilho3, textViewFilho4, textViewP1, textViewP12, textViewF1, textViewF12;
    private String d1, c1, d2, c2, d3, c3, d4, c4, genep1, genep2, genep3, genep4, genef1_1, genef1_2, genef1_3, genef1_4;
    public ImageView filho1, filho2, filho3, filho4, imageViewP1, imageViewP12, imageViewF1, imageViewF12;
    public int screenWidth;
    public int screenHeight;
    public int velocidade;
    public ImageView imageViewTutorial;

    /**
     * String com informações de como usar o app
     **/

    String poli1;
    String poli2;
    String poli3;
    String poli4;
    String poli5;
    String poli6;
    String poli7;
    String poli8;
    String poli9;
    String poli10;
    String poli11;
    String poli12;
    String poli13;
    String poli14;
    String poli15;
    String poli16;
    String poli17;
    String poli18;
    String poli19;
    String poli20;
    String poli21;
    String poli22;
    String poli23;
    String poli24;
    String poli25;
    String poli26;
    String poli27;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial_polialelia);

        poli1= getString(R.string.tutorial_poli2_1);
        poli2= getString(R.string.tutorial_poli2_2);
        poli3= getString(R.string.tutorial_poli2_3);
        poli4= getString(R.string.tutorial_poli2_4);
        poli5= getString(R.string.tutorial_poli2_5);
        poli6= getString(R.string.tutorial_poli2_6);
        poli7= getString(R.string.tutorial_poli2_7);
        poli8= getString(R.string.tutorial_poli2_8);
        poli9= getString(R.string.tutorial_poli2_9);
        poli10= getString(R.string.tutorial_poli2_10);
        poli11= getString(R.string.tutorial_poli2_11);
        poli12= getString(R.string.tutorial_poli2_12);
        poli13= getString(R.string.tutorial_poli2_13);
        poli14= getString(R.string.tutorial_poli2_14);
        poli15= getString(R.string.tutorial_poli2_15);
        poli16= getString(R.string.tutorial_poli2_16);
        poli17= getString(R.string.tutorial_poli2_17);
        poli18= getString(R.string.tutorial_poli2_18);
        poli19= getString(R.string.tutorial_poli2_19);
        poli20= getString(R.string.tutorial_poli2_20);
        poli21= getString(R.string.tutorial_poli2_21);
        poli22= getString(R.string.tutorial_poli2_22);
        poli23= getString(R.string.tutorial_poli2_23);
        poli24= getString(R.string.tutorial_poli2_24);
        poli25= getString(R.string.tutorial_poli2_25);
        poli26= getString(R.string.tutorial_poli2_26);
        poli27= getString(R.string.tutorial_poli2_27);



        Bundle dados = getIntent().getExtras();
        velocidade = dados.getInt("velocidade");

        //instância dos textview para todas gerações
        textViewFilho1 = findViewById(R.id.textViewFilho1_tutorial1law);
        textViewFilho2 = findViewById(R.id.textViewFilho2_tutorial1law);
        textViewFilho3 = findViewById(R.id.textViewFilho3_tutorial1law);
        textViewFilho4 = findViewById(R.id.textViewFilho4_tutorial1law);

        textViewP1 = findViewById(R.id.textViewF11_tutorial1law);
        textViewP12 = findViewById(R.id.textViewF12_tutorial1law);

        imageViewP1 = findViewById(R.id.imageViewF11_tutorial1law);
        imageViewP12 = findViewById(R.id.imageViewF12_tutorial1law);


        //instância dos imageview da geração f2
        filho1 = findViewById(R.id.law1_filho1);
        filho2 = findViewById(R.id.law1_filho2);
        filho3 = findViewById(R.id.law1_filho3);
        filho4 = findViewById(R.id.law1_filho4);

        imageViewTutorial = findViewById(R.id.imageViewTutorial);


        textToSpeech = new TextToSpeech(activity_tutorial_polialelia.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    textToSpeech.setLanguage(Locale.getDefault());
                    textToSpeech.setSpeechRate(velocidade);
                    textToSpeech.setPitch(1);
                    textToSpeech.speak(poli1, textToSpeech.QUEUE_FLUSH, null);
                }
            }
        });

        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        /** Pega o Tamanho da tela do Celular Para a Classe OuvinteDeToque**/
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        screenWidth = displayMetrics.widthPixels;
        screenHeight = displayMetrics.heightPixels;

        initTela();
    }

    /**
     * METODOS AQUI
     **/
    @SuppressLint("ClickableViewAccessibility")
    private void initTela() {
        RelativeLayout Rlayout = findViewById(R.id.relativeLayout_tutorial_polialelia);
        Rlayout.setOnTouchListener(new OuvinteTelaTutorial(getApplicationContext(), screenWidth) {
            @Override
            public void onSwipeTopE() {
                if (x == 1 || x == 5 || x == 7) {
                    textToSpeech.speak(poli5 + '\n' + poli2, TextToSpeech.QUEUE_FLUSH, null);
                    escolha = "C";
                } else if (x == 2 || x == 10 || x == 11 || x == 3 || x == 6 || x == 9 || x == 4 || x == 8 || x == 12){
                    textToSpeech.speak(poli3, TextToSpeech.QUEUE_FLUSH, null);
                } else if (x > 12){
                    textToSpeech.speak(poli4, TextToSpeech.QUEUE_FLUSH, null);
                }

            }

            @Override
            public void onSwipeBottomE() {
                if(x == 2 || x == 10 || x == 11) {
                    textToSpeech.speak(poli6 + '\n' + poli2, TextToSpeech.QUEUE_FLUSH, null);
                    escolha = "Ch";
                } else if (x == 1 || x == 5 || x == 7 || x == 3 || x == 6 || x == 9 || x == 4 || x == 8 || x == 12) {
                    textToSpeech.speak(poli3, TextToSpeech.QUEUE_FLUSH, null);
                }else if (x > 12){
                    textToSpeech.speak(poli4, TextToSpeech.QUEUE_FLUSH, null);
                }


            }

            @Override
            public void onSwipeTopD() {
                if(x == 3 || x == 6 || x == 9) {
                    textToSpeech.speak(poli7 + '\n' + poli2, TextToSpeech.QUEUE_FLUSH, null);
                    escolha = "CCh";
                } else if (x == 1 || x == 5 || x == 7 || x == 2 || x == 10 || x == 11 || x == 4 || x == 8 || x == 12) {
                    textToSpeech.speak(poli3, TextToSpeech.QUEUE_FLUSH, null);
                } else if (x > 12){
                    textToSpeech.speak(poli4, TextToSpeech.QUEUE_FLUSH, null);
                }

            }

            @Override
            public void onSwipeBottomD() {
                if(x == 4 || x == 8 || x == 12) {
                    textToSpeech.speak( poli8 + '\n' + poli2, TextToSpeech.QUEUE_FLUSH, null);
                    escolha = "Ca";
                } else if (x == 1 || x == 5 || x == 7 || x == 2 || x == 10 || x == 11 || x == 3 || x == 6 || x == 9) {
                    textToSpeech.speak(poli3, TextToSpeech.QUEUE_FLUSH, null);
                } else if (x > 12){
                    textToSpeech.speak(poli4, TextToSpeech.QUEUE_FLUSH, null);
                }

            }

            @Override
            public void doubleTap() {
                if (x >= 1 && escolha != null) {
                    if (x == 1) {
                        genep1 = escolha;
                        textToSpeech.speak(poli9, TextToSpeech.QUEUE_FLUSH, null);
                        imageViewTutorial.setImageResource(R.drawable.img2);
                    } else if (x == 2) {
                        genep2 = escolha;
                        if (genep1.equals("C") && genep2.equals("Ch")) {
                            imageViewP1.setImageResource(R.drawable.selvagem);
                            textViewP1.setText("C Ch");
                            textToSpeech.speak(poli10, TextToSpeech.QUEUE_ADD, null);
                            textToSpeech.speak(poli11, TextToSpeech.QUEUE_ADD, null);
                            imageViewTutorial.setImageResource(R.drawable.img3);
                        }
                    } else if (x == 3) {
                        genep3 = escolha;
                        textToSpeech.speak(poli12, TextToSpeech.QUEUE_FLUSH, null);
                        imageViewTutorial.setImageResource(R.drawable.img3);
                    } else if (x == 4) {
                        genep4 = escolha;
                        if (genep3.equals("CCh") && genep4.equals("Ca")) {
                            imageViewP12.setImageResource(R.drawable.chinchila);
                            textViewP12.setText("CCh Ca");
                            textToSpeech.speak(poli13, TextToSpeech.QUEUE_ADD, null);
                            textToSpeech.speak(poli14, TextToSpeech.QUEUE_ADD, null);
                            imageViewTutorial.setImageResource(R.drawable.img2);
                        }
                    } else if (x == 5) {
                        genef1_1 = escolha;
                        textToSpeech.speak(poli15, TextToSpeech.QUEUE_ADD, null);
                        imageViewTutorial.setImageResource(R.drawable.img3);
                    } else if (x == 6) {
                        genef1_2 = escolha;
                        if (genef1_1.equals("C") && genef1_2.equals("CCh")) {
                            imageViewTutorial.setImageResource(R.drawable.img2);
                            filho1.setImageResource(R.drawable.selvagem);
                            textViewFilho1.setText("C CCh");
                            textToSpeech.speak(poli16, TextToSpeech.QUEUE_ADD, null);
                            textToSpeech.speak(poli17, TextToSpeech.QUEUE_ADD, null);
                        }
                    } else if (x == 7) {
                        genef1_3 = escolha;
                        textToSpeech.speak(poli18, TextToSpeech.QUEUE_ADD, null);
                        imageViewTutorial.setImageResource(R.drawable.img3);
                    } else if (x == 8) {
                        genef1_4 = escolha;
                        if (genef1_3.equals("C") && genef1_4.equals("Ca")) {
                            filho2.setImageResource(R.drawable.selvagem);
                            textViewFilho2.setText("C Ca");
                            textToSpeech.speak(poli19, TextToSpeech.QUEUE_ADD, null);
                            textToSpeech.speak(poli20, TextToSpeech.QUEUE_ADD, null);
                            imageViewTutorial.setImageResource(R.drawable.img3);
                        } // aqui
                    } else if (x == 9) {
                        c1 = escolha;
                        textToSpeech.speak(poli21, TextToSpeech.QUEUE_FLUSH, null);
                        imageViewTutorial.setImageResource(R.drawable.img2);
                    } else if (x == 10) {
                        d1 = escolha;
                        if (c1.equals("CCh") && d1.equals("Ch")) {
                            filho3.setImageResource(R.drawable.chinchila);
                            textViewFilho3.setText("CCh Ch");
                            textToSpeech.speak(poli22, TextToSpeech.QUEUE_ADD, null);
                            textToSpeech.speak(poli23, TextToSpeech.QUEUE_FLUSH, null);
                        }
                    } else if (x == 11) {
                        c2 = escolha;
                        textToSpeech.speak(poli24, TextToSpeech.QUEUE_FLUSH, null);
                        imageViewTutorial.setImageResource(R.drawable.img3);
                    } else if (x == 12) {
                        d2 = escolha;
                        if (c2.equals("Ch") && d2.equals("Ca")) {
                            filho4.setImageResource(R.drawable.himalaia);
                            textViewFilho4.setText("Ch Ca");
                            imageViewTutorial.setImageResource(R.drawable.img2);
                            textToSpeech.speak(poli25, TextToSpeech.QUEUE_ADD, null);
                            textToSpeech.speak(poli26, TextToSpeech.QUEUE_FLUSH, null);
                        }
                    }
                } else {
                    System.out.println("print");
                    x = x - 1;
                }
            }

            /*dica da questão*/
            @Override
            public void onLongPressTutorial() {
                textToSpeech.speak(poli27, TextToSpeech.QUEUE_FLUSH, null);
            }
            /*ir para o meu */

            @Override
            public void LGesture() {
                Intent intent = new Intent(getApplicationContext(), activity_menu_polialelia.class);
                startActivity(intent);
                finish();
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
        textToSpeech.stop();
        super.onPause();
    }

}
