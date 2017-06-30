/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Martes;

/**
 *  Constructor de una clase
 *      Es un conjunto de instrucciones diseñado para inicializar una instancia
 *      de una clase.
 *      en su declaracion o encabezado puede aceptar parametros.
 *      
 *      Bike b = new Bike();
        Bike() <- Hace Referencia al constructor por omision.
    
    Antes de su ejecucion, b es null; al final de la llamada "b" es un apunrador
    * a un objeto para contener sus valores de atributos y sus apuntadores a
    * metodos.
    * 
    * ¿por que el constructor no es un metodo?
    * no puedo llamar al constructor usando el operador de indireccion 
    * (el punto ejemplo bike.show()).
    * 
    * Carece de un valor de retorno distinto a un apuntador.
    * 
    * No puede ser REDEFINIDO ()
    * No puede ser declarado con un type
    * 
    * 
 */
public class Bike {
    //propiedades del objeto
    int velocidad;
    String color, marca;
    
    //Declaro el constructor implicito
    public Bike()
    {
        
    }
    
    //Inmutable cunado su valor no cambia durante 
    //la ejecucion del programa
    public Bike(String color,String marca, int velocidad)
    {
        this.velocidad = velocidad;
        this.color = color;
        this.marca = marca;
    }
    
    //Sobrecargade Constructores
    public Bike(String color,int velocidad)
    {
        this.velocidad = velocidad;
        this.color = color;
        
    }
    
    
    public int getVelocidad(){ return velocidad; }
    
    public String getColor(){ return color; }
    
    public String getMarca(){ return marca; }
}
