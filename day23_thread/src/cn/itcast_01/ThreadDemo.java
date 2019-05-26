package cn.itcast_01;

public class ThreadDemo {
	public static void main(String[] args) {
		MyThread my1 = new MyThread();
		MyThread my2 = new MyThread();

		my1.setName("ÓÃÓÑ");
		my2.setName("½ğµû");
		my1.start();
		my2.start();
	}

}
