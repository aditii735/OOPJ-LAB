/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cardemo;
class car{
    private String brand;
    private String model;
    private double price;
    // setter methods
    public void setBrand (String b)
    {
        this.brand = b;
     
    }
    public void setModel (String m)
    {
        this.model = m;
        
    }
    public void setPrice (double p)
    {
        this.price = p;
    
    }

//getter mehod
    public String getBrand()
    {
        return (this.brand);
    }
    public String getModel()
    {
        return (this.model);
        
    }
    public double getPrice()
    {
        return (this.price);
    }
    public void displayDetails()
    {
        System.out.println("Car details");
        System.out.println("Brand:" +brand);
        System.out.println("Model:" +model);
        System.out.println("Price:" +price);
        
    }
    }

/**
 *
 * @author OOPL-21
 */
public class Cardemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        car c1 = new car();
        c1.setBrand ("Toyota");
        c1.setModel("Corolla");
        c1.setPrice(1600000);
        c1.displayDetails();
        car c2 = new car();
        c2.setBrand ("BMW");
        c2.setModel ("Baleno");
        c2.setPrice(800000);
        c2.displayDetails();
        
        System.out.println("Car 1 details");
        System.out.println("Brand:" +c1.getBrand ());
        System.out.println("Model:" +c1.getModel ());
        System.out.println("Price;" +c1.getPrice ());
        
        System.out.println("Car 2 details");
        System.out.println("Brand;" +c2.getBrand ());
        System.out.println("Model:" +c2.getModel ());
        System.out.println("Price;" +c2.getPrice ());
        
        
        // TODO code application logic here
    }
    
}
