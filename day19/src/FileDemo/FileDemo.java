package FileDemo;

import java.io.File;
import java.io.FilenameFilter;

public class FileDemo {
	private static final String String = null;

	public static void main(String[] args) {
		File f = new File("d:\\");
		// 是否可读取
		System.out.println("f.canRead():" + f.canRead());
		// 是否存在
		System.out.println("exists():" + f.exists());
		// 是否是一个标准文件
		System.out.println("isFile(): " + f.isFile());
		// 是否是绝对路径
		System.out.println("isAbsolute(): " + f.isAbsolute());
		// 是否是隐藏文件
		System.out.println("isHidden() :" + f.isHidden());
		System.out.println("***************************************************");
		// 列出可用的文件系统根目录
		File[] f1 = f.listFiles();
		for (File f2 : f1) {
			
			// System.out.println(f2.getName());
			
		}
		System.out.println("***************************************************");

		String [] q = f.list();
	//	for (File f2 : f1) {
			
			// System.out.println(f2.getName());
			 
			
		}
		
		// File[] a = f.listFiles();
		// System.out.println(a);
		// String[] s = f.list();
		// System.out.println(s);
		//直接获取到符合条件的数组,遍历输出
	// File file = new File("d:\\");
	// f.list(FilenameFilter(){
	// public boolean accept((file dir, String name) {
	// File fi = new File(dir,name);
	// boolean flag1 = fi.isFile();
	// boolean flage2 = fi.getName().endsWith(".mp3");
	// return
	// }
	// });
	// }

	private static FilenameFilter FilenameFilter() {
		return null;
	}
}
