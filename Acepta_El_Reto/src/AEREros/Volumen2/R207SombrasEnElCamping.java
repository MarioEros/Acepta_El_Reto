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
public class R207SombrasEnElCamping {
    public static void main(String[] args) throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String caso = lector.readLine();
            if (caso.equalsIgnoreCase("0 0 0")) {
                break;
            }
            String[] casoProcesado = caso.split(" ");
            int maxCol = Integer.parseInt(casoProcesado[0]);
            int maxFila = Integer.parseInt(casoProcesado[1]);
            char[][] camping = new char[maxCol][maxFila];
            if (casoProcesado[2].equalsIgnoreCase("0")) {
                System.out.println("0");
            } else {
                String arboles = lector.readLine();
                String[] tallitos = arboles.split(" ");
                int sombra = 0;
                for (int i = 0; i < Integer.parseInt(casoProcesado[2])*2; i += 2) {
                    int col = Integer.parseInt(tallitos[i]) - 1;
                    int fila = Integer.parseInt(tallitos[i + 1]) - 1;
                    if (camping[col][fila] == 's') {
                        sombra--;
                    }
                    camping[col][fila] = 'a';
                    try {
                        if (camping[col - 1][fila - 1] != 's'&&camping[col - 1][fila - 1] != 'a') {
                            camping[col - 1][fila - 1] = 's';
                            sombra++;
                        }
                    } catch (Exception e){}
                    try {
                        if (camping[col][fila - 1] != 's'&&camping[col][fila - 1] != 'a') {
                            camping[col][fila - 1] = 's';
                            sombra++;
                        }
                    } catch (Exception e) {}
                    try {
                        if (camping[col + 1][fila - 1] != 's'&&camping[col + 1][fila - 1] != 'a') {
                            camping[col + 1][fila - 1] = 's';
                            sombra++;
                        }
                    } catch (Exception e) {}
                    try {
                        if (camping[col - 1][fila] != 's'&&camping[col - 1][fila] != 'a') {
                            camping[col - 1][fila] = 's';
                            sombra++;
                        }
                    } catch (Exception e) {}
                    try {
                        if (camping[col + 1][fila] != 's'&&camping[col + 1][fila] != 'a') {
                            camping[col + 1][fila] = 's';
                            sombra++;
                        }
                    } catch (Exception e) {}
                    try {
                        if (camping[col - 1][fila + 1] != 's'&&camping[col - 1][fila + 1] != 'a') {
                            camping[col - 1][fila + 1] = 's';
                            sombra++;
                        }
                    } catch (Exception e) {}
                    try {
                        if (camping[col][fila + 1] != 's'&&camping[col][fila + 1] != 'a') {
                            camping[col][fila + 1] = 's';
                            sombra++;
                        }
                    } catch (Exception e) {}
                    try {
                        if (camping[col + 1][fila + 1] != 's'&&camping[col + 1][fila + 1] != 'a') {
                            camping[col + 1][fila + 1] = 's';
                            sombra++;
                        }
                    } catch (Exception e) {}
                }
                System.out.println(sombra);
            }
        }
    }
}
