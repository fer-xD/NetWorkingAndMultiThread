/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Jueves.IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

/**
 *
 * @author CC-21
 */
public class IOTest7 {
    public static void main(String[] args) throws IOException {
        
        FileInputStream fis = new FileInputStream("C:\\magia.txt");
        
        BufferedInputStream bin= new BufferedInputStream(fis);
        int i;
        while((i= bin.read())!=-1)
        {
            System.out.print((char)i);
        }
        
        
        bin.close();
        fis.close();
       
    }
}
