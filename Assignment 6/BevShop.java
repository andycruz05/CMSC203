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
import java.util.Collections;
import java.util.List;

public class BevShop extends Object implements BevShopInterface {
    // Instance variable
    private List<Order> orders; 
    private Order currentOrder;

    // Constructor
    public BevShop() {
        this.orders = new ArrayList<>();
        this.currentOrder = null; 
    }

  
    @Override
    public boolean isValidTime(int time) {
        return time >= MIN_TIME && time <= MAX_TIME;
    }

   
    @Override
    public int getMaxNumOfFruits() {
        return MAX_FRUIT;
    }

  
    @Override
    public int getMinAgeForAlcohol() {
        return MIN_AGE_FOR_ALCOHOL;
    }

 
    @Override
    public boolean isMaxFruit(int numOfFruits) {
        return numOfFruits > MAX_FRUIT;
    }

 
    @Override
    public int getMaxOrderForAlcohol() {
        return MAX_ORDER_FOR_ALCOHOL;
    }


    @Override
    public boolean isEligibleForMore() {
        return getNumOfAlcoholDrink() < MAX_ORDER_FOR_ALCOHOL;
    }


    @Override
    public int getNumOfAlcoholDrink()
    {
        if (currentOrder != null)
        {
            return currentOrder.findNumOfBeveType(Type.ALCOHOL);
        }
        return 0;
    }

   
    @Override
    public boolean isValidAge(int age)
    {
        return age >= MIN_AGE_FOR_ALCOHOL;
    }


    @Override
    public void startNewOrder(int time, Day day, String customerName, int customerAge)
    {

        if (!isValidTime(time))
        {
            throw new IllegalArgumentException("Invalid order time.");
        }
        if (!isValidAge(customerAge))
        {
            throw new IllegalArgumentException("Customer is not of legal age.");
        }

      
        Customer customer = new Customer(customerName, customerAge);
        Order newOrder = new Order(time, day, customer);
        orders.add(newOrder);
        currentOrder = newOrder;
    }

    @Override
    public void processAlcoholOrder(String bevName, Size size)
    {
        if (!isValidAge(currentOrder.getCustomer().getAge()))
        {
            throw new IllegalArgumentException("Customer is not of legal age to order alcohol.");
        }
        if (!isEligibleForMore())
        {
            throw new IllegalArgumentException("Cannot order more alcohol beverages in this order.");
        }

        currentOrder.addNewBeverage(bevName, size);
    }

    @Override
    public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup)
    {
        currentOrder.addNewBeverage(bevName, size, extraShot, extraSyrup);
    }

    @Override
    public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein)
    {
     
        if (isMaxFruit(numOfFruits)) 
        {
            throw new IllegalArgumentException("Cannot add more than " + MAX_FRUIT + " fruits to a smoothie.");
        }

        currentOrder.addNewBeverage(bevName, size, numOfFruits, addProtein);
    }

  
    @Override
    public double totalMonthlySale()
    {
        double total = 0;
        for (Order order : orders)
        {
            total += order.calcOrderTotal();
        }
        return total;
    }


    @Override
    public int totalNumOfMonthlyOrders()
    {
        return orders.size();
    }
    @Override
    public double totalOrderPrice(int orderNo)
    {
        int index = findOrder(orderNo);
        if (index != -1)
        {
            Order order = orders.get(index);
            return order.calcOrderTotal();
        }
        return 0; 
    }
  
    @Override
    public int findOrder(int orderNo)
    {
        for (int i = 0; i < orders.size(); i++)
        {
            if (orders.get(i).getOrderNo() == orderNo) 
            {
                return i;
            }
        }
        return -1; 
    }

   
    @Override
    public Order getCurrentOrder()
    {
        return currentOrder;
    }

   
    @Override
    public Order getOrderAtIndex(int index)
    {
        return orders.get(index);
    }

    
    @Override
    public void sortOrders() {
      
        Collections.sort(orders);
    }

   
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BevShop:\n");
        for (Order order : orders) {
            sb.append(order.toString()).append("\n");
        }
        sb.append("Total Monthly Sale: $").append(totalMonthlySale()).append("\n");
        return sb.toString();
    }
}
