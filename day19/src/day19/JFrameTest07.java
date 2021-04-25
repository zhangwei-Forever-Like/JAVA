package day19;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class JFrameTest07 extends JFrame{
	public JFrameTest07() {
		setBounds(100, 100, 300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		setVisible(true);
		c.setLayout(new GridLayout(7,3,5,5));
		for (int i = 0; i < 20; i++) {
			c.add(new JButton("按钮"+i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   new JFrameTest07();
	}

}
