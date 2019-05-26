package cn.itcast04;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test_01 {
public static void main(String[] args) throws IOException {
	FileOutputStream fos = new FileOutputStream("002.txt");
	//byte [] bys = {95,75,42,61,61,5,32,97};
	byte[] bys = "abcde".getBytes();
	fos.write(bys);
	
	fos.close();
}
}
