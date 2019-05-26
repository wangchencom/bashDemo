package cn.itcast_04;

/*
 * 统计大写小写字符的个数
 * 
 * 举例：
 * 		Hello12345World
 * 
 * 		大写：2
 * 		小写：8
 * 		数字：5
 * 
 * 思路：
 * 		A:定义三个统计变量
 * 		B:获取到每一个字符。遍历字符串。
 * 		C:判断是属于哪种范围的
 * 			大写：65-90
 * 			小写：97-122
 * 			数字：48-57
 *		C:是哪种哪种++
 */
public class StringTest {
	public static void main(String[] args) {
		String s = "Hello12345World";

		// 定义三个统计变量
		int bigCount = 0;
		int smallCount = 0;
		int numberCount = 0;

		// 遍历字符串。
		for (int x = 0; x < s.length(); x++) {
			char ch = s.charAt(x);
			// 判断是属于哪种范围的
//			if (ch >= 65 && ch <= 90) {
//				bigCount++;
//			} else if (ch >= 97 && ch <= 122) {
//				smallCount++;
//			} else if (ch >= 48 && ch <= 57) {
//				numberCount++;
//			}
			
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
