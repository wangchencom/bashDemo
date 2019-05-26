package cn.itcast05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.ByteOrder;

public class Test01 {
public static void main(String[] args) throws IOException  {
	FileReader fr = new FileReader("002.txt");
	BufferedReader bw = new BufferedReader(fr);
	
	int ch = 0;
	while((ch=bw.read()) != -1){
		bw.read();
	}
}
}
