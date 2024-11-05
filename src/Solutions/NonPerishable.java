package Solutions;

public class NonPerishable extends Product 
{
    // Constructor
    public NonPerishable(String name) 
    {
        super(name);
        setPrice();
    }

    // Implementation of setPrice method
    @Override
    public void setPrice() 
    {
        this.price = 19.99;
    }
}
