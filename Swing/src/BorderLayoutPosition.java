import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutPosition extends JFrame{
public BorderLayoutPosition() {
	setTitle("边界布局");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	Container c=getContentPane();
	setLayout(new BorderLayout());
	JButton b1=new JButton("中"),
			b2=new JButton("东"),
			b3=new JButton("南"),
			b4=new JButton("西"),
			b5=new JButton("北");
	c.add(BorderLayout.CENTER,b1);
	c.add(BorderLayout.EAST,b2);
	c.add(BorderLayout.SOUTH,b3);
	c.add(BorderLayout.WEST,b4);
	c.add(BorderLayout.NORTH,b5);
	setSize(350,200);
	setVisible(true);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   new BorderLayoutPosition();
	}

}
