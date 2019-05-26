package day20_test;

import java.io.File;

public class Test_04 {
	public static void main(String[] args) {
		listJava("D:\\比向东的视频资料");
	}

	public static void listJava(String path) {
		File file = new File(path);
		File[] files = file.listFiles();
		for (File f : files) {
			if (f.isFile() && f.getName().endsWith(".java")) {
				System.out.println(f);
			} else if (f.isDirectory())
				listJava(f.getAbsolutePath());
		}

	}

}
