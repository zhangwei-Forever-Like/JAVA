package day19;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JFramPractice01 extends JFrame {
	public JFramPractice01() {
		setBounds(100, 100, 300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
//		c.setLayout(null);
//		JButton b1=new JButton("按钮");
//		b1.setBounds(10, 10, 50, 50);
//	    c.add(b1);
		
		c.setLayout(new FlowLayout());
		JCheckBox c1=new JCheckBox("1");
		JCheckBox c2=new JCheckBox("2");
		JCheckBox c3=new JCheckBox("3");
		
		c.add(c1);
		c.add(c2);
		c.add(c3);
		c1.setSelected(true);
		
		JButton btn =new JButton("打印");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println(c1.getText()+"复选框中状态"+c1.isSelected());
				System.out.println(c2.getText()+"复选框中状态"+c2.isSelected());
				System.out.println(c3.getText()+"复选框中状态"+c3.isSelected());
			}
		});
		c.add(btn);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JFramPractice01();
	}

}
