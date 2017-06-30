/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Viernes.SocketTres;

import java.net.HttpURLConnection;
import java.net.URL;


public class HttpUrlDemo {
    
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.oracle.com");
            HttpURLConnection huc = (HttpURLConnection)url.openConnection();
            
            for(int i=1; i<=8; i++){
                
                System.out.println(huc.getHeaderFieldKey(i)+""+huc.getHeaderField(i));
                
            }
            huc.disconnect();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
