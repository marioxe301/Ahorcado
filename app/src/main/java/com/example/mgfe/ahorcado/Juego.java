package com.example.mgfe.ahorcado;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by MGFE on 16/11/2017.
 */

public class Juego extends Main_Activity {
    TextView textView;
    TextView tv;
    int conta;
    String lin;
    String pal;
    char []Arlin;
    boolean check;
    int []imagenes = {R.drawable.hangman01,R.drawable.hangman02,R.drawable.hangman03,R.drawable.hangman04,R.drawable.hangman05,R.drawable.hangman06,R.drawable.hangman07,R.drawable.hangman08,R.drawable.hangman09,R.drawable.hangman10,R.drawable.hangman11,R.drawable.hangman12,R.drawable.hangman13,R.drawable.hangman14,R.drawable.hangman15,R.drawable.hangman_completo};


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.juego);
        lin = getIntent().getExtras().getString("Arln");
        pal = getIntent().getExtras().getString("Paltem");
        Arlin = lin.toCharArray();
        conta = getIntent().getExtras().getInt("cont");
        check = getIntent().getExtras().getBoolean("Fin");
        textView = (TextView)findViewById(R.id.Pal);
        textView.setText(String.valueOf(Arlin));
        tv = (TextView)findViewById(R.id.nom);
        tv.setText(Main_Activity.Nombre);
        /*Toast toast = Toast.makeText(getApplicationContext(),"EL POLLO CON UNA PATA",Toast.LENGTH_LONG);
        toast.show();*/
        ImageView imageView = (ImageView)findViewById(R.id.Img);
        imageView.setImageResource(imagenes[0]);
        }

    }





