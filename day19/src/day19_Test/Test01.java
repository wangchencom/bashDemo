package day19_Test;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Object neet;
		System.out.println("�����뱻����");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		System.out.println("���������");
		Scanner s = new Scanner(System.in);
		int y = s.nextInt();

		try {
			System.out.println("���Ϊ");
			System.out.println(x / y);
		} catch (ArithmeticException ae) {
			System.out.println("��������Ϊ��");
		}

	}
}
