/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Jueves.IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

/**
 *
 * @author CC-21
 */

public class IOTest6 {
    public static void main(String[] args) throws IOException {
        
        FileInputStream fis = new FileInputStream("C:\\hola.txt");
        FileInputStream fis2 = new FileInputStream("C:\\magia.txt");
        
        SequenceInputStream sis= new SequenceInputStream(fis,fis2);
        int i;
        while((i= sis.read())!=-1)
        {
            System.out.print((char)i);
        }
        
        sis.close();
        fis.close();
        fis2.close();
    }
}
