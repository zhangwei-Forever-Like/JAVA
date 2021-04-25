import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelTest extends JFrame {
	public JPanelTest() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(2, 2, 10, 10));
		JPanel p1 = new JPanel(new GridLayout(1, 3, 10, 10));
		JPanel p2 = new JPanel(new GridLayout(1, 2, 10, 10));
		JPanel p3 = new JPanel(new GridLayout(1, 2, 10, 10));
		JPanel p4 = new JPanel(new GridLayout(2, 1, 10, 10));
		p1.add(new JButton("1"));
		
		p1.add(new JButton("2"));
		p1.add(new JButton("3"));
		p1.add(new JButton("4"));
		p2.add(new JButton("5"));
		p2.add(new JButton("6"));
		p3.add(new JButton("7"));
		p3.add(new JButton("8"));
		p4.add(new JButton("9"));
		p4.add(new JButton("10"));
		c.add(p1);
		c.add(p2);
		c.add(p3);
		c.add(p4);
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JPanelTest();
	}

}
