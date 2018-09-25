package testFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class JFrame2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame2 frame = new JFrame2();
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
	public JFrame2() {
		setTitle("\uC774\uC790 \uACC4\uC0B0\uAE30");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 351, 268);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC6D0\uAE08\uC744 \uC785\uB825\uD558\uC2DC\uC624");
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 13));
		lblNewLabel.setBounds(50, 30, 138, 43);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("\uC774\uC728\uC744 \uC785\uB825\uD558\uC2DC\uC624.");
		label.setFont(new Font("±¼¸²", Font.BOLD, 13));
		label.setBounds(50, 83, 138, 35);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("1000");
		textField.setBounds(176, 41, 96, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("7.5");
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setColumns(10);
		textField_1.setBounds(176, 90, 96, 21);
		contentPane.add(textField_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(112, 128, 114, 35);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("\uBCC0\uD658");
		panel.add(btnNewButton);
		btnNewButton.setFont(new Font("±¼¸²", Font.BOLD, 13));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 176, 317, 43);
		contentPane.add(panel_1);
		
		textField_2 = new JTextField();
		panel_1.add(textField_2);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setText("\uC774\uC790\uB294 \uC5F0 75\uB9CC\uC6D0 \uC785\uB2C8\uB2E4.");
		textField_2.setColumns(25);
	}
}
