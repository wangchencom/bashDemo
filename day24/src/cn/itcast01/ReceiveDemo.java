package cn.itcast01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/***
 * 建立接收端服务对象
 * 创建数据包（接收容器）
 * 调用接收方法
 * 解析数据包 把数据显示在控制台
 * 释放资源
 * B:Exception in thread "main" java.net.BindException: 
 *  	  Address already in use: Cannot bind
 *		端口被占用
 * @author 琛
 *
 */
public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket(10079);
		byte[]buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf, buf.length);
		ds.receive(dp);
		String ip = dp.getAddress().getHostAddress();
		String s = new String(dp.getData(), 0, dp.getLength());
		System.out.println(ip);
		System.out.println(s);
		ds.close();
	
	}
}
