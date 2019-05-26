package cn.itcast02;
/**
 * 调用读取方法
 * 将读取数据显示在控制台上。
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Day21_Test01 {
public static void main(String[] args) throws IOException {
	//创建字符输入流对象
	FileReader fr= new FileReader("Day21_Test01.java");
	//调用方法
	int c = fr.read();
	//System.out.println((char)c);
	while (c!=-1) {
		System.out.print((char)c);
		c = fr.read();
		
		
	}
	fr.close();
}
}
