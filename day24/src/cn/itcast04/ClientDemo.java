package cn.itcast04;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import org.xml.sax.InputSource;

public class ClientDemo {
public static void main(String[] args) throws IOException, IOException {
	//创建一个客户端的Socket对象
	Socket  s = new Socket("192.168.27.114",10010);
	//建立连接
	//发送数据(获取输出流来往服务端发送数据)
	//public OUtputStream getOUtputStreaam()
	OutputStream os = s.getOutputStream();
	os.write("hello,pc".getBytes());
	//获取输入流
	InputStream is = s.getInputStream();
	byte[] bys = new byte[1024];
	int len = is.read(bys);
	String client = new String (bys,0,len);
	System.out.println("client"+client);
	//释放资源
	s.close();
	
	
	
}
}
