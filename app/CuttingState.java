
public class CuttingState {
	int chairState = 1; 	// 1 refers to an empty chair

	synchronized void getChair() {
		while (chairState == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		chairState--;
	}
	
	synchronized void releaseChair() {
		chairState++;
		notify();
	}
	
}