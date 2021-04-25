import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame extends JFrame {
	public MyFrame() {
		setBounds(100,100,300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		setLayout(null);
		JLabel j1 = new JLabel("这是一个窗体");
		add(j1);
		setVisible(true);
		JButton btn = new JButton("按钮");
		btn.setBounds(10, 10, 100, 21);
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new MyJDialog(MyFrame.this).setVisible(true);
			}
		});
		c.add(btn);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}

}

class MyJDialog extends JDialog {
	public MyJDialog(MyFrame frame) {
		super(frame, "第一个JDialog窗体", true);
		Container c = getContentPane();
		JLabel j1 = new JLabel("这是一个新的窗体");
		c.add(j1);
		setBounds(120, 120, 100, 100);
	}
}