/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Miercoles;

/*

Exepcion: condicion anormal
Hilo: Subproceso ligero, unidad pequeña de procesamiento. Es una via de 
ejecucion separada.
Los hilos son independientes, sis se produce una excepcion en un hilo no afecta
a los demas hilos y comparten un area en memoria comun.

Ventajas de usar hilos:

1.-No bloqueamos al usuario por que son tareas al mismo tiempo.
2.- podemos realizar muchas tareas simultaneamente ahorrando tiempo.
3.-los hilos al ser independientes no se afectan entre si, en caso de ocurrir,
una excepcion en un hilo los demas funcionan igual.

Multitarea: proceso de ejucion simultaneo de muchas tareas simultaneamente.

usamos la multitarea en el CPU. se logra de dos maneras:
1.- multitarea basada en procesos(multiprocesos)
*cada proceso tiene su propia direccion en memoria, es decir, cada proceso 
asigna un area de memoria separada.
*el proceso pesado.
*el costo de la comunicacion entre el es      alto
*cambiar de un proceso a otro requiere de tiempo para guardar y cargar registro
de mapas de memoria, listas de actualizacion.

2.-multitarea basada en hilos (multihilo)
*los hilos comparten los mimsmos espacios en memoria para direcciones.
*el costo de comunicacion entre hilos es baja.

(paralelismos)multihilos
(concurrencia) es la propiedad de los sistemas para soportar, multiples 
peticiones, auxiliandose de multiprocesamiento y multihilo logrando la
multitarea.

ciclo de vida de un hilo
un hilo puede encontrarse en uno de sus 5 estados de acuerdo con oracle solo hay
en el ciclo de ejecutables(running) no existe.
new, runnable, non-runnable and terminated.

1.-new: el hilo esta en este estado, si se crea una instacia de la clase Thread
pero antes de la invocacion de start()
2.-Runnable: el hilo esta aqui, despues de la invocacion del metodo start(), 
pero el ThreadSheduler (administrador de hilos) no lo ha selecionado como el 
hilo en ejecucion.
3.-running: el hilo esta aqui cuando ts lo ha seleccionado.
4.-non-runnable:(blocked):es el estado cuando el hilo sigue activo, sin
embargo no es apto para ejecutarse.
5.-terminated: es el estado cuando el hilo ha finalizado,muerto, cuando sale
del metodo run().

hay dos formas de crear un hilo:
1.-al extender de la clase thread
2.-al implementar la interface runnable.

clase thread

proporciona los constructores y metodos para crear y realizar operaciones
en un hilo. la clase thread extiende de la clase object e implementa la inte
runnable.

constructores comunes de la clase thread
Thread()
Thread(String name)
Thread(Runnable r)
Thread(Runneable r, String name)

Runnable
la interface runnable debe ser implementada por cualquier clase suyas instancias
esten destinadas a ser ejecutadas por un hilo.
la interface runnable tiene un solo metodo denominado run()
public void run(): es usado para realizar la accion de un hilo.
*/
/*
public class HilosF extends Thread{
    @Override
    public void run(){
    
        System.out.println("El hilo esta Corriendo");
    }
    
    public static void main(String[] args) {
        HilosF hilo = new HilosF();
        Thread thread = new Thread(hilo);
        thread.start();
    }
    
}
*/

//Ejemplo de Runneable

class Hilos implements Runnable {

    @Override
    public void run(){
    
        System.out.println("El Hilo de runnable esta corriendo" + "Corriendo");
        
    }
    
    public static void main(String[] args) {
        Hilos h = new Hilos();
        Thread t = new Thread(h);
        t.start();
    }
}

/*Metodos Callbacks

public void run(){
se utiliza para realizar la accion de un hilo
}

public voud start(){
// inicia la ejecucion del hilo
//la jvm llama al metodo run() del hilo
}

public void sleep(){
//hace que el hilo actual en ejecucion se detenga temporalmente durante el
numero especificado en mmilisegundos
}

public void join(){
espera que el hilo se muera
}

public 



public int setPriority(){

cambia la prioridad del hilo
}

public String getName(){

regresa el nombre del hilo
}

public Thread currentThread(){

devuelve la referencia al hilo en ejecucion actual
}

public int getId(){

devuelve el id del hilo

}

public Thread.State getState(){

regresa el estado actual del hilo
}

public boolean isAlive(){

prueba si el hilo esta vivo 

}

public void yield(){

hace que el objeto del hilo actualmente en ejecucion, se detenga temporalmente
y permita que otros hilos se ejecute.
}

public void suspend(){

deprecado para suspender el hilo
}

public void stop(){

deprecado se utiliza para detener el hilo
}

public boolean isDaemon(){

verifica si el hilo es un demonio

}

public void setDaemon(){

marca el hilo como un demonio
}

public void interrupt(){

interrumpe el hilo

}


public boolean interrupted(){

verifica si el hilo se puede interrumpir

}


public static boolean interrupted(){

prueba si el hilo actual se ha interrumpido

}



*/