/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Martes;

/**Herencia es un mecanismo que permite que un Objeto  adquiera 
 * todas las propiedades de un objeto padre
 *  
 * la idea de la herencia es que puedas crear nuevas clases de las que ya 
 * existen.
 * Existen diversas clasificaciones de relacion de herencia.
 * 
 * Relaciones entre clases: asociacion, composicion, agregacion, herencia.
 * 
 * Hay un termino que permite distinguir los distintos tipos de relaciones
 * llamado ACOPLAMIENTO.
 * 
 * -Medida de la dependencia que hay entre 2 modulos, existen grados de
 * acoplamiento(bajo o alto).
 * 
 * -cada clase y metodo hace una sola cosa y la hace bien(COHESION).
 * Numero de tareas que tiene cada clase o metodo.
 * 
 * Es deseable que 2 o mas modulos de un programa mantengan  alta cohesion y 
 * bajo acoplamiento.
 * 
 * Relaciones entre clases:
 * Asocioacion: cuando entre 2 o mas clases se da una interaccion que no
 * modifica en nada el comportamiento de los objetos antes o despues de
 * terminada la relacion.
 * 
 * la asociacion es un modo de interaccion entre objetos donde uno utiliza los
 * servicios de otro a corto plazo.
 * 
 * la asociacion es una relacion de objetos debilmente acoplados.
 * 
 * Agregacion (tiene un) : es una relacion entre objetos que afecta el comportamiento 
 * entre ellos mientras que dura la relacion. Es decir, un objeto depende de los
 * servicios de otro a largo plazo.
 * 
 * Composicion (Contiene): cuando un objeto complejo usa otros objetos 
 * permanentemente.
 * la composicion es una relacion entre objetos cuya esencia tiene sentido
 * solo cuando ellos estan acomplados.
 * por ultimo podemos decir que la composicion es un tipo de agregacion a muy 
 * largo plazo.
 * 
 * Herencia: cuando objeto tiene las caracteristicas  de otro permanentemente,
 * tendremos una relacion entre objetos intimamente acoplados cuya existencia
 * depende de un ancestro irrenunciablemente.
 * 
 * 
 *  
 * 
 */
public class Empleado {
    
     double salario = 40000;
    }
    
        
    class Programador extends Empleado{
    
        int bono = 1000;
        
        public static void main (String [] args){
        
            Programador p = new Programador();
            System.out.println("El Salario del programador es "+p.salario);
            
            System.out.println("El bono del programador es" +p.bono);
        }
        void mensaje(){
        
            System.out.println("Soy un Programador");
        }
    }

//Herencia Simple Empleado a programador
//Herencia multinivel Empleado a programador - web
//Herencia jerarquica empleado a programador y
//empleado a web
class Web extends Programador{

    public static void main (String[] args){
    
        
        Web W = new Web();
        W.mensaje();
    }
            

}

