/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AEREros.Volumen3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Mauna Kea
 */
public class R376SietePicos{
    public static void main (String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int casos=Integer.parseInt(br.readLine());
            int respuesta=0;
            if (casos ==0) break;
            String entrada=br.readLine();
            String[] entradaPicos=entrada.split(" ");
            int[] picos=new int[entradaPicos.length];
            int cont=0;
            for(String numero:entradaPicos){
                picos[cont]=Integer.parseInt(numero);
                cont++;
            }
            if(picos[0]>picos[picos.length-1]&&picos[0]>picos[1])respuesta++;
            if(picos[picos.length-1]>picos[0]&&picos[picos.length-1]>picos[picos.length-2])respuesta++;
            for (int i=1;i<casos-1;i++){
                if (picos[i]>picos[i-1]&&picos[i]>picos[i+1])respuesta++;
            }
            System.out.println(respuesta);
        }
    }
}
