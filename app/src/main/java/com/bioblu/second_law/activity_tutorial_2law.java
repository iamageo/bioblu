package com.bioblu.second_law;
import com.bioblu.R;
import com.bioblu.controllers.OuvinteTelaTutorial;

import static com.bioblu.main.activity_voiceRate.FILE_NAME;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;



import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;


public class activity_tutorial_2law extends AppCompatActivity {
    private TextView textView1, textView2, textView3, textView4, textView5,
            textView6, textView7, textView8, textView9, textView10, textView11,
            textView12, textView13, textView14, textView15, textView16;
    private TextView textViewF11, textViewF12, textViewF2_1, textViewF2_2, textViewF2_3, textViewF2_4, textViewP1, textViewP2;
    private ImageView imageViewF11, imageViewF12, imageViewF2_1, imageViewF2_2, imageViewF2_3, imageViewF2_4, imageViewP1, imageViewP2;
    private TextToSpeech textToSpeech;
    public int screenWidth;
    private String [] genesParental = new String[8];
    private String [] geneP = new String[4];
    private String [] resultadoGene = new String[8];
    private String [] resultado = new String[4];
    private String [] valor_matriz = new String[32];
    private String [] lista_genes = new String[16];
    private String [] classificacao = new String[16];
    String gene_selecionado;
    String [] gene_selecionado1 = new String[4];
    public int velocidade;

    private int yx = 0, l1 = 0, l2 = 1, l3 = 2, l4 = 3, l5 = 4, l6 = 5, l7 = 6, l8 = 7, l9 = 8,
    l10 = 9, l11 = 10, l12 = 11, l13 = 12, l14 = 13, l15 = 14;
    private int i = -1;
    private int ix = -1;
    private int fx = -1;
    TextView[] cursor =  new TextView[16];

    private String [][] matriz_resultado = new String[4][4];
    private String [][] matriz_final = new String[4][4];

