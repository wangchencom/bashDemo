package cn.itcast03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveThread implements Runnable {

	@Override
	public void run() { 
		try {
			// �������ն�Socket����
			DatagramSocket ds = new DatagramSocket(10086);

			// �������ݰ�
			while (true) {
				byte[] bys = new byte[1024];
				DatagramPacket dp = new DatagramPacket(bys, bys.length);
				// //��������
				ds.receive(dp);
				// ��������
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
