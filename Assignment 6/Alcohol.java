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

public class Alcohol extends Beverage
{
    private boolean isWeekend;
    public Alcohol(String bevName, Size size, boolean isWeekend) 
    {
        super(bevName, Type.ALCOHOL, size);
        this.isWeekend = isWeekend;
    }
    
    public boolean isWeekend()
    {
        return isWeekend;
    }


    @Override
    public double calcPrice()
    {
        double price = addSizePrice();
        
        if (isWeekend)
        {
            price += 0.6; 
        }
        return price;
    }

    @Override
    public String toString()
    {
        return getBevName() + ", " + getSize() + ", Weekend: " + isWeekend + ", Price: $" + calcPrice();
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

        Alcohol other = (Alcohol) anotherBev;
       
        return super.equals(anotherBev)
            && isWeekend == other.isWeekend;
    }
}
