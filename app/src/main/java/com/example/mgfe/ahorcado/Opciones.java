package com.example.mgfe.ahorcado;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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
                intent.putExtra("Paltem",lg.opcion(1));
                intent.putExtra("Arln",lg.Arreglo(0));
                intent.putExtra("ln",Logica_Juego.lin);
                intent.putExtra("cont",Logica_Juego.cont);
                intent.putExtra("Fin",Logica_Juego.finalizar);
                startActivity(intent);


            }
        });

        Button button2 = (Button) findViewById(R.id.button6);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Opciones.this, Juego.class);
                intent.putExtra("Paltem",lg.opcion(2));
                intent.putExtra("Arln",lg.Arreglo(0));
                intent.putExtra("ln",Logica_Juego.lin);
                intent.putExtra("cont",Logica_Juego.cont);
                intent.putExtra("Fin",Logica_Juego.finalizar);
                startActivity(intent);

            }
        });

        Button button3 = (Button) findViewById(R.id.button7);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Opciones.this, Juego.class);
                intent.putExtra("Paltem",lg.opcion(3));
                intent.putExtra("Arln",lg.Arreglo(0));
                intent.putExtra("ln",Logica_Juego.lin);
                intent.putExtra("cont",Logica_Juego.cont);
                intent.putExtra("Fin",Logica_Juego.finalizar);
                startActivity(intent);

            }
        });

        Button button4 = (Button) findViewById(R.id.button8);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Opciones.this, Juego.class);
                intent.putExtra("Paltem",lg.opcion(4));
                intent.putExtra("Arln",lg.Arreglo(0));
                intent.putExtra("ln",Logica_Juego.lin);
                intent.putExtra("cont",Logica_Juego.cont);
                intent.putExtra("Fin",Logica_Juego.finalizar);

                startActivity(intent);

            }
        });

        Button button5 = (Button) findViewById(R.id.button9);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Opciones.this, Juego.class);
                intent.putExtra("Paltem",lg.opcion(5));
                intent.putExtra("Arln",lg.Arreglo(0));
                intent.putExtra("ln",Logica_Juego.lin);
                intent.putExtra("cont",Logica_Juego.cont);
                intent.putExtra("Fin",Logica_Juego.finalizar);
                startActivity(intent);

            }
        });
    }





}


