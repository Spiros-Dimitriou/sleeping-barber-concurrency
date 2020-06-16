
public class WaitingRoomState {
	int couchState = 0;
	
	synchronized void sitOnCouch() {
		while (couchState > 3) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		couchState++;
	}
	
	synchronized void releaseCouch() {
		couchState--;
		notify();
	}
	
}