package cn.io_demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * ����һ��ѧ���࣬��������һ�³�Ա���������������ĳɼ�����ѧ�ɼ���Ӣ��ɼ���
 * ��Ӽ���¼��5��ѧ����Ϣ��Ȼ�����Լ�����ĸ�ʽ�洢���ı��ļ��С�
 * Ҫ�󱻴洢��ѧ�����շ����Ӹߵ�������
 * 
 * ������
 * 		A:дһ��ѧ���࣬��4����Ա������
 * 		B:��Scannerʵ�ּ���¼�롣
 * 		C:������ѧ�����д洢���ü��ϡ�
 * 			��ô�����ĸ�������?
 * 			����������Ҫ�������ԣ�����ѡ��TreeSet���ϡ�
 * 		D:�������ϣ���ȡ�������е�ÿһ�����ݣ��������д���ı��ļ���
 * 			name	chinese		math	english
 */
public class StudentTest {
	public static void main(String[] args) throws IOException {
		System.out.println("ѧ����Ϣ¼�뿪ʼ");
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				//��Ҫ����
				int num =o2.getSum() - o1.getSum();
				int num2 = (num ==0)? o1.getChinese()- o2.getChinese():num;
				int num3 = (num2==0)? o1.getMath() - o2.getMath() : num2;
				int num4 = (num3==0)? o1.getName().compareTo(o2.getName()):num3;
				return num4;
			}

		});
		for (int i = 0; i < 5; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("������" + (i + 1) + "��ѧ��������:");
			String name = sc.nextLine();
			System.out.println("�������" + (i + 1) + "��ѧ�������ĳɼ�:");
			int chinese = sc.nextInt();
			System.out.println("�������" + (i + 1) + "��ѧ������ѧ�ɼ�:");
			int math = sc.nextInt();
			System.out.println("�������" + (i + 1) + "��ѧ����Ӣ��ɼ�:");
			int english = sc.nextInt();
			// �����ݷ�װ��ѧ��������
			Student s = new Student();
			s.setName(name);
			s.setChinese(chinese);
			s.setMath(math);
			s.setEnglish(english);

			ts.add(s);

		}
		// ��������,��ȡ�����е�ÿһ������,�������д���ı��ļ�.
		BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt"));
		bw.write("����\t����\t��ѧ\tӢ��");
		bw.newLine();
		bw.flush();
		for (Student s : ts) {
			StringBuilder sb = new StringBuilder();
			sb.append(s.getName()).append("\t").append(s.getChinese())
					.append("\t").append(s.getMath()).append("\t")
					.append(s.getEnglish());
			bw.write(sb.toString());
			bw.newLine();
			bw.flush();
		}
		bw.close();
		System.out.println("ѧ����Ϣ¼��ɹ�");
	}
}


















