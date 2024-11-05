package Solutions;

public class Perishable extends Product 
{
    // Constructor
    public Perishable(String name) 
    {
        super(name);
        setPrice();
    }

    // Implementation of setPrice method
    @Override
    public void setPrice() 
    {
        this.price = 11.99;
    }
}
