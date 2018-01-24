/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17a;

/**
 *
 * @author sherlyn
 */
public class Numeros {
      int[] numeros = new int[6];

    public int[] cArray() {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 50) + 1;
        }
        return numeros;
    }

    public void visualizarArray(int[] lNumeros) {
        for (int i = 0; i < lNumeros.length; i++) {
            System.out.println(lNumeros[i]);
        }
    }

    public void visualizarInverso (int[] lNumeros) {
        for (int i = lNumeros.length - 1; i >= 0; i--) {
            System.out.println(lNumeros[i]);
        }
    }
}
