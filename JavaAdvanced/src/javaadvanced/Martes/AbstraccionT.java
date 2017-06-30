/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Martes;

/**
 *
 * Abstraccion: accion de separar mentalmente la representacion de las
 * caracteristicas esenciales de un obejto, sin incluir antecedentes o detalles
 * irrelevantes.
 * Es el proceso natural en los seres humanos de poseer la facultad intuitiva
 * de conocer la escencia de las cosas.
 * 
 * Existen 5 tipos de Abstraccion
 * Funcional, Parametrica, De Datos, Contextual, y Generica.
 * 
 * Funcional: sirve para modelar la interaccion logica es decir como se daran 
 * las instrucciones de: 
 * planteamiento,entrada,procesamiento,salidas y navegabilidad en el algoritmo.
 * 
 * Datos:Permite delimitar los atributos y sus metodos que deben servir para 
 * modelar una clase de objetos tomando en cuenta sus alcances, sus tipos de
 * datos, sus parametros y sus valores de retorno.
 * 
 * Contextual: proceso mentalqeque comienza con el analisis de un fenomeno, 
 * amalgamando las abstracciones de datos y funcional para integrar una solucion
 * automatizada, que utilice de cierto, los acervos de conocimientos previos
 * y tome en cuenta las restricciones y los riesgos.
 * 
 * Parametrica: Cuando se diseñan los metodos y las operaciones de las
 * abstracciones de datos, funcional y contextuales, puede haber redundancias
 * que es posible evitar si se parametrizan apropiadamente y, con esto se ahorra
 * codigo y se tiene una mayor legibilidad, flexibilidad y mantenibilidad en los
 * desarrollos de software.
 * 
 * Generica:es un tipo especial de abstraccion parametrica que se usa en las 
 * clases genericas pero en lugar de parametrizar variables se parametrizan tipos 
 * de datos su objetivo es la reutilizacion de algoritmos.
 * 
 * 
 * en JAVA
 * una clase declarada con la palabra reservada Abstrac se considera abstracta
 * de nombre. puede ser abstracta con metodos no abstractos.
 * 
 * 
 * la abstraccion es un proceso para ocultar los detalles de implementacion y 
 * mostrar la funcionalidad al usuario.
 * 
 * enviar sms solo escribe el texto y lo envia
 * no conocemos el proceso interno sobre la entrega de mensajes.
 * 
 * la abstraccion permite concentrarse en lo que -HACE
 * el objeto en lugar del como lo HACE.
 * 
 * Formas de Lograr la Abstraccion:
 * 
 * 1.- Clase Abstracta (0 a 100%)
 * 2.-interface (100%)
 *
 * Una Clase declarada 
 * 
 * un metodo que es declarado como abstracto no tiene implementaciones (como lo hace)
 * abstrac void print();
 * 
*/

abstract class Shape{

    abstract void draw();
}

class Circle extends Shape{

    @Override
    void draw(){

        System.out.println("dibujando un circulo...");
    }
}

public class AbstraccionT extends Circle{
    public static void main(String[] args) {
        Shape s = new AbstraccionT();
        Shape s2 = new Circle();
        s.draw();
        s2.draw();
    }
    @Override
    void draw(){
    
        System.out.println("dibujando...");
    }
}
                                                                                                                     