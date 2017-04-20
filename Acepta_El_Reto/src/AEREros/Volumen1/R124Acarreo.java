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
public class R124Acarreo {
    public static void main (String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String caso=br.readLine();
            if(caso.equals("0 0"))break;
            caso=caso.replace(".", "");
            caso=caso.replace(",", "");
            String [] numero=caso.split(" ");
            while(numero[0].length()>numero[1].length()){
                numero[1]="0"+numero[1];
            }
            while(numero[1].length()>numero[0].length()){
                numero[0]="0"+numero[0];
            }
            String[] stringNum1=numero[0].split("");
            String[] stringNum2=numero[1].split("");
            byte[] num1=new byte[stringNum1.length];
            byte[] num2=new byte[stringNum2.length];
            for(int i=0;i<stringNum1.length;i++){
                num1[i]=Byte.parseByte(stringNum1[i]);
                num2[i]=Byte.parseByte(stringNum2[i]);
            }
            short resultado=0;
            byte acarreo=0;
            for(int i=num1.length-1;i>-1;i=i-1){
                if(num1[i]+num2[i]+acarreo>9){
                    resultado++;
                    acarreo=1;
                }else{
                    acarreo=0;
                }
            }
            System.out.println(resultado);
        }
    }
}
