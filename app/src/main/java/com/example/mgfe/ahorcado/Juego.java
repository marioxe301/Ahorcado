package com.example.mgfe.ahorcado;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by MGFE on 16/11/2017.
 */

public class Juego extends Main_Activity  {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = (TextView)findViewById(R.id.Pal);
        textView.setText(Logica_Juego.linea);
        setContentView(R.layout.juego);


    }
    TextView textView = (TextView)findViewById(R.id.Pal);


}
