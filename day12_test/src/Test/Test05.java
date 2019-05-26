package Test;


public class Test05 {
	public static void main(String[] args) {
		String s = "Hello12345World";

		// 定义三个统计变量
		int bigCount = 0;
		int smallCount = 0;
		int numberCount = 0;

		// 遍历字符串。
		for (int x = 0; x < s.length(); x++) {
			char ch = s.charAt(x);
			
			
			if (ch >= 'A' && ch <= 'Z') {
				bigCount++;
			} else if (ch >= 'a' && ch <= 'z') {
				smallCount++;
			} else if (ch >= '0' && ch <= '9') {
				numberCount++;
			}
		}

		System.out.println("大写：" + bigCount);
		System.out.println("小写：" + smallCount);
		System.out.println("数字：" + numberCount);
	}
}


