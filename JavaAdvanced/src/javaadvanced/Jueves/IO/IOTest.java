/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Jueves.IO;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *Java I/O
 * Entrada y Salida
 * 
 * 
 * se utiliza para procesar la entrada y salida.en java se utiliza el concepto
 * Stream (flujo) para hacer que los operaciones de E/S sean rapidas.
 * 
 * podemos realizar el manejo de archivos a traves de java I/O api
 * 
 * Stream
 * esun flujo de datos , que esta compuesto por bytes se llama stream por que
 * es como un flujo de agua que sigue corriendo.
 * 
 * en java existen 3 streams que se crean para nuestro uso automaticamente.
 * 
 * 1.-System.out: flujo de salida estandar
 * 2.-System.in: flujo de entrada estandar
 * 3.-System.err: flujo de errores estandar
 * 
 * System.out.print("Error");
 * System.err.print("Error");
 * 
 * OutputStream vs InputStream
 * 
 * Input: Lee
 * Output: Escribe
 */
public class IOTest {
    
    public static void main(String[] args) {
        
        try{
        
            FileOutputStream fos = new FileOutputStream("C:\\hola.txt");
            fos.write(65);
            fos.close();
        }catch(IOException ioe){
        
            System.out.println(ioe);
        }
    }
}
