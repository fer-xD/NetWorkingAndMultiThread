/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Miercoles;




public class TestS extends Thread{
    // todo lo que el hilo haga es en el run o poner abstracto para separar
    public void run(){
    
        for(int i=1; i<5; i++){
        
            try{
            Thread.sleep(500);
                System.out.println(i);
            }
            catch (InterruptedException ie){
                
                ie.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        
        
        TestS t1 = new TestS();
        t1.start();
        
        Thread th1= new Thread(t1);
        th1.start();
    }
}


class HiloS implements Runnable{
    @Override
    public void run(){
    
        for(int i=1; i<5; i++){
        
            try{
            Thread.sleep(500);
                System.out.println(i);
            }
            catch (InterruptedException ie){
                
                ie.printStackTrace();
            }
        }
    }
}