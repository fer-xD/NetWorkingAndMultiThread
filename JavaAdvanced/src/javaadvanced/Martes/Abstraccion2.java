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
abstract class Bici{

    Bici(){
    
        System.out.println("La Bicicleta se creo");
    }
    
    abstract void run();
    
    void changeColor(){
    
        System.out.println("Color Cambiado");
    }
}

class Magistroni extends Bici{


    void run(){
    
        System.out.println("Soy una Bicicleta");
    }
            
}

public class Abstraccion2 {
    
    void run(){
    
        System.out.println("La Bici esta Corriendo");
    }
    
    public static void main(String[] args) {
        Bici bici = new Magistroni();
        bici.run();
        bici.changeColor();
    }
}
