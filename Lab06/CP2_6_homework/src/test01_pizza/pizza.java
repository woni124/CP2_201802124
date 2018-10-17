package test01_pizza;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;

public class pizza extends JFrame implements ActionListener {
	
	public static void main(String[] args) {
		JFrame Pizza = new pizza();
	}
	static JLabel text;
	private JPanel WelcomPanel, TypePanel, SizePanel, ToppingPanel, ButtonPanel;
	private JRadioButton combo, potato, bulgogi, small, medium, large;
	private JCheckBox pepper, cheese, pepperoni, bacon;
	private String typeresult, toppingresult, sizeresult;
	private JButton b1;
	private JButton b2;
	private SimpleDialog aDialog;
	
	public pizza() {
		setTitle("���� �ֹ�");
		setVisible(true);
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		WelcomPanel = new JPanel();
		JLabel label = new JLabel("�ڹ� ���ڿ� ���� ���� ȯ���մϴ�.");
		WelcomPanel.add(label);
		add(WelcomPanel, BorderLayout.NORTH);
		
		TypePanel = new JPanel();
		combo = new JRadioButton("�޺�", true);
		potato = new JRadioButton("��������");
		bulgogi = new JRadioButton("�Ұ��");
		
		combo.addActionListener(new RadioListener());
		potato.addActionListener(new RadioListener());
		bulgogi.addActionListener(new RadioListener());
		
		ButtonGroup Type = new ButtonGroup();
		Type.add(combo);
		Type.add(potato);
		Type.add(bulgogi);
		
		TypePanel.add(combo);
		TypePanel.add(potato);
		TypePanel.add(bulgogi);
		
		Border TypeBorder = BorderFactory.createTitledBorder("����");
		TypePanel.setBorder(TypeBorder);
		add(TypePanel, BorderLayout.WEST);
		// ���� ������ �г�
		
		ToppingPanel = new JPanel();
		pepper = new JCheckBox("�Ǹ�");
		cheese = new JCheckBox("ġ��");
		pepperoni = new JCheckBox("����δ�");
		bacon = new JCheckBox("������");
		
		ToppingPanel.add(pepper);
		ToppingPanel.add(cheese);
		ToppingPanel.add(pepperoni);
		ToppingPanel.add(bacon);
		
		pepper.addItemListener(new CheckBoxListener());
		cheese.addItemListener(new CheckBoxListener());
		pepperoni.addItemListener(new CheckBoxListener());
		bacon.addItemListener(new CheckBoxListener());
		
		Border ToppingBorder = BorderFactory.createTitledBorder("�߰� ����");
		ToppingPanel.setBorder(ToppingBorder);
		add(ToppingPanel, BorderLayout.CENTER);
		// ���� �г� ������
		
		SizePanel = new JPanel();
		small = new JRadioButton("Small");
		medium = new JRadioButton("Medium", true);
		large = new JRadioButton("Large");
		
		small.addActionListener(new RadioListener());
		medium.addActionListener(new RadioListener());
		large.addActionListener(new RadioListener());
		
		ButtonGroup Size = new ButtonGroup();
		Size.add(small);
		Size.add(medium);
		Size.add(large);
		
		SizePanel.add(small);
		SizePanel.add(medium);
		SizePanel.add(large);
		
		Border SizeBorder = BorderFactory.createTitledBorder("ũ��");
		SizePanel.setBorder(SizeBorder);
		add(SizePanel, BorderLayout.EAST);
		
		ButtonPanel = new JPanel();
		b1 = new JButton("�ֹ�");
		b2 = new JButton("���");
		b1.addActionListener(this);
		b2.addActionListener(this);
		ButtonPanel.add(b1);
		ButtonPanel.add(b2);
		add(ButtonPanel, BorderLayout.SOUTH);
	}
	
