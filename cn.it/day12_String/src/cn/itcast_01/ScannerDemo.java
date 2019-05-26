package cn.itcast_01;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		// 创建对象
		Scanner sc = new Scanner(System.in);

		// 获取int类型数据
		// int num = sc.nextInt();

		// 获取String类型的数据
		// public String nextLine()
		String line = sc.nextLine();
		System.out.println("line:" + line);
	}
}
