/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17c;

import javax.swing.JOptionPane;

/**
 *
 * @author sherlyn
 */
public class LosAlumnos {
    public  Alumno[] crearArray(){
        String nombre;
        int nota;
        Alumno[] alumnos =  new Alumno[30];
        for (int i=0; i<alumnos.length;i++){
            nombre = JOptionPane.showInputDialog("Introduzca el nome del alumno");
            nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce su nota"));
            alumnos[i] = new Alumno(nombre,nota);
        }
        return alumnos;
    }
    
    public void visualizar (Alumno[] listaAlumnos){
        for(Alumno elemento:listaAlumnos){
            System.out.println(elemento);
        } 
    }
    
    public void buscar(Alumno[] listaAlumnos, String nombre){
        boolean encontrado=false; 
        
        for (int i=0;i<listaAlumnos.length;i++){
            if (listaAlumnos[i].getNombre().equalsIgnoreCase(nombre)){
                System.out.println("La nota de "+nombre+" es un "+listaAlumnos[i].getNota());
                encontrado=true;
            }
        }
        if (encontrado==false){
            System.out.println("El alumno introducido no está en la lista");
        }
    }
    
    public void alumnosAprobados(Alumno[] listaAlumnos){
        for(Alumno elemento:listaAlumnos){
            if (elemento.getNota()>=5){
                System.out.println(elemento);
            }
        } 
    }
}
