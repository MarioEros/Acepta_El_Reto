/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AEREros.Volumen3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author Mauna Kea
 */
public class R315Buscaminas {
    public static void main(String[] args) throws IOException{
        BufferedReader lector=new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String[] entrada=lector.readLine().split(" ");
            if(entrada[0].equals("0"))break;
            int fila=Integer.parseInt(entrada[0]);
            int col=Integer.parseInt(entrada[1]);
            String[][] tablero=new String[fila][col];
            for(int leeFilas=0;leeFilas<fila;leeFilas++){
                entrada=lector.readLine().split("");
                for (int columna=0;columna<col;columna++){
                    tablero[leeFilas][columna]=entrada[columna];
                }
            }
            for(int i=0;i<fila;i++)System.out.println(Arrays.toString(tablero[i]));
            int minas=Integer.parseInt(lector.readLine());
            for (int bomba=0;bomba<minas;bomba++){
                entrada=lector.readLine().split(" ");
                int minafila=Integer.parseInt(entrada[0]);
                int minacol=Integer.parseInt(entrada[1]);
                tablero=actualizar(minafila, minacol, tablero);
            }
            String respuesta="";
        }
    }
    private static String [][] actualizar(int fila, int col, String[][] array){
        
    }
}
