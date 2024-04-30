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

public class Customer extends Object
{
    // Instance variables
    private String name; // Customer's name
    private int age;     // Customer's age

    // Constructor to initialize a Customer object with the given name and age
    public Customer(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    // Copy constructor to create a copy of an existing Customer object
    public Customer(Customer c)
    {
        this.name = c.name;
        this.age = c.age;
    }

    // Getter for the age property
    public int getAge() {
        return age;
    }

    // Setter for the age property
    public void setAge(int age)
    {
        this.age = age;
    }

    // Getter for the name property
    public String getName()
    {
        return name;
    }

    // Setter for the name property
    public void setName(String name) 
    {
        this.name = name;
    }

    // Override toString method to represent a Customer object as a string
    @Override
    public String toString()
    {
        return "Customer: " + name + ", Age: " + age;
    }
}