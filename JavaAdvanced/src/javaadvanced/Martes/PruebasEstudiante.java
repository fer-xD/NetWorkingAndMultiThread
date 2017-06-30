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
public class PruebasEstudiante {
    
    //Caso 5
    int dato = 5;
    
    PruebasEstudiante(){
    
        Student s5 = new Student(this);
        s5.s();
    }
    
    
     public static void main(String[] args) {
        
        Student s1= new Student(111, "Fer", "ITLeon");
        Student s2= new Student(112, "Ara", "UG");
        Student s3= new Student(113, "Pepe", "ITR");
        
        
        //this caso 3 constructor
        Student s4= new Student(10);
        
        /*
        s1.display();
        s2.display();
        s3.display();
        */
        
        s1.mensaje();
        s2.mensaje();
        s3.mensaje();
        
        //caso 4
        PruebasEstudiante ps1 =new PruebasEstudiante();
        ps1.despliega();
        
        //Caso 5
        PruebasEstudiante ps2 =new PruebasEstudiante();
        
        //Caso 6
        //new Student().getStudent().msg();
        
    }
    //caso 4
    void muestra(PruebasEstudiante obj){
    
        System.out.println("Metodo Es Invocado");
    }
    
    void despliega(){
    muestra(this);
    }
    
}
