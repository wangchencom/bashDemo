/**
 * 判断功能：
 *一 boolean equals(Object obj)：判断字符串的内容是否相同,区分大小写。
 * 二boolean equalsIgnoreCase(String str):判断字符串的内容是否相同,不区分大小写。
 * 三boolean contains(String str):判断字符串对象是否包含给定的字符串。
 * 四boolean startsWith(String str):判断字符串对象是否以给定的字符串开始。
 * 五boolean endsWith(String str):判断字符串对象是否以给定的字符串结束。
 * 六boolean isEmpty():判断字符串对象是否为空。数据是否为空。
 */
package Test;

public class Test03 {
	public static void main(String[] args) {
		//创建字符串对象
		String s = "HelloWorld";
		//测试一:判断字符串的内容是否相同,区分大小写。
		System.out.println(s.equals("helloworld"));
		System.out.println(s.equals("HelloWorld"));
		System.out.println("*****************");
		//测试二:判断字符串的内容是否相同,不区分大小写。
		System.out.println(s.equalsIgnoreCase("helloworld"));
		System.out.println(s.equalsIgnoreCase("hellOWorld"));
		System.out.println("*****************");
		//测试三：判断字符串对象是否包含给定的字符串。
		System.out.println(s.contains("he"));
		System.out.println(s.contains("or"));
		System.out.println("*****************");
		//测试四:判断字符串对象是否以给定的字符串开始。
		System.out.println(s.startsWith("w"));
		System.out.println(s.startsWith("H"));
		System.out.println("*****************");
		//测试五：判断字符串对象是否以给定的字符串结束。
		System.out.println(s.endsWith("l"));
		System.out.println(s.endsWith("d"));
		System.out.println("*****************");
		//测试六;判断字符串对象是否为空。数据是否为空。
		System.out.println(s.isEmpty());
		//如果		String s = "";
		//或			 String s = null;
		//测试七
		String s2 ="";
		//String s3 = null;
		
		System.out.println(s2.isEmpty());
		//System.out.println(s3.isEmpty());  NullPointerException空指针异常

	}

}
