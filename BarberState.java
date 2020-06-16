
public class BarberState {
	public synchronized void waitCustomer(){
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void cutMyHair() {
		notify();
	}
}
