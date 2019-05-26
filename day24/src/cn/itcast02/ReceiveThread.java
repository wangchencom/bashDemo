package cn.itcast02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveThread  implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		DatagramSocket ds;
		try {
			ds = new DatagramSocket(10079);
		
		byte[]buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf, buf.length);
		ds.receive(dp);
		String ip = dp.getAddress().getHostAddress();
		String s = new String(dp.getData(), 0, dp.getLength());
		System.out.println(ip);
		System.out.println(s);
		ds.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
