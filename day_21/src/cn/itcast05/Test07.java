package cn.itcast05;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test07 {
	public static void main(String[] args) throws IOException {
		// PrintWriter pw = new PrintWriter("008.txt");�������󲻻��Զ�ˢ��
		PrintWriter pw = new PrintWriter(new FileWriter("009.txt"), true);// ���������������AotuFlushΪtrue������£����������Զ�ˢ��
																			// ������Ӧ����println��printf��format
		// ʹ��print
		// pw.print(123);
		// pw.print(true);
		// pw.print("asd");
		// pw.flush();
		// �Զ�ˢ�²��һ������Զ�����Ŷ
		// pw.println("aa");����û��ȥ������Ϊû������~�����췽��
		pw.println("aa");// ����д�룬�Զ�ˢ�£��Զ�����
	}
}
