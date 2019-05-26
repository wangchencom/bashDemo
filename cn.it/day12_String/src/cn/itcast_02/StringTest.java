package cn.itcast_02;

/*
 * 面试题：
 * A:字符串一旦初始化就不可以被改变
 * 		注意：这里指的是字符串在常量池里面的值不能发生改变。而不是说字符串的引用不能变。
 * 
 * B:String s1 = new String("abc");String s2 = "abc";有区别吗？
 * 		有。
 * 		第一种方式，其实在内存中有两个对象存在。
 * 		第二种方式，在内存中只有一个对象存在。
 */
public class StringTest {
	public static void main(String[] args) {
		String s = "hello";
		s += "world";
		System.out.println(s); // helloworld
	}
}
