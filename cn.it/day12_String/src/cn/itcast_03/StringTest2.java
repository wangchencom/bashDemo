package cn.itcast_03;

import java.util.Scanner;

/*
 * 用户登录：
 * 		这里肯定有一个用户存在。并且用户类里面还应该有一个方法，用于判断用户登录是否成功。
 */
public class StringTest2 {
	public static void main(String[] args) {
		// 存在一个用户
		User user = new User();
		user.setUsername("admin");
		user.setPassword("admin");

		// 三次机会
		for (int x = 0; x < 3; x++) {
			// x 0,1,2
			// 键盘录入数据：用户名和密码。
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入用户名：");
			String name = sc.nextLine();
			System.out.println("请输入密码：");
			String pwd = sc.nextLine();
			// 把数据进行比较。

			if (user.isLogin(name, pwd)) {
				System.out.println("恭喜你,登录成功");
				// 引入曾经的猜数字小游戏。
				break;
			} else {
				if ((2 - x) == 0) {
					System.out.println("账号被锁定,请与林青霞联系");
				} else {
					// 2,1,0
					System.out.println("登录失败,你还有" + (2 - x) + "次机会");
				}
			}
		}
	}
}
