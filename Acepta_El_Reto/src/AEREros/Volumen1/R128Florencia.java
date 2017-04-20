/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AEREros.Volumen1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Mauna Kea
 */
public class R128Florencia {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String varillasString=br.readLine();
            if(varillasString.equals("-1"))break;
            String paraguasString=br.readLine();
            //paraguasString=paraguasString.replaceAll(",", "");
            //paraguasString=paraguasString.replaceAll(".", "");
            ArrayList<String> paraguasDatos=new ArrayList();
            String[] paraguasarray=paraguasString.split(" ");
            for(String palabra:paraguasarray){
                paraguasDatos.add(palabra);
            }
            while(true){
                if(paraguasDatos.get(0).equals("-1"))break;
                
            }
            
        }
    }
   
}
