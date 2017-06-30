/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Martes.banco2;

/**
 *
 * @author CC-21
 */
public class Banco {
    double getTazaDeInteres(){
    
        return 0;
    }
}
    
    class Bancomer extends Banco{
    
        double getTazaDeInteres(){
    
        return 8.4;
        }
    }
    class HSBC extends Banco{
    
        double getTazaDeInteres(){
    
        return 7.3;
        }
    }
    class Bancoppel extends Banco{
    
        double getTazaDeInteres(){
    
        return 9.7;
        }
    }

    class TestP{
    
        public static void main(String[] args) {
            Banco b;
            b= new Bancomer();
            System.out.println("La tasa de interes " + "de Bancomer es: "
                    +b.getTazaDeInteres());
            b= new HSBC();
            System.out.println("La tasa de interes " + "de HSBC es: "
                    +b.getTazaDeInteres());
            b= new Bancoppel();
            System.out.println("La tasa de interes " + "de Bancoppel es: "
                    +b.getTazaDeInteres());
        }
    }
