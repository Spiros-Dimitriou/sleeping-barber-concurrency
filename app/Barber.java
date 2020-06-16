public class Barber extends java.awt.Button implements Runnable {
	
	private static final long serialVersionUID = 1L;
	private WaitingRoomState wrs;
	private GettingHaircut gh;
	private BarberState bs;
	private int i;
	
	public Barber (WaitingRoomState wrs, GettingHaircut gh, BarberState bs) {
		this.wrs = wrs;
		this.setLabel("B");
		this.gh = gh;
		this.bs = bs;
		this.setBounds(271,57,30,30);
	}
	
	public void run() {
		while(true){
			if (wrs.couchState == 0) {
				barberSit(1);	
				bs.waitCustomer();		// rest
				barberSit(0);
				work();					// work
				gh.releaseCustomer();
			}
			else {
				bs.waitCustomer();		// rest
				if (i == 4) {
					barberSit(1);		// if he has cut 5 person's hair, then he rests
					rest();
					i = 0;
				}
				barberSit(0);
				work();					// work
				i+=1;
				gh.releaseCustomer();
			}
		}
	}
	
	
	void cutHair() {
		try {
			Thread.sleep((int)(Math.random() * 100 + 1));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	void barberSit(int i) {
		if (i==0) {
			this.setBounds(271,57,30,30);	// Working
		}
		else {
			this.setBounds(215,200,20,40); 	// Taking a break
		}
	}
	
	void work() {
		try {
			Thread.sleep((int)(Math.random() * 1000 + 1));
			System.out.println("I cut a person's hair");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	void rest() {
		try {
			Thread.sleep((int)((Math.random()+1) * 1000));
			System.out.println("I have cut 5 people's hair, I need a rest");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}