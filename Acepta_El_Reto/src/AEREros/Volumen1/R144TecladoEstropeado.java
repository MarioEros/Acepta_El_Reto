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
public class R144TecladoEstropeado {
    public static void main(String[] args) throws IOException {
        BufferedReader lector=new BufferedReader(new InputStreamReader(System.in));
        String datos=lector.readLine();
        while(datos!=null){
            String[] entrada=datos.split("");
            StringBuilder solucion= new StringBuilder("");
            int indice=0;
            for(int i=0;i<entrada.length;i++){
                if (entrada[i].equals("-")){
                    indice=0;
                }else if (entrada[i].equals("+")){
                    indice=solucion.length();
                }else if (entrada[i].equals("*")){
                    indice++;
                }else if (entrada[i].equals("3")){
                    if(solucion.length()>=indice+1)solucion=new StringBuilder(solucion.substring(0, indice)+solucion.substring(indice+1));
                }else{
                    solucion.insert(indice,entrada[i]);
                    indice++;
                }
            }
            System.out.println(solucion.toString());
            datos=lector.readLine();
        }
    }
}
