/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Jueves;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * ThreadPool
 * representa un grupo de hilos que estan trabajando o esperan su turno para 
 * trabajar.
 * 
 * Mejoran el rendimiento, por que no necesita crear multiples instancias.
 */
public class ThreadPl implements Runnable{
    
    private String msg;
    public ThreadPl(String s){
    
        msg=s;
    }
    
        @Override
    public void run(){
    
        System.out.println(Thread.currentThread().getName()+"(Start) msg = "
                +msg);
        System.out.println(Thread.currentThread().getName() + "(End)");
        
        processMsg();
    }
    
    private void processMsg(){
    
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
    

class PruebaPl{

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for(int i = 0; i<10; i++){
        
            Runnable worker = new ThreadPl(" "+i);
            executor.execute(worker);
        }
        executor.shutdown();
        while(!executor.isTerminated()){}
            System.out.println("Todos los Hilos se han terminado");
        
    }
}
