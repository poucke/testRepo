package ui;

import domein.BasePlusCommissionEmployee;

public class FinalizeApplicatie
{
 
    public static void main(String[] args)
    {
        BasePlusCommissionEmployee employee =
                new BasePlusCommissionEmployee(
                "Lisa", "Jones", "555-55-5555", 2000, .06, 800);
        
        employee = null;
        System.gc();
        
        for(int i=0;i<1000000;i++);     //even wachten zodat  zijn werk kan doen
    }
}
