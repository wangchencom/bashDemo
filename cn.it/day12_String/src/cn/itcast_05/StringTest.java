package cn.itcast_05;

/*
 * 需求:把字符串的首字母转成大写，其余为小写
 * 
 * 举例：
 * 		helloWorld
 * 
 * 		结果：
 * 		Helloworld
 * 
 * 思路：
 * 		A:截取首字母。
 * 		B:截取其他字母。
 * 		C:把A转大写+B转小写
 */
public class StringTest {
	public static void main(String[] args) {
		String s = "helloWorld";
		String s1 = s.substring(0, 1);
		String s2 = s.substring(1);
		String s3 = s1.toUpperCase().concat(s2.toLowerCase());
		System.out.println(s3);

		// 链式编程
		// String result = s.substring(0, 1).toUpperCase()
		// .concat(s.substring(1).toLowerCase());
		// System.out.println(result);
	}
}
