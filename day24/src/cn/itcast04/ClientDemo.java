package cn.itcast04;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import org.xml.sax.InputSource;

public class ClientDemo {
public static void main(String[] args) throws IOException, IOException {
	//����һ���ͻ��˵�Socket����
	Socket  s = new Socket("192.168.27.114",10010);
	//��������
	//��������(��ȡ�������������˷�������)
	//public OUtputStream getOUtputStreaam()
	OutputStream os = s.getOutputStream();
	os.write("hello,pc".getBytes());
	//��ȡ������
	InputStream is = s.getInputStream();
	byte[] bys = new byte[1024];
	int len = is.read(bys);
	String client = new String (bys,0,len);
	System.out.println("client"+client);
	//�ͷ���Դ
	s.close();
	
	
	
}
}
