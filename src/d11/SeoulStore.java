package d11;
				// 서울공화춘 ( 자식 클래스 = sub 클래스)
public class SeoulStore extends Store {

	
	private String udon;

	public String getUdon() {
		System.out.println("우동");
		return udon;
	}

	public void setUdon(String udon) {
		this.udon = udon;
	}
	
}
