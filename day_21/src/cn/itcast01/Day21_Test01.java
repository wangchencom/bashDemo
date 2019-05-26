package cn.itcast01;

import java.io.FileWriter;
import java.io.IOException;



public class Day21_Test01 {


public static void main(String[] args) throws IOException {

	
	String s ="sdfaffgggg";
	FileWriter file = new FileWriter("001.txt" );
	file.write(s, 0, 5);
	file.write(s, 0, 6);
	file.flush();
	
	
}
}
