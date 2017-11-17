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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.juego);
        String lin = getIntent().getExtras().getString("Arln");
        String pal = getIntent().getExtras().getString("Paltem");
        char []Arlin = getIntent().getExtras().getCharArray("ln");
        int conta = getIntent().getExtras().getInt("cont");
        boolean check = getIntent().getExtras().getBoolean("Fin");
        textView = (TextView)findViewById(R.id.Pal);
        textView.setText(lin);
        }
    }





