



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
		//�����ļ�����һ���ļ���D��\\javaFile �£����еĺ�׺��Ϊ��java���ļ�
		//���Ƶ�Ŀ¼D��\\jad�£�������׺���ӡ�java��Ϊ��jad
		//�ȸ��ƣ��������
		//1����ø�Ŀ¼�����еġ�java�ļ�
		File scrfile=new File("D:\\javaFile");
		File[] arrfile=scrfile.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return new File(dir,name).isFile()&&name.endsWith(".java");
			}
		});//�õ����Լ���Ҫ���ƵĶ�����
		//��װĿ�ĵ��ļ�
		File destFile=new File("D��\\File");
		//��һ����û��D:\\jad���Ŀ¼������û�оʹ���һ����
		if (!destFile.exists()) {
			destFile.mkdir();
			
		}
		//��������Դ�����������ļ����顣
				for (File file : arrfile) {
					
					String name=file.getName();//�õ���ǰ�ļ������֣�Դ�ļ��е��ļ�����
					String newName=name.replace(".java", ".jad");//����java�ļ���Ϊ��jad�ļ���
					File newFile=new File(destFile,newName);//����Ŀ�ĵ��ļ����ļ��������ƣ�����file����
					BufferedReader br=new BufferedReader(new FileReader(file));//ÿ�α���������Դ�е��ļ�
					BufferedWriter bw=new BufferedWriter(new FileWriter(newFile));//��ӦĿ�ĵ����ļ�
					//�����ļ�
					String line=null;
					while((line=br.readLine())!=null){
						bw.write(line);
						bw.newLine();
						bw.flush();
						
					}
					//�ͷ���Դ
					bw.close();
					br.close();
				}
				System.out.println("�������");
		
	}

} 