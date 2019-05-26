package cn.itcast;
/*
 * helloWorld
 * 
 * Helloworld
 * 
 * 思路：
 * 	1. 截图首字母，转换成大写
 *  2. 截取其他父母，转换成小写
 *  3. 拼接
 * 
 */
public class StringTest {
	
	public static void main(String[] args) {
		String str = "helloWorld";
		//方式一
		//1. 
		String headStr = str.substring(0,1);
		headStr = headStr.toUpperCase();
		
		//2. 
		String otherStr = str.substring(1);
		otherStr = otherStr.toLowerCase();
		
		//3
		String str1 = headStr + otherStr;
		System.out.println(str1);
		
		
		//方式二
		//链式编程
		//可读性差，书写简单
		String str2  = str.substring(0,1).toUpperCase().concat(str.substring(1).toLowerCase());
		System.out.println(str2);
		
		
	}

}
