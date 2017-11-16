package com.example.mgfe.ahorcado;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main_Activity extends Activity {
    public static final String mens = "Ingrese su nombre";
    public static Logica_Juego lg = new Logica_Juego();
    public static String Nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ahorcado);
        lg.incializar();

    }
    public void Mostrar(View view) {


                final EditText input = new EditText(Main_Activity.this);
                AlertDialog builder = new AlertDialog.Builder(Main_Activity.this)
                        .setTitle("INICIO")
                        .setMessage(mens)
                        .setView(input)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Editable nm = input.getText();
                                Nombre = nm.toString();

                                startActivity(new Intent(Main_Activity.this, Opciones.class));
                            }
                        })

                        .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        }).show();
            }
        };













