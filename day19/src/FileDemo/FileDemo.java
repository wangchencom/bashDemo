package FileDemo;

import java.io.File;
import java.io.FilenameFilter;

public class FileDemo {
	private static final String String = null;

	public static void main(String[] args) {
		File f = new File("d:\\");
		// �Ƿ�ɶ�ȡ
		System.out.println("f.canRead():" + f.canRead());
		// �Ƿ����
		System.out.println("exists():" + f.exists());
		// �Ƿ���һ����׼�ļ�
		System.out.println("isFile(): " + f.isFile());
		// �Ƿ��Ǿ���·��
		System.out.println("isAbsolute(): " + f.isAbsolute());
		// �Ƿ��������ļ�
		System.out.println("isHidden() :" + f.isHidden());
		System.out.println("***************************************************");
		// �г����õ��ļ�ϵͳ��Ŀ¼
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
		//ֱ�ӻ�ȡ����������������,�������
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
