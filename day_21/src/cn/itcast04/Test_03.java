package cn.itcast04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//二进制数据我们一般都用字节流读取
public class Test_03 {
public static void main(String[] args) throws IOException {
	FileInputStream fis = new FileInputStream("psb(3).jpg");
	FileOutputStream fos = new FileOutputStream("D:\\psb.jpg");
	int ch = 0;
	while((ch=fis.read()) != -1){
		fos.write(ch);
	}
	fis.close();
	fos.close();
}
}
