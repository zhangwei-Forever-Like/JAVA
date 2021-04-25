package day19;

import java.awt.Container;

import javax.swing.*;


public class JFrameTest04 extends JFrame{
	public JFrameTest04() {
		   setBounds(100,100,200,200);
		   setDefaultCloseOperation(EXIT_ON_CLOSE);
		   Container c=getContentPane();
		   setVisible(true);
		   c.setLayout(null);
		   JButton b1=new JButton("按钮1"), b2=new JButton("按钮2");
		   b1.setBounds(10, 30, 80, 30);
		   b2.setBounds(60, 70, 100, 20);
		   c.add(b1);
		   c.add(b2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new JFrameTest04();
	}

}
