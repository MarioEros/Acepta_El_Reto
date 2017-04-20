/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AEREros.Volumen1;

import java.io.IOException;

/**
 *
 * @author Mauna Kea
 */
public class R116HolaMundo {
    public static void main(String[] args) throws IOException {
        byte num=((byte)(System.in.read()-48));
        for(byte i=0;i<num;i++){
            System.out.println("Hola mundo.");
        }
    }
}
