/*
 * Class: CMSC203 30339
 * Instructor: Dr. Grinberg
 * Description: Holiday Bonuses
 * Due: 4/15/24
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Andy Cruz
*/

public class HolidayBonus
{
	private static final double HIGHEST_SALES_BONUS = 0; 
    private static final double LOWEST_SALES_BONUS = 0; 
    private static final double OTHER_SALES_BONUS = 0; 

  
    public static double[] calculateHolidayBonus(double[][] sales) {
        double[] bonuses = new double[sales.length];
        for (int i = 0; i < sales.length; i++)
        {
            double totalSales = TwoDimRaggedArrayUtility.getRowTotal(sales, i);
            double highestSales = TwoDimRaggedArrayUtility.getHighestInRow(sales, i);
            double lowestSales = TwoDimRaggedArrayUtility.getLowestInRow(sales, i);

            if (totalSales == highestSales) {
                bonuses[i] = HIGHEST_SALES_BONUS;
            } else if (totalSales == lowestSales) {
                bonuses[i] = LOWEST_SALES_BONUS;
            } else {
                bonuses[i] = OTHER_SALES_BONUS;
            }
        }
        return bonuses;
    }

    public static double calculateTotalHolidayBonus(double[][] sales)
    {
        double totalBonus = 0;
        double[] bonuses = calculateHolidayBonus(sales);
        for (double bonus : bonuses) {
            totalBonus += bonus;
        }
        return totalBonus;
    }
}