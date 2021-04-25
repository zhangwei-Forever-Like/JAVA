import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Practice01 extends JFrame {
	public Practice01() {
		setBounds(100, 100, 300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		Container c = getContentPane();
		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.addItem("红");
		comboBox.addItem("黄");
		comboBox.addItem("蓝");
		comboBox.addItem("绿");
		comboBox.setBounds(0,0,290,20);
		c.add(comboBox);
		JRadioButton j1=new JRadioButton("男");
		JRadioButton j2=new JRadioButton("女");
		c.add(j1);
		c.add(j2);
		j1.setBounds(80, 20, 50, 50);
		j2.setBounds(140, 20, 50, 50);
		ButtonGroup group=new ButtonGroup();
		group.add(j1);
		group.add(j2);
		JButton btn1=new JButton("确定");
		JButton btn2=new JButton("取消");
		c.add(btn1);
		c.add(btn2);
		btn1.setBounds(40,100, 70, 30);
		btn2.setBounds(150, 100, 70, 30);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Practice01();
	}

}
