package pack1;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class login extends JFrame implements ActionListener{
	JButton teacher = new JButton("��ʦ");
	JButton student = new JButton("ѧ��");
	login(){
		setSize(300,200);
		setTitle("�û�ѡ��");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout());    //���ô���Ϊ��������
		add(teacher);
		add(student);    //����ť���봰����
		validate();
		teacher.addActionListener(this);
		student.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==teacher) 
			new teacher();
		if(e.getSource()==student)
			new student();
	}
public static void main(String[] args) {
	login login= new login();
}
}