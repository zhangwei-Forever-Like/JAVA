import java.awt.Container;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBoxTest extends JFrame {
	public JComboBoxTest() {
		setBounds(100, 100, 190, 120);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.addItem("身份证");
		comboBox.addItem("学生证");
		comboBox.addItem("工作证");
		c.add(comboBox);
		comboBox.setBounds(10, 10, 80, 21);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JComboBoxTest();
	}

}
