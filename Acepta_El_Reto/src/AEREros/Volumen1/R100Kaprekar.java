/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AEREros.Volumen1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Yossy
 */
public class R100Kaprekar {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        short cont = Short.parseShort(sc.nextLine());
        byte[] numero = new byte[4];
        for (short i = 0; i < cont; i++) {
            String linea = sc.nextLine();
            while (linea.length() < 4) {
                linea = "0" + linea;
            }
            numero[0] = Byte.parseByte(linea.substring(0, 1));
            numero[1] = Byte.parseByte(linea.substring(1, 2));
            numero[2] = Byte.parseByte(linea.substring(2, 3));
            numero[3] = Byte.parseByte(linea.substring(3, 4));
            if (numero[0] == numero[1] && numero[1] == numero[2] && numero[2] == numero[3]) {
                System.out.println("8");
            } else {
                byte contador = 0;
                while (numero[0] != 6 || numero[1] != 1 || numero[2] != 7 || numero[3] != 4) {
                    Arrays.sort(numero);
                    int num1 = (numero[3] * 1000)
                            + (numero[2] * 100)
                            + (numero[1] * 10)
                            + numero[0];
                    int num2 = (numero[0] * 1000)
                            + (numero[1] * 100)
                            + (numero[2] * 10)
                            + numero[3];
                    String respuesta = Integer.toString(num1 - num2);
                    while (respuesta.length() < 4){
                        respuesta="0"+respuesta;
                    }
                        numero[0] = Byte.parseByte(respuesta.substring(0, 1));
                        numero[1] = Byte.parseByte(respuesta.substring(1, 2));
                        numero[2] = Byte.parseByte(respuesta.substring(2, 3));
                        numero[3] = Byte.parseByte(respuesta.substring(3, 4));
                        contador++;
                }
                System.out.println(contador);
            }
        }
    }
}