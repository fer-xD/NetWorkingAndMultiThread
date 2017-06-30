/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Miercoles;

public class TestJoin extends Thread{
    
    public void run(){
    
        for(int i=1; i<5; i++){
        
            try {
                Thread.sleep(500);
            } catch(InterruptedException ie) {
                ie.printStackTrace();
            }
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        TestJoin t1=new TestJoin(),
                 t2=new TestJoin(),
                 t3=new TestJoin();
        t1.start();
        try {
            t1.join(1500);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        t2.start();
        t3.start();
    }
    
    
}
