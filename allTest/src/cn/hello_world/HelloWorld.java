package cn.hello_world;

public class HelloWorld {
	

	public static void main (String[]args){
		System.out.println("hello java");
		for(int x = 1; x <100;x++){
			for(int y = 1;y<x+1; x ++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
}
