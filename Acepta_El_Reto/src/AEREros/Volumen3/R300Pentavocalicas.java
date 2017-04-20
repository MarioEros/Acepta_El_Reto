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
public class R300Pentavocalicas {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int numDePalabras=Integer.parseInt(br.readLine());
        for(int i=1; i<=numDePalabras;i++){
            String palabra=br.readLine();
            System.out.println((palabra.contains("a")&&palabra.contains("e")&&palabra.contains("i")&&palabra.contains("o")&&palabra.contains("u"))?"SI":"NO");
        }
    }
}
