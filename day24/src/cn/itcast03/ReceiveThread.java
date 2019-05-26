package cn.itcast03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveThread implements Runnable {

	@Override
	public void run() { 
		try {
			// 创建接收端Socket对象
			DatagramSocket ds = new DatagramSocket(10086);

			// 创建数据包
			while (true) {
				byte[] bys = new byte[1024];
				DatagramPacket dp = new DatagramPacket(bys, bys.length);
				// //接收数据
				ds.receive(dp);
				// 解析数据
				String ip = dp.getAddress().getHostAddress();
				String s = new String(dp.getData(), 0, dp.getLength());
//				String hostName = dp.getAddress().getHostName();
				System.out.println("from " + ip + " data is " + s);
			}

			// ds.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