	private class RadioListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == combo) {
				typeresult = "�޺� ";
				//text.setText("������ " + typeresult + "����, ������ " + toppingresult + "ũ��� " + sizeresult + "�� �ֹ� �ϼ̽��ϴ�.");
			} 
			if (e.getSource() == potato) {
				typeresult = "��������";
				//text.setText("������ " + typeresult + "����, ������ " + toppingresult + "ũ��� " + sizeresult + "�� �ֹ� �ϼ̽��ϴ�.");
			} 
			if (e.getSource() == bulgogi) {
				typeresult = "�Ұ��";
				//text.setText("������ " + typeresult + "����, ������ " + toppingresult + "ũ��� " + sizeresult + "�� �ֹ� �ϼ̽��ϴ�.");
			} // �Ұ�� if
			
			if (e.getSource() == small) {
				sizeresult = "Small";
				//text.setText("������ " + typeresult + "����, ������ " + toppingresult + "ũ��� " + sizeresult + "�� �ֹ� �ϼ̽��ϴ�.");
			} // small if
			if (e.getSource() == medium) {
				sizeresult = "Medium";
				//text.setText("������ " + typeresult + "����, ������ " + toppingresult + "ũ��� " + sizeresult + "�� �ֹ� �ϼ̽��ϴ�.");
			} // medium if
			if (e.getSource() == large) {
				sizeresult = "Large";
				//text.setText("������ " + typeresult + "����, ������ " + toppingresult + "ũ��� " + sizeresult + "�� �ֹ� �ϼ̽��ϴ�.");
			} // large if
		} // action
		
	} // RadioListener
	private class CheckBoxListener implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent e) {
			Object source = e.getItemSelectable();
			if (source == pepper) {
				if (e.getStateChange() == ItemEvent.DESELECTED) {
					toppingresult = "";
				} else {
					toppingresult = "�Ǹ�,";
					//text.setText("������ " + typeresult + "����, ������ " + toppingresult + "ũ��� " + sizeresult + "�� �ֹ� �ϼ̽��ϴ�.");
				} 
			} //pepper
			if (source == cheese) {
				if (e.getStateChange() == ItemEvent.DESELECTED) {
					toppingresult = "";
				} else {
					toppingresult = "ġ��,";
					//text.setText("������ " + typeresult + "����, ������ " + toppingresult + "ũ��� " + sizeresult + "�� �ֹ� �ϼ̽��ϴ�.");
				}
			} // cheese
			if (source == pepperoni) {
				if (e.getStateChange() == ItemEvent.DESELECTED) {
					toppingresult = "";
				} else {
					toppingresult = "����δ�,";
					//text.setText("������ " + typeresult + "����, ������ " + toppingresult + "ũ��� " + sizeresult + "�� �ֹ� �ϼ̽��ϴ�.");
				}
			} // pepperoni
			if (source == bacon) {
				if (e.getStateChange() == ItemEvent.DESELECTED) {
					toppingresult = "";
				} else {
					toppingresult = "������,";
					//text.setText("������ " + typeresult + "����, ������ " + toppingresult + "ũ��� " + sizeresult + "�� �ֹ� �ϼ̽��ϴ�.");
				}
			} // bacon
		
		} // itemStateChanged
		
	} // CheckBoxListener
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			if(aDialog == null) {
				aDialog = new SimpleDialog(this, "Simple Dialog");
			}
			aDialog.setVisible(true); // â���� ����
			b1.requestFocus(); // ���� �̵�
		}
		if(e.getSource() == b2) {
			System.exit(0); // ���μ��� ����
		}
	} // action
		
}


/*	private class JPanel {
		//private JPanel WelcomPanel, TypePanel, SizePanel, ToppingPanel, ButtonPanel;
	}
	private class WelcomPanel extends JPanel {
		JPanel WelcomPanel = new JPanel();
		JLabel label = new JLabel("�ڹ� ���ڿ� ���� ���� ȯ���մϴ�.");
		
	}
}
	private class TypePanel extends JPanel {
		TypePanel = new JPanel();
		combo = new JRadioButton("�޺�");
		potato = new JRadioButton("��������");
		bulgogi = new JRadioButton("�Ұ��");
		
		combo.addActionListener(new RadioListener());
		potato.addActionListener(new RadioListener());
		bulgogi.addActionListener(new RadioListener());
		
		ButtonGroup Type = new ButtonGroup();
		Type.add(combo);
		Type.add(potato);
		Type.add(bulgogi);
		
		TypePanel.add(combo);
		TypePanel.add(potato);
		TypePanel.add(bulgogi);
		
		Border TypeBorder = BorderFactory.createTitledBorder("����");
		TypePanel.setBorder(TypeBorder);
		pizza.add(TypePanel, BorderLayout.WEST);
	}
	
	private class ToppingPanel extends JPanel {
		ToppingPanel = new JPanel();
		pepper = new JCheckBox("�Ǹ�");
		cheese = new JCheckBox("ġ��");
		pepperoni = new JCheckBox("����δ�");
		bacon = new JCheckBox("������");
		
		ToppingPanel.add(pepper);
		ToppingPanel.add(cheese);
		ToppingPanel.add(pepperoni);
		ToppingPanel.add(bacon);
		
		pepper.addItemListener(new CheckBoxListener());
		cheese.addItemListener(new CheckBoxListener());
		pepperoni.addItemListener(new CheckBoxListener());
		bacon.addItemListener(new CheckBoxListener());
		
		Border ToppingBorder = BorderFactory.createTitledBorder("�߰� ����");
		ToppingPanel.setBorder(ToppingBorder);
		pizza.add(ToppingPanel, BorderLayout.CENTER);
		// ���� �г� ������
	}
	private class SizePanel extends JPanel { 
		SizePanel = new JPanel();
		small = new JRadioButton("Small");
		medium = new JRadioButton("Medium");
		large = new JRadioButton("Large");
		
		small.addActionListener(new RadioListener());
		medium.addActionListener(new RadioListener());
		large.addActionListener(new RadioListener());
		
		ButtonGroup Size = new ButtonGroup();
		Size.add(small);
		Size.add(medium);
		Size.add(large);
		
		SizePanel.add(small);
		SizePanel.add(medium);
		SizePanel.add(large);
		
		Border SizeBorder = BorderFactory.createTitledBorder("����");
		SizePanel.setBorder(SizeBorder);
		pizza.add(SizePanel, BorderLayout.EAST);
	}
	
	private class ButtonPanel extends JPanel {
		ButtonPanel = new JPanel();
		pizza.add(ButtonPanel, BorderLayout.EAST);		
	}
	
	
}
}
}
}
}
}*/