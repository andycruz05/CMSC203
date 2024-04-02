/*
 * Class: CMSC203 30339
 * Instructor:Dr. Grinberg
 * Description: Property Management
 * Due:4/1/24
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Andy Cruz
*/

public class Property
{
    private String propertyName;
    private String city;
    private double rentalAmount;
    private String owner;
    private Plot plot;

    public Property()
    {
        this.propertyName = "";
        this.city = "";
        this.rentalAmount = 0.0;
        this.owner = "";
    }
    
    public Property(String propertyName, String city, double rentalAmount, String owner, int x, int y, int width, int depth)
    {
        this.propertyName = propertyName;
        this.city = city;
        this.rentalAmount = rentalAmount;
        this.owner = owner;
        this.plot = new Plot(x, y, width, depth);
    }

    public Property(String propertyName, String city, double rentalAmount, String owner)
    {
        this.propertyName = propertyName;
        this.city = city;
        this.rentalAmount = rentalAmount;
        this.owner = owner;
        this.plot = new Plot();
    }

    
    public Property(Property other)
    {
        this.propertyName = other.propertyName;
        this.city = other.city;
        this.rentalAmount = other.rentalAmount;
        this.owner = other.owner;
        this.plot = new Plot(other.plot);
    }
    
    public String getPropertyName()
    {
        return propertyName;
    }
    
    public String getCity()
    {
        return city;
    }

    public double getRentalAmount()
    {
        return rentalAmount;
    }

    public String getOwner()
    {
        return owner;
    }

    public Plot getPlot()
    {
        return plot;
    }

    public String toString()
    {
        return "Property Name: " + propertyName + "\nLocated in " + city + "\nBelonging to: " + owner + "\nRent Amount: " + rentalAmount;
    }
}