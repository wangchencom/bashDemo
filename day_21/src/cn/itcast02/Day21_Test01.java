package cn.itcast02;
/**
 * ���ö�ȡ����
 * ����ȡ������ʾ�ڿ���̨�ϡ�
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Day21_Test01 {
public static void main(String[] args) throws IOException {
	//�����ַ�����������
	FileReader fr= new FileReader("Day21_Test01.java");
	//���÷���
	int c = fr.read();
	//System.out.println((char)c);
	while (c!=-1) {
		System.out.print((char)c);
		c = fr.read();
		
		
	}
	fr.close();
}
}
