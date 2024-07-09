package tnsif.scanner;

public class taxcalculation {
	public void calucatetax(person p) {
		if(p.getIncome()<=1600) {
			p.setTax(0);
		}
		else if(p.getIncome()>1600 && p.getIncome()<30000) {
			p.setTax(5);
		}
		else {
			p.setTax(10);
		}
	}

}
