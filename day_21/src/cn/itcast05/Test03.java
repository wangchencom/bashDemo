package cn.itcast05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test03 {
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new FileReader("001.txt"));

	BufferedWriter bw = new BufferedWriter(new FileWriter("005.txt"));
	char[] chs = new char[1024];
	String len = null;
	while((len = br.readLine())!= null)
	{
		//往目的地写入数据
		bw.write(len);
		//换行功能
		bw.newLine();
		//刷新
		bw.flush();
	}
	br.close();
	bw.close();
	System.out.println("复制成功");
	
}
}
