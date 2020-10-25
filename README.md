# Java
Java实验二
一、实验目的
初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
掌握面向对象的类设计方法（属性、方法）；
掌握类的继承用法，通过构造方法实例化对象；
学会使用super()，用于实例化子类；
掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。

二、实验要求
1.编写上述实体类以及测试主类（注意类之间继承关系的适用）。
2.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）；模拟学生退课操作，再打印课程信息。
3.编写实验报告。

三、实验过程
1、编写思路
    先确定需要实现哪些功能，然后再根据框架写出程序。先确定需要哪些包（swing\awt\IO），将包导入，导入后先构建整体的GUI的所有界面，将界面通过监听事件相连接。
    然后在需要文本写入与文本读出的地方的界面写上文本操作。而打印课表则是通过将文件打开，显示出学生基本信息、所选课程来实现的。
2、核心代码
GUI界面框架事例：
public class register extends JFrame implements ActionListener{
	JLabel id = new JLabel("请输入学号：");
	JLabel name = new JLabel("请输入姓名：");
	JLabel password = new JLabel("请输入密码：");
	JTextField jtf1 = new JTextField(15); 
	JTextField jtf2 = new JTextField(15); 
	JTextField jtf3 = new JTextField(15); 
	JButton r = new JButton("注册");
	
	register(){
		setTitle("注册");
		setSize(300,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout());
		
		add(id);add(jtf1);
		add(name);add(jtf2);
		add(password);add(jtf3);
		add(r);
		r.addActionListener(this);
	}
  
录入学生信息：
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class student extends JFrame implements ActionListener{
	JButton login1 = new JButton("登录");
	JButton login2 = new JButton("注册");
	JLabel id = new JLabel("学号：");
	JLabel password = new JLabel("密码：");
	JTextField jtf1 = new JTextField(15); 
	JTextField jtf2 = new JTextField(15); 
	
	student(){
		setTitle("学生");
		setSize(250,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout());
		add(id);add(jtf1);
		add(password);add(jtf2);
		add(login1);add(login2);
		validate();
		login1.addActionListener(this);;
		login2.addActionListener(this);
	}
  
录入课表：
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;

public class choosing extends JFrame implements  ActionListener{
	JLabel a = new JLabel("请选择课程：");
	JButton r = new JButton("确定");
	JCheckBox jc1 = new JCheckBox("老师名称：张三    老师编号： 1  所授课程：高数   学分：6 地点：教101   时间：10:00am-11:00am");
	JCheckBox jc2 = new JCheckBox("老师名称：李四    老师编号： 2  所授课程：英语   学分：5 地点：教102   时间：11:00pm-12:00pm");
	JCheckBox jc3 = new JCheckBox("老师名称：王五    老师编号： 3  所授课程：物理   学分：4 地点：教103   时间：13:00pm-14:00pm");
	
	choosing(){
		setTitle("选课");
		setSize(600,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout());
		
		add(a);
		add(jc1);
		add(jc2);
		add(jc3);
		add(r);
		jc1.addActionListener(this);
		jc2.addActionListener(this);
		jc3.addActionListener(this);
		r.addActionListener(this);
	}
  
打开文件：
public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Choosing) {
			new choosing();
		}
		if(e.getSource()==Printing) {
			try {
				Runtime.getRuntime().exec("C:\\Users\\Thinkpad\\Desktop\\学生选课.txt");
				} catch (Exception e1) {
					System.out.println("txt打开失败！");
					e1.printStackTrace();
				}
				} 

四、实验结果
老师名称：张三    老师编号： 1  所授课程：高数   学分：6 地点：教101   时间：10:00am-11:00am
老师名称：李四    老师编号： 2  所授课程：英语   学分：5 地点：教102   时间：11:00pm-12:00pm
老师名称：王五    老师编号： 3  所授课程：物理   学分：4 地点：教103   时间：13:00pm-14:00pm

五、实验感想
    这次实验很锻炼我的综合考虑能力，像文件输入时如何保证是在末尾添加而不是刷新界面、如何将输在文本框的内容添加到txt文件中等，这些十分考验我在文件
 处理时所需要的编程能力。通过这次实验，我想了很多，比如如何高效的处理代码，在实现功能的情况下将代码简化等。这些对我日后的编程能力的提升是十分有帮助的。
 但是我也看到我的不足，例如文件处理过差，导致退课功能无法实现、所用的代码重复性太高，代码多样性差，容易溢出，还有我本身的掌握的算法少，编程能力不足
 也在这次实验中体现出来。总之，收获丰富，意识到不足，更能进步。
