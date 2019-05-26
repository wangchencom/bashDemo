package cn.io_demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * 我有一个学生类，这个类包含一下成员变量：姓名，语文成绩，数学成绩，英语成绩。
 * 请从键盘录入5个学生信息，然后按照自己定义的格式存储到文本文件中。
 * 要求被存储的学生按照分数从高到低排序。
 * 
 * 分析：
 * 		A:写一个学生类，有4个成员变量。
 * 		B:用Scanner实现键盘录入。
 * 		C:把这多个学生进行存储。用集合。
 * 			那么，用哪个集合呢?
 * 			由于最终需要排序，所以，我们选择TreeSet集合。
 * 		D:遍历集合，获取到集合中的每一个数据，用输出流写到文本文件。
 * 			name	chinese		math	english
 */
public class StudentTest {
	public static void main(String[] args) throws IOException {
		System.out.println("学生信息录入开始");
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				//主要条件
				int num =o2.getSum() - o1.getSum();
				int num2 = (num ==0)? o1.getChinese()- o2.getChinese():num;
				int num3 = (num2==0)? o1.getMath() - o2.getMath() : num2;
				int num4 = (num3==0)? o1.getName().compareTo(o2.getName()):num3;
				return num4;
			}

		});
		for (int i = 0; i < 5; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入" + (i + 1) + "个学生的姓名:");
			String name = sc.nextLine();
			System.out.println("请输入第" + (i + 1) + "个学生的语文成绩:");
			int chinese = sc.nextInt();
			System.out.println("请输入第" + (i + 1) + "个学生的数学成绩:");
			int math = sc.nextInt();
			System.out.println("请输入第" + (i + 1) + "个学生的英语成绩:");
			int english = sc.nextInt();
			// 把数据封装到学生对象中
			Student s = new Student();
			s.setName(name);
			s.setChinese(chinese);
			s.setMath(math);
			s.setEnglish(english);

			ts.add(s);

		}
		// 遍历集合,获取到其中的每一个数据,用输出流写到文本文件.
		BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt"));
		bw.write("姓名\t语文\t数学\t英语");
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
		System.out.println("学生信息录入成功");
	}
}


















