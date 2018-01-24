/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17c;

/**
 *
 * @author sherlyn
 */
public class Alumno implements Comparable {
    private String nombre;
    private int nota;

    public Alumno() {
    }

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " || Nota: " + nota;
    }

    @Override
    public int compareTo(Object o) {
        Alumno alum = (Alumno)o;  
        if(nota > alum.getNota()){
            return 1;
        }else if(nota==alum.getNota()){
            return 0;
        }else{
            return -1;
        }
    }
    
}
