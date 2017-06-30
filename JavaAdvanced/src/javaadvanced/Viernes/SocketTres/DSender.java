/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Viernes.SocketTres;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author CC-21
 */
public class DSender {
    
    public static void main(String[] args) throws Exception {
        System.out.println("CLIENTE");
        DatagramSocket ds = new DatagramSocket();
        
        String str = "Hola";
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        
        DatagramPacket dp = new DatagramPacket(str.getBytes(),str.length(),
         ip, 3000);
        
        ds.send(dp);
        ds.close();
        
    }
    
}
