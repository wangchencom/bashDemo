package cn.itcast01;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.lang.model.element.UnknownElementException;

/**
 * InetAddrssd :��ʾIP��ַ
 * @author �
 *ΪʲĪû�д�ӡ����������
 */
public class InetAddrssdDemo {
public static void main(String[] args) throws UnknownElementException, UnknownHostException {
	InetAddress address = InetAddress.getByName("192.168.27.01");
	String ip = address.getHostAddress();
	String name =address.getHostName();
	System.out.println(ip);
	System.out.println(name);
	System.out.println(address);
}
}
