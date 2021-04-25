import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator extends JFrame {
	String firstInput = "";
	String secondInput = "";
	String first = "";
	String second = "";
	String charInput = "";
	String ansOuput = "";
	String result = "";
	boolean isSecond;

	public Calculator() {
		setTitle("计算器");
		setBounds(100, 100, 230, 230);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		JPanel viewPanel = new JPanel();
		c.add(viewPanel, BorderLayout.NORTH);
		JButton btn2=new JButton("清除");
		JTextField textField = new JTextField();
		textField.setColumns(14);
		viewPanel.add(textField);
		
		JPanel btn = new JPanel();
		GridLayout gridLayout = new GridLayout(4, 0);
		gridLayout.setVgap(10);
		gridLayout.setHgap(10);
		btn.setLayout(gridLayout);
		c.add(btn, BorderLayout.CENTER);
		String[][] names = { { "7", "8", "9", "/" }, { "4", "5", "6", "*" }, { "1", "2", "3", "-" },
				{ ".", "0", "=", "+" } };
		JButton[][] btns = new JButton[4][4];
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				secondInput="";
				textField.setText(secondInput);
			}
		});
		viewPanel.add(btn2);
		for (int i = 0; i < btns.length; i++) {
			for (int j = 0; j < btns.length; j++) {
				btns[i][j] = new JButton(names[i][j]);
			}
		}
		if (!isSecond) {
			btns[0][0].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					firstInput = names[0][0];
					secondInput = secondInput + firstInput;
					textField.setText(secondInput);
				}
			});
		}
		if (!isSecond) {
			btns[0][1].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					firstInput = names[0][1];
					secondInput = secondInput + firstInput;
					textField.setText(secondInput);
				}
			});
		}
		if (!isSecond) {
			btns[0][2].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					firstInput = names[0][2];
					secondInput = secondInput + firstInput;
					textField.setText(secondInput);
				}
			});
		}
		if (!isSecond) {
			btns[1][0].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					firstInput = names[1][0];
					secondInput = secondInput + firstInput;
					textField.setText(secondInput);
				}
			});
		}
		if (!isSecond) {
			btns[1][1].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					firstInput = names[1][1];
					secondInput = secondInput + firstInput;
					textField.setText(secondInput);
				}
			});
		}
		if (!isSecond) {
			btns[1][2].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					firstInput = names[1][2];
					secondInput = secondInput + firstInput;
					textField.setText(secondInput);
				}
			});
		}
		if (!isSecond) {
			btns[2][0].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					firstInput = names[2][0];
					secondInput = secondInput + firstInput;
					textField.setText(secondInput);
				}
			});
		}
		if (!isSecond) {
			btns[2][1].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					firstInput = names[2][1];
					secondInput = secondInput + firstInput;
					textField.setText(secondInput);
				}
			});
		}
		if (!isSecond) {
			btns[2][2].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					firstInput = names[2][2];
					secondInput = secondInput + firstInput;
					textField.setText(secondInput);
				}
			});
		}
		if (!isSecond) {
			btns[3][1].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					firstInput = names[3][1];
					secondInput = secondInput + firstInput;
					textField.setText(secondInput);
				}
			});
		}
		btns[3][2].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (charInput.equals("1")) {
					double before = Double.parseDouble(first);
					double after = Double.parseDouble(secondInput);
					secondInput="";
					secondInput = secondInput + (before / after);
					textField.setText(secondInput);
					secondInput = "";
				}
				if(charInput.equals("2")) {
					double before = Double.parseDouble(first);
					double after = Double.parseDouble(secondInput);
					secondInput="";
					secondInput = secondInput + (before * after);
					textField.setText(secondInput);
					secondInput = "";
				}
				if(charInput.equals("3")) {
					double before = Double.parseDouble(first);
					double after = Double.parseDouble(secondInput);
					secondInput="";
					secondInput = secondInput + (before - after);
					textField.setText(secondInput);
					secondInput = "";
				}
				if(charInput.equals("4")) {
					double before = Double.parseDouble(first);
					double after = Double.parseDouble(secondInput);
					secondInput="";
					secondInput = secondInput+ (before + after);
					textField.setText(secondInput);
					secondInput = "";
				}
			}
		});
		if (!isSecond) {
			btns[0][3].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
//			isSecond=true;
					first = secondInput;
					charInput = "1";
					secondInput = "";
					textField.setText(secondInput);
				}
			});
		}
		btns[1][3].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//		isSecond=true;
				first = secondInput;
				charInput = "2";
				secondInput = "";
				textField.setText(secondInput);
			}
		});
		btns[2][3].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//		isSecond=true;
				first = secondInput;
				charInput = "3";
				secondInput = "";
				textField.setText(secondInput);
			}
		});
		btns[3][3].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//		isSecond=true;
				first = secondInput;
				charInput = "4";
				secondInput = "";
				textField.setText(secondInput);
			}
		});
		for (int i = 0; i < btns.length; i++) {
			for (int j = 0; j < btns.length; j++) {
				btn.add(btns[i][j]);
			}
		}
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculator();
	}

}
