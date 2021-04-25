package day19;

import java.awt.Color;
import java.awt.Container;

import javax.swing.*;

public class JFrameTest02 extends JFrame{
   public JFrameTest02() {
	   setBounds(100,100,200,200);
	   setDefaultCloseOperation(EXIT_ON_CLOSE);
	   Container c=getContentPane();
	   setVisible(true);
	   
	   JLabel l=new JLabel("这是一个标题");
	   c.add(l);
//	   l.setText("更改标签内容");
//	   System.out.println(l.getText());
	   l.setForeground(Color.red);
	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      new JFrameTest02();
	}

}
