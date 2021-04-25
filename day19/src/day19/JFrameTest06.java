package day19;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;

public class JFrameTest06 extends JFrame {
	public JFrameTest06() {
		setBounds(100, 100, 300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		setVisible(true);
		c.setLayout(new BorderLayout());
		JButton b1 = new JButton("中"), 
				b2 = new JButton("东"), 
				b3 = new JButton("南"), 
				b4 = new JButton("西"),
				b5 = new JButton("北");
		c.add(b1, BorderLayout.CENTER);
		c.add(b2, BorderLayout.EAST);
		c.add(b3, BorderLayout.WEST);
		c.add(b4, BorderLayout.SOUTH);
		c.add(b5, BorderLayout.NORTH);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JFrameTest06();
	}

}
