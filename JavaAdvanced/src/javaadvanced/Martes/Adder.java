/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Martes;

/**
 *
 * Firma o signatura de un metodo
 * es lo que permite distinguir sin ambiguedad
 * a los metodos tanto en la declaracion como en la invocacion 
 * (emision de mensajes) y contiene 3 elementos:
 * 
 * El valor de retorno (tipo) : double
 * Nombre del metodo: pow
 * Numero, tipo y orden de los parametros
 * :Math.pow(x,2)
 * 
 * 
 * en la herencia ademas de producir una clase nueva basada en una antigua
 * añadiendo caracteristicas  adicionales (especializacion); puedes extender
 * el comportamiento existente de la superclase.
 * 
 * si un metodo se define en la subclase de modo que el nombnre , el tipo
 * de retorno y su lista de parametros coinciden exactamente con algun metodo
 * de la clase acestro, entomces ese nuevo metodo decimos que REDEFINE el 
 * comportamiento del antiguo.
 * 
 * los metodos con el mismo nombre, pero diferente lista de parametros
 * dentro de la misms clase se consideran simplemente sobrecargados.
 * esto provoca que el compilador utilice los argumentos proporcionados en un 
 * mensaje para determinar cual metodo ha de llamar.
 * 
 * To overload <- Sobrecargar
 * To override <- Redefinir(sobremontar)
 * To overwrite <- sobreescribir
 * 
 * Override:metodo con la misma signatura en distintas clases (de una jerarquia
 * de herencia)
 * 
 * overload: metodo con el mismmo nombre que la clase y distinta signatura.
 * Reglas para Redefinir metodos
 * 
 * 1.-el tipo de retorno del metodo redefinido debe ser identicoal del metodo
 * que redefine.
 * 2.un metodo redefinido no puede ser menos accesible que un metodo al que 
 * redefine. superclase es publica, el redefinido no puede ser protected.
 * 3.un metodo redefinido ni puede lanzar excepciones diferentes al metodo que
 * redefine.
 * 
 * Diferencia entre sobre carga y redefinicion .
 * 1.- la sobrecarga(overload) puede codificarse en una sola clase y la 
 * redefiniciion (override) 
 * 
 * 2.-los metodos sobrecargasdos tienen distinta signatura.
 * 3.-los metodos redefinidos tienen la misma signatura.
 */
public class Adder {
    //1.- cambiando el numero de arguementos
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
    //2.-Cambiando el tipo de datos
    
    static int suma(int c, int d){
    
        return c+d;
    }
            
            
    static double suma(double c, double d){

        return c+d;
    }
    
    //1.- cambiando el numero de arguementos
    public static void main(String[] args) {
        System.out.println(Adder.add(111,222));
        System.out.println(Adder.add(111,222,333));
         
    //2.-Cambiando el tipo de datos
        System.out.println(Adder.suma(11,22));
        System.out.println(Adder.suma(15.1,32.2));
    }
}
