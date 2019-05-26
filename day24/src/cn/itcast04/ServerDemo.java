package cn.itcast04;

/***
 * TCP协议的服务区端步骤：
 * 创建服务器Socket对象SeverSocket
 * 监听连接
 * public ServerSocket accept()
 * 获取输入流，读取数据并显示数据
 * public iInputStrean getInputStream()注意该方法是Socket中的方法
 * 释放资源
 * 
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(10010);
		// 监听客户端连接  如果没有连接 阻塞
		Socket s = ss.accept();// 阻塞
		// 获取输入流 读取数据 并显示
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		
		int len = is.read(bys);// 阻塞
		
		String client = new String(bys, 0, len);
		
		System.out.println("client" + client);
		// 获取输出流
		OutputStream os = s.getOutputStream();
		os.write("数据传输成功".getBytes());
		// 释放资源
		
		s.close();
		ss.close();

	}
}
