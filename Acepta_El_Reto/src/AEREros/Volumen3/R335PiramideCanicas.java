/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AEREros.Volumen3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Mauna Kea
 */
public class R335PiramideCanicas {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        short piramides=Short.parseShort(br.readLine());
        for (int i=0;i<piramides;i++){
            int pisos=Integer.parseInt(br.readLine());
            long solucion=0;
            long anterior=0;
            for(int s=1;s<=pisos;s++){
                solucion=solucion+(anterior+s);
                anterior=anterior+s;
            }
            System.out.println(solucion);
        }
    }
}
