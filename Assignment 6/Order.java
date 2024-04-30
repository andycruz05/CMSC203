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
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order extends Object implements OrderInterface, Comparable<Order>
{
   
    private int orderNumber;       
    private int orderTime;         
    private Day orderDay;       
    private Customer customer;     
    private List<Beverage> beverages; 

   
    public Order(int orderTime, Day orderDay, Customer customer)
    {
        this.orderTime = orderTime;
        this.orderDay = orderDay;
        this.customer = new Customer(customer);
        this.orderNumber = generateOrder(); 
        this.beverages = new ArrayList<>();
    }


    private int generateOrder()
    {
        Random random = new Random();
        return random.nextInt(80001) + 10000;
    }


    public void addNewBeverage(String bevName, Size size)
    {
        Beverage alcohol = new Alcohol(bevName, size, isWeekend());
        beverages.add(alcohol);
    }

  
    public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup)
    {
        Beverage coffee = new Coffee(bevName, size, extraShot, extraSyrup);
        beverages.add(coffee);
    }

    
    public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein)
    {
        Beverage smoothie = new Smoothie(bevName, size, numOfFruits, addProtein);
        beverages.add(smoothie);
    }

  
   
    public double calcOrderTotal()
    {
        double total = 0;
        for (Beverage beverage : beverages)
        {
            double price = beverage.calcPrice();
            System.out.println("Beverage: " + beverage.getBevName() + ", Price: " + price);
            total += price;
            System.out.println("Running total: " + total);
        }
        System.out.println("Final calculated total: " + total);
        return total;
    }

    public int findNumOfBeveType(Type type)
    {
        int count = 0;
        for (Beverage beverage : beverages)
        {
            if (beverage.getType() == type)
            {
                count++;
            }
        }
        return count;
    }

  
    public Beverage getBeverage(int itemNo)
    {
        return beverages.get(itemNo);
    }


    
    public Customer getCustomer()
    {
        return new Customer(customer);
    }

 
  
    public Day getDay()
    {
        return orderDay;
    }

    
    
    public int getOrderNo()
    {
        return orderNumber;
    }

    
   
    public int getOrderTime()
    {
        return orderTime;
    }


    public int getTotalItems()
    {
        return beverages.size();
    }

    public boolean isWeekend()
    {
        return orderDay == Day.SATURDAY || orderDay == Day.SUNDAY;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Order Number: ").append(orderNumber).append("\n");
        sb.append("Order Time: ").append(orderTime).append("\n");
        sb.append("Order Day: ").append(orderDay).append("\n");
        sb.append("Customer: ").append(customer.getName()).append(", Age: ").append(customer.getAge()).append("\n");
        sb.append("Beverages in Order:\n");
        for (Beverage beverage : beverages)
        {
            sb.append(" - ").append(beverage.toString()).append("\n");
        }
        return sb.toString();
    }


    @Override
    public int compareTo(Order anotherOrder)
    {
        return Integer.compare(this.orderNumber, anotherOrder.orderNumber);
    }
}
