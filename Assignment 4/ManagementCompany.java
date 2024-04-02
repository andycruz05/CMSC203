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

public class ManagementCompany
{
    private String companyName;
    private String taxID;
    private double managementFee;
    private static final int MAX_PROPERTY = 5;
    private static final int MGMT_WIDTH = 10;
    private static final int MGMT_DEPTH = 10;
    private Property[] properties;
    private Plot plot;
    private int numberOfProperties;

    
    public ManagementCompany()
    {
        this("", "", 0.0);
    }

    public ManagementCompany(String name, String taxID, double mgmFee)
    {
        this.companyName = name;
        this.taxID = taxID;
        this.managementFee = mgmFee;
        this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
        this.properties = new Property[MAX_PROPERTY];
        this.numberOfProperties = 0;
    }

    public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth)
    {
        this.companyName = name;
        this.taxID = taxID;
        this.managementFee = mgmFee;
        this.plot = new Plot(x, y, width, depth);
        this.properties = new Property[MAX_PROPERTY];
        this.numberOfProperties = 0;
    }

    public ManagementCompany(ManagementCompany otherCompany)
    {
        this.companyName = otherCompany.companyName;
        this.taxID = otherCompany.taxID;
        this.managementFee = otherCompany.managementFee;
        this.plot = new Plot(otherCompany.plot);
        this.properties = new Property[MAX_PROPERTY];
        for (int i = 0; i < otherCompany.numberOfProperties; i++) {
            this.properties[i] = new Property(otherCompany.properties[i]);
        }
        this.numberOfProperties = otherCompany.numberOfProperties;
    }

   
    public String getName()
    {
        return companyName;
    }

    public String getTaxID()
    {
        return taxID;
    }

    public double getMgmFeePer()
    {
        return managementFee;
    }

    public Plot getPlot()
    {
        return plot;
    }

    public Property[] getProperties()
    {
        return properties;
    }

    public int getPropertiesCount()
    {
        return numberOfProperties;
    }

    // Setter method
    public void setManagementFee(double mgmFee)
    {
        this.managementFee = mgmFee;
    }

    // Method to add property
    public int addProperty(String name, String city, double rent, String owner)
    {
        return addProperty(new Property(name, city, rent, owner));
    }

    public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth)
    {
        return addProperty(new Property(name, city, rent, owner, x, y, width, depth));
    }

    public int addProperty(Property property)
    {
        if (numberOfProperties >= MAX_PROPERTY)
        {
            return -1;
        } 
        else if (property == null)
        {
            return -2; 
        }
        else if (!plot.encompasses(property.getPlot()))
        {
            return -3;
        } 
        else
        {
            for (int i = 0; i < numberOfProperties; i++) 
            {
                if (property.getPlot().overlaps(properties[i].getPlot()))
                {
                    return -4;
                }
            }
            properties[numberOfProperties++] = property;
            return numberOfProperties - 1; 
        }
    }

    public Property getHighestRentPropperty()
    {
        if (numberOfProperties == 0)
        {
            return null;
        }
        Property maxRentProperty = properties[0];
        for (int i = 1; i < numberOfProperties; i++)
        {
            if (properties[i].getRentalAmount() > maxRentProperty.getRentalAmount())
            {
                maxRentProperty = properties[i];
            }
        }
        return maxRentProperty;
    }

 
    public double getTotalRent()
    {
        double totalRent = 0.0;
        for (int i = 0; i < numberOfProperties; i++)
        {
            totalRent += properties[i].getRentalAmount();
        }
        return totalRent;
    }

 
    public void removeLastProperty()
    {
        if (numberOfProperties > 0)
        {
            properties[--numberOfProperties] = null;
        }
    }

   
    public boolean isPropertiesFull()
    {
        return numberOfProperties >= MAX_PROPERTY;
    }

   
    public boolean isMangementFeeValid()
    {
        return managementFee >= 0 && managementFee <= 100;
    }

    
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("List of the properties for ").append(companyName).append(", taxID: ").append(taxID).append("\n");
        sb.append("______________________________________________________\n");
        for (int i = 0; i < numberOfProperties; i++)
        {
            sb.append(properties[i]).append("\n");
        }
        sb.append("______________________________________________________\n\n");
        sb.append("Total management Fee: ").append(getTotalRent() * (managementFee / 100));
        return sb.toString();
    }
}
