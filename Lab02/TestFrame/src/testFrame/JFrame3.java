package testFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;

public class JFrame3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame3 frame = new JFrame3();
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
	public JFrame3() {
		setTitle("\uACC4\uC0B0\uAE30");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 249, 297);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("23");
		textField.setBounds(32, 22, 188, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 53, 108, 33);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("C");
		panel.add(btnNewButton);
		btnNewButton.setFont(new Font("±¼¸²", Font.BOLD, 12));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 88, 237, 33);
		contentPane.add(panel_1);
		
		JButton btnNewButton_1 = new JButton("7");
		panel_1.add(btnNewButton_1);
		
		JButton button = new JButton("8");
		panel_1.add(button);
		
		JButton button_1 = new JButton("9");
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("/");
		panel_1.add(button_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 131, 238, 37);
		contentPane.add(panel_2);
		
		JButton button_3 = new JButton("4");
		panel_2.add(button_3);
		
		JButton button_4 = new JButton("5");
		panel_2.add(button_4);
		
		JButton button_5 = new JButton("6");
		panel_2.add(button_5);
		
		JButton button_6 = new JButton("*");
		panel_2.add(button_6);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 171, 237, 33);
		contentPane.add(panel_3);
		
		JButton button_7 = new JButton("1");
		panel_3.add(button_7);
		
		JButton button_8 = new JButton("2");
		panel_3.add(button_8);
		
		JButton button_9 = new JButton("3");
		panel_3.add(button_9);
		
		JButton button_10 = new JButton("-");
		panel_3.add(button_10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 212, 249, 33);
		contentPane.add(panel_4);
		
		JButton button_11 = new JButton("0");
		panel_4.add(button_11);
		
		JButton button_12 = new JButton("00");
		panel_4.add(button_12);
		
		JButton button_13 = new JButton("=");
		panel_4.add(button_13);
		
		JButton button_14 = new JButton("+");
		panel_4.add(button_14);
	}

}
