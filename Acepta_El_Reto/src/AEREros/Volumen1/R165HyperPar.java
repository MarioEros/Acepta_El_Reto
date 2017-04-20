/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AEREros.Volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Mauna Kea
 */
public class R165HyperPar {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        while(true){
            String num=br.readLine();
            if(num.contains("-"))break;
            System.out.println(procesarCaso(num));
            
        }
    }
    public static String procesarCaso(String num){
        if(num.contains("1")||num.contains("3")||num.contains("5")||num.contains("7")||num.contains("9")){
                return "NO";
            }else{
                return "SI";
            }
    }
}
