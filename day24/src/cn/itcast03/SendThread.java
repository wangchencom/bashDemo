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
			// 创建发送端Socket对象
			DatagramSocket ds = new DatagramSocket();

			// 封装键盘录入
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			// 创建数据，并打包
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

			// 释放资源
			ds.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
