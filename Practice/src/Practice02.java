import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Practice02 extends JFrame {
	public Practice02() {
		setBounds(100, 100, 300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		Container c = getContentPane();
		JLabel j1 = new JLabel("用户名：");
		c.add(j1);
		JTextField jt = new JTextField();
		jt.setColumns(20);
		c.add(jt);
		JLabel j2 = new JLabel("密码：");
		c.add(j2);
		JPasswordField jp = new JPasswordField();
		jp.setColumns(20);
		c.add(jp);
		JButton btn1 = new JButton("提交");
		JButton btn2 = new JButton("重置");
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//			System.out.println(jt.getText());
				char ch[] = jp.getPassword();
				String str = new String(ch);
				if (jt.getText().equals("mr") && str.equals("mrsoft")) {
					new MyJDialog(Practice02.this).setVisible(true);
				}
			}
		});
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
             jt.setText("");
             jp.setText("");
             jt.requestFocus();
			}
		});
		c.add(btn1);
		c.add(btn2);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Practice02();
	}

}

class MyJDialog extends JDialog {
	public MyJDialog(Practice02 frame) {
		super(frame, "窗体", true);
		Container c = getContentPane();
		c.add(new JLabel("登陆成功"));
		setLayout(new FlowLayout());
		setBounds(120, 120, 100, 100);
	}
}