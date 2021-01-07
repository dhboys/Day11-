package gobusanex;

public class Bus extends Transportation {

	public void goBus() {
		System.out.println("부산행 버스");
	}
	
	@Override
	public void go() {
		goBus();
	}
}
