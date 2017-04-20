/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AEREros.Volumen2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Mauna Kea
 */
public class R285VacasPensantes {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String cantCubos = br.readLine();
            if (cantCubos.equals("0")) {
                break;
            }
            String cubos = br.readLine();
            String[] stringCantidad = cubos.split(" ");
            ArrayList<Integer> intCantidad = new ArrayList<>();
            for (String numero : stringCantidad) {
                intCantidad.add(Integer.parseInt(numero));
            }
            int maxComida = 0;
            boolean comeLista = true;
            //aqui se turnan para comer empezando por la lista
            while (intCantidad.size() > 2) {
                int devPrevComer1 = Math.max(intCantidad.get(1), intCantidad.get(intCantidad.size() - 1));
                int devPrevComer2 = Math.max(intCantidad.get(0), intCantidad.get(intCantidad.size() - 2));
                //vaquita lista
                if (devPrevComer1 < devPrevComer2) {
                    maxComida = maxComida + intCantidad.get(0);
                    intCantidad.remove(0);
                } else {
                    maxComida = maxComida + intCantidad.get(intCantidad.size() - 1);
                    intCantidad.remove(intCantidad.size() - 1);
                }
                comeLista = false;
                //devoradora
                int devComer = Math.max(intCantidad.get(0), intCantidad.get(intCantidad.size() - 1));
                if (intCantidad.get(0) == devComer) {
                    intCantidad.remove(0);
                } else {
                    intCantidad.remove(intCantidad.size() - 1);
                }
                comeLista = true;
            }
            //cuando quedan 2 cubos
            if (intCantidad.size() > 1) {
                int comerUltimos = Math.max(intCantidad.get(0), intCantidad.get(intCantidad.size() - 1));
                if (comeLista) {
                    if (intCantidad.get(0) == comerUltimos) {
                        maxComida = maxComida + intCantidad.get(0);
                        intCantidad.remove(0);
                        comeLista = false;
                    } else {
                        maxComida = maxComida + intCantidad.get(intCantidad.size() - 1);
                        intCantidad.remove(intCantidad.size() - 1);
                        comeLista = false;
                    }
                } else {
                    if (intCantidad.get(0) == comerUltimos) {
                        intCantidad.remove(0);
                        comeLista = true;
                    } else {
                        intCantidad.remove(intCantidad.size() - 1);
                        comeLista = true;
                    }
                }
            }
            //cuando solo queda un cubo
            if (intCantidad.size() == 1) {
                if (comeLista) {
                    maxComida = maxComida + intCantidad.get(0);
                }
            }
            System.out.println(maxComida);
        }
    }
}
