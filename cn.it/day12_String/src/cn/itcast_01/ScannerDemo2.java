package cn.itcast_01;

import java.util.Scanner;

/*
 * int -- int			正常
 * String -- String		正常
 * String -- int		正常	
 * int -- String		不正常
 * 
 * 如何解决这个不正确的情况：
 * A:重新创建一个Scanner对象。
 * B:都用字符串接收，然后把一个字符串转换成int类型。
 */
public class ScannerDemo2 {
	public static void main(String[] args) {
		// 创建对象
		Scanner sc = new Scanner(System.in);

		// 获取两个int类型数据
		int a = sc.nextInt();
		// int b = sc.nextInt();

		//对sc对象重新赋值
		sc = new Scanner(System.in);
		// 获取两个字符串类型
		// String a = sc.nextLine();
		String b = sc.nextLine();
		// int b = sc.nextInt();
		System.out.println(a + "***" + b);
		char c = 97;
	}
}
