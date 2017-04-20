/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AEREros.Volumen3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class R362Navidad {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        short can=Short.parseShort(br.readLine());
        for (short i = 0; i < can; i++) {
            String fecha = br.readLine();
            if (fecha.equalsIgnoreCase("25 12")) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}
