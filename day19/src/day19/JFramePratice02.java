package day19;

import java.awt.Container;

import javax.swing.*;

public class JFramePratice02 extends JFrame{
public JFramePratice02() {
	setBounds(100,100,300,300);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	Container c=getContentPane();
	c.setLayout(null);
  String[] temp= {"元素1","元素2","元素3","元素4","元素5","元素6","元素7","元素8"};
  DefaultListModel<String> model=new DefaultListModel<String>();
  for (int i = 0; i < temp.length; i++) {
	model.addElement(temp[i]);
}
	JList<String> j1=new JList<>();
	j1.setModel(model);
	JScrollPane js=new JScrollPane(j1);
	js.setBounds(10, 10, 100, 100);
	c.add(js);
	setVisible(true);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    new JFramePratice02();
	}

}
