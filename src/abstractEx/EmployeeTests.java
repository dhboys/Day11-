package abstractEx;

public class EmployeeTests {

	public static void printPay(Employee emp) {

		System.out.println("======================");
		System.out.println(emp);
		System.out.println("----------------------");
		System.out.println(emp.getMonthPay());
		System.out.println("----------------------");
	}

	public static void main(String[] args) {
		Employee[] emps = new Employee[4];
		// emps 배열의 각 인덱스는 각기 다른 타입을 가질 수 있다.(같은 부모클래스에서 상속받은 객체이면)
		emps[0] = new RegularEmployee("E001", "홍길동", 3000, 500);
		emps[1] = new TempEmployee("E002", "임꺽정", 4000, 0);
		emps[2] = new PartTimeEmployee("E003", "황진이", 5, 10);
		emps[3] = new PartTimeEmployee("E004", "어우동", 10, 7);
		for (int i = 0; i < emps.length; i++) {
			printPay(emps[i]);
		}

	}
}