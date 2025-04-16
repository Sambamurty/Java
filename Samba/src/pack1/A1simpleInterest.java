package pack1;

import java.math.BigDecimal;

public class A1simpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleInterestCalculator calculator = new SimpleInterestCalculator( "4500.00", "7.5");
		BigDecimal totalvalue = calculator.calculateTotalValue(5);
		System.out.println(totalvalue);
		//System.out.print(false);
	}

}
class SimpleInterestCalculator{
	private BigDecimal principal;
	private BigDecimal interest;
	SimpleInterestCalculator(String principal, String interest)
	{
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest);
	}
	public BigDecimal calculateTotalValue(int year)
	{
		BigDecimal totalval = (principal.add((principal).multiply(interest).multiply(new BigDecimal(year))));
		return totalval;
	}
}