    String tutorial2law_1;
    String tutorial2law_2;
    String tutorial2law_3;
    String tutorial2law_4;
    String tutorial2law_5;
    String tutorial2law_6;
    String tutorial2law_7;
    String tutorial2law_8;
    String tutorial2law_9;
    String tutorial2law_10;
    String tutorial2law_11;
    String tutorial2law_12;
    String tutorial2law_13;
    String tutorial2law_14;
    String tutorial2law_15;
    String tutorial2law_16;
    String tutorial2law_17;
    String tutorial2law_18;
    String tutorial2law_19;
    String tutorial2law_20;
    String tutorial2law_21;
    String tutorial2law_22;
    String tutorial2law_23;
    String tutorial2law_24;
    String tutorial2law_25;
    String tutorial2law_26;
    String tutorial2law_27;
    String tutorial2law_28;
    String tutorial2law_29;
    String tutorial2law_30;
    String tutorial2law_31;
    String tutorial2law_32;
    String tutorial2law_33;
    String tutorial2law_34;
    String tutorial2law_35;
    String tutorial2law_36;
    String tutorial2law_37;
    String tutorial2law_38;
    String tutorial2law_39;
    String tutorial2law_40;
    String tutorial2law_41;
    String tutorial2law_42;
    String tutorial2law_43;
    String tutorial2law_44;
    String tutorial2law_45;
    String tutorial2law_46;
    String tutorial2law_47;
    String tutorial2law_48;
    String tutorial2law_49;
    String tutorial2law_50;
    String tutorial2law_51;
    String tutorial2law_52;
    String tutorial2law_53;
    String tutorial2law_54;
    String tutorial2law_55;
    String tutorial2law_56;
    String tutorial2law_57;
    String tutorial2law_58;
    String tutorial2law_59;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial_2law);

        tutorial2law_1 = getString(R.string.tutorial2law_1);
        tutorial2law_2 = getString(R.string.tutorial2law_2);
        tutorial2law_3 = getString(R.string.tutorial2law_3);
        tutorial2law_4 = getString(R.string.tutorial2law_4);
        tutorial2law_5 = getString(R.string.tutorial2law_5);
        tutorial2law_6 = getString(R.string.tutorial2law_6);
        tutorial2law_7 = getString(R.string.tutorial2law_7);
        tutorial2law_8 = getString(R.string.tutorial2law_8);
        tutorial2law_9 = getString(R.string.tutorial2law_9);
        tutorial2law_10 = getString(R.string.tutorial2law_10);
        tutorial2law_11 = getString(R.string.tutorial2law_11);
        tutorial2law_12 = getString(R.string.tutorial2law_12);
        tutorial2law_13 = getString(R.string.tutorial2law_13);
        tutorial2law_14 = getString(R.string.tutorial2law_14);
        tutorial2law_15 = getString(R.string.tutorial2law_15);
        tutorial2law_16 = getString(R.string.tutorial2law_16);
        tutorial2law_17 = getString(R.string.tutorial2law_17);
        tutorial2law_18 = getString(R.string.tutorial2law_18);
        tutorial2law_19 = getString(R.string.tutorial2law_19);
        tutorial2law_20 = getString(R.string.tutorial2law_20);
        tutorial2law_21 = getString(R.string.tutorial2law_21);
        tutorial2law_22 = getString(R.string.tutorial2law_22);
        tutorial2law_23 = getString(R.string.tutorial2law_23);
        tutorial2law_24 = getString(R.string.tutorial2law_24);
        tutorial2law_25 = getString(R.string.tutorial2law_25);
        tutorial2law_26 = getString(R.string.tutorial2law_26);
        tutorial2law_27 = getString(R.string.tutorial2law_27);
        tutorial2law_28 = getString(R.string.tutorial2law_28);
        tutorial2law_29 = getString(R.string.tutorial2law_29);
        tutorial2law_30 = getString(R.string.tutorial2law_30);
        tutorial2law_31 = getString(R.string.tutorial2law_31);
        tutorial2law_32 = getString(R.string.tutorial2law_32);
        tutorial2law_33 = getString(R.string.tutorial2law_33);
        tutorial2law_34 = getString(R.string.tutorial2law_34);
        tutorial2law_35 = getString(R.string.tutorial2law_35);
        tutorial2law_36 = getString(R.string.tutorial2law_36);
        tutorial2law_37 = getString(R.string.tutorial2law_37);
        tutorial2law_38 = getString(R.string.tutorial2law_38);
        tutorial2law_39 = getString(R.string.tutorial2law_39);
        tutorial2law_40 = getString(R.string.tutorial2law_40);
        tutorial2law_41 = getString(R.string.tutorial2law_41);
        tutorial2law_42 = getString(R.string.tutorial2law_42);
        tutorial2law_43 = getString(R.string.tutorial2law_43);
        tutorial2law_44 = getString(R.string.tutorial2law_44);
        tutorial2law_45 = getString(R.string.tutorial2law_45);
        tutorial2law_46 = getString(R.string.tutorial2law_46);
        tutorial2law_47 = getString(R.string.tutorial2law_47);
        tutorial2law_48 = getString(R.string.tutorial2law_48);
        tutorial2law_49 = getString(R.string.tutorial2law_49);
        tutorial2law_50 = getString(R.string.tutorial2law_50);
        tutorial2law_51 = getString(R.string.tutorial2law_51);
        tutorial2law_52 = getString(R.string.tutorial2law_52);
        tutorial2law_53 = getString(R.string.tutorial2law_53);
        tutorial2law_54 = getString(R.string.tutorial2law_54);
        tutorial2law_55 = getString(R.string.tutorial2law_55);
        tutorial2law_56 = getString(R.string.tutorial2law_56);
        tutorial2law_57 = getString(R.string.tutorial2law_57);
        tutorial2law_58 = getString(R.string.tutorial2law_58);
        tutorial2law_59 = getString(R.string.tutorial2law_59);

        //instância dos elementos parentais
        textViewP1 = findViewById(R.id.textViewP1);
        textViewP2 = findViewById(R.id.textViewP2);
        imageViewP1 = findViewById(R.id.imageViewP1);
        imageViewP2 = findViewById(R.id.imageViewP2);

        //instância dos elementos F1
        textViewF11 = findViewById(R.id.textViewF11_tutorial1law);
        textViewF12 = findViewById(R.id.textViewF12_tutorial1law);
        imageViewF11 = findViewById(R.id.imageViewF11_2law);
        imageViewF12 = findViewById(R.id.imageViewF12_2law);

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
        cursor[1] = textView2 = findViewById(R.id.law1_filho2);
        cursor[2] = textView3 = findViewById(R.id.law1_filho3);
        cursor[3] = textView4 = findViewById(R.id.law1_filho4);
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

        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        /* tratamento de erro da api de fala */
        textToSpeech = new TextToSpeech(activity_tutorial_2law.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                ler_velocidade();
                if (status != TextToSpeech.ERROR) {
                    textToSpeech.setLanguage(Locale.getDefault());
                    textToSpeech.setSpeechRate(velocidade);
                    textToSpeech.speak(tutorial2law_1, TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        screenWidth = displayMetrics.widthPixels;
        initTela ();
    }

    @SuppressLint("ClickableViewAccessibility")
    public void initTela() {

        RelativeLayout Rlayout = findViewById(R.id.relativeLayoutconceito);

        Rlayout.setOnTouchListener(new OuvinteTelaTutorial(activity_tutorial_2law.this, screenWidth ) {
            @Override
            public void onSwipeTopE() {
                if ((gene_x == 0) || (gene_x == 1) || (gene_x == 8) || (gene_x == 12) || (gene_x == 14)) {
                    escolhaGeneP = tutorial2law_2;
                    textToSpeech.speak( tutorial2law_3 + tutorial2law_4  + tutorial2law_5, TextToSpeech.QUEUE_FLUSH, null);
                    escolhafala =  tutorial2law_4;
                }
                else if ((gene_x == 2) || (gene_x == 3) || (gene_x == 10) || (gene_x == 13) || (gene_x == 17)) {
                    textToSpeech.speak(tutorial2law_6, TextToSpeech.QUEUE_FLUSH, null);

                } else if ((gene_x == 4) || (gene_x == 5) || (gene_x == 9)|| (gene_x == 16) || (gene_x == 18) || (gene_x == 6) || (gene_x == 7) || (gene_x == 15) || (gene_x == 19) || (gene_x == 11)) {
                    textToSpeech.speak(tutorial2law_7, TextToSpeech.QUEUE_FLUSH, null);

                }

                else if (gene_x > 19 && gene_x < 36){
                    escolhaGeneP = tutorial2law_2;
                    textToSpeech.speak(tutorial2law_3 + tutorial2law_4 + tutorial2law_5, TextToSpeech.QUEUE_FLUSH, null);
                    escolhafala =  tutorial2law_4;
                } else if (gene_x >= 36) {
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
                    textToSpeech.speak("item: " + i+1 + classificacao[i], TextToSpeech.QUEUE_FLUSH, null);
                }
            }

            @Override
            public void onSwipeBottomE() {
                if ((gene_x == 2) || (gene_x == 3) || (gene_x == 10) || (gene_x == 13) || (gene_x == 17)) {
                    escolhaGeneP = tutorial2law_8;
                    textToSpeech.speak(tutorial2law_3 + tutorial2law_9 + tutorial2law_5, TextToSpeech.QUEUE_FLUSH, null);
                    escolhafala = tutorial2law_9;

                }
                else if ((gene_x == 0) || (gene_x == 1) || (gene_x == 8) || (gene_x == 12) || (gene_x == 14)) {
                    textToSpeech.speak(tutorial2law_10, TextToSpeech.QUEUE_FLUSH, null);
                }
                else if ((gene_x == 4) || (gene_x == 5) || (gene_x == 9)|| (gene_x == 16) || (gene_x == 18) || (gene_x == 6) || (gene_x == 7) || (gene_x == 15) || (gene_x == 19) || (gene_x == 11)){
                    textToSpeech.speak(tutorial2law_11, TextToSpeech.QUEUE_FLUSH, null);

                }

                else if (gene_x > 19 && gene_x < 36) {
                    escolhaGeneP = tutorial2law_8;
                    textToSpeech.speak(tutorial2law_3 + tutorial2law_9 + tutorial2law_5, TextToSpeech.QUEUE_FLUSH, null);
                    escolhafala = tutorial2law_9;
                } else if (gene_x >= 36) {

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
                    textToSpeech.speak("item: " + i+1 + classificacao[i], TextToSpeech.QUEUE_FLUSH, null);
                    if (ix > 0) {
                        cursor[ix - 1].setBackgroundColor(Color.TRANSPARENT);
                    }
                }
            }

            @Override
            public void onSwipeTopD() {

            if ((gene_x == 4) || (gene_x == 5) || (gene_x == 9)|| (gene_x == 16) || (gene_x == 18)) {
                escolhaGeneP = tutorial2law_12;
                textToSpeech.speak(tutorial2law_3 + tutorial2law_13 + tutorial2law_5, TextToSpeech.QUEUE_FLUSH, null);
                escolhafala =  tutorial2law_13;
            }
            else if ((gene_x == 6) || (gene_x == 7) || (gene_x == 15) || (gene_x == 19) || (gene_x == 11)) {
                textToSpeech.speak(tutorial2law_6, TextToSpeech.QUEUE_FLUSH, null);
            }
            else if ((gene_x == 0) || (gene_x == 1) || (gene_x == 8) || (gene_x == 12) || (gene_x == 14) || (gene_x == 2) || (gene_x == 3) || (gene_x == 10) || (gene_x == 13) || (gene_x == 17)) {
                textToSpeech.speak(tutorial2law_7, TextToSpeech.QUEUE_FLUSH, null);
            }

            else if (gene_x > 19 && gene_x < 36){
                escolhaGeneP = tutorial2law_12;
                textToSpeech.speak(tutorial2law_3 +tutorial2law_13 + tutorial2law_5, TextToSpeech.QUEUE_FLUSH, null);
                escolhafala =  tutorial2law_13;
            } else if (gene_x >= 36) {

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
                    textToSpeech.speak("item: " + i+1 + classificacao[i], TextToSpeech.QUEUE_FLUSH, null);
                }
            }

            @Override
            public void onSwipeBottomD() {
                if ((gene_x == 6) || (gene_x == 7) || (gene_x == 15) || (gene_x == 19) || (gene_x == 11)) {
                    escolhaGeneP = tutorial2law_14;
                    textToSpeech.speak(tutorial2law_3 + tutorial2law_15 +  tutorial2law_5, TextToSpeech.QUEUE_FLUSH, null);
                    escolhafala = tutorial2law_15;
                } else if ((gene_x == 4) || (gene_x == 5) || (gene_x == 9)|| (gene_x == 16) || (gene_x == 18)) {
                    textToSpeech.speak(tutorial2law_10, TextToSpeech.QUEUE_FLUSH, null);

                } else if ((gene_x == 0) || (gene_x == 1) || (gene_x == 8) || (gene_x == 12) || (gene_x == 14) || (gene_x == 2) || (gene_x == 3) || (gene_x == 10) || (gene_x == 13) || (gene_x == 17)) {
                    textToSpeech.speak(tutorial2law_11, TextToSpeech.QUEUE_FLUSH, null);
                }
                else if (gene_x > 19 && gene_x < 36) {
                    escolhaGeneP = tutorial2law_14;
                    textToSpeech.speak(tutorial2law_3 + tutorial2law_15 + tutorial2law_5, TextToSpeech.QUEUE_FLUSH, null);
                    escolhafala = tutorial2law_15;
                }
                else if (gene_x >= 35) {
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
                    textToSpeech.speak("item: " + i+1 + classificacao[i], TextToSpeech.QUEUE_FLUSH, null);
                    if (ix > 0) {
                        cursor[ix - 1].setBackgroundColor(Color.TRANSPARENT);
                    }
                }
            }

            @Override
            public void LGesture() {
                finish();
                Intent intent = new Intent(activity_tutorial_2law.this, activity_menu_2law.class);
                startActivity(intent);

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
            public void doubleTap() {
                textToSpeech.speak(tutorial2law_16 + escolhafala, textToSpeech.QUEUE_FLUSH, null);
                if (escolhaGeneP != null) {
                    if (gene_x == 0) {
                        genesParental[gene_x] = escolhaGeneP;
                        textToSpeech.speak(tutorial2law_17, TextToSpeech.QUEUE_ADD, null);
                    } else if (gene_x == 1) {
                        genesParental[gene_x] = escolhaGeneP;
                        textToSpeech.speak(tutorial2law_18, TextToSpeech.QUEUE_ADD, null);
                    } else if (gene_x == 2) {
                        genesParental[gene_x] = escolhaGeneP;
                        textToSpeech.speak(tutorial2law_19, TextToSpeech.QUEUE_ADD, null);
                    } else if (gene_x == 3) {
                        genesParental[gene_x] = escolhaGeneP;
                        imageViewP1.setImageResource(R.drawable.quadrado_normal);
                        textViewP1.setText("VVRR");
                        textToSpeech.speak(tutorial2law_20, TextToSpeech.QUEUE_ADD, null);
                    } else if (gene_x == 4) {
                        genesParental[gene_x] = escolhaGeneP;
                        textToSpeech.speak(tutorial2law_21, TextToSpeech.QUEUE_ADD, null);
                    } else if (gene_x == 5) {
                        genesParental[gene_x] = escolhaGeneP;
                        textToSpeech.speak(tutorial2law_22, TextToSpeech.QUEUE_ADD, null);
                    } else if (gene_x == 6) {
                        genesParental[gene_x] = escolhaGeneP;
                        textToSpeech.speak(tutorial2law_23, TextToSpeech.QUEUE_ADD, null);
                    } else if (gene_x == 7) {
                        genesParental[gene_x] = escolhaGeneP;
                        imageViewP2.setImageResource(R.drawable.quadrado_preenchido);
                        textViewP2.setText("vvrr");
                        textToSpeech.speak(tutorial2law_24, TextToSpeech.QUEUE_ADD, null);
                    } else if (gene_x == 8) {
                        geneP[0] = escolhaGeneP;
                        textToSpeech.speak(tutorial2law_25, TextToSpeech.QUEUE_ADD, null);
                    } else if (gene_x == 9) {
                        geneP[1] = escolhaGeneP;
                        textViewF11.setText("Vv");
                        imageViewF11.setImageResource(R.drawable.quadrado_normal);
                        textToSpeech.speak(tutorial2law_26, TextToSpeech.QUEUE_ADD, null);
                    } else if (gene_x == 10) {
                        geneP[2] = escolhaGeneP;
                        textToSpeech.speak(tutorial2law_27, TextToSpeech.QUEUE_ADD, null);
                    } else if (gene_x == 11) {
                        geneP[3] = escolhaGeneP;
                        textViewF12.setText("Rr");
                        imageViewF12.setImageResource(R.drawable.quadrado_normal);
                        textToSpeech.speak(tutorial2law_28, TextToSpeech.QUEUE_ADD, null);
                    } else if (gene_x == 12) {
                        resultadoGene[0] = escolhaGeneP;
                        textToSpeech.speak(tutorial2law_29, TextToSpeech.QUEUE_ADD, null);
                    } else if (gene_x == 13) {
                        resultadoGene[1] = escolhaGeneP;
                        resultado[0] = resultadoGene[0] + resultadoGene[1];

                        if (resultadoGene[0].equals(resultadoGene[0].toUpperCase()) && resultadoGene[1].equals(resultadoGene[1].toUpperCase())) {
                            gene_selecionado1[0] = tutorial2law_30;
                            textViewF2_1.setText("VR");
                            imageViewF2_1.setImageResource(R.drawable.quadrado_normal);
                        } else if (resultadoGene[0].equals(resultadoGene[0].toUpperCase()) && resultadoGene[1].equals(resultadoGene[1].toLowerCase())) {
                            gene_selecionado1[0] = tutorial2law_31;
                            textViewF2_1.setText("Vr");
                            imageViewF2_1.setImageResource(R.drawable.quadrado_normal);
                        } else if (resultadoGene[0].equals(resultadoGene[0].toLowerCase()) && resultadoGene[1].equals(resultadoGene[1].toUpperCase())) {
                            gene_selecionado1[0] = tutorial2law_31;
                            textViewF2_1.setText("vR");
                            imageViewF2_1.setImageResource(R.drawable.quadrado_normal);
                        } else {
                            gene_selecionado1[0] = tutorial2law_32;
                            textViewF2_1.setText("vr");
                            imageViewF2_1.setImageResource(R.drawable.quadrado_preenchido);
                        }
                        textToSpeech.speak(tutorial2law_33, TextToSpeech.QUEUE_ADD, null);
                    } else if (gene_x == 14) {
                        resultadoGene[2] = escolhaGeneP;
                        textToSpeech.speak(tutorial2law_34, TextToSpeech.QUEUE_ADD, null);
                    } else if (gene_x == 15) {
                        resultadoGene[3] = escolhaGeneP;
                        resultado[1] = resultadoGene[2] + resultadoGene[3];

                        if (resultadoGene[2].equals(resultadoGene[2].toUpperCase()) && resultadoGene[3].equals(resultadoGene[3].toUpperCase())) {
                            gene_selecionado1[1] = tutorial2law_30;
                            textViewF2_2.setText("VR");
                            imageViewF2_2.setImageResource(R.drawable.quadrado_normal);
                        } else if (resultadoGene[2].equals(resultadoGene[2].toUpperCase()) && resultadoGene[3].equals(resultadoGene[3].toLowerCase())) {
                            gene_selecionado1[1] = tutorial2law_31;
                            textViewF2_2.setText("Vr");
                            imageViewF2_2.setImageResource(R.drawable.quadrado_normal);
                        } else if (resultadoGene[2].equals(resultadoGene[2].toLowerCase()) && resultadoGene[3].equals(resultadoGene[3].toUpperCase())) {
                            gene_selecionado1[1] = tutorial2law_31;
                            textViewF2_2.setText("vR");
                            imageViewF2_2.setImageResource(R.drawable.quadrado_normal);
                        } else {
                            gene_selecionado1[1] = tutorial2law_32;
                            textViewF2_2.setText("vr");
                            imageViewF2_2.setImageResource(R.drawable.quadrado_preenchido);
                        }
                        textToSpeech.speak(tutorial2law_35, TextToSpeech.QUEUE_ADD, null);
                    } else if (gene_x == 16) {
                        resultadoGene[4] = escolhaGeneP;
                        textToSpeech.speak(tutorial2law_36, TextToSpeech.QUEUE_ADD, null);
                    } else if (gene_x == 17) {
                        resultadoGene[5] = escolhaGeneP;
                        resultado[2] = resultadoGene[4] + resultadoGene[5];


                        if (resultadoGene[4].equals(resultadoGene[4].toUpperCase()) && resultadoGene[5].equals(resultadoGene[5].toUpperCase())) {
                            gene_selecionado1[2] = tutorial2law_30;
                            textViewF2_3.setText("VR");
                            imageViewF2_3.setImageResource(R.drawable.quadrado_normal);
                        } else if (resultadoGene[4].equals(resultadoGene[4].toUpperCase()) && resultadoGene[5].equals(resultadoGene[5].toLowerCase())) {
                            gene_selecionado1[2] = tutorial2law_31;
                            textViewF2_3.setText("Vr");
                            imageViewF2_3.setImageResource(R.drawable.quadrado_normal);
                        } else if (resultadoGene[4].equals(resultadoGene[4].toLowerCase()) && resultadoGene[5].equals(resultadoGene[5].toUpperCase())) {
                            gene_selecionado1[2] = tutorial2law_31;
                            textViewF2_3.setText("vR");
                            imageViewF2_3.setImageResource(R.drawable.quadrado_normal);
                        } else {
                            gene_selecionado1[2] =tutorial2law_32;
                            textViewF2_3.setText("vr");
                            imageViewF2_3.setImageResource(R.drawable.quadrado_preenchido);
                        }
                        textToSpeech.speak(tutorial2law_37, TextToSpeech.QUEUE_ADD, null);
                    } else if (gene_x == 18) {
                        resultadoGene[6] = escolhaGeneP;
                        textToSpeech.speak(tutorial2law_38, TextToSpeech.QUEUE_ADD, null);
                    } else if (gene_x == 19) {
                        resultadoGene[7] = escolhaGeneP;
                        resultado[3] = resultadoGene[6] + resultadoGene[7];



                        if (resultadoGene[6].equals(resultadoGene[6].toUpperCase()) && resultadoGene[7].equals(resultadoGene[7].toUpperCase())) {
                            gene_selecionado1[3] =tutorial2law_30;
                            textViewF2_4.setText("VR");
                            imageViewF2_4.setImageResource(R.drawable.quadrado_preenchido);
                        } else if (resultadoGene[6].equals(resultadoGene[6].toUpperCase()) && resultadoGene[7].equals(resultadoGene[7].toLowerCase())) {
                            gene_selecionado1[3] = tutorial2law_31;
                            textViewF2_4.setText("Vr");
                            imageViewF2_4.setImageResource(R.drawable.quadrado_preenchido);
                        } else if (resultadoGene[6].equals(resultadoGene[6].toLowerCase()) && resultadoGene[7].equals(resultadoGene[7].toUpperCase())) {
                            gene_selecionado1[3] = tutorial2law_31;
                            textViewF2_4.setText("vR");
                            imageViewF2_4.setImageResource(R.drawable.quadrado_preenchido);
                        } else {
                            gene_selecionado1[3] = tutorial2law_32;
                            textViewF2_4.setText("vr");
                            imageViewF2_4.setImageResource(R.drawable.quadrado_preenchido);
                        }

                        /* tratar matriz resultado */
                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {
                                matriz_final[i][j] = resultado[i] + resultado[j];
                            }
                        }

                        textToSpeech.speak(tutorial2law_39, TextToSpeech.QUEUE_ADD, null);
                        /** Quadro de Punnet aqui **/
                    } else if (gene_x == 20) { /* linha 0, coluna 0*/
                        valor_matriz[0] = escolhaGeneP;
                        textToSpeech.speak(tutorial2law_40, TextToSpeech.QUEUE_ADD, null);
                    } else if (gene_x == 21) {
                        valor_matriz[1] = escolhaGeneP;
                        matriz_resultado[0][0] = valor_matriz[0] + valor_matriz[1];
                        textToSpeech.speak(tutorial2law_41, TextToSpeech.QUEUE_ADD, null);
                    } else if (gene_x == 22) { /* linha 0, coluna 1*/
                        valor_matriz[2] = escolhaGeneP;
                        textToSpeech.speak(tutorial2law_42, TextToSpeech.QUEUE_ADD, null);
                    } else if (gene_x == 23) {
                        valor_matriz[3] = escolhaGeneP;
                        lista_genes[0] = valor_matriz[0] + valor_matriz[1] + valor_matriz[2] + valor_matriz[3];
                        matriz_resultado[0][1] = valor_matriz[2] + valor_matriz[3];
                        textView1.setText(lista_genes[0]); // final primeiro alelo

                        if (lista_genes[0].equals(matriz_final[0][0])) {
                            textToSpeech.speak(tutorial2law_43, TextToSpeech.QUEUE_ADD, null);
                        } else {
                            textToSpeech.speak(tutorial2law_44, TextToSpeech.QUEUE_ADD, null);
                            gene_x -= 4;
                        }

                    } else if (gene_x == 24) { /* linha 0, coluna 1*/
                        valor_matriz[4] = escolhaGeneP;
                        textToSpeech.speak(tutorial2law_45, TextToSpeech.QUEUE_ADD, null);
                    } else if (gene_x == 25) {
                        textToSpeech.speak(tutorial2law_46, TextToSpeech.QUEUE_ADD, null);
                        valor_matriz[5] = escolhaGeneP;
                        escolhaGeneP = null;
                        matriz_resultado[0][2] = valor_matriz[4] + valor_matriz[5];


                    } else if (gene_x == 26) { /* linha 0, coluna 2*/
                        textToSpeech.speak(tutorial2law_47, TextToSpeech.QUEUE_ADD, null);
                        valor_matriz[6] = escolhaGeneP;
                        escolhaGeneP = null;
                    } else if (gene_x == 27) {
                        textToSpeech.speak(tutorial2law_48, TextToSpeech.QUEUE_ADD, null);
                        valor_matriz[7] = escolhaGeneP;
                        lista_genes[1] = valor_matriz[4] + valor_matriz[5] + valor_matriz[6] + valor_matriz[7];
                        matriz_resultado[0][3] = valor_matriz[6] + valor_matriz[7];
                        textView2.setText(lista_genes[1]);

                        if (lista_genes[1].equals(matriz_final[0][1])) {
                            textToSpeech.speak(tutorial2law_49, TextToSpeech.QUEUE_ADD, null);
                        } else {
                            textToSpeech.speak(tutorial2law_44, TextToSpeech.QUEUE_ADD, null);
                            gene_x -= 4;
                        } // tratar outros dois

                    } else if (gene_x == 28) { /* linha 0, coluna 3*/
                        valor_matriz[8] = escolhaGeneP;
                        textToSpeech.speak(tutorial2law_50, TextToSpeech.QUEUE_ADD, null);
                    } else if (gene_x == 29) {
                        valor_matriz[9] = escolhaGeneP;
                        matriz_resultado[1][0] = valor_matriz[8] + valor_matriz[9];
                        textToSpeech.speak(tutorial2law_51, TextToSpeech.QUEUE_ADD, null);
                    } else if (gene_x == 30) { /* linha 0, coluna 1*/
                        valor_matriz[10] = escolhaGeneP;
                        textToSpeech.speak(tutorial2law_52, TextToSpeech.QUEUE_ADD, null);
                    } else if (gene_x == 31) {
                        valor_matriz[11] = escolhaGeneP;
                        lista_genes[2] = valor_matriz[8] + valor_matriz[9] + valor_matriz[10] + valor_matriz[11];
                        matriz_resultado[1][1] = valor_matriz[2] + valor_matriz[3];
                        textView3.setText(lista_genes[2]); // final primeiro alelo

                        if (lista_genes[2].equals(matriz_final[0][2])) {
                            textToSpeech.speak(tutorial2law_53, TextToSpeech.QUEUE_ADD, null);
                        } else {
                            textToSpeech.speak(tutorial2law_44, TextToSpeech.QUEUE_ADD, null);
                            gene_x -= 4;
                        } // tratar outros dois

                    } else if (gene_x == 32) { /* linha 0, coluna 4*/
                        valor_matriz[12] = escolhaGeneP;
                        textToSpeech.speak(tutorial2law_54, TextToSpeech.QUEUE_ADD, null);
                    } else if (gene_x == 33) {
                        textToSpeech.speak(tutorial2law_55, TextToSpeech.QUEUE_ADD, null);
                        valor_matriz[13] = escolhaGeneP;
                        escolhaGeneP = null;
                        matriz_resultado[1][2] = valor_matriz[12] + valor_matriz[13];


                    } else if (gene_x == 34) { /* linha 0, coluna 2*/
                        textToSpeech.speak(tutorial2law_56, TextToSpeech.QUEUE_ADD, null);
                        valor_matriz[14] = escolhaGeneP;
                        escolhaGeneP = null;
                    } else if (gene_x == 35) {
                        textToSpeech.speak(tutorial2law_57, TextToSpeech.QUEUE_ADD, null);
                        valor_matriz[15] = escolhaGeneP;
                        lista_genes[3] = valor_matriz[12] + valor_matriz[13] + valor_matriz[14] + valor_matriz[15];
                        matriz_resultado[1][3] = valor_matriz[14] + valor_matriz[15];
                        textView4.setText(lista_genes[3]);

                        if (lista_genes[3].equals(matriz_final[0][3])) {
                            textToSpeech.speak(tutorial2law_58, TextToSpeech.QUEUE_ADD, null);
                        } else {
                            textToSpeech.speak(tutorial2law_44, TextToSpeech.QUEUE_ADD, null);
                            gene_x -= 4;
                        }
                    } else if (gene_x == 36) {


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


                        textToSpeech.speak(tutorial2law_59, TextToSpeech.QUEUE_ADD, null);

                    }
                }
            }

        });
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
        textToSpeech.stop();
        if(textToSpeech != null) {
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
