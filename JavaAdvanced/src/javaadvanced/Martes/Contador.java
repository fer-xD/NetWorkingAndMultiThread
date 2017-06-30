/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Martes;

/**
 *
 *  Restricciones de static
 */
public class Contador {
    
    static int i=0;
    
    public Contador(){
    
        i++;
        System.out.println(i);
    }
    
    public static void main (String [] args){
        Contador i1 = new Contador();
        Contador i2 = new Contador();
        Contador i3 = new Contador();
    }
    
}
