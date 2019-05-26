package cn.itcast03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendThread implements Runnable {

	@Override
	public void run() {
		try { 
			// �������Ͷ�Socket����
			DatagramSocket ds = new DatagramSocket();

			// ��װ����¼��
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			// �������ݣ������
			String line = null;
			while ((line = br.readLine()) != null) {
				if ("886".equals(line)) {
					break;
				}

				byte[] bys = line.getBytes();
				DatagramPacket dp = new DatagramPacket(bys, bys.length,
						InetAddress.getByName("192.168.1.100"), 10086);
				ds.send(dp);
			}

			// �ͷ���Դ
			ds.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
