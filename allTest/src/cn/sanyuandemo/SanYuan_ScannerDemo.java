package cn.sanyuandemo;

import java.util.Scanner;

/***
 * 条件运算符：(三元运算符) (条件表达式)?表达式1：表达式2；
 * 
 * 注意：条件表达式说明这里将来只能是结果为true或者false的表达式。
 * 
 * 执行顺序： 如果条件表达式为true，就把表达式1作为结果。 如果条件表达式为false，就把表达式2作为结果。
 * 
 * 
 * @author 琛 键盘录入 Scanner方法 使用步骤 A:导包 import java.util.Scanner; B:创建对象 Scanner
 *         sc = new Scanner(System.in);
 * 
 *         System.in:是标准输入流。对应着键盘录入。 C:调用方法获取int类型数据 int number = sc.nextInt();
 */
public class SanYuan_ScannerDemo {
	public static void main(String[] args) {
		int x = 100;
		int y = (x > 50) ? 100 : 200;
		// 复杂的
		int z = (x > 200) ? ((y < 40) ? 100 : 200) : ((y > 100) ? 300 : 200);
		System.out.println(z);
		// 封装键盘录入数据
		Scanner sc = new Scanner(System.in);
		// 定义一个变量接收
		int num = sc.nextInt();
		System.out.println(num);

		// 面试题一 :
		// 使用最高的效率写出二乘以八这个式子.
		// 2*8 -- 2<<3

		// 面试题二
		// 请把两个数据交换。
		// 举例：
		// int a = 10;
		// int b = 20;
		// 结果：
		// a = 20;
		// b = 10;
		//
		// 开发使用第三方变量的形式。
		// 面试使用位^运算符。
		// 记忆：假设变量是a,b
		// 左边：a,b,a
		// 右边；a^b
		int a = 10;
		int b = 20;

		// 方案1：采用临时变量(开发用)
		/*
		 * int temp = a; a = b; b = temp; System.out.println(a+"***"+b);
		 */

		// 方案2：使用位^运算符
		// 特点：一个数据对同一个数据位^运算两次，数据不变。
		// System.out.println(a ^ b);
		// System.out.println(a ^ b ^ b);

		a = a ^ b;
		b = a ^ b; // a ^ b ^ b = a
		a = a ^ b; // a ^ b ^ a = b
		System.out.println(a + "***" + b);
		/*
		 * a = a ^ b
		 * b = a^ b
		 * a = a^ b
		 */
	}
}
