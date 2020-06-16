import gui.BarberGui;

public class Customer extends java.awt.Button implements Runnable {
	
	private static final long serialVersionUID = 1L;
	private int id;
	private CuttingState cs;
	private WaitingRoomState wrs;
	private GettingHaircut gh;
	private BarberState bs;
	
	public Customer(int inp, CuttingState cs, WaitingRoomState wrs, GettingHaircut gh, BarberState bs) {
		this.id = inp;
		this.cs = cs;
		this.setLabel(Integer.toString(id));
		this.wrs = wrs;
		this.gh = gh;
		this.bs = bs;
	}

	public void run() {
		while (true) {
			display(0); // 0 refers to a position outside of the shop
			goToLongSleep();
			
			display(1);	// 1 refers to the entrance of the shop
			goToSleep();
			
			wrs.sitOnCouch();
			display(2);	// 2 refers to the waiting couch
			goToSleep();
			
			cs.getChair();
			wrs.releaseCouch();
			display(3);	// 3 refers to the barber chair
			bs.cutMyHair();
			gh.gettingHaircut();
			cs.releaseChair();
		}
	}

	void goToSleep() {
		try {
			Thread.sleep((int)((Math.random()+1) * 500));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	void goToLongSleep() {
		try {
			Thread.sleep((int)((Math.random()+1) * 2000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	void display(int i) {
		this.setBounds(BarberGui.pos[this.id][i].x,BarberGui.pos[this.id][i].y,20,20);
	}
	
}