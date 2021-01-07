package abstractEx;
//        추상클래스로 선언
public abstract class Employee {

	// 공통된 정보
	protected String empnumber;
	protected String name;
	protected int pay;
	
	// 반드시 override 해주어야하는 추상 메서드
	public abstract double getMonthPay();
	// 모든 종류의 직원이 3가지 데이터를 다 물려받고 , 모두 필수적인 데이터이므로 모두 생성자 사용
	public Employee(String empnumber, String name, int pay) {
		super();
		this.empnumber = empnumber;
		this.name = name;
		this.pay = pay;
	}
	@Override
	public String toString() {
		return "Employee [empnumber=" + empnumber + ", name=" + name + ", pay=" + pay + "]";
	}
	
}
