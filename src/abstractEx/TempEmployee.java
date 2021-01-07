package abstractEx;

public class TempEmployee extends Employee{
		// 고용기간
	private int hireYear;
	
	public TempEmployee(String empnumber, String name, int pay, int hireYear) {
		super(empnumber, name, pay);
		this.hireYear = hireYear;
	}

	@Override
	public double getMonthPay() {
		return (pay/(double)12);
		// TODO Auto-generated method stub
	}
	
	

}
