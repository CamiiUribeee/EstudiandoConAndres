
package com.mycompany.onlyfiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



public class OnlyFiles {

    public static void main(String[] args) {
        File file = new File ("./data.txt");
        try {
            file.createNewFile();
        } catch (IOException ex) {
            System.out.println("no se que paso");
        }
        
        try {  
            FileWriter fileWriter = new FileWriter(file, true);
            PrintWriter printerWriter = new PrintWriter(fileWriter);
            printerWriter.println ("Hola soy camila"); 
            
            fileWriter.close();
            printerWriter.close();
        } catch (IOException ex) {
           
        }
    }
}
