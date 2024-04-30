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



public class BevShopDriverApp
{
    public static void main(String[] args)
    {
        BevShop bevShop = new BevShop();
        System.out.println("The current order in process can have at most " + bevShop.getMaxOrderForAlcohol() + " alcoholic beverages.");
        System.out.println("The minimum age to order alcohol drink is " + bevShop.getMinAgeForAlcohol());
        System.out.println("Start a new order:");
        int time = 10;
        Day day = Day.WEDNESDAY;
        String customerName = "John";
        int customerAge = 23;
        bevShop.startNewOrder(time, day, customerName, customerAge);
        System.out.println("Your total order for now is " + bevShop.getCurrentOrder().calcOrderTotal());

   
        if (bevShop.isValidAge(customerAge))
        {
            System.out.println("Your age is above " + bevShop.getMinAgeForAlcohol() + " and you are eligible to order alcohol.");
            bevShop.processAlcoholOrder("Whiskey", Size.MEDIUM);
            System.out.println("The current order of drinks is " + bevShop.getCurrentOrder().getTotalItems());
            System.out.println("The total price on the order is " + bevShop.getCurrentOrder().calcOrderTotal());
            
            if (bevShop.isEligibleForMore())
            {
                bevShop.processAlcoholOrder("Wine", Size.LARGE);
                System.out.println("The current order of drinks is " + bevShop.getCurrentOrder().getTotalItems());
                System.out.println("The total price on the order: " + bevShop.getCurrentOrder().calcOrderTotal());
            }
            
            if (bevShop.isEligibleForMore())
            {
                bevShop.processAlcoholOrder("Vodka", Size.MEDIUM);
                System.out.println("The current order of drinks is " + bevShop.getCurrentOrder().getTotalItems());
                System.out.println("The total price on the order: " + bevShop.getCurrentOrder().calcOrderTotal());
            }

            if (!bevShop.isEligibleForMore())
            {
                System.out.println("You have reached the maximum alcohol drinks for this order.");
            }
        }

        bevShop.processCoffeeOrder("Latte", Size.SMALL, true, false);
        System.out.println("Added a COFFEE to your order:");
        System.out.println("Total items on your order is " + bevShop.getCurrentOrder().getTotalItems());
        System.out.println("The total price on the order: " + bevShop.getCurrentOrder().calcOrderTotal());
        System.out.println("#------------------------------------#");
        System.out.println("Start a new order:");
        customerName = "Ray";
        customerAge = 18;
        bevShop.startNewOrder(time, day, customerName, customerAge);
        System.out.println("The total price on the order: " + bevShop.getCurrentOrder().calcOrderTotal());
        System.out.println("Would you please add an alcoholic drink:");
        
        if (!bevShop.isValidAge(customerAge))
        {
            System.out.println("Your age is not appropriate for an alcohol drink!!");
        }

        bevShop.processSmoothieOrder("Berry Blast", Size.MEDIUM, 2, false);
        System.out.println("The total price on the order: " + bevShop.getCurrentOrder().calcOrderTotal());
        bevShop.processCoffeeOrder("Espresso", Size.SMALL, false, true);
        System.out.println("The total price on the order: " + bevShop.getCurrentOrder().calcOrderTotal());
        System.out.println("Would you please add another drink:");
        
        if (bevShop.isMaxFruit(5))
        {
            System.out.println("You reached a maximum number of fruits.");
        }
        System.out.println("Total price on the second order: " + bevShop.getCurrentOrder().calcOrderTotal());
        System.out.println("Total amount for all orders: " + bevShop.totalMonthlySale());
    }
}
