package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/*���д������ɼ���¼��ѧ����Ϣ���������ֽܷ�ѧ����Ϣ���ܷ�һͬд���ı��ļ� 
���󣺼���¼��3��ѧ����Ϣ(����,���ĳɼ�,��ѧ�ɼ�) 
  ���ÿ��ѧ�����ܷ� 
,���ҽ�ѧ������Ϣд��Student.txt�ļ��� 
     Ҫ���ļ��е�Ч������ʾ 
  
����   ���ĳɼ�  ��ѧ�ɼ�  �ܷ� 
����    99         88      177 
����    20         90      112 
����    100       100      200   
  
��ʾ ����дһ��ѧ����Student�������ĸ����� �������������ȽϷ��� 
����  : ����¼�� Scanner���� 
        Student �� ����,���ĳɼ�,��ѧ�ɼ�,�ܷ� 
        д�ļ�  ����� �ַ������ ��Ч�ַ������*/
public class Test01 {
	public static void main(String[] args) throws IOException {
		Student stu1 = BulidStudent();
		Student stu2 = BulidStudent();
		Student stu3 = BulidStudent();
//		�������
		
//		�����ĵ�
		File file = new File("Student.txt");
		file.createNewFile();
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(""));
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		oos.writeObject('\n');
		oos.writeObject("����"+'\t'+"���ĳɼ�"+'\t'+"��ѧ�ɼ�"+'\t'+"�ܷ�");
		oos.writeObject('\n');
		oos.writeObject(stu1.getName()+'\t'+stu1.getYuwen()+'\t'+stu1.getShuxue()+'\t'+stu1.getSum());
		oos.writeObject('\n');
		oos.writeObject(stu2.getName()+'\t'+stu2.getYuwen()+'\t'+stu2.getShuxue()+'\t'+stu2.getSum());
		oos.writeObject('\n');
		oos.writeObject(stu3.getName()+'\t'+stu3.getYuwen()+'\t'+stu3.getShuxue()+'\t'+stu3.getSum());
		oos.close();
	}

	public static Student BulidStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������");
		System.out.println("��������");
		System.out.println("������ѧ");
		Student stu = new Student(sc.next(),sc.nextInt(),sc.nextInt());
		stu.getSum();
		return stu;
	}

}
