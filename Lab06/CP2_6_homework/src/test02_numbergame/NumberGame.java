package test02_numbergame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NumberGame extends JFrame implements ActionListener {
	
	private JButton b1, b2;
	private JPanel P1, P2, P3;
	private JFormattedTextField text;
	private JLabel L2, L3;
	Random random = new Random();
	int number, trynum;
	
	public NumberGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 150);
		setTitle("���� ����");
		
		number = random.nextInt(100);
		System.out.println(number);
		P1 = new JPanel();
		JLabel label = new JLabel("���ڸ� �����Ͻÿ�:");
		text = new JFormattedTextField();
		P1.add(label);
		P1.add(text);
		text.setColumns(10);
		text.setText("100");
		int next = Integer.valueOf(text.getText());
		text.addKeyListener(new KeyListener() {
		
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					try {
						if (e.getKeyChar() >= 0 && e.getKeyChar() <= 100) {
							number = number / 0;
						}
					} catch (ArithmeticException ime) {
						L2.setText("������ �Է��ϼ���.");
					} // ����ó��
					if (next < number) {
						 L2.setText("�ʹ� �����ϴ�.");
						 L2.setBackground(Color.blue);
						 
					}
					if (next > number) {
						L2.setText("�ʹ� �����ϴ�.");
						L2.setBackground(Color.red);
						
					}
					if (next == number) {
						L2.setText("�����Դϴ�.");
						L2.setBackground(Color.green);
						
					}
					
					trynum += 1;
					L3.setText("�õ� Ƚ��: " + trynum);
					text.setEditable(false);
				}
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		add(P1, BorderLayout.NORTH);
		
		P2 = new JPanel();
		L2 = new JLabel(); // ����
		trynum = 0;
		L3 = new JLabel("�õ� Ƚ��: " + trynum); // �õ�Ƚ��
		P2.add(L2); 
		P2.add(L3);
		add(P2, BorderLayout.CENTER);
		
		P3 = new JPanel();
		b1 = new JButton("�ٽ� �� ��");
		b2 = new JButton("����");
		b1.addActionListener(this);
		b2.addActionListener(this);
		P3.add(b1);
		P3.add(b2);
		add(P3, BorderLayout.SOUTH);
		
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			L3.setText("�õ� Ƚ��: " + trynum);
			text.setEditable(true);
		}
		if (e.getSource() == b2) {
			System.exit(0);
		}
	}

}
