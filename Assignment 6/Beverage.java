/*
 * Class: CMSC203 
 * Instructor:30339
 * Description: Beverage Shop
 * Due: 4/29/24
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Andy Cruz
*/

import java.lang.Object;

public abstract class Beverage extends Object
{
    private String bevName; 
    private Type type;     
    private Size size;      
    private final double BASE_PRICE = 2.0; 
    private final double SIZE_PRICE = 0.5; 

   
    public Beverage(String bevName, Type type, Size size)
    {
        this.bevName = bevName;
        this.type = type;
        this.size = size;
    }

  
    public double getBasePrice()
    {
        return BASE_PRICE;
    }

    public String getBevName()
    {
        return bevName;
    }

    public Size getSize()
    {
        return size;
    }

    public Type getType()
    {
        return type;
    }

    public double addSizePrice()
    {
        double price = BASE_PRICE;
        if (size == Size.MEDIUM)
        {
            price += SIZE_PRICE;
        } else if (size == Size.LARGE)
        {
            price += SIZE_PRICE * 2;
        }
        return price;
    }

    public abstract double calcPrice();

    @Override
    public String toString()
    {
        return bevName + ", " + size;
    }

   
    @Override
    public boolean equals(Object anotherBev)
    {
        if (this == anotherBev)
        {
            return true;
        }
        if (anotherBev == null || getClass() != anotherBev.getClass())
        {
            return false;
        }
        Beverage other = (Beverage) anotherBev;
        return bevName.equals(other.bevName) && type == other.type && size == other.size;
    }
}