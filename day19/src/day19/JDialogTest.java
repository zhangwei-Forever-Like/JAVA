package day19;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JDialogTest extends JDialog {
	public JDialogTest(JFrame frame) {
		super(frame,"对话框标题",true);
		Container c= getContentPane();
		c.add(new JLabel("这是一个对话框"));
		
		
		setBounds(100,100,100,100);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
    JFrame f= new JFrame("父窗体");
    f.setBounds(50,50,300,300);
    Container c=f.getContentPane();
    JButton btn=new JButton("弹出对话框");
    c.setLayout(new FlowLayout());
    c.add(btn);
    f.setVisible(true);
    f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    btn.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JDialogTest d=new JDialogTest(f);
			d.setVisible(true);
		}
	});
	}

}
