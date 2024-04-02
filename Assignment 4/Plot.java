/*
 * Class: CMSC203 30339
 * Instructor:Dr. Grinberg
 * Description: Property Management
 * Due:4/1/24
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Andy Cruz
*/

public class Plot
{
    private int x;
    private int y;
    private int width;
    private int depth;

    // no-arg constructor
    public Plot()
    {
        this.x = 0;
        this.y = 0;
        this.width = 1;
        this.depth = 1;
    }

    // parameterized constructor
    public Plot(int x, int y, int width, int depth)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.depth = depth;
    }

    // copy constructor
    public Plot(Plot otherPlot)
    {
        this.x = otherPlot.x;
        this.y = otherPlot.y;
        this.width = otherPlot.width;
        this.depth = otherPlot.depth;
    }

    // getters and setters for instance variables
    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public int getDepth()
{
        return depth;
    }

    public void setDepth(int depth)
    {
        this.depth = depth;
    }

    public String toString()
    {
        return "Plot [x=" + x + ", y=" + y + ", width=" + width + ", depth=" + depth + "]";
    }

    public boolean overlaps(Plot other)
    {
        return (x < other.x + other.width) && (x + width > other.x) && (y < other.y + other.depth) && (y + depth > other.y);
    }

    public boolean encompasses(Plot other)
    {
        return (x <= other.x) && (x + width >= other.x + other.width) && (y <= other.y) && (y + depth >= other.y + other.depth);
    }
}