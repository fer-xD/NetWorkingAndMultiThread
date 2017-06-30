/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Martes;

/**
 *   es una variable de autoreferencia.
 *   This tiene 6 usos en java.
 *      *This, se usa para referir ala variable de instancia de la clase actual.
 *      *This para invocar el metodo de una clase actual.
 *      *This() para invocar al constructor de una clase(actual).
 *      *This puede ser pasado como argumento en la llamada a un metodo.
 *      *This se puede pasar como argumento en la llamada  al constructor.
 *      *This se puede utilizar para devolver la instancia de la clase actual 
 *       del metodo.
 * 
 */
public class Student {
    
    int matricula;
    String nombre;
    String universidad;
    
    //Caso 6
    /*
    public Student (){
    
        //return this();
    }
    
    /*
    Student getStudent(){
    System.out.println("Soy un Mensaje");
    }
    */
    
    
    //This Caso 5
    
    PruebasEstudiante obj;
    
    public Student(PruebasEstudiante obj){
    
        this.obj = obj;
    }
    
    void s(){
    
        System.out.println(obj.dato);
    }
    
    
    //This Caso 3
    public Student(){
    
        System.out.println("Soy el Constructor por Default");
    }
    //This caso 3
    public Student(int a){
    
        this();
        System.out.println(a);
    }
    
    public Student(int matricula, String nombre, String universidad){
    
        //This caso 1
        this.matricula = matricula;
        this.nombre = nombre;
        this.universidad = universidad;
    }
    
    void display(){
    
        String msg= "La matricula es:" +matricula;
        msg+="\n El nombre es:" +nombre;
        msg+="\n La universida es:" +universidad;
        
        System.out.println(msg);
    }
    
    //This caso 2
    void mensaje(){
    
        System.out.println("Soy un Mensajito");
        this.display();
    }
}

