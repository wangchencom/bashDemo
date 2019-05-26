package cn.itcast01;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.lang.model.element.UnknownElementException;

/**
 * InetAddrssd :表示IP地址
 * @author 琛
 *为什莫没有打印出主机名呢
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
