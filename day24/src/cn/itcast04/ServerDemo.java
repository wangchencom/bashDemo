package cn.itcast04;

/***
 * TCPЭ��ķ������˲��裺
 * ����������Socket����SeverSocket
 * ��������
 * public ServerSocket accept()
 * ��ȡ����������ȡ���ݲ���ʾ����
 * public iInputStrean getInputStream()ע��÷�����Socket�еķ���
 * �ͷ���Դ
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
		// �����ͻ�������  ���û������ ����
		Socket s = ss.accept();// ����
		// ��ȡ������ ��ȡ���� ����ʾ
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		
		int len = is.read(bys);// ����
		
		String client = new String(bys, 0, len);
		
		System.out.println("client" + client);
		// ��ȡ�����
		OutputStream os = s.getOutputStream();
		os.write("���ݴ���ɹ�".getBytes());
		// �ͷ���Դ
		
		s.close();
		ss.close();

	}
}
