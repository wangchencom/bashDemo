package day20_test;
/**
 * �ڿ���̨���ָ��Ŀ¼�µ�����.java�ļ�
 * ˼·��
 * 		��װָ��Ŀ¼
 * 		��ȡ����Ŀ¼�����е��ļ��л����ļ��е�File����
 * 		�Եڶ�����file[]���б�������ȡÿ��File���� isFile����
 * 		�жϵ�ǰ������Ŀ¼�����ļ���
 * 			�����Ŀ¼�����ݹ� ִ��2����
 * 			������ļ��ؾ��ж��Ƿ���0java�ļ�����Ǿ��������·��
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
