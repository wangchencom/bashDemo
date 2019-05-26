package day20_test;

import java.io.FileWriter;
import java.io.IOException;

public class Test_6 {
public static void main(String[] args) throws IOException {
	//创建字符输出流
	//创建对象
	//把字符输出流对象指向创建的文件
	FileWriter fw = new FileWriter("a.txt");
	//写入数据
	fw.write("123456789111");
	//刷新：数据底层
	fw.flush();
	fw.close();
	
}
}
