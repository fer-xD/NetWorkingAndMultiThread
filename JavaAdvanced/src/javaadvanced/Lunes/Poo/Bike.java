/*
    Clase: Conjunto de objetos con caracteristicas similares que se identifican por nombre,
    atributos y una serie de funciones o metodos aplicables a todo el conjunto.
    Es una Plantilla para caracterizaro definir objetos.
    Abstraccion: es la Facultad intuitiva que permite conocer la escencia de las cosas.

    Modularidad: Es un Proceso mental que permite distinguir los componentes de los objetos que estan siendo estudiados.

    Encapsulamiento: Permite Ocultar las caracterisiticas no relevantes de una clase, destacar las relevantes y 
    modelar su comportamiento. Dando como resultado la Abstraccion de Datos.

    Herencia: Relacion entre clases cuya existencia depende de un ancestro, clase base delega sus atributos y metodos
    a las clases derivadas.

    Polimorfismo: Es el conjunto de operaciones aplicadas a un objeto por medio de los mensajes que invoca a alguno
    de los metodos definidos en la clase dominio de la aplicacion(Contexto).


    Objeto: Es una entidad real o imaginaria que tiene identidad, estado y un comportamiento, conforme al conjunto de ojetos(clase)
    a la que pertenece. Es una instancia de una clase.

    Un obejeto mujer es una instancia de una mujer con clase.
    Mujer mujer= new Mujer();

    una clase de java contiene lo siguiente:
    
    campos
    metodos
    constructores
    bloques
    clases aninadas e interfaces


clas <class_name> {
    field;
    method;
}

Variables de instancia
Mujer mujer= newMujer();


 */
package javaadvanced.Lunes.Poo;

/**
 *
 * @author CC-21
 */
public class Bike {
    
    public static void main(String[] args) {
        Bike bici= new Bike();
        bici.show();
    }
   
    public void show()
        {
            MountainBike bici= new MountainBike();
            bici.setColor("Azul");
            bici.setVelocidad(6);
            String msg=" Soy una Bici de Montaña ";
            msg += " y mi color es: " + bici.getColor();
            msg += " y tengo " + bici.getVelocidad();
            msg += " Velocidades ";
            System.out.println(msg);
        }
    
}

    class MountainBike
    {
        int velocidad;

    public int getVelocidad() {
        return velocidad;
    }

    protected boolean setVelocidad(int velocidad) {
        if(velocidad>0){
            this.velocidad = velocidad;
            return true;
        }
        else
        {
            return false;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
        String color;
        
        
    }