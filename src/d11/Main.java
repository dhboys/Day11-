package d11;

public class Main {

	public static void main(String[] args) {

		Store[] stores = new Store[3];
		
		stores[0] = new Store();
		stores[1] = new SeoulStore();
		stores[2] = new BusanStore();
		
		
		Store seoul = new SeoulStore();
		
		((SeoulStore)seoul).getUdon();
	
		
		
		
	}
}
