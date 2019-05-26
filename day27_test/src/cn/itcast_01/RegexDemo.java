package cn.itcast_01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class RegexDemo {
	public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new FileReader("mail.txt"));
ArrayList<String> array = new ArrayList<String>();
String regex = "\\w+@\\w{2,,8}(\\.\\w{2,3})";

} 
}
