package domein;

public class BasePlusCommissionEmployee extends CommissionEmployee

{
    private double baseSalary; 		// basisloon per week

    public BasePlusCommissionEmployee( String firstName, String lastName, 
	     String socialSecurityNumber, double grossSales, double commissionRate, 
			double baseSalary)
    {
        super( firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        if (baseSalary < 0.0)
           throw new IllegalArgumentException("Base salary moet >= 0.0 zijn");   
        this.baseSalary = baseSalary;
    }

    public void setBaseSalary( double baseSalary )
    {
          if (baseSalary < 0.0 )
                    throw new IllegalArgumentException("Base Salary moet >=0.0 zijn");
            this.baseSalary = baseSalary;
    } 

    public double getBaseSalary()
    {
        return baseSalary;
    }
    
    // berekent het weekloon van de werkemer: 
    // basisloon + commissiepercentage op zijn verkoopcijfers
    @Override
    public double earnings()
    {
        return getBaseSalary() + super.earnings();
    }
    @Override
    public String toString()
    {	
        return String.format( "%s %s%n%s: %.2f", "base-salaried", 
                         super.toString(), "base salary", getBaseSalary() );
    }

    @Override
    protected void finalize()
    {
        System.out.println(" BasePlusCommissionEmployee finalizer: ");
        super.finalize();  		// call superclass finalize method
    }
}
