import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Practice03 extends JFrame {
	int i=0;
	public Practice03() {
		setBounds(100, 100, 300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		JComboBox comboBox = new JComboBox();
		c.add(comboBox);
		comboBox.setBounds(10,10,80,21);
		JButton btn=new JButton("按钮");
		btn.setBounds(80,70,70,30);
		String[] str= {"红","黄","蓝","绿","清","碘","紫","白","黑","红棕"};
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(i==str.length) {
					return;
				}
				comboBox.addItem(str[i++]);
//				if(i==str.length) {
//					i=0;
//				}
				
			}
		});
		c.add(btn);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Practice03();
	}

}
