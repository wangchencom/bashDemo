package cn.itcast01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/***
 * �������ն˷������
 * �������ݰ�������������
 * ���ý��շ���
 * �������ݰ� ��������ʾ�ڿ���̨
 * �ͷ���Դ
 * B:Exception in thread "main" java.net.BindException: 
 *  	  Address already in use: Cannot bind
 *		�˿ڱ�ռ��
 * @author �
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
