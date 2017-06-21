/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AEREros.Auxiliar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author Mauna Kea
 */
public class ListaNumerosEnOrdenAleatorio {
    public static void main(String[] args) {
        ArrayList<Integer> numeros=new ArrayList<Integer>();
        int valor=1000;
        for (int i=1;i<=valor;i++){
            numeros.add(i);
        }
        Collections.shuffle(numeros);
        String num="";
        for (int i:numeros){
            num=num+i+" ";
        }
        System.out.println(num);
    }
}