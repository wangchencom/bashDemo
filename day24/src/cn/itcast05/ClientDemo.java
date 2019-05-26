package cn.itcast05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/*
 * 需求：数据来源于键盘录入与，通过服务器转成大写，然后反馈给客户端显示。
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException {
		// 创建客户端Socket对象
		Socket s = new Socket("192.168.27.66", 22222);
		// 封装键盘录入
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 获取输出流
		// OutputStream os = s.getOutputStream();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
				s.getOutputStream()));

		String line = null;
		while ((line = br.readLine()) != null) {
			if ("over".equals(line)) {
				break;
			}

			bw.write(line);
			bw.newLine();
			bw.flush();

			// 获取服务器的反馈
			BufferedReader brServer = new BufferedReader(new InputStreamReader(
					s.getInputStream()));
			String server = brServer.readLine();
			System.out.println("server:" + server);
		}

		br.close();
		s.close();    
	}
}
