/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Miercoles.banco3;


public interface Drawable {


void draw();

}


class SuperHeroe implements Drawable{

    
    public void draw(){
        
            System.out.println("Dibujando a Ironman");
        }
    }

class SuperVillano implements Drawable{

    public void draw(){
        
            System.out.println("Dibujando a Loki");
        }
}
 
    
class Historia{

    public static void main(String[] args) {
       Drawable d,e;
       d = new SuperHeroe();
       e = new SuperVillano();
       
       d.draw();
       e.draw();
    }
}