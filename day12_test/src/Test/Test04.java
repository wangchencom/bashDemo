/**
 * 模拟登录,给三次机会,并提示还有几次
 * 
 * 思路：
 * 		A:应该已经存在有用户名和密码。用String表示就可以。
 * 		B:键盘录入数据：用户名和密码。
 * 		C:把数据进行比较。
 * 			匹配：成功
 * 			不匹配：失败。
 *		D:给三次机会，说明用循环控制。而告诉你了三次。用for循环。
 *		E:提示还有几次。其实很简单。
 */

package Test;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		// 应该已经存在有用户名和密码。用String表示就可以。
		String username = "admin";
		String password = "admin";
		//三次机会　
		for (int i = 0; i < 3; i++) {
			//键盘录入账户名和密码．
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入用户名：");
			String name = sc.nextLine();
			System.out.println("请输入密码：");
			String pwd =sc.nextLine();
			//把数据进行比较
			if (username.equals(name) && password.equals(pwd)) {
				System.out.println("恭喜你登录成功");
				break;
			}
		
		}
	}

}
