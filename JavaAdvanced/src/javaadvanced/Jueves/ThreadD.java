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
public class ThreadD extends Thread {

    public void run(){
    
        if(Thread.currentThread().isDaemon()){
        
            System.out.println("Tenemos un Demonio aqui ");
        }else{
        
            System.out.println("Ah no es un hiilo de usuario");
        }
        
        //System.out.println(Thread.currentThread().isDaemon());
    }
    
    public static void main(String[] args) {
        ThreadD t1 = new ThreadD(),t2 = new ThreadD(),
                t3 = new ThreadD();
        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }
}
