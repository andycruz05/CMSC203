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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility {

    public static double[][] readFile(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int rows = 0;
        while (scanner.hasNextLine()) {
            rows++;
            scanner.nextLine();
        }
        scanner.close();

        double[][] array = new double[rows][];
        scanner = new Scanner(file);
        for (int i = 0; i < rows; i++) {
            String[] values = scanner.nextLine().trim().split("\\s+");
            array[i] = new double[values.length];
            for (int j = 0; j < values.length; j++) {
                array[i][j] = Double.parseDouble(values[j]);
            }
        }
        scanner.close();
        return array;
    }

    public static void writeToFile(double[][] array, File file) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(file);
        for (double[] row : array) {
            for (double value : row) {
                writer.print(value + " ");
            }
            writer.println();
        }
        writer.close();
    }

    public static double getTotal(double[][] array) {
        double total = 0.0;
        for (double[] row : array) {
            for (double value : row) {
                total += value;
            }
        }
        return total;
    }

    public static double getAverage(double[][] array) {
        double total = getTotal(array);
        int count = 0;
        for (double[] row : array) {
            count += row.length;
        }
        return total / count;
    }

    public static double getRowTotal(double[][] array, int row) {
        double total = 0.0;
        if (row >= 0 && row < array.length) {
            for (double value : array[row]) {
                total += value;
            }
        }
        return total;
    }

    public static double getColumnTotal(double[][] array, int col) {
        double total = 0.0;
        for (double[] row : array) {
            if (col >= 0 && col < row.length) {
                total += row[col];
            }
        }
        return total;
    }

    public static double getHighestInRow(double[][] array, int row) {
        double highest = Double.MIN_VALUE;
        if (row >= 0 && row < array.length) {
            for (double value : array[row]) {
                if (value > highest) {
                    highest = value;
                }
            }
        }
        return highest;
    }

    public static int getHighestInRowIndex(double[][] array, int row) {
        double highest = Double.MIN_VALUE;
        int highestIndex = -1;
        if (row >= 0 && row < array.length) {
            for (int i = 0; i < array[row].length; i++) {
                if (array[row][i] > highest) {
                    highest = array[row][i];
                    highestIndex = i;
                }
            }
        }
        return highestIndex;
    }

    public static double getLowestInRow(double[][] array, int row) {
        double lowest = Double.MAX_VALUE;
        if (row >= 0 && row < array.length) {
            for (double value : array[row]) {
                if (value < lowest) {
                    lowest = value;
                }
            }
        }
        return lowest;
    }

    public static int getLowestInRowIndex(double[][] array, int row) {
        double lowest = Double.MAX_VALUE;
        int lowestIndex = -1;
        if (row >= 0 && row < array.length) {
            for (int i = 0; i < array[row].length; i++) {
                if (array[row][i] < lowest) {
                    lowest = array[row][i];
                    lowestIndex = i;
                }
            }
        }
        return lowestIndex;
    }

    public static double getHighestInColumn(double[][] array, int col) {
        double highest = Double.MIN_VALUE;
        for (double[] row : array) {
            if (col >= 0 && col < row.length) {
                highest = Math.max(highest, row[col]);
            }
        }
        return highest;
    }

    public static int getHighestInColumnIndex(double[][] array, int col) {
        double highest = Double.MIN_VALUE;
        int highestIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (col >= 0 && col < array[i].length && array[i][col] > highest) {
                highest = array[i][col];
                highestIndex = i;
            }
        }
        return highestIndex;
    }

    public static double getLowestInColumn(double[][] array, int col) {
        double lowest = Double.MAX_VALUE;
        for (double[] row : array) {
            if (col >= 0 && col < row.length) {
                lowest = Math.min(lowest, row[col]);
            }
        }
        return lowest;
    }

    public static int getLowestInColumnIndex(double[][] array, int col) {
        double lowest = Double.MAX_VALUE;
        int lowestIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (col >= 0 && col < array[i].length && array[i][col] < lowest) {
                lowest = array[i][col];
                lowestIndex = i;
            }
        }
        return lowestIndex;
    }

    public static double getHighestInArray(double[][] array) {
        double highest = Double.MIN_VALUE;
        for (double[] row : array) {
            for (double value : row) {
                highest = Math.max(highest, value);
            }
        }
        return highest;
    }

    public static double getLowestInArray(double[][] array) {
        double lowest = Double.MAX_VALUE;
        for (double[] row : array) {
            for (double value : row) {
                lowest = Math.min(lowest, value);
            }
        }
        return lowest;
    }
}
