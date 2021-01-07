package abstractEx;

public class PartTimeEmployee extends Employee {

	private int workDay;
	
	public PartTimeEmployee(String empnumber, String name, int pay, int workDay) {
		super(empnumber, name, pay);
		this.workDay = workDay;
	}

	@Override
	public double getMonthPay() {
		// 여기서 pay는 일당으로 계산
		return pay * workDay;
		// TODO Auto-generated method stub
	}

}
