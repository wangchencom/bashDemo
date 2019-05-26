package cn.itcast03;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CapyDemo {
	public static void main(String[] args) throws IOException {
		
	

	// TODO Auto-generated method stub
	FileReader fr = new FileReader("001.txt");
	FileWriter fw = new FileWriter("00.txt");
	int count = 0;
	while ((count=fr.read())!=-1) {             
		fw.write(count);
		
		
	}
	fr.close();
	fw.close();
	System.out.println("¸´ÖÆ³É¹¦");
			
}
}
