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
public class R364EspionajeNavidad {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String linea="";
        do{
            String carta="";
            linea=br.readLine();
            char[] letras=linea.toCharArray();
            for(char unaLetra:letras){
                if(unaLetra==' '){
                    carta=carta+" ";
                }else if(unaLetra!='Z'){
                    char letra=(char)(unaLetra+1);
                    carta=carta+letra;
                }else{
                    carta=carta+'A';
                }
            }
            if(!linea.equalsIgnoreCase("fin")){
                System.out.println(carta);
            }
        }while(!linea.equalsIgnoreCase("fin"));
    }
}
