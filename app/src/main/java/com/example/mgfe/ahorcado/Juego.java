package com.example.mgfe.ahorcado;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by MGFE on 16/11/2017.
 */

public class Juego extends Main_Activity {
    TextView textView;
    int conta;
    String lin;
    String pal;
    char []Arlin;
    boolean check;
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
        }

    }





