package cn.itcast02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class SendThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// 创建发送端Socket服务对象
		DatagramSocket ds;
		try {
			ds = new DatagramSocket();
	
		// 创建数据，并把数据打包
		String str = "heallo00000";
		byte[] bys = str.getBytes();
		int length = bys.length;
		InetAddress address = InetAddress.getByName("192.168.27.114");
		int port = 10079;
		DatagramPacket dp = new DatagramPacket(bys, length, address, port);
		
		//  public DatagramPacket(byte buf[], int length,InetAddress address, int port) {
							
		//发送数据   DatagramPacket 包类
		ds.send(dp);
		
		//释放资源
		ds.close();	} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	}


