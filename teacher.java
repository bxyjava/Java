package pack1;

import java.awt.FlowLayout;

import javax.swing.*;

public class teacher extends JFrame {
	JLabel j1 = new JLabel("ѡ��ѧ����");
	JLabel  name = new JLabel("��ʦ���ƣ�����");
	JLabel  ID = new JLabel("��ʦ��ţ� 1");
	JLabel  course = new JLabel("���ڿγ̣����� "+"ѧ�֣�6"+
	                            "�ص㣺101"+"ʱ�䣺10:00am-11:00am");
	JTextField jtf1 = new JTextField("С��",15);
	teacher(){
		setSize(400,200);
		setTitle("��ʦ");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout(5));    
		add(name);     //����ǩ���봰����
		System.out.print("\n");
		add(ID);  
		add(course);
		add(j1);
		add(jtf1);
		validate();
	}
	
	public static void main(String[] args) {
		new teacher();
	}
	
}