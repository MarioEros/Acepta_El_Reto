/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AEREros;

/**
 *
 * @author Mauna Kea
 */
public class GeneradorDeNumerosGrandes {
    public static void main(String[] args) {
        int num=1000;
        String numero="";
        for (int i=0;i<num;i++){
            byte dado=(byte)(Math.random()*10);
            numero=numero+dado;
        }
        System.out.println(numero);
    }
}
