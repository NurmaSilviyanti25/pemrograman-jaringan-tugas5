/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.LineNumberInputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class ReadFile {
    public static void main(String[] args) {
       
        Scanner br = new Scanner(System.in);
        Scanner br1 = new Scanner(System.in);
        
        String input = "";
        System.out.print("Inputkan Lokasi File Anda : ");
        input = br.nextLine();
    
    try {
             int desimal;
             char ascii;
             int desimal2;
             char ascii2;
             
             // inputStream = new LineNumberInputStream(new FileInputStream("coba.txt"));
             LineNumberInputStream inputStream = new LineNumberInputStream(new FileInputStream(input));
             while ((desimal = inputStream.read()) != -1) {
                 ascii = (char) desimal;
                 System.out.println("" + ascii + " at line " + inputStream.getLineNumber());
                 
             }
                 System.out.println();
                 System.out.println("Jumlah Baris : "+(inputStream.getLineNumber() +1));
                 
             LineNumberInputStream inputStream2 = new LineNumberInputStream(new FileInputStream(input));
             System.out.print("Cari Karakter : ");
             String cari = br1.next();
             while((desimal2 = inputStream2.read()) != -1) {
                 char c = cari.charAt(0);
                 ascii2 = (char) desimal2;
                 if(c == ascii2) {
                     System.out.println("" + ascii2 + " at line " +inputStream2.getLineNumber() + " | " );
                 }
             }
           
         } catch (FileNotFoundException ex) {
             Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
         }
    
    }
    
}
