import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;

public class FlowLayoutPosition extends JFrame {
	public FlowLayoutPosition() {
		setTitle("本窗体使用流布局管理器");
		Container c = getContentPane();
		setLayout(new FlowLayout(1, 10, 10));
		for (int i = 0; i < 10; i++) {
			c.add(new JButton("按钮" + i));
		}
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlowLayoutPosition();
	}

}
