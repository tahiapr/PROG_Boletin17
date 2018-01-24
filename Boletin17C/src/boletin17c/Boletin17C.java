/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17c;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author sherlyn
 */
public class Boletin17C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         LosAlumnos alum = new LosAlumnos();
        
        Alumno[] listaAlumnos = alum.crearArray();
        alum.visualizar(listaAlumnos);
        
        alum.buscar(listaAlumnos, "luisana");
        
        Arrays.sort(listaAlumnos);
        alum.visualizar(listaAlumnos);
        
        String nome = JOptionPane.showInputDialog("Introduzca o nome do alumno");
        alum.buscar(listaAlumnos, nome);
    }
    
}
