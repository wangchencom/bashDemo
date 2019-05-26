package day20_test;
/**
 * 在控制台输出指定目录下的所有.java文件
 * 思路：
 * 		封装指定目录
 * 		获取到该目录下所有的文件夹或者文件夹的File【】
 * 		对第二部的file[]进行遍历，获取每个File对象 isFile（）
 * 		判断当前对象是目录还是文件夹
 * 			如果是目录继续递归 执行2操作
 * 			如果是文件呢就判断是否是0java文件如果是就输出绝对路径
 */
import java.io.File;

public class Tet_05 {
public static void main(String[] args) {
	File file = new File("D:\\");
	
}
private static void showJava(String string) {
	// TODO Auto-generated method stub
	//
	
}
public static void showJava(File file){
	String file1 = null;
	File f = new File(file1);
	File[] fileArray = file.listFiles();
	for(File f1 : fileArray){
		if(f.isDirectory()){
			showJava(f1);
			
		}else{
			if(f.getName().endsWith(".java")){
				System.out.println(f.getName());
			}
		}
	}
}
private static void showFiles(File f) {
	// TODO Auto-generated method stub
	
}
}
