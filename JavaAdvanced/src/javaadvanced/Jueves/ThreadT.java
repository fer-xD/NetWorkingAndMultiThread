/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Jueves;


public class ThreadT extends Thread{

    public void run(){
    
        System.out.println("Corriendo");
        System.out.println(Thread.currentThread().getName());
    }
    
    public static void main(String[] args) {
        ThreadT t1 = new ThreadT(), t2 = new ThreadT(), t3=new ThreadT();
        System.out.println("El nombre del hilo: " +t1.getName());
        System.out.println("El nombre del hilo: " +t2.getName());
        System.out.println("El nombre del hilo: " +t3.getName());
        
        t1.start();
        t2.start();
        t3.start();
        
        t1.setName("Hilo A");
        t2.setName("Hilo B");
        t3.setName("Hilo C");
        
        System.out.println("El nombre del hilo ahora es: " +t1.getName());
        System.out.println("El nombre del hilo ahora es: " +t2.getName());
        System.out.println("El nombre del hilo ahora es: " +t3.getName());
    }
}


