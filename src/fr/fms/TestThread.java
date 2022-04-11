package fr.fms;

public class TestThread extends Thread {

	public TestThread(String name) {
		super(name);
	}

	public synchronized void run() {
		for (int i = 0; i < 5; i++) {

			System.out.print(this.getName());
		}
	}


	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		TestThread t =new TestThread("1-");
		TestThread t6 =new TestThread("2--");	
		TestThread t2 =new TestThread("3---");	
		TestThread t4 =new TestThread("4----");
		TestThread t8 =new TestThread("5-----");

		t.start();
		t2.start(); t4.start(); t6.start(); t8.start();

	}


}
