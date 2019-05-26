package cn.itcast05;

/***
 * 先改名在复制
 * 					
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;

public class Test06 {
	public static void main(String[] args) throws IOException {
		// 封装数据源文件夹
		File scrFile = new File("src");
		// 拿到数据源文件中所有后缀名为.java的文件
		File[] arrFile = scrFile.listFiles(new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return new File(dir, name).isFile() && name.endsWith(".java");
			}
		});
		File destFile = new File("007.txt");//创建目的地文件夹
		//如果没有该文件夹，就创建
		if(!destFile.exists()){
			destFile.mkdir();
		}
		for(File file : arrFile){
			String name = file.getName();
			String newName = name.replace(".java", ".jad");
			File newFile = new File (destFile,newName);
			BufferedReader br = new BufferedReader(new FileReader(file));
			BufferedWriter bw = new BufferedWriter(new FileWriter(newFile));
			
			String line = null;
			while((line=br.readLine())!=null){
				bw.write(line);
				bw.newLine();
				bw.flush();
			}
			br.close();
			bw.close();
			System.out.println("复制成功");
			
		}
		

	}
}
