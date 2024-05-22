
package com.mycompany.empresaelectronica.salesProcessing;

public class Sales {
    
    private int id;
    private String name; 
    private int quantity; 
    private double price; 

    public Sales(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Sales{" + "id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + '}';
    }
    
    
}
