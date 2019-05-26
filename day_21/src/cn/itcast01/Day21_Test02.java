package cn.itcast01;

import java.io.FileWriter;
import java.io.IOException;

public class Day21_Test02 {
public static void main(String[] args) {
	FileWriter fw = null;
	try {
		fw = new FileWriter("002.txt");
		fw.write("hello");
		fw.flush();
	} catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
	}finally{
		if (fw!= null) {
			try {
				fw.close();
			} catch (IOException e2) {
				// TODO: handle exception
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}
	}
}
}
