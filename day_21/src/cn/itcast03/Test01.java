package cn.itcast03;

import java.io.FileReader;
import java.io.IOException;

/**
 * ���һ�ζ�ȡһ����������� һ�ζ�����ַ� ��������1024��������
 * 
 * @author �
 * 
 */
public class Test01 {
	public static void main(String[] args) throws IOException {
		// �����ַ�������
		FileReader fr = new FileReader("Day21_Test01.java");
		//��������1024����������
		char[] chs = new char[1024];
		int len = 0;
		while ((len = fr.read(chs)) != -1) {
			System.out.print(new String(chs, 0, len));
		}
		fr.close();
	}
}
