/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Jueves;

/**
 *
 * @author CC-21
 */
public class MultiTask extends Thread{
    
    public void run(){
    
        System.out.println("Tarea Uno");
    }
    
    public static void main(String[] args) {
        MultiTask t1 = new MultiTask(),
                t2 = new MultiTask(),
                t3 = new MultiTask();
                
                t1.start();
                t2.start();
                t3.start();
    }
}

class M implements Runnable {

    @Override
    public void run(){
    
        System.out.println("Tarea Uno");
    }
    
    public static void main(String[] args) {
        Thread t1 = new Thread(new M());
        Thread t2 = new Thread(new M());
        
        TrueM t1m = new TrueM();
        TrueMT t2m = new TrueMT(); 
        
        t1.start();
        t2.start();
    }
}

class TrueM extends Thread{

    public void run(){
    
        System.out.println("Tarea A");
    }
}

class TrueMT extends Thread{

    public void run(){
    
        System.out.println("Tarea B");
    }
}
