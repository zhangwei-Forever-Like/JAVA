package day19;

import java.awt.Container;
import java.net.URL;

import javax.swing.*;

public class JFrameTest03 extends JFrame {
	public JFrameTest03() {
		   setBounds(100,100,200,200);
		   setDefaultCloseOperation(EXIT_ON_CLOSE);
		   Container c=getContentPane();
		   setVisible(true);
		   JLabel l=new JLabel("这是一个展示图片的标题");
		   URL url=JFrameTest03.class.getResource("java.png");
		   System.out.println(url);
//		   Icon icon=new ImageIcon(url);
//		   l.setIcon(icon);
//		   l.setSize(20,20);
		   c.add(l);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      new JFrameTest03();
	}

}
