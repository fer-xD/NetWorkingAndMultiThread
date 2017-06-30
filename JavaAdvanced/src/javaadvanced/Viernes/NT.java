/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Viernes;

/**
 *Networking es un concepto de conectividad entre 2 o mas dispositivos juntos,
 * que comparten recursos.
 * 
 * programacion  de sockets proporciona la facilidad de compartir datos entre
 * diferentes dispositivos.
 * 
 * ventajas del networking em java
 * 
 *-compartir recursos
 * centralizar la gestion del software
 * 
 * conceptos clave:
 * Direccion IP: numero dinamico asignado a un nodo de una red, compuesto por 
 * octetosque van del 0 al 255.
 * es la dirrecion logica que puede ser cambiada.
 * 
 * Protocolo: conjunto de reglas para establecer la comunicacion entre 
 * aplicaciones.
 * 
 * Puerto: esta asociado a la direccion ip para la comunicacion entre aplicaciones
 * 
 * MAC:(Media Access)
 * 
 * 
 * Oriented Connection Protocol:
 * es un protocolo de tipo TCP, TCP/IP, confiable pero lento. el acuse de recibo
 * es enviado por el receptor.
 * 
 * Connection Less Protocol: el receptor no envia el acuse de recibo.
 * es rapido, sin embargo no es confiable, pueden o no llegar los paquetes. eje:
 * UDP
 * 
 * Socket:  Punto final en una conexion bidireccional
 * 
 * la programacion de sockets se utiliza para la comunicacion entre aplicaciones
 * que se ejecutan en diferentes JREs. Java Runtime Enviroment.
 * 
 * la programacion de javasocket puede estar bajo ambos protocolos (OCP, OCL).
 * 
 * las clase de java sockets y ServerSockets se utilizan para la programacion
 * orientada ala conexion.
 * 
 * las clases DaragramSocket y DatagramPacket son usadas para la programacion de
 * socket sin conexion.
 * 
 * el cliente  en la programacion necesita saber:
 * IP adress del server
 * port number
 * socket class
 * 
 * el socket es un punto final para las comunicaciones entre dispositivos.
 * Socket class
 * Metodos
 * 
 *  Public InputStream getInputStream() regresa el is adjunto con el socket
 * 
 * Public OutputStream getOutputStream () regresa el os adjunto al socket
 * 
 * Public synchronized void close()
 * cierra el socket
 * 
 * Server Socket
 * 
 * Metodos:
 * Public socket accept()
 * establece la conexion entrante 
 * Public synchronized void close()
 * cierra la conexion del servidor.
 */
public class NT {
    
}
