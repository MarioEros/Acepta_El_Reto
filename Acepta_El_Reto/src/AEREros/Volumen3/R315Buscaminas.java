/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AEREros.Volumen3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Mauna Kea
 */
public class R315Buscaminas {
    public static void main(String[] args) throws IOException{
        BufferedReader lector=new BufferedReader(new InputStreamReader(System.in));
        while (lector.ready()){
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
            //for(int i=0;i<fila;i++)System.out.println(Arrays.toString(tablero[i]));
            String[][] solucion=new String[fila][col];
            for(int i=0;i<fila;i++){
                for(int e=0;e<col;e++){
                    solucion[i][e]="X";
                }
            }
            //System.out.println(Arrays.deepToString(solucion));
            int pulsos=Integer.parseInt(lector.readLine());
            for (int clics=0;clics<pulsos;clics++){
                entrada=lector.readLine().split(" ");
                int minafila=Integer.parseInt(entrada[0])-1;
                int minacol=Integer.parseInt(entrada[1])-1;
                solucion=unClic(minafila, minacol, solucion, tablero);
            }
            if(solucion[0][0].equals("NO"))System.out.println("GAME OVER");
            else{
                String respuesta="";
                for(int i=0;i<fila;i++)respuesta+="\n"+(Arrays.toString(solucion[i]).replace("[", "").replace(", ", "")).replace("]", "");
                System.out.println(respuesta.substring(1));
            }
        }
    }
    private static String[][] unClic(int unfila, int uncol, String[][] array, String[][] arraybomb) {
        if (arraybomb[unfila][uncol].equals("*"))return new String[][]{{"NO"}, {"BOMBA"}};
        ArrayList<Integer[]> clics = new ArrayList<>();
        clics.add(new Integer[]{unfila, uncol});
        while (clics.size() > 0) {
        ArrayList<Integer[]> nuevosClics = new ArrayList<>();
        int fila=clics.get(0)[0];
        int col=clics.get(0)[1];
            if (arraybomb[fila][col].equals("-")) {
                int bombas = 0;
                try {
                    if (arraybomb[fila-1][col-1].equals("*")) {
                        bombas++;
                    } else if(arraybomb[fila-1][col-1].equals("J")){
                        
                    }else {
                        nuevosClics.add(new Integer[]{fila-1, col-1});
                    }
                } catch (Exception e) {//System.out.println("Error -1 -1");
                }
                try {
                    if (arraybomb[fila-1][col].equals("*")) {
                        bombas++;
                    } else if(arraybomb[fila-1][col].equals("J")){
                        
                    } else {
                        nuevosClics.add(new Integer[]{fila-1, col});
                    }
                } catch (Exception e) {//System.out.println("Error -1 0");
                }
                try {
                    if (arraybomb[fila-1][col+1].equals("*")) {
                        bombas++;
                    } else if(arraybomb[fila-1][col+1].equals("J")){
                        
                    } else {
                        nuevosClics.add(new Integer[]{fila-1, col+1});
                    }
                } catch (Exception e) {//System.out.println("Error +1 +1");
                }
                try {
                    if (arraybomb[fila][col-1].equals("*")) {
                        bombas++;
                    } else if(arraybomb[fila][col-1].equals("J")){
                        
                    } else {
                        nuevosClics.add(new Integer[]{fila, col-1});
                    }
                } catch (Exception e) {//System.out.println("Error 0 -1");
                }
                try {
                    if (arraybomb[fila][col+1].equals("*")) {
                        bombas++;
                    } else if(arraybomb[fila][col+1].equals("J")){
                        
                    } else {
                        nuevosClics.add(new Integer[]{fila, col+1});
                    }
                } catch (Exception e) {//System.out.println("Error 0 +1");
                }
                try {
                    if (arraybomb[fila+1][col-1].equals("*")) {
                        bombas++;
                    } else if(arraybomb[fila+1][col-1].equals("J")){
                        
                    } else {
                        nuevosClics.add(new Integer[]{fila+1, col-1});
                    }
                } catch (Exception e) {//System.out.println("Error +1 -1");
                }
                try {
                    if (arraybomb[fila+1][col].equals("*")) {
                        bombas++;
                    } else if(arraybomb[fila+1][col].equals("J")){
                        
                    } else {
                        nuevosClics.add(new Integer[]{fila+1, col});
                    }
                } catch (Exception e) {//System.out.println("Error +1 0");
                }
                try {
                    if (arraybomb[fila+1][col+1].equals("*")) {
                        bombas++;
                    } else if(arraybomb[fila+1][col+1].equals("J")){
                        
                    } else {
                        nuevosClics.add(new Integer[]{fila+1, col+1});
                    }
                } catch (Exception e) {//System.out.println("Error +1 +1");
                }
                if(bombas>0){
                    array[fila][col]=""+bombas;
                    clics.remove(0);
                    arraybomb[fila][col]="J";
                }else{
                    array[fila][col]="-";
                    clics.remove(0);
                    arraybomb[fila][col]="J";
                    clics.addAll(nuevosClics);
                }
            }else clics.remove(0);
        }
        return array;

    }
}
