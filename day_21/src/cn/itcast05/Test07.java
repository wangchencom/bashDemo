package cn.itcast05;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test07 {
	public static void main(String[] args) throws IOException {
		// PrintWriter pw = new PrintWriter("008.txt");创建对象不会自动刷新
		PrintWriter pw = new PrintWriter(new FileWriter("009.txt"), true);// 创建对象如果参数AotuFlush为true的情况下，可以试想自动刷新
																			// 但其中应包含println，printf，format
		// 使用print
		// pw.print(123);
		// pw.print(true);
		// pw.print("asd");
		// pw.flush();
		// 自动刷新并且还可以自动换行哦
		// pw.println("aa");还是没进去。。因为没有启动~换构造方法
		pw.println("aa");// 数据写入，自动刷新，自动换行
	}
}
