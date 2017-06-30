/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Martes;

/**
 *
 * @author CC-21
 */

class Bike2{

    void run(){
    
        System.out.println("Running.....");
    }
}

public class Poliformismo extends Bike2 {
    void run(){
    
        System.out.println("Running safely with 60km");
    }
    
    public static void main(String[] args) {
        Bike2 b = new Poliformismo();
        /*
        Upcasting -> cuando la variable de referencia refiere al objeto de la 
        clase hija
        class A(){}
        class B() extends A{}
        A a= new B();
        */
        
        b.run();
    }
    
    
}
