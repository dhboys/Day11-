package gobusanex;

public class Train extends Transportation {

	public void goTrain() {
		System.out.println("부산행 기차");
	}
	
	@Override
	public void go() {
		goTrain();
	}
}
