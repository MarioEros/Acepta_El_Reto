/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AEREros.Volumen3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author Mauna Kea
 */
public class R370LaLlave13_14 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        short casos = Short.parseShort(br.readLine());
        for(int i=0;i<casos;i++){
            String[] llave= br.readLine().split("-");
            Arrays.sort(llave);
            if(Integer.parseInt(llave[0])%2==0&&Integer.parseInt(llave[0])+1==Integer.parseInt(llave[1])){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
            }
        }
}
