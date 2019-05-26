package cn.itcast05;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


 class ScoreSort {
	/*
	 * 2�� �����ѧ����ÿ��ѧ����3�ſΣ����ġ���ѧ��Ӣ��ĳɼ���
	 * дһ��������մӼ�������ѧ������Ϣ�������ʽΪ��name,30,30,30�����������ſγɼ�
	 * ����Ȼ��������ѧ����Ϣ���ִܷӸߵ��͵�˳��д�뵽һ������
	 * "stu.txt"�ļ��С�Ҫ��stu.txt�ļ��ĸ�ʽҪ�Ƚ�ֱ�ۣ�������ļ����Ϳ��Ժ�����Ŀ���ѧ������Ϣ��
	 */
	public static void main(String[] args) throws IOException {

		TreeMap<Student, Integer> tm = new TreeMap<Student, Integer>(
				new Comparator<Student>() {
					@Override
					public int compare(Student s1, Student s2) {
						return (s2.getChn() + s2.getMath() + s2.getEng())
								- (s1.getChn() + s1.getMath() + s1.getEng());
					}
				});

		FileWriter fw = new FileWriter("stu.txt");
		fw.write("����" + "\t" + "����" + "\t" + "��ѧ" + "\t" + "Ӣ��" + "\t" + "�ܷ�"
				+ "\r\n");
		fw.flush();
		Scanner sc = new Scanner(System.in);
		System.out.println("������ѧ����Ϣ,��ʽΪ: ����,����,��ѧ,Ӣ��");
		for (int i = 1; i < 6; i++) {
			System.out.println("������¼���" + i + "��ѧ������Ϣ...");
			String str = sc.nextLine();
			String[] arr = str.split(",");
			String name = arr[0];
			int chn = Integer.parseInt(arr[1]);
			int math = Integer.parseInt(arr[2]);
			int eng = Integer.parseInt(arr[3]);
			Integer score = chn + math + eng;
			Student s = new Student(name, chn, math, eng);
			tm.put(s, score);
		}
		Set<Student> keySet = tm.keySet();
		Iterator<Student> it = keySet.iterator();
		while (it.hasNext()) {
			Student stu = it.next();
			/*
			 * System.out.println(stu.getName() + "\t" + stu.getChn() + "\t" +
			 * stu.getMath() + "\t" + stu.getEng() + "\t" + tm.get(stu));
			 */

			fw.write(stu.getName() + "\t" + stu.getChn() + "\t" + stu.getMath()
					+ "\t" + stu.getEng() + "\t" + tm.get(stu) + "\r\n");
			fw.flush();
		}
		fw.close();

	}
}

class Student {
	private String name;
	private int chn;
	private int math;
	private int eng;

	public Student(String name, int chn, int math, int eng) {
		super();
		this.name = name;
		this.chn = chn;
		this.math = math;
		this.eng = eng;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getChn() {
		return chn;
	}

	public void setChn(int chn) {
		this.chn = chn;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

}
