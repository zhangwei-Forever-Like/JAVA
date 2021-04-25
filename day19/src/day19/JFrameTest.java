package day19;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame j = new JFrame("窗体");
		j.setVisible(true);
		j.setSize(300,200);
		j.setLocation(200,200);
		Container c=j.getContentPane();
		c.setBackground(Color.white);
		JLabel l=new JLabel("这是一个窗体");
		c.add(l);
		c.remove(l);
//		j.setResizable(false);
	}

}
