package cn.itcast_05;

/*
 * byte[] getBytes():把字符串转换成字节数组。
 * char[] toCharArray()：把字符串转换成字符数组。
 * static String copyValueOf(char[] chs):把字符数组转换成字符串。
 * static String valueOf(char[] chs):把字符数组转换成字符串。
 * static String valueOf(int i)基本类型：把int（基本类型）转换成字符串。
 * String toLowerCase()：把字符串变成小写
 * String toUpperCase():把字符串变成大写
 * String concat(String str):拼接字符串。
 */
public class StringDemo {
	public static void main(String[] args) {
		// 创建字符串对象
		String s = "HelloWorld";

		// byte[] getBytes():把字符串转换成字节数组。
		byte[] bys = s.getBytes();
		for (int x = 0; x < bys.length; x++) {
			System.out.println(bys[x]);
		}
		System.out.println("-----------------");

		// char[] toCharArray()：把字符串转换成字符数组。
		char[] chs = s.toCharArray();
		for (int x = 0; x < chs.length; x++) {
			System.out.println(chs[x]);
		}
		System.out.println("-----------------");

		// static String copyValueOf(char[] chs):把字符数组转换成字符串。
		char[] chs2 = { 'a', 'b', 'c', '中', '国' };
		String s2 = String.copyValueOf(chs2);
		System.out.println(s2);
		System.out.println("-----------------");

		// static String valueOf(char[] chs):把字符数组转换成字符串。
		String s3 = String.valueOf(chs2);
		System.out.println(s3);
		System.out.println("-----------------");

		// static String valueOf(int i)
		int i = 100;
		String s4 = String.valueOf(i);
		System.out.println(s4);
		System.out.println("-----------------");

		// String toLowerCase()：把字符串变成小写
		System.out.println(s.toLowerCase());
		// String toUpperCase():把字符串变成大写
		System.out.println(s.toUpperCase());
		System.out.println("-----------------");

		// String concat(String str):拼接字符串。
		String s5 = "hello";
		String s6 = s5 + "world";
		String s7 = s5.concat("world");
		System.out.println(s6);
		System.out.println(s7);
	}
}
