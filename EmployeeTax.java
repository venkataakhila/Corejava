class TaxCalculator{
	
	float tax;
	float basicSalary;
	boolean citizenship;
	int netSalary;
	void calculateTax(float basicSalary)
	{
		tax=30*basicSalary/100;
		System.out.println("the tax of the employee for the "+basicSalary+ "is" +tax );
	}
	void deductTax(float basicSalary)
	{
		netSalary=(int)basicSalary-(int)tax;
		System.out.println("The nett salary of the employee"+netSalary);
		
	}
	void validateSalary(boolean citizenship,float basicSalary)
	{
		
		if(basicSalary>100000&&citizenship==true)
		{
			System.out.println(" true");
		}
		else
		{
			System.out.println("false");
		}
		
	}
}
class EmployeeTax
{
	public static void main(String args[])
	{
		TaxCalculator tc=new TaxCalculator();
		tc.calculateTax(25000);
		tc.deductTax(25000);
		tc.validateSalary(true,25000);
		TaxCalculator tc2=new TaxCalculator();
		tc2.calculateTax(125000);
		tc2.deductTax(125000);
		tc2.validateSalary(true,125000);
		
	}
}