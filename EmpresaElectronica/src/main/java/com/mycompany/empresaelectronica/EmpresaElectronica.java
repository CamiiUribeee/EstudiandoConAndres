
//Una empresa de comercio electrónico necesita un sistema 
//para registrar y gestionar las ventas diarias. Este sistema debe permitir 
//la lectura de un archivo de texto con los detalles de las ventas y el manejo 
//de posibles excepciones que puedan ocurrir durante este proceso. 
//Además, debe permitir guardar un informe con las ventas procesadas.


package com.mycompany.empresaelectronica;

import com.mycompany.empresaelectronica.salesProcessing.SalesManage;
import java.io.File;
import java.io.IOException;
import java.util.List;


public class EmpresaElectronica {

    public static void main(String[] args) throws IOException {
        
        File file = new File ("./ventas.txt"); 
        
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Archivo creado");
        } 
        
        SalesManage salesManage = new SalesManage(file);  //ESTA ES MI CLASE, LA QUE CREÉ PARA LEER EL ARCHIVO
        List <String> sales = salesManage.loadSales();
        
        for (String line : sales){
            String [] splited = new String[4];
            splited = line.split(";");
            System.out.println("VENTAS: "+ splited[0] + " " + splited[1] + " " + splited[2] + " " + splited[3]);
            
        }
        
        
    }
    
    /* public static void main(String[] args) {
        File file = new File("./ventas.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("Archivo creado: " + file.getAbsolutePath());
            } else {
                System.out.println("El archivo ya existe: " + file.getAbsolutePath());
            }

            SalesManage salesManage = new SalesManage(file);
            List<String> sales = salesManage.loadSales();

            for (String sale : sales) {
                System.out.println("VENTA: " + sale);
            }

        } catch (IOException e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
            e.printStackTrace();
        }
    }*/
}
