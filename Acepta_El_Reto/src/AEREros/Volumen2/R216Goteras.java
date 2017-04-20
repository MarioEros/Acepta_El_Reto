/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AEREros.Volumen2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Mauna Kea
 */
public class R216Goteras {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        short num=Short.parseShort(br.readLine());
        for(short i=0;i<num;i++){
            int tiempo= Integer.parseInt(br.readLine());
            //tiempo=(tiempo*1000);
            //Time reloj=new Time(tiempo);
            byte horas=(byte) (tiempo/3600);
            byte minutos=(byte) ((tiempo%3600)/60);
            byte segundos=(byte) ((tiempo%3600)%60);
            /*String shoras=(horas<10?"0"+horas:""+horas);
            String sminutos=(minutos<10?"0"+minutos:""+minutos);
            String ssegundos=(segundos<10?"0"+segundos:""+segundos);
            System.out.println(shoras+":"+sminutos+":"+ssegundos);*/
            System.out.println((horas<10?"0"+horas:""+horas)+":"+(minutos<10?"0"+minutos:""+minutos)+":"+(segundos<10?"0"+segundos:""+segundos));
        }
    }
}
