
package com.mycompany.excpandfil.Exceptions;


public class ExceptionCarlos {

    public ExceptionCarlos() {
    }
    
    public static void validarEntrada (String name) throws Exception {
        
        System.out.println(name);
        if (name.equals("Carlos")){
            throw new Exception("Excepción: Tu no");              
        }else if (name.equals("Carla")){
            throw new Exception ("Jodete Carla");             
        }
        
        
    }
    
}
