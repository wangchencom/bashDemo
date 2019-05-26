package cn.itcast03;

import java.io.FileReader;
import java.io.IOException;

/**
 * 如何一次读取一个数组的数据 一次读多个字符 开发中是1024的整数倍
 * 
 * @author 琛
 * 
 */
public class Test01 {
	public static void main(String[] args) throws IOException {
		// 创建字符输入流
		FileReader fr = new FileReader("Day21_Test01.java");
		//开发中用1024的整数倍。
		char[] chs = new char[1024];
		int len = 0;
		while ((len = fr.read(chs)) != -1) {
			System.out.print(new String(chs, 0, len));
		}
		fr.close();
	}
}
