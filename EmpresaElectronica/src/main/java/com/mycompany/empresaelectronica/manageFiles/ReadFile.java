
package com.mycompany.empresaelectronica.manageFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class ReadFile {
    //NIVELES DE ACCESO 
    private File file; 
    private FileReader fileReader; 
    private BufferedReader bufferedReader;  

    public ReadFile(File file) throws IOException {   //EXCEPCION 
        this.file = file;
        this.fileReader= new FileReader(file);
        this.bufferedReader= new BufferedReader(fileReader); 
    }

    

    
    
    
}
