package day20_test;

import java.io.FileWriter;
import java.io.IOException;

public class Test_6 {
public static void main(String[] args) throws IOException {
	//�����ַ������
	//��������
	//���ַ����������ָ�򴴽����ļ�
	FileWriter fw = new FileWriter("a.txt");
	//д������
	fw.write("123456789111");
	//ˢ�£����ݵײ�
	fw.flush();
	fw.close();
	
}
}
