/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Viernes.socketUno;

import java.io.DataOutputStream;
import java.net.Socket;
import java.io.IOException;


/**
*
*/
public class Cliente {
    
    public static void main(String[] args) {
        try {
            System.out.println("Ventana Cliente");
            Socket s = new Socket("localhost",6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Lo que sea xD");
            dout.flush();
            dout.close();
            s.close();
            
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    
}
