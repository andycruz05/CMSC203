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

public class Coffee extends Beverage
{
    private boolean extraShot; 
    private boolean extraSyrup; 

    // Constructor
    public Coffee(String bevName, Size size, boolean extraShot, boolean extraSyrup) 
    {
    
        super(bevName, Type.COFFEE, size);
        this.extraShot = extraShot;
        this.extraSyrup = extraSyrup;
    }

    public boolean getExtraShot() 
    {
        return extraShot;
        
    }

    public boolean getExtraSyrup()
    {
        return extraSyrup;
    }


    @Override
    public double calcPrice()
    {
        double price = addSizePrice();

     
        if (extraShot)
        {
            price += 0.5;
        }

      
        if (extraSyrup)
        {
            price += 0.5; 
        }

        return price;
    }

 
    @Override
    public String toString()
    {
        return getBevName() + ", " + getSize() + ", Extra shot: " + extraShot + ", Extra syrup: " + extraSyrup + ", Price: $" + calcPrice();
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

        Coffee other = (Coffee) anotherBev;
        // Compare properties
        return super.equals(anotherBev)
            && extraShot == other.extraShot
            && extraSyrup == other.extraSyrup;
    }
}