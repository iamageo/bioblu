package com.bioblu.first_law;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bioblu.controllers.OuvinteTelaTutorial;
import com.bioblu.R;

import java.util.Locale;

public class activity_tutorial_1law extends AppCompatActivity {
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

    String tutorial_1law;
    String tutorial_dominante;
    String tutorial_recessivo;
    String tutorial_4law;
    String tutorial_5law;
    String tutorial_6law;
    String tutorial_7law;
    String tutorial_8law_homo_d;
    String tutorial_9law_hete_r;
    String tutorial_11law;
    String tutorial_12law;
    String tutorial_13law;
    String tutorial_14law;
    String tutorial_15law;
    String tutorial_16law;
    String tutorial_17law;
    String tutorial_18law;
    String tutorial_19law;
    String tutorial_20law;
    String tutorial_21law;
    String tutorial_22law;
    String tutorial_23law;
    String tutorial_24law;
    String tutorial_25law;
    String tutorial_26law;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial_1law);
        Bundle dados = getIntent().getExtras();
        velocidade = dados.getInt("velocidade");

        tutorial_1law = getString(R.string.tutorial_1law);
        tutorial_dominante = getString(R.string.tutorial_dominante);
        tutorial_recessivo = getString(R.string.tutorial_recessivo);
        tutorial_4law = getString(R.string.tutorial_4law);
        tutorial_5law = getString(R.string.tutorial_5law);
        tutorial_6law = getString(R.string.tutorial_6law);
        tutorial_7law = getString(R.string.tutorial_7law);
        tutorial_8law_homo_d = getString(R.string.tutorial_8law);
        tutorial_9law_hete_r = getString(R.string.tutorial_9law);
        tutorial_11law = getString(R.string.tutorial_11law);
        tutorial_12law = getString(R.string.tutorial_12law);
        tutorial_13law = getString(R.string.tutorial_13law);
        tutorial_14law = getString(R.string.tutorial_14law);
        tutorial_15law = getString(R.string.tutorial_15law);

        tutorial_16law = getString(R.string.tutorial_16law);
        tutorial_17law = getString(R.string.tutorial_17law);
        tutorial_18law = getString(R.string.tutorial_18law);
        tutorial_19law = getString(R.string.tutorial_19law);
        tutorial_20law = getString(R.string.tutorial_20law);
        tutorial_21law = getString(R.string.tutorial_21law);
        tutorial_22law = getString(R.string.tutorial_22law);
        tutorial_23law = getString(R.string.tutorial_23law);
        tutorial_24law = getString(R.string.tutorial_24law);
        tutorial_25law = getString(R.string.tutorial_25law);
        tutorial_26law = getString(R.string.tutorial_26law);

        //instância dos textview para todas gerações
        textViewFilho1 = findViewById(R.id.textViewFilho1_tutorial1law);
        textViewFilho2 = findViewById(R.id.textViewFilho2_tutorial1law);
        textViewFilho3 = findViewById(R.id.textViewFilho3_tutorial1law);
        textViewFilho4 = findViewById(R.id.textViewFilho4_tutorial1law);

        textViewP1 = findViewById(R.id.textViewParental_tutorial1law);
        textViewP12 = findViewById(R.id.textViewParental2_tutorial1law);
        textViewF1 = findViewById(R.id.textViewF11_tutorial1law);
        textViewF12 = findViewById(R.id.textViewF12_tutorial1law);

        //instância dos imageview da geração parental e f1
        imageViewP1 = findViewById(R.id.imageViewParental_tutorial1law);
        imageViewP12 = findViewById(R.id.imageViewParental2_tutorial1law);
        imageViewF1 = findViewById(R.id.imageViewF11_tutorial1law);
        imageViewF12 = findViewById(R.id.imageViewF12_tutorial1law);

        //instância dos imageview da geração f2
        filho1 = findViewById(R.id.law1_filho1);
        filho2 = findViewById(R.id.law1_filho2);
        filho3 = findViewById(R.id.law1_filho3);
        filho4 = findViewById(R.id.law1_filho4);

        imageViewTutorial = findViewById(R.id.imageViewTutorial);


        textToSpeech = new TextToSpeech(activity_tutorial_1law.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    textToSpeech.setLanguage(new Locale("en", "US"));
                    textToSpeech.setSpeechRate(velocidade);
                    textToSpeech.setPitch(1);
                    textToSpeech.speak(tutorial_1law, textToSpeech.QUEUE_FLUSH, null);
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

    @SuppressLint("ClickableViewAccessibility")
    private void initTela() {
        RelativeLayout Rlayout = findViewById(R.id.relativeLayout_tutorial1law);
        Rlayout.setOnTouchListener(new OuvinteTelaTutorial(getApplicationContext(), screenWidth) {
            @Override
            public void onSwipeTopE() {
                if (x == 1) {
                    textToSpeech.speak(tutorial_dominante, TextToSpeech.QUEUE_FLUSH, null);
                    escolha = "V";
                } else if (x == 2) {
                    textToSpeech.speak(tutorial_dominante, TextToSpeech.QUEUE_FLUSH, null);
                    escolha = "V";
                } else if (x == 3 || x == 4) {
                    textToSpeech.speak(tutorial_4law, TextToSpeech.QUEUE_FLUSH, null);
                } else if (x == 5) {
                    textToSpeech.speak(tutorial_dominante, TextToSpeech.QUEUE_FLUSH, null);
                    escolha = "V";
                } else if (x == 6) {
                    textToSpeech.speak(tutorial_4law, TextToSpeech.QUEUE_FLUSH, null);
                } else if (x == 7) {
                    textToSpeech.speak(tutorial_dominante, TextToSpeech.QUEUE_FLUSH, null);
                    escolha = "V";
                } else if (x == 8) {
                    textToSpeech.speak(tutorial_4law, TextToSpeech.QUEUE_FLUSH, null);
                } else if (x == 9) {
                    textToSpeech.speak(tutorial_dominante, TextToSpeech.QUEUE_FLUSH, null);
                    escolha = "V";
                } else if (x == 10) {
                    textToSpeech.speak(tutorial_dominante, TextToSpeech.QUEUE_FLUSH, null);
                    escolha = "V";
                } else if (x == 11) {
                    textToSpeech.speak(tutorial_dominante, TextToSpeech.QUEUE_FLUSH, null);
                    escolha = "V";
                } else if (x == 12) {
                    textToSpeech.speak(tutorial_4law, TextToSpeech.QUEUE_FLUSH, null);
                } else if (x == 13) {
                    textToSpeech.speak(tutorial_4law, TextToSpeech.QUEUE_FLUSH, null);
                } else if (x == 14) {
                    textToSpeech.speak(tutorial_dominante, TextToSpeech.QUEUE_FLUSH, null);
                    escolha = "V";
                } else if (x == 15) {
                    textToSpeech.speak(tutorial_4law, TextToSpeech.QUEUE_FLUSH, null);
                } else if (x == 16) {
                    textToSpeech.speak(tutorial_4law, TextToSpeech.QUEUE_FLUSH, null);
                } else if (x > 16) {
                    textToSpeech.speak(tutorial_6law, TextToSpeech.QUEUE_FLUSH, null);
                }

            }

            @Override
            public void onSwipeBottomE() {
                if (x == 1) {
                    textToSpeech.speak(tutorial_dominante, TextToSpeech.QUEUE_FLUSH, null);
                    escolha = "V";
                } else if (x == 2) {
                    textToSpeech.speak(tutorial_dominante, TextToSpeech.QUEUE_FLUSH, null);
                    escolha = "V";
                } else if (x == 3 || x == 4) {
                    textToSpeech.speak(tutorial_4law, TextToSpeech.QUEUE_FLUSH, null);
                } else if (x == 5) {
                    textToSpeech.speak(tutorial_dominante, TextToSpeech.QUEUE_FLUSH, null);
                    escolha = "V";
                } else if (x == 6) {
                    textToSpeech.speak(tutorial_4law, TextToSpeech.QUEUE_FLUSH, null);
                } else if (x == 7) {
                    textToSpeech.speak(tutorial_dominante, TextToSpeech.QUEUE_FLUSH, null);
                    escolha = "V";
                } else if (x == 8) {
                    textToSpeech.speak(tutorial_4law, TextToSpeech.QUEUE_FLUSH, null);
                } else if (x == 9) {
                    textToSpeech.speak(tutorial_dominante, TextToSpeech.QUEUE_FLUSH, null);
                    escolha = "V";
                } else if (x == 10) {
                    textToSpeech.speak(tutorial_dominante, TextToSpeech.QUEUE_FLUSH, null);
                    escolha = "V";
                } else if (x == 11) {
                    textToSpeech.speak(tutorial_dominante, TextToSpeech.QUEUE_FLUSH, null);
                    escolha = "V";
                } else if (x == 12) {
                    textToSpeech.speak(tutorial_4law, TextToSpeech.QUEUE_FLUSH, null);
                } else if (x == 13) {
                    textToSpeech.speak(tutorial_4law, TextToSpeech.QUEUE_FLUSH, null);
                } else if (x == 14) {
                    textToSpeech.speak(tutorial_dominante, TextToSpeech.QUEUE_FLUSH, null);
                    escolha = "V";
                } else if (x == 15) {
                    textToSpeech.speak(tutorial_4law, TextToSpeech.QUEUE_FLUSH, null);
                } else if (x == 16) {
                    textToSpeech.speak(tutorial_4law, TextToSpeech.QUEUE_FLUSH, null);
                } else if (x > 16) {
                    textToSpeech.speak(tutorial_6law, TextToSpeech.QUEUE_FLUSH, null);
                }

            }

            @Override
            public void onSwipeTopD() {
                if (x == 1 || x == 2) {
                    textToSpeech.speak(tutorial_5law, TextToSpeech.QUEUE_FLUSH, null);
                } else if (x == 3) {
                    textToSpeech.speak(tutorial_recessivo, TextToSpeech.QUEUE_FLUSH, null);
                    escolha = "v";
                } else if (x == 4) {
                    textToSpeech.speak(tutorial_recessivo, TextToSpeech.QUEUE_FLUSH, null);
                    escolha = "v";
                } else if (x == 5) {
                    textToSpeech.speak(tutorial_5law, TextToSpeech.QUEUE_FLUSH, null);
                } else if (x == 6) {
                    textToSpeech.speak(tutorial_recessivo, TextToSpeech.QUEUE_FLUSH, null);
                    escolha = "v";
                } else if (x == 7) {
                    textToSpeech.speak(tutorial_5law, TextToSpeech.QUEUE_FLUSH, null);
                } else if (x == 8) {
                    textToSpeech.speak(tutorial_recessivo, TextToSpeech.QUEUE_FLUSH, null);
                    escolha = "v";
                } else if (x == 9) {
                    textToSpeech.speak(tutorial_5law, TextToSpeech.QUEUE_FLUSH, null);
                } else if (x == 10) {
                    textToSpeech.speak(tutorial_5law, TextToSpeech.QUEUE_FLUSH, null);
                } else if (x == 11) {
                    textToSpeech.speak(tutorial_5law, TextToSpeech.QUEUE_FLUSH, null);
                } else if (x == 12) {
                    textToSpeech.speak(tutorial_recessivo, TextToSpeech.QUEUE_FLUSH, null);
                    escolha = "v";
                } else if (x == 13) {
                    textToSpeech.speak(tutorial_recessivo, TextToSpeech.QUEUE_FLUSH, null);
                    escolha = "v";
                } else if (x == 14) {
                    textToSpeech.speak(tutorial_5law, TextToSpeech.QUEUE_FLUSH, null);
                } else if (x == 15) {
                    textToSpeech.speak(tutorial_recessivo, TextToSpeech.QUEUE_FLUSH, null);
                    escolha = "v";
                } else if (x == 16) {
                    textToSpeech.speak(tutorial_recessivo, TextToSpeech.QUEUE_FLUSH, null);
                    escolha = "v";
                } else if (x > 16) {
                    textToSpeech.speak(tutorial_6law, TextToSpeech.QUEUE_FLUSH, null);
                }

            }

            @Override
            public void onSwipeBottomD() {
                if (x == 1 || x == 2) {
                    textToSpeech.speak(tutorial_5law, TextToSpeech.QUEUE_FLUSH, null);
                } else if (x == 3) {
                    textToSpeech.speak(tutorial_recessivo, TextToSpeech.QUEUE_FLUSH, null);
                    escolha = "v";
                } else if (x == 4) {
                    textToSpeech.speak(tutorial_recessivo, TextToSpeech.QUEUE_FLUSH, null);
                    escolha = "v";
                } else if (x == 5) {
                    textToSpeech.speak(tutorial_5law, TextToSpeech.QUEUE_FLUSH, null);
                } else if (x == 6) {
                    textToSpeech.speak(tutorial_recessivo, TextToSpeech.QUEUE_FLUSH, null);
                    escolha = "v";
                } else if (x == 7) {
                    textToSpeech.speak(tutorial_5law, TextToSpeech.QUEUE_FLUSH, null);
                } else if (x == 8) {
                    textToSpeech.speak(tutorial_recessivo, TextToSpeech.QUEUE_FLUSH, null);
                    escolha = "v";
                } else if (x == 9) {
                    textToSpeech.speak(tutorial_5law, TextToSpeech.QUEUE_FLUSH, null);
                } else if (x == 10) {
                    textToSpeech.speak(tutorial_5law, TextToSpeech.QUEUE_FLUSH, null);
                } else if (x == 11) {
                    textToSpeech.speak(tutorial_5law, TextToSpeech.QUEUE_FLUSH, null);
                } else if (x == 12) {
                    textToSpeech.speak(tutorial_recessivo, TextToSpeech.QUEUE_FLUSH, null);
                    escolha = "v";
                } else if (x == 13) {
                    textToSpeech.speak(tutorial_recessivo, TextToSpeech.QUEUE_FLUSH, null);
                    escolha = "v";
                } else if (x == 14) {
                    textToSpeech.speak(tutorial_5law, TextToSpeech.QUEUE_FLUSH, null);
                } else if (x == 15) {
                    textToSpeech.speak(tutorial_recessivo, TextToSpeech.QUEUE_FLUSH, null);
                    escolha = "v";
                } else if (x == 16) {
                    textToSpeech.speak(tutorial_recessivo, TextToSpeech.QUEUE_FLUSH, null);
                    escolha = "v";
                } else if (x > 16) {
                    textToSpeech.speak(tutorial_6law, TextToSpeech.QUEUE_FLUSH, null);
                }
            }

            @Override
            public void doubleTap() {
                if (x >= 1 && escolha != null) {
                    if (x == 1) {
                        imageViewTutorial.setImageResource(R.drawable.img2);
                        genep1 = escolha;
                        textToSpeech.speak(tutorial_7law, TextToSpeech.QUEUE_FLUSH, null);
                    } else if (x == 2) {
                        genep2 = escolha;
                        imageViewTutorial.setImageResource(R.drawable.img2);
                        if (genep1.equals("V") && genep2.equals("V")) {
                            imageViewP1.setImageResource(R.drawable.quadrado_normal);
                            textViewP1.setText("VV");
                            textToSpeech.speak(tutorial_8law_homo_d, TextToSpeech.QUEUE_ADD, null);
                            textToSpeech.speak(tutorial_11law, TextToSpeech.QUEUE_ADD, null);
                            imageViewTutorial.setImageResource(R.drawable.img2);
                        }
                    } else if (x == 3) {
                        genep3 = escolha;
                        textToSpeech.speak(tutorial_12law, TextToSpeech.QUEUE_FLUSH, null);
                        imageViewTutorial.setImageResource(R.drawable.img3);
                    } else if (x == 4) {
                        genep4 = escolha;
                        imageViewTutorial.setImageResource(R.drawable.img3);
                        if (genep3.equals("v") && genep4.equals("v")) {
                            imageViewP12.setImageResource(R.drawable.quadrado_preenchido);
                            textViewP12.setText("vv");
                            textToSpeech.speak(tutorial_9law_hete_r, TextToSpeech.QUEUE_ADD, null);
                            textToSpeech.speak(tutorial_13law, TextToSpeech.QUEUE_ADD, null);
                            imageViewTutorial.setImageResource(R.drawable.img2);
                        }
                    } else if (x == 5) {
                        genef1_1 = escolha;
                        textToSpeech.speak(tutorial_14law, TextToSpeech.QUEUE_ADD, null);
                        imageViewTutorial.setImageResource(R.drawable.img3);
                    } else if (x == 6) {
                        genef1_2 = escolha;
                        if (genef1_1.equals("V") && genef1_2.equals("v")) {
                            imageViewTutorial.setImageResource(R.drawable.img3);
                            imageViewF1.setImageResource(R.drawable.quadrado_normal);
                            textViewF1.setText("Vv");
                            textToSpeech.speak(tutorial_8law_homo_d, TextToSpeech.QUEUE_ADD, null);
                            textToSpeech.speak(tutorial_15law, TextToSpeech.QUEUE_ADD, null);
                        }
                    } else if (x == 7) {
                        genef1_3 = escolha;
                        textToSpeech.speak(tutorial_16law, TextToSpeech.QUEUE_ADD, null);
                    } else if (x == 8) {
                        genef1_4 = escolha;
                        if (genef1_3.equals("V") && genef1_4.equals("v")) {
                            imageViewF12.setImageResource(R.drawable.quadrado_normal);
                            textViewF12.setText("Vv");
                            textToSpeech.speak(tutorial_8law_homo_d, TextToSpeech.QUEUE_ADD, null);
                            textToSpeech.speak(tutorial_17law, TextToSpeech.QUEUE_ADD, null);
                            imageViewTutorial.setImageResource(R.drawable.img2);
                        }
                    } else if (x == 9) {
                        c1 = escolha;
                        textToSpeech.speak(tutorial_18law, TextToSpeech.QUEUE_FLUSH, null);
                    } else if (x == 10) {
                        d1 = escolha;
                        if (c1.equals("V") && d1.equals("V")) {
                            filho1.setImageResource(R.drawable.quadrado_normal);
                            textViewFilho1.setText("VV");
                            textToSpeech.speak(tutorial_8law_homo_d, TextToSpeech.QUEUE_ADD, null);
                            textToSpeech.speak(tutorial_19law, TextToSpeech.QUEUE_FLUSH, null);
                        }
                    } else if (x == 11) {
                        imageViewTutorial.setImageResource(R.drawable.img3);
                        c2 = escolha;
                        textToSpeech.speak(tutorial_20law, TextToSpeech.QUEUE_FLUSH, null);

                    } else if (x == 12) {
                        d2 = escolha;
                        if (c2.equals("v") && d2.equals("V") || c2.equals("V") && d2.equals("v")) {
                            filho2.setImageResource(R.drawable.quadrado_normal);
                            textViewFilho2.setText("Vv");
                            imageViewTutorial.setImageResource(R.drawable.img2);
                            textToSpeech.speak(tutorial_8law_homo_d, TextToSpeech.QUEUE_ADD, null);
                            textToSpeech.speak(tutorial_21law, TextToSpeech.QUEUE_FLUSH, null);
                        }
                    } else if (x == 13) {
                        c3 = escolha;
                        textToSpeech.speak(tutorial_22law, TextToSpeech.QUEUE_FLUSH, null);
                        imageViewTutorial.setImageResource(R.drawable.img3);
                    } else if (x == 14) {
                        d3 = escolha;
                        if (c3.equals("v") && d3.equals("V") || c3.equals("V") && d3.equals("v")) {
                            filho3.setImageResource(R.drawable.quadrado_normal);
                            textViewFilho3.setText("Vv");
                            textToSpeech.speak(tutorial_8law_homo_d, TextToSpeech.QUEUE_ADD, null);
                            textToSpeech.speak(tutorial_23law, TextToSpeech.QUEUE_FLUSH, null);
                        }

                    } else if (x == 15) {
                        c4 = escolha;
                        textToSpeech.speak(tutorial_24law, TextToSpeech.QUEUE_FLUSH, null);
                        imageViewTutorial.setImageResource(R.drawable.img3);
                    } else if (x == 16) {
                        d4 = escolha;
                        if (c4.equals("v") && d4.equals("v")) {
                            filho4.setImageResource(R.drawable.quadrado_preenchido);
                            textViewFilho4.setText("vv");
                            textToSpeech.speak(tutorial_9law_hete_r, TextToSpeech.QUEUE_ADD, null);
                            textToSpeech.speak(tutorial_25law, TextToSpeech.QUEUE_FLUSH, null);
                            x = 17;
                        }
                    }
                } else {
                    System.out.println("print");
                    x = x - 1;
                }
            }

            @Override
            public void onLongPressTutorial() {
                textToSpeech.speak(tutorial_26law, TextToSpeech.QUEUE_FLUSH, null);
            }

            @Override
            public void LGesture() {
                Intent intent = new Intent(getApplicationContext(), activity_menu.class);
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
