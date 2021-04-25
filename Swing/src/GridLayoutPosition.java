import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutPosition extends JFrame{
public GridLayoutPosition() {
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	Container c=getContentPane();
	setLayout(new GridLayout(7,3,5,5));
	for (int i = 0; i < 21; i++) {
		c.add(new JButton("按钮"+i));
	}
	setSize(300,300);
	setVisible(true);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new GridLayoutPosition();
	}

}
