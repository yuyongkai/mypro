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

/*请编写程序，完成键盘录入学生信息，并计算总分将学生信息与总分一同写入文本文件 
需求：键盘录入3个学生信息(姓名,语文成绩,数学成绩) 
  求出每个学生的总分 
,并且将学生的信息写入Student.txt文件中 
     要求文件中的效果下所示 
  
姓名   语文成绩  数学成绩  总分 
李四    99         88      177 
张三    20         90      112 
王五    100       100      200   
  
提示 可以写一个学生类Student里面有四个属性 这样操作起来比较方便 
分析  : 键盘录入 Scanner对象 
        Student 类 姓名,语文成绩,数学成绩,总分 
        写文件  输出流 字符输出流 高效字符输出流*/
public class Test01 {
	public static void main(String[] args) throws IOException {
		Student stu1 = BulidStudent();
		Student stu2 = BulidStudent();
		Student stu3 = BulidStudent();
//		设置输出
		
//		建立文档
		File file = new File("Student.txt");
		file.createNewFile();
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(""));
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		oos.writeObject('\n');
		oos.writeObject("姓名"+'\t'+"语文成绩"+'\t'+"数学成绩"+'\t'+"总分");
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
		System.out.println("输入姓名");
		System.out.println("输入语文");
		System.out.println("输入数学");
		Student stu = new Student(sc.next(),sc.nextInt(),sc.nextInt());
		stu.getSum();
		return stu;
	}

}
