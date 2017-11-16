package com.example.mgfe.ahorcado;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by MGFE on 16/11/2017.
 */

public class Opciones extends Main_Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opciones);
        Button button1 = (Button) findViewById(R.id.button5);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Opciones.this, Juego.class);
                lg.opcion(1);
                lg.Arreglo(0);
                startActivity(intent);

            }
        });

        Button button2 = (Button) findViewById(R.id.button6);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Opciones.this, Juego.class);
                lg.opcion(2);
                lg.Arreglo(0);
                startActivity(intent);

            }
        });

        Button button3 = (Button) findViewById(R.id.button7);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Opciones.this, Juego.class);
                lg.opcion(3);
                lg.Arreglo(0);
                startActivity(intent);

            }
        });

        Button button4 = (Button) findViewById(R.id.button8);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Opciones.this, Juego.class);
                lg.opcion(4);
                lg.Arreglo(0);
                startActivity(intent);

            }
        });

        Button button5 = (Button) findViewById(R.id.button9);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Opciones.this, Juego.class);
                lg.opcion(5);
                lg.Arreglo(0);
                startActivity(intent);

            }
        });
    }





}


