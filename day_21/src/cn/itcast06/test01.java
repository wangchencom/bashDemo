



package cn.itcast06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;




class test01
{
	public static void main(String[] args) throws IOException {
		//复制文件，把一个文件家D：\\javaFile 下，所有的后缀名为。java的文件
		//复制到目录D：\\jad下，并将后缀名从。java改为。jad
		//先复制，后改名。
		//1，获得该目录下所有的。java文件
		File scrfile=new File("D:\\javaFile");
		File[] arrfile=scrfile.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return new File(dir,name).isFile()&&name.endsWith(".java");
			}
		});//拿到了自己想要复制的东西。
		//封装目的地文件
		File destFile=new File("D：\\File");
		//看一下有没有D:\\jad这个目录，若是没有就创建一个。
		if (!destFile.exists()) {
			destFile.mkdir();
			
		}
		//遍历数据源符合条件的文件数组。
				for (File file : arrfile) {
					
					String name=file.getName();//拿到当前文件的名字（源文件中的文件）。
					String newName=name.replace(".java", ".jad");//将。java文件改为。jad文件。
					File newFile=new File(destFile,newName);//根据目的地文件和文件的新名称，创建file对象。
					BufferedReader br=new BufferedReader(new FileReader(file));//每次遍历到数据源中的文件
					BufferedWriter bw=new BufferedWriter(new FileWriter(newFile));//对应目的地中文件
					//复制文件
					String line=null;
					while((line=br.readLine())!=null){
						bw.write(line);
						bw.newLine();
						bw.flush();
						
					}
					//释放资源
					bw.close();
					br.close();
				}
				System.out.println("操作完成");
		
	}

} 