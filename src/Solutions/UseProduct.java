package Solutions;

public class UseProduct 
{
    public static void main(String[] args) 
    {
        // Create a Perishable product
        Product perishableProduct = new Perishable("Joghurt");
        
        // Create a NonPerishable product
        Product nonPerishableProduct = new NonPerishable("Swivel Mop");
        
        // Display product details
        System.out.println("Perishable Product");
        System.out.println("Product: " + perishableProduct.getName());
        System.out.println("Price: R" + perishableProduct.getPrice());
        
        System.out.println("\nNon-perishable Product");
        System.out.println("Product: " + nonPerishableProduct.getName());
        System.out.println("Price: R" + nonPerishableProduct.getPrice());
    }
}
