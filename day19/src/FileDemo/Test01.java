package FileDemo;

import java.io.File;
import java.io.FilenameFilter;

public class Test01 {
	public static void main(String[] args) {
		File file = new File("D:\\2");
		String[] strArr = file.list(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				//
				File fi = new File(dir, name);
				boolean flag1 = fi.isFile();
				boolean flag2 = fi.getName().endsWith(".txt");

				return flag1 && flag2;
			}
		});
		for (String s : strArr) {
			System.out.println(s);
		}

	}
}
