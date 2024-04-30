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

public class Smoothie extends Beverage
{
   
    private int numOfFruits; 
    private boolean addProtein; 

    public Smoothie(String bevName, Size size, int numOfFruits, boolean addProtein)
    {
        super(bevName, Type.SMOOTHIE, size);
        this.numOfFruits = numOfFruits;
        this.addProtein = addProtein;
    }

 
    public int getNumOfFruits()
    {
        return numOfFruits;
    }

    public boolean getAddProtein()
    {
        return addProtein;
    }

    
    @Override
    public double calcPrice()
    {
        double price = addSizePrice(); 
        price += numOfFruits * 0.5;
        if (addProtein)
        {
            price += 1.5;
        }
    return price;
    }

    @Override
    public String toString()
    {
        return getBevName() + ", " + getSize() + ", Fruits: " + numOfFruits + ", Protein: " + addProtein + ", Price: $" + calcPrice();
    }

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
        Smoothie other = (Smoothie) anotherBev;
        // Compare properties
        return super.equals(anotherBev)
            && numOfFruits == other.numOfFruits
            && addProtein == other.addProtein;
    }
}
