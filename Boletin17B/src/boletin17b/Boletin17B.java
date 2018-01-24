/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17b;

/**
 *
 * @author sherlyn
 */
public class Boletin17B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Notas not = new Notas();
        int [] lnotas = not.cArray();
        not.visualizarArray(lnotas);
        not.aprobadosSuspensos();
        not.hacerMedia();
        not.notaAlta();
    }
    
}
