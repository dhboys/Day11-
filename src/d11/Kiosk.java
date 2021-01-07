package d11;

public class Kiosk {

	
	private static int num;
	
	public int pressButton() {
		
		return ++num;
	}
	
	
	// main 은 oop와 무관
	
	public static void main(String[] args) {
		
		Kiosk m1 = new Kiosk();
	
		Kiosk m2 = new Kiosk();
		
		System.out.println(m1.pressButton());
		
		System.out.println(m2.pressButton());
	}
	
	
	
	
	
}
