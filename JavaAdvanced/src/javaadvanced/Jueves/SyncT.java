/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Jueves;

/**
 *la sincronizacion en java es la capacidad de controlar el acceso de multiples 
 * hilos en cualquier recurso comparido.
 * 
 * la sincronizacion es la mejor opcion cuando queremso permitir que solo pueda
 * acceder a recursos compartidos.
 * 
 * la sincronizacion es principalmente usada para:
 * 1.-prevenir la interferencia de hilos
 * 2.-prevenir problema de inconsistencia
 * 
 * Tipos de Sincronización
 * 1.- procesos
 * 2.-hilos: mutualmente excluyente
 *      1.- metodo sincronizado
 *      2.-Bloqueo sincronizado
 *      3.-sincronización estatica
 * 
 * cooperacion: comunicacion entre hilos.
 * 
 * Exclusion mutua:ayuda a prevenir que los hilos interfieran entre si mientras}
 * comparten informacion.
 * 
 * bloqueo: la sincronización se basa en una entidad interna conocida como lock
 *  o monito. cada objeto tiene un bloqueo asociado a el.
 * 
 * por convencion de un hilo necesita una acceso consistete alos campos de un
 * objeto, tiene qye adquirir el bloqueo del objeto antes de acceeder a ellos 
 * y a continuacion liberar el bloqueo cuando se hace con ellos.
 * 
 * desde java 5, el paquete java.util.concurrent.locks
 * contiene varias implementaciones del bloqueo.
 */

class Tabla{

    synchronized void imprimir(int n){
        for(int i = 1; i<=5; i++){
            System.out.println(n*i);
            try {
                Thread.sleep(400);
                
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}


class Hilo1 extends Thread{

    Tabla t;
    Hilo1(Tabla t){
    this.t=t;
    }
    public void run(){
    
        t.imprimir(100);
    }
}
        

class Hilo2 extends Thread{

    Tabla t;
    Hilo2(Tabla t){
    this.t=t;
    }
    public void run(){
    
        t.imprimir(5);
    }
}

public class SyncT {
    
    public static void main(String[] args) {
        Tabla ob = new  Tabla();
        Hilo1 t1 = new Hilo1(ob);
        Hilo2 t2 = new Hilo2(ob);
        
        t1.start();
        t2.start();
    }
    
}
