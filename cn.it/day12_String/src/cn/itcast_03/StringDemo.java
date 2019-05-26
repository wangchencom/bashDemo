package cn.itcast_03;

/*
 * 判断功能：
 * boolean equals(Object obj)：判断字符串的内容是否相同,区分大小写。
 * boolean equalsIgnoreCase(String str):判断字符串的内容是否相同,不区分大小写。
 * boolean contains(String str):判断字符串对象是否包含给定的字符串。
 * boolean startsWith(String str):判断字符串对象是否以给定的字符串开始。
 * boolean endsWith(String str):判断字符串对象是否以给定的字符串结束。
 * boolean isEmpty():判断字符串对象是否为空。数据是否为空。
 */
public class StringDemo {
	public static void main(String[] args) {
		// 创建字符串对象
		String s = "HelloWorld";

		// boolean equals(Object obj)：判断字符串的内容是否相同,区分大小写。
		System.out.println(s.equals("HelloWorld"));
		System.out.println(s.equals("helloworld"));
		System.out.println("--------------------");

		// boolean equalsIgnoreCase(String str):判断字符串的内容是否相同,不区分大小写。
		System.out.println(s.equalsIgnoreCase("HelloWorld"));
		System.out.println(s.equalsIgnoreCase("helloworld"));
		System.out.println("--------------------");

		// boolean contains(String str):判断字符串对象是否包含给定的字符串。
		System.out.println(s.contains("or"));
		System.out.println(s.contains("ak"));
		System.out.println("--------------------");

		// boolean startsWith(String str):判断字符串对象是否以给定的字符串开始。
		System.out.println(s.startsWith("Hel"));
		System.out.println(s.startsWith("hello"));
		System.out.println("--------------------");

		// boolean endsWith(String str):判断字符串对象是否以给定的字符串结束。省略不讲。

		// boolean isEmpty():判断字符串对象是否为空。数据是否为空。
		System.out.println(s.isEmpty());
		String s2 = "";
		System.out.println(s2.isEmpty());
		// String s3 = null;
		// NullPointerException 空指针异常
		// System.out.println(s3.isEmpty());
	}
}
