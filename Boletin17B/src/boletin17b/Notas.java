/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17b;

import javax.swing.JOptionPane;

/**
 *
 * @author sherlyn
 */
public class Notas {

    int[] notas = new int[30];

    public int[] cArray() {
        for (int i = 0; i < notas.length; i++) {
            int nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce una nota"));
            notas[i]=nota;
        }
        return notas;
    }

    public void visualizarArray(int[] lNotas) {
        for (int i = 0; i < lNotas.length; i++) {
            System.out.println("Nota "+(i+1)+": "+lNotas[i]);
        }
    }
    
    public void aprobadosSuspensos(){
        int a = 0,s = 0;
        for (int i=0; i<notas.length;i++){
            if (notas[i]>=5){
                a++;
            }else{
                s++;
            }
        }
        System.out.println("Hay " + a + " aprobados y " + s + " suspensos");
    }
    
     public void hacerMedia(){
        int sum=0;
        for (int i=0; i<notas.length;i++){
            sum=sum+notas[i];
        }
        System.out.println("La nota media de todos los alumnos es "+sum/notas.length);
    }
     
     public void notaAlta(){
        int c=0;
        for (int i=0; i<notas.length-1;i++){
            for (int f=1; i<notas.length;i++){
                if (notas[i]>notas[f]){
                    if (notas[i]>c){
                         c =   notas[i];   
                    }
                }
            }
        }
        
        System.out.println("La nota más alta fue un "+c);
    }
}
