package cn.itcast04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test_02 {
public static void main(String[] args) throws IOException {
	FileInputStream fis = new FileInputStream("002.txt");
		// int by = 0;
		// while((by= fis.read())!=-1)
		// {
		// System.out.print((char)by);
		// }
	//fis.close();
	byte[] bys = new byte[1024];
	int len = 0;
	while((len = fis.read(bys))!=-1){
		System.out.println(new String (bys,0,len));
	}
	fis.close();
	
}
}
