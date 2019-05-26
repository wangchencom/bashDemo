package cn.itcast02;



public class ChatRoom {
public static void main(String[] args) {
	SendThread st = new SendThread();
	ReceiveThread rt = new ReceiveThread();

	Thread t1 = new Thread(st);
	Thread t2 = new Thread(rt); 

	t1.start();
	t2.start();

}
}
