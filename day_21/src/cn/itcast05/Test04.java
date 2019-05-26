package cn.itcast05;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class Test04 {
public static void main(String[] args) throws  IOException{
	//Scanner sc =  new Scanner(System.in);
	BufferedWriter bw = new BufferedWriter(new FileWriter("006.txt"));
	ArrayList<String> al = new ArrayList<String>();
	al.add("hello");
	al.add("world");
	al.add("java");
	for(String s :al){
		bw.write(s);
		bw.newLine();
		bw.flush();
		
	}
	bw.close();
	System.out.println(" ‰»Î≥…π¶");
	
}
}
