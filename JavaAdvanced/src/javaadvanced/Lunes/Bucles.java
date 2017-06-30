/*
    un lazo, es usado pára iterar una parte del programa muchas veces.

    Hay 3 tipos de lazos en java
    Simple for
    For-each
    Labeled for (anidado)
 */
package javaadvanced.Lunes;

/**
 *
 * @author CC-21
 */
public class Bucles {
    
    public static void main(String[] args) {
    
        //Simple For
        /*
        for(inicialization; condition; incr/dec){
        lo que sea
        }
        
        */
        for(int i=1; i<=10; i++){
            System.out.println("Iterando el elemento"+i);
        }
        
        //For-each
        
        /*
            La estructura for-each se utiliza para recorrer un arreglo o una coleccion
            en java.
        
            for(Type var:array){
            lo que sea
            }
        */
        
        int arreglo[] = {12,23,34,45,56,67};
        for(int a:arreglo){
            System.out.println(a);
        }
        
        //For Labeled
        aa:
        for(int i = 1; i<=3; i++){
            
            bb:
            for(int j = 1; j<=3; j++){
                if(i==2 && j==2){
                    break aa;
                }
                System.out.println(i+" "+j);
            }
        }
        
    }
}
