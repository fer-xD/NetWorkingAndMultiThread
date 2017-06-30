/*
    la sentencia switch nos permite evaluar una declaracion
    para multiples condiciones.
    Reemplazando a un if else anidado a nivel 6
 */
package javaadvanced.Lunes;

public class SwitchSample {

    public static void main(String[] args) {

        int num = 20;
        char opc='a';
        
        switch (num) {
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("No esta en 10, 20 o 30");
        }
        
        switch(opc){
            case 'a':
                System.out.println("La Opcion es a");
                break;
            case 'b':
                System.out.println("La Opcion es b");
                break;
            case 'c':
                System.out.println("La Opcion es c");
                break;
            default:
                System.out.println("Selecione una Opcion Valida");
        }
        
    }
    
}
