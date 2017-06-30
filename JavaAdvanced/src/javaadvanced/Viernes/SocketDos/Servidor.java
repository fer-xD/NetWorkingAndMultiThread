/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Viernes.SocketDos;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author CC-21
 */
public class Servidor {
    public static void main(String[] args) throws IOException {
        System.out.println("Ventana Servidor");
        //conexion del socket
    ServerSocket ss = new ServerSocket(6666);
    Socket s = ss.accept();
    
    
    //recibir y enviar datos
    DataInputStream dis = new DataInputStream(s.getInputStream());
    DataOutputStream dos = new DataOutputStream(s.getOutputStream());
    BufferedReader br = new BufferedReader
                            (new InputStreamReader(System.in));
    
    //textos
    String strCliente = "", strServidor ="";
            
    //centinela
    while(!strCliente.equals("stop")){
    
        strCliente = dis.readUTF();
        System.out.println("el cliente dice: "+strCliente);
        
        strServidor = br.readLine();
        dos.writeUTF(strServidor);
        dos.flush();
        
        }
        
        dos.close();
        dis.close();
        s.close();
        ss.close();
    
    }
    
}
