package cn.itcast_04;

/*
 * 字符串的获取功能：
 * int length():获取字符串的长度
 * char charAt(int index):返回字符串中给定索引处的字符
 * int indexOf(int ch):返回指定字符在此字符串中第一次出现的索引
 * int indexOf(String str):返回指定字符串在此字符串中第一次出现的索引
 * int indexOf(int ch,int fromIndex):返回在此字符串中第一次出现指定字符的索引，从指定的索引开始搜索。
 * int indexOf(String str,int fromIndex):返回在此字符串中第一次出现指定字符串的索引，从指定的索引开始搜索。
 * String substring(int start):截取字符串。返回从指定位置开始截取后的字符串。
 * String substring(int start,int end)截取字符串。返回从指定位置开始到指定位置结束截取后的字符串。
 */
public class StringDemo {
	public static void main(String[] args) {
		// 创建字符串对象
		String s = "helloworld";

		// int length():获取字符串的长度
		System.out.println(s.length());
		System.out.println("--------");

		// char charAt(int index):返回字符串中给定索引处的字符
		System.out.println(s.charAt(2));
		System.out.println("--------");

		// 遍历字符串。
		for (int x = 0; x < s.length(); x++) {
			char ch = s.charAt(x);
			System.out.println(ch);
		}
		System.out.println("--------");

		// int indexOf(int ch):返回指定字符在此字符串中第一次出现的索引
		System.out.println(s.indexOf('l'));
		// int indexOf(int ch,int fromIndex):返回在此字符串中第一次出现指定字符的索引，从指定的索引开始搜索。
		System.out.println(s.indexOf('l', 4));
		System.out.println("--------");

		// 常见的方法：包左不包右。
		// String substring(int start):截取字符串。返回从指定位置开始截取后的字符串。
		System.out.println(s.substring(4));
		// String substring(int start,int end)截取字符串。返回从指定位置开始到指定位置结束截取后的字符串。
		System.out.println(s.substring(4, 8));
		
		//截取的串要和以前一样。
		System.out.println(s.substring(0));
		System.out.println(s.substring(0,s.length()));
		
		System.out.println(s);
	}
}
