package day19;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;

public class JFrameTest05 extends JFrame{
	public JFrameTest05() {
		   setBounds(100,100,300,300);
		   setDefaultCloseOperation(EXIT_ON_CLOSE);
		   Container c=getContentPane();
		   setVisible(true);
		   c.setLayout(new FlowLayout());
		   for (int i = 0; i < 10; i++) {
			c.add(new JButton("按钮"+i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   new JFrameTest05();
	}

}
