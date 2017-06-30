 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Martes;

/**
 *  La palabra reservada static es usada para la administracion de memoria
 *  principalmente.
 *  es aplicada a variables, metodos, bloques y clases anidadas.
 *  la palabra static pertenece a la clase que la instancia.
 * 
 *  para variables: se puede utilizar para referir una propiedad comun a todos
 *  los objetos.
 *  La variable estatica obtiene memoria solo una vez en el area de la clase
 *  en el momento que se crea.
 * 
 *  Promueve la eficiencia en el rendimiento del programa.
 * 
 */
public class Estudiante {
    int matricula;
    String nombre;
    static String Universidad = "LAQUESEA";
    
    public Estudiante (int m, String n){
        matricula = m;
        nombre = n;
    }
    
    void show(){
    System.out.println(matricula+" "+nombre);
    }
    
    
    public static void main(String[] args) {
    
        Estudiante s1 = new Estudiante(111,"Fer");
        Estudiante s2 = new Estudiante(112,"Emmanuel");
        
        s1.show();
        s2.show();
    }
            
}
