package abstractEx;
// 처음엔 생성자 때문에 에러가 난다.
public class RegularEmployee extends Employee {

	private int bonus;
	
	public RegularEmployee(String empnumber, String name, int pay, int bonus) {
		super(empnumber, name, pay);
		this.bonus = bonus;
	}

	// 자동으로 생성된 추상 메서드 -> 반드시 오버라이드 해주어야 한다.
	@Override
	public double getMonthPay() {
		// (연봉/12)+(수당/12)
		return (pay/(double)12)+(bonus/(double)12);
		// 리턴 타입이 double이므로 12를 double로 캐스팅하고 int와 double의 계산은 자동으로 double로 처리
		// TODO Auto-generated method stub
	}

}
