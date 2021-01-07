package d11;

public class CatchStore {

	private Store[] stores;

	public CatchStore() {
		stores = new Store[10];
		for (int i = 0; i < stores.length; i++) {
			Store store = null;
			if (i % 3 == 0) {
				store = new Store();
			} else if (i % 3 == 1) {
				store = new SeoulStore();
			} else if (i % 3 == 2) {
				store = new BusanStore();
			}
			stores[i] = store;
		}
	}

}
