package cn.itcast05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("001.txt"));

			BufferedWriter bw = new BufferedWriter(new FileWriter("005.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		} 
	}
}