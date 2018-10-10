package test02;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class test02 extends JFrame {

	static JPanel contentPane;
	static JTextField textField;
	static JButton btnNewButton;
	static JButton btnNewButton_1;
	static JButton button;
	static JButton button_1;
	static JButton button_2;
	static JButton button_3;
	static JButton button_4;
	static JButton button_5;
	static JButton button_6;
	static JButton button_7;
	static JButton button_8;
	static JButton button_9;
	static JButton button_10;
	static JButton button_11;
	static JButton button_12;
	static JButton button_13;
	static JButton button_14;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test02 frame = new test02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public test02() {
		setTitle("\uACC4\uC0B0\uAE30");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 298, 323);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(32, 22, 188, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.addKeyListener(new KeyListener() {
			private int num1, num2;
			private String calc;
			private int sum;
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					if (test02.textField.getText().equals("0")) {
						test02.textField.setText("");
					} else if (calc == "+") {
						num2 = Integer.valueOf(textField.getText());
						sum = num1 + num2;
						textField.setText(sum + "");
					} else if (calc == "-") {
						num2 = Integer.valueOf(textField.getText());
						sum = num1 - num2;
						textField.setText(sum + "");
					} else if (calc == "*") {
						num2 = Integer.valueOf(textField.getText());
						sum = num1 * num2;
						textField.setText(sum + "");
					} else if (calc == "/") {
						num2 = Integer.valueOf(textField.getText());
						sum = num1 / num2;
						textField.setText(sum + "");
					}
					else {
						textField.setText(" 값을 제대로 입력하십시오. ");
					}
				} // ENTER
				
				if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
					if (textField.getText().equals("")) {
						textField.setText("");
					} else {
						textField.setText("0");
					}
				} // ESC
				
			} // keyPressed

			@Override
			public void keyReleased(KeyEvent arg0) {	
			}
			@Override
			public void keyTyped(KeyEvent arg0) {	
			}
		}); // KeyListener
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 53, 108, 33);
		contentPane.add(panel);
		
		btnNewButton = new JButton("C");
		btnNewButton.addActionListener(new button());
		panel.add(btnNewButton);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 12));
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 88, 237, 33);
		contentPane.add(panel_1);
		
		btnNewButton_1 = new JButton("7");
		btnNewButton_1.addActionListener(new button());
		panel_1.add(btnNewButton_1);
		
		button = new JButton("8");
		button.addActionListener(new button());
		panel_1.add(button);
		
		button_1 = new JButton("9");
		button_1.addActionListener(new button());
		panel_1.add(button_1);
		
		button_2 = new JButton("/");
		button_2.addActionListener(new button());
		panel_1.add(button_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 131, 238, 37);
		contentPane.add(panel_2);
		
		button_3 = new JButton("4");
		button_3.addActionListener(new button());
		panel_2.add(button_3);
		
		button_4 = new JButton("5");
		button_4.addActionListener(new button());
		panel_2.add(button_4);
		
		button_5 = new JButton("6");
		button_5.addActionListener(new button());
		panel_2.add(button_5);
		
		button_6 = new JButton("*");
		button_6.addActionListener(new button());
		panel_2.add(button_6);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 171, 237, 33);
		contentPane.add(panel_3);
		
		button_7 = new JButton("1");
		button_7.addActionListener(new button());
		panel_3.add(button_7);
		
		button_8 = new JButton("2");
		button_8.addActionListener(new button());
		panel_3.add(button_8);
		
		button_9 = new JButton("3");
		button_9.addActionListener(new button());
		panel_3.add(button_9);
		
		button_10 = new JButton("-");
		button_10.addActionListener(new button());
		panel_3.add(button_10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 212, 249, 33);
		contentPane.add(panel_4);
		
		button_11 = new JButton("0");
		button_11.addActionListener(new button());
		panel_4.add(button_11);
		
		button_12 = new JButton("00");
		button_12.addActionListener(new button());
		panel_4.add(button_12);
		
		button_13 = new JButton("+");
		button_13.addActionListener(new button());
		panel_4.add(button_13);
		
		button_14 = new JButton("=");
		button_14.addActionListener(new button());
		panel_4.add(button_14);
		
	}

}
