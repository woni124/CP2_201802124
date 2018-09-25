package testFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class JFrame1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame1 frame = new JFrame1();
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
	public JFrame1() {
		setTitle("\uB9C8\uC77C\uC744 \uD0AC\uB85C\uBBF8\uD130\uB85C \uBCC0\uD658");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 380, 192);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uAC70\uB9AC\uB97C \uB9C8\uC77C \uB2E8\uC704\uB85C \uC785\uB825\uD558\uC2DC\uC624.");
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 15));
		lblNewLabel.setBounds(38, 23, 236, 26);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("1");
		textField.setBounds(262, 25, 51, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("±¼¸²", Font.PLAIN, 14));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setText("1\uB9C8\uC77C\uC740 1.6 \uD0AC\uB85C\uBBF8\uD130\uC785\uB2C8\uB2E4.");
		textField_1.setBounds(63, 111, 250, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(130, 64, 98, 37);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("\uBCC0\uD658");
		panel.add(btnNewButton);
		btnNewButton.setFont(new Font("±¼¸²", Font.BOLD, 15));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(35, 99, 302, 51);
		contentPane.add(panel_1);
	}
}
