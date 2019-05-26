package cn.operator;

public class OperatorDemo {
	public static void main(String[] args) {
		// 最基本的赋值
		int a = 10;
		// 多种赋值
		a += 20;// 把左边和右边的数据加起来再赋给左边.
		// 等价于 a= a + 20.
		// 面试题
		short s = 5;
		// s = s + 2 ;//会报错
		s += 2;// += 会自动类型转化
		// 类项转换: 隐式转换(从小到大)
		// byte ,short , char -- int --long -- float --double
		// long 是八个字节,float是4个字节 long是整数,float是浮点数,整数和浮点数的储存规则不一样
		// long的范围小于float

		// 强制转换(从大到小)
		// 格式:(转换后的数据类型)变量或者值
		// 定义两个类型不一致变量
		// int x = 10;
		// byte b = 20;
		// 把两个变量进行加法运算
		// byte b2 = x + b;
		// System.out.println(b2);

		// 定义两个类型一致的变量
		int x = 10;
		int y = 20;
		int z = x + y;
		System.out.println(z);

		// 隐式转换
		byte x1 = 10;
		int b = x1;
		System.out.println(b);

		float f = 12.5F;
		// byte b2 = a+b+f;
		// int i2 = a+b+f;
		// float f2 = a+b+f;
		double d = a + b + f;
		System.out.println(d);

		// 强制类型转换
		int i = 10;
		byte b2 = (byte) i;
		System.out.println(b2);
		byte b1 = 3;
		byte b21 = 4;
		byte b3 = (byte) (b1 + b21);
		byte b4 = 3 + 4;
		// ASCII码表三个字符的值. 'a' - 97
		// 'A' - 65
		// '0' - 48

	}
}
