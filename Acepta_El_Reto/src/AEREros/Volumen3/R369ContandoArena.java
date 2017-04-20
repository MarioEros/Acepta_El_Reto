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
public class R369ContandoArena {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            short num=Short.parseShort(br.readLine());
            if (num==0)break;
            String respuesta="";
            while(respuesta.length()<num){
                respuesta=respuesta+"1";
            }
            System.out.println(respuesta);
        }
    }
}
