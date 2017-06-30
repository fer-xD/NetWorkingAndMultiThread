/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Miercoles.banco3;

/**
 *
 * @author CC-21
 */
public interface Bank {
    int tasaDeInteres();
}


class HSBC1 implements Bank{
    
    public int tasaDeInteres(){
        
            return 7;
        }
    }

class Bancomer1 implements Bank{
    
    public int tasaDeInteres(){
        
            return 8;
        }
    }
 
class Bancoppel1 implements Bank{
    
    public int tasaDeInteres(){
        
            return 9;
        }
    }
    
class TasastBank{

    public static void main(String[] args) {
       Bank h;
       h = new HSBC1();
       System.out.println("Tasa de Interes De HSBC es: \n"+h.tasaDeInteres());
       h = new Bancomer1();
       System.out.println("Tasa de Interes De Bancomer es: \n"+h.tasaDeInteres());
       h = new Bancoppel1();
       System.out.println("Tasa de Interes De Bancoppel es: \n"+h.tasaDeInteres());
       //h.tasaDeInteres();
       
    }
}