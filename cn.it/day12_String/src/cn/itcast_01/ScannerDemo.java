package cn.itcast_01;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		// ��������
		Scanner sc = new Scanner(System.in);

		// ��ȡint��������
		// int num = sc.nextInt();

		// ��ȡString���͵�����
		// public String nextLine()
		String line = sc.nextLine();
		System.out.println("line:" + line);
	}
}
