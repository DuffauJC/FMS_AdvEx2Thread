package fr.fms;

public class TestRunnable implements Runnable {

	public void run() {
		String star="";
		for (int i = 0; i < 9; i++) {
			star+="*";
			System.out.println(star);
		}
	}

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		Thread tr = new Thread(new TestRunnable());
		tr.run();

	}

}
