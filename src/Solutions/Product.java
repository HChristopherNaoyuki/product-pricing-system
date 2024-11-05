package Solutions;

public abstract class Product 
{
    protected String name;
    protected double price;

    // Constructor
    public Product(String name) 
    {
        this.name = name;
    }

    // Getters
    public String getName() 
    {
        return name;
    }

    public double getPrice() 
    {
        return price;
    }

    // Abstract method to be implemented by subclasses
    public abstract void setPrice();
}
