

import java.util.Scanner;

public class LoginTest_2 {
	public static void main(String[] args) {
		User u = new User();
		u.setName("admin");
		u.setPw("admin");


		for (int i = 0; i < 3; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("请输入用户名：");
			String name = sc.nextLine();
			System.out.print("请输入密码：");
			String pw = sc.nextLine();
			if (u.isLogin(name, pw)) {
				System.out.println("恭喜，登陆成功！");
				break;
			}else{
				if (2-i==0) {
					System.out.println("输入错误3次账号被锁定，请于工作日前往北京中南海抢救你的账号");
				}else {
						System.out.println("账号名或密码错误，登录失败。你还有"+(2-i)+"次机会。");					
				}
			}
		}
	}
}