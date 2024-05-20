
package com.mycompany.excpandfil;

import com.mycompany.excpandfil.Exceptions.ExceptionCarlos;
import java.util.ArrayList;


public class ExcpAndFil {

    public static void main(String[] args) throws Exception {
        //capturar en el main 
        int a = 10; 
        int b= 0; 
        try {
            int c= a/b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
            
        }
        
        
        
        // capturando por medio de clases 
        ExceptionCarlos exception1 = new ExceptionCarlos();  //clase que creé 
        ArrayList<String> Estudiantes = new ArrayList <>();  
        
        Estudiantes.add("Camila");
        Estudiantes.add("Andres");
        Estudiantes.add("Carlos");
        Estudiantes.add("Maria");
        Estudiantes.add("Jose");
        Estudiantes.add("Carla");
        Estudiantes.add("Ramona");
        
        for (String Estudiante : Estudiantes) {
            try {
                exception1.validarEntrada(Estudiante);
            }
            catch (Exception e) {
                System.out.println(e.getMessage()); //si quiero toda la exception, solo dejo la variable "e" 
            }
            finally{
                System.out.println("el codigo se murio pero yo me ejecute"); // Solo pongo finally cuando tengo un solo estudiante, porque si no, eso se ejecuta siempre 
            }
        }
    }
}
