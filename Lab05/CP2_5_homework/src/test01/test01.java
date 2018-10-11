package test01;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class test01 extends JFrame {

	static JPanel contentPane;
	static JTextField textField;
	static JTextField textField_1;
	static JTextField textField_2;
	static JButton btnNewButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test01 frame = new test01();
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
	public test01() {
		setTitle("이자 계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 422, 223);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC6D0\uAE08\uC744 \uC785\uB825\uD558\uC2DC\uC624");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel.setBounds(61, 41, 137, 15);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(206, 38, 137, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("\uC774\uC728\uC744 \uC785\uB825\uD558\uC2DC\uC624.");
		label.setFont(new Font("굴림", Font.BOLD, 15));
		label.setBounds(61, 78, 137, 15);
		contentPane.add(label);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setColumns(10);
		textField_1.setBounds(206, 75, 137, 21);
		textField_1.addKeyListener(new KeyListener() {
			private int money;
			private double rate;
			private double calc;
			@Override
			public void keyPressed(KeyEvent g) {
				// TODO Auto-generated method stub
				if (g.getKeyCode() == KeyEvent.VK_ENTER) {
					if (textField.getText().equals("")) {
						money = 0;
					} else if (textField_1.getText().equals("")) {
						rate = 1;
					} else {
						money = Integer.valueOf(test01.textField.getText());
						rate = Double.valueOf(test01.textField_1.getText());
					} 
					calc = (double) money * (rate/100);
				
					test01.textField_2.setText("이자는 연 " + calc + "원 입니다.");
				}
			}
			@Override
			public void keyReleased(KeyEvent g) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void keyTyped(KeyEvent g) {
				// TODO Auto-generated method stub
				
			}
		});
		contentPane.add(textField_1);
		
		btnNewButton = new JButton("\uBCC0\uD658");
		btnNewButton.addActionListener(new button());
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 15));
		btnNewButton.setBounds(167, 106, 68, 41);
		contentPane.add(btnNewButton);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBounds(61, 157, 313, 21);
		contentPane.add(textField_2);
	}
}
