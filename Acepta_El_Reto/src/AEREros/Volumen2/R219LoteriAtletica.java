/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AEREros.Volumen2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Mauna Kea
 */
public class R219LoteriAtletica {

    /*public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int casos = Integer.parseInt(br.readLine());
        for(int i=0;i<casos;i++){
            int loteriaDisponible= Integer.parseInt(br.readLine());
            String [] numeros= br.readLine().split(" ");
            int loteriaComprable=0;
            for(int e=0;e<loteriaDisponible;e++){
                if(Integer.parseInt(numeros[e])%2==0){
                    loteriaComprable++;
                }
                    
            }
            System.out.println(loteriaComprable);
        }
    }*/
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int casos = Integer.parseInt(br.readLine());
        for(int i=0;i<casos;i++){
            int loteriaDisponible= Integer.parseInt(br.readLine());
            String [] numeros= br.readLine().split(" ");
            int loteriaComprable=0;
            for(int e=0;e<loteriaDisponible;e++){
                if(numeros[e].endsWith("0")||numeros[e].endsWith("2")||numeros[e].endsWith("4")||numeros[e].endsWith("6")||numeros[e].endsWith("8")){
                    loteriaComprable++;
                }
                    
            }
            System.out.println(loteriaComprable);
        }
    }
}
