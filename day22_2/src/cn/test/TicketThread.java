package cn.test;

public class TicketThread extends Thread {
	private static int tickets = 200;

	@Override
	public void run() {
		
		while (true) {
				if (tickets > 0) {
					try {
						Thread.sleep(200); 
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(getName() + "正在出售第" + (tickets--) + "张票");
				}
			
		}
	}
}
