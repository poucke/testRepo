package domein;

public class CommissionEmployee 
{
  private final String firstName;
  private final String lastName;
  private final String socialSecurityNumber;
  private double grossSales; 		// wekelijkse verkoopresultaten
  private double commissionRate; 	// commissiepercentage

  // constructor
  public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
            double grossSales, double commissionRate)
  {
     // Als eerste taak wordt impliciet de constructor van Object opgeroepen
     if (grossSales < 0.0)      
        throw new IllegalArgumentException ("Gross sales moet >= 0.0 zijn");
     if (commissionRate <= 0.0 || commissionRate >= 1.0 )
	throw new IllegalArgumentException("Commission rate moet > 0.0 en < 1.0 zijn");
     this.firstName = firstName;
     this.lastName = lastName;
     this.socialSecurityNumber = socialSecurityNumber;
     this.grossSales = grossSales; 
     this. commissionRate = commissionRate;
  }

  public String getFirstName()
  {
      return firstName;
  } 
  public String getLastName()
  {
      return lastName;
  }
  public String getSocialSecurityNumber()
  {
      return socialSecurityNumber;
  }
  public void setGrossSales( double grossSales )
  {
        if (grossSales < 0.0)      
                throw new IllegalArgumentException ("Gross sales moet >= 0.0 zijn");
        this.grossSales = grossSales;  
  } 
  public double getGrossSales()
  {
      return grossSales;
  }
  public void setCommissionRate( double commissionRate )
  {
      if (commissionRate <= 0.0 || commissionRate >= 1.0 )
		throw new IllegalArgumentException("Commission rate moet > 0.0 en < 1.0 zijn");
      this. commissionRate = commissionRate;
  }
  public double getCommissionRate()
  {
      return commissionRate;
  }
  // berekent het weekloon van de werkemer
  public double earnings()
  {
      return getCommissionRate() * getGrossSales();
  }
  @Override 
  public String toString()
  {
      return String.format( "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", 
         "commission employee", getFirstName(), getLastName(), 
         "social security number", getSocialSecurityNumber(), 
         "gross sales", getGrossSales(), 
         "commission rate", getCommissionRate() );
  }

    protected void finalize()
    {
        System.out.println(" CommissionEmployee finalizer: ");
    }
}
