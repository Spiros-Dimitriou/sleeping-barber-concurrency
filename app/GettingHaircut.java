
public class GettingHaircut {

	public synchronized void gettingHaircut() {
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public synchronized void releaseCustomer() {
		notify();
	}
}
