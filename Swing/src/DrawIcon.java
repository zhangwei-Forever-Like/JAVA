import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.HeadlessException;

import javax.swing.*;


public class DrawIcon  implements Icon {
 private int width;
 private int height;
	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		// TODO Auto-generated method stub
    g.fillOval(x, y, width, height);
	}

	public DrawIcon(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		return this.width;
	}

	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		return this.height;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawIcon icon=new DrawIcon(15,15);
		JLabel j=new JLabel("测试",icon,SwingConstants.CENTER);
		JFrame jf=new JFrame();
		Container c=jf.getContentPane();
		jf.setBounds(100, 100, 300, 300);
		c.add(j);
		jf.setVisible(true);
	}

}
