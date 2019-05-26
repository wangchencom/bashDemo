package cn.itcast05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
public static void main(String[] args) throws IOException {
	//�ȴ�������������
	ServerSocket ss = new ServerSocket(11111);
	//�����ͻ���
	Socket s = ss.accept();
	BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
	String line = null;
	while((line = br.readLine())!=null){
		bw.write(line.toUpperCase());
		bw.newLine();
		bw.flush();
		
	}
}
}
