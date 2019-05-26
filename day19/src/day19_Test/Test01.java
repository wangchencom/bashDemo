package day19_Test;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Object neet;
		System.out.println("请输入被除数");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		System.out.println("请输入除数");
		Scanner s = new Scanner(System.in);
		int y = s.nextInt();

		try {
			System.out.println("结果为");
			System.out.println(x / y);
		} catch (ArithmeticException ae) {
			System.out.println("除数不能为零");
		}

	}
}
