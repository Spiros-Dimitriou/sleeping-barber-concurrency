import gui.BarberGui;

public class BarberTestV4 {
	public static void main(String[] args) {
		
		BarberGui bg = new BarberGui();
		GettingHaircut gh = new GettingHaircut();
		CuttingState cs = new CuttingState();
		WaitingRoomState wrs = new WaitingRoomState();
		BarberState bs = new BarberState();
		Barber barb = new Barber(wrs,gh,bs);
		
		Thread barber = new Thread(barb);
		bg.add(barb);
		barber.start();
		
		Customer c0 = new Customer(0,cs,wrs,gh,bs);
		Thread t0 = new Thread(c0);
		bg.add(c0);
	
		Customer c1 = new Customer(1,cs,wrs,gh,bs);
		Thread t1 = new Thread(c1);
		bg.add(c1);
		
		Customer c2 = new Customer(2,cs,wrs,gh,bs);
		Thread t2 = new Thread(c2);
		bg.add(c2);
		
		Customer c3 = new Customer(3,cs,wrs,gh,bs);
		Thread t3 = new Thread(c3);
		bg.add(c3);
		
		Customer c4 = new Customer(4,cs,wrs,gh,bs);
		Thread t4 = new Thread(c4);
		bg.add(c4);
		
		Customer c5 = new Customer(5,cs,wrs, gh,bs);
		Thread t5 = new Thread(c5);
		bg.add(c5);
		
		Customer c6 = new Customer(6,cs,wrs,gh,bs);
		Thread t6 = new Thread(c6);
		bg.add(c6);
		
		Customer c7 = new Customer(7,cs,wrs,gh,bs);
		Thread t7 = new Thread(c7);
		bg.add(c7);
		
		Customer c8 = new Customer(8,cs,wrs,gh,bs);
		Thread t8 = new Thread(c8);
		bg.add(c8);
		
		Customer c9 = new Customer(9,cs,wrs,gh,bs);
		Thread t9 = new Thread(c9);
		bg.add(c9);
		
		t0.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
	}

}
