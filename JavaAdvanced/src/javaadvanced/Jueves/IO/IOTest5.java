/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Jueves.IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *la clase java BufferedOutPutStream se utiliza para alamacenar en un buffer 
 * un stream de salida.
 * internamente utiliza un buffer para almacenar datos directamente en un stream.
 * añade mas eficiencia que escribir datos de manera directa en un flujo por lo
 * tanto logra un mejor rendimiento.
 * 
 * Tiene 2 Constructores:
 *  BufferedOutPutStream (OutPutStream OS):
 *  crea un nuevo flujo de salida almacenando en un buffer. que se utiliza  para
 * escribir los datos  en el stream especificado.
 * BufferedOutPutStream(OutputStream os, int size) crea un nuevo fluijo de salida
 * que sera almacenado en buffer el cual se utiliza para escribir los datos en el
 * stream especificando el tamaño del buffer.
 * 
 * metodos:
 * void write(int b): escribe el byte especificado en el stream de salida alamcenado
 * en buffer.
 * 
 * void write(byte[]b, int off, int len):
 * escribe los bytes de la secuencia de stream de bytes especificados en un arreglo
 * de bytes comienza con el desplazamiento dado.
 * 
 * 
 * void flush(): borra el flujo de salida almacenado en buffer.
 * vacia los datos de una secuencia y la envia aotra se necesita si se ha conectado
 * a una secuencia con otra.
 */
public class IOTest5 {
    
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("C:\\magia.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fos);
            
            String s = "Hola a todos";
            byte []b = s.getBytes();
            
            bout.write(b);
            bout.flush();
                    
            bout.close();
            fos.close();
            
            System.out.println("Listo");
            
        } catch(IOException ioe){
            System.out.println(ioe);
        }
    }
    
}
