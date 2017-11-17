package com.example.mgfe.ahorcado;

import java.util.Random;

/**
 * Created by MGFE on 15/11/2017.
 */

public class Logica_Juego {
    public String [][]Pal = new String [5][10];
    public static String paltemp;
    public static int intentos=15;
    public static String linea ="";
    public static char []lin = linea.toCharArray();
    public static boolean finalizar = false;
    public  static int cont =0;





    public void incializar(){
        //Paises
        Pal[0][0]="HONDURAS";
        Pal[0][1]="HOLANDA";
        Pal[0][2]="ALEMANIA";
        Pal[0][3]="AUSTRALIA";
        Pal[0][4]="RUSIA";
        Pal[0][5]="CANADA";
        Pal[0][6]="POLONIA";
        Pal[0][7]="AFRICA";
        Pal[0][8]="MARRUECOS";
        Pal[0][9]="BRASIL";

        //Diccionario
        Pal[1][0]="PAMEMAS";
        Pal[1][1]="FRERROCARRIL";
        Pal[1][2]="AUTOMOVIL";
        Pal[1][3]="TREN";
        Pal[1][4]="PERRO";
        Pal[1][5]="JEFA";
        Pal[1][6]="RUMBA";
        Pal[1][7]="PLECTORICO";
        Pal[1][8]="GELIDO";
        Pal[1][9]="CLEPTOMANO";

        //Lugares
        Pal[2][0]="CEIBA";
        Pal[2][1]="CORTES";
        Pal[2][2]="VEGAS";
        Pal[2][3]="UNITEC";
        Pal[2][4]="CITYMALL";
        Pal[2][5]="CINEPOLIS";
        Pal[2][6]="MERCEDES";
        Pal[2][7]="FESITRAN";
        Pal[2][8]="OMOA";
        Pal[2][9]="BANCO";
        //frutas
        Pal[3][0]="PERA";
        Pal[3][1]="MANZANA";
        Pal[3][2]="BANANO";
        Pal[3][3]="MANGOSTIN";
        Pal[3][4]="MANGO";
        Pal[3][5]="FRESA";
        Pal[3][6]="SANDIA";
        Pal[3][7]="MELON";
        Pal[3][8]="NARANJA";
        Pal[3][9]="PAPAYA";
        //animales

        Pal[4][0]="PERRO";
        Pal[4][1]="GATO";
        Pal[4][2]="PAJARO";
        Pal[4][3]="PEZ";
        Pal[4][4]="HAMSTER";
        Pal[4][5]="CONEJO";
        Pal[4][6]="AVESTRUZ";
        Pal[4][7]="ELEFANTE";
        Pal[4][8]="ORNITORRINCO";
        Pal[4][9]="MURCIELAGO";

    }

    public String opcion(int opcion){
        Random rnd = new Random();
        int ran = rnd.nextInt(10)+0;

        switch (opcion){
            case 1:
               return paltemp=Pal[0][ran];

            case 2:
                return paltemp=Pal[1][ran];

            case 3:
                return paltemp= Pal[2][ran];

            case 4:
                return paltemp= Pal[3][ran];

            case 5:
                return paltemp=Pal[4][ran];

        }

    return null;
    }

    public void verificar(char a,int b){
        if(b>paltemp.length()-1){
            intentos--;
            return;
        }else if(paltemp.charAt(b) == a){
            lin[b]=a;
            cont++;
            verificar(a,b+1);
        }else{
            verificar(a,b+1);
        }
    }

    public String Arreglo (int a){
        if(a==paltemp.length()){
            return linea;

        }else{

            return "-"+ Arreglo(a+1);
        }
    }
    public boolean finalizar_(){
        if(cont==paltemp.length()){
            return true;
        }else if(intentos==0){
            return true;
        }else{
            return false;
        }
    }

}
