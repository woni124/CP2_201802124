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
		setTitle("피자 주문");
		setVisible(true);
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		WelcomPanel = new JPanel();
		JLabel label = new JLabel("자바 피자에 오신 것을 환영합니다.");
		WelcomPanel.add(label);
		add(WelcomPanel, BorderLayout.NORTH);
		
		TypePanel = new JPanel();
		combo = new JRadioButton("콤보", true);
		potato = new JRadioButton("포테이토");
		bulgogi = new JRadioButton("불고기");
		
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
		
		Border TypeBorder = BorderFactory.createTitledBorder("종류");
		TypePanel.setBorder(TypeBorder);
		add(TypePanel, BorderLayout.WEST);
		// 토핑 마지막 패널
		
		ToppingPanel = new JPanel();
		pepper = new JCheckBox("피망");
		cheese = new JCheckBox("치즈");
		pepperoni = new JCheckBox("페페로니");
		bacon = new JCheckBox("베이컨");
		
		ToppingPanel.add(pepper);
		ToppingPanel.add(cheese);
		ToppingPanel.add(pepperoni);
		ToppingPanel.add(bacon);
		
		pepper.addItemListener(new CheckBoxListener());
		cheese.addItemListener(new CheckBoxListener());
		pepperoni.addItemListener(new CheckBoxListener());
		bacon.addItemListener(new CheckBoxListener());
		
		Border ToppingBorder = BorderFactory.createTitledBorder("추가 토핑");
		ToppingPanel.setBorder(ToppingBorder);
		add(ToppingPanel, BorderLayout.CENTER);
		// 토핑 패널 마지막
		
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
		
		Border SizeBorder = BorderFactory.createTitledBorder("크기");
		SizePanel.setBorder(SizeBorder);
		add(SizePanel, BorderLayout.EAST);
		
		ButtonPanel = new JPanel();
		b1 = new JButton("주문");
		b2 = new JButton("취소");
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
				typeresult = "콤보 ";
				//text.setText("종류는 " + typeresult + "피자, 토핑은 " + toppingresult + "크기는 " + sizeresult + "을 주문 하셨습니다.");
			} 
			if (e.getSource() == potato) {
				typeresult = "포테이토";
				//text.setText("종류는 " + typeresult + "피자, 토핑은 " + toppingresult + "크기는 " + sizeresult + "을 주문 하셨습니다.");
			} 
			if (e.getSource() == bulgogi) {
				typeresult = "불고기";
				//text.setText("종류는 " + typeresult + "피자, 토핑은 " + toppingresult + "크기는 " + sizeresult + "을 주문 하셨습니다.");
			} // 불고기 if
			
			if (e.getSource() == small) {
				sizeresult = "Small";
				//text.setText("종류는 " + typeresult + "피자, 토핑은 " + toppingresult + "크기는 " + sizeresult + "을 주문 하셨습니다.");
			} // small if
			if (e.getSource() == medium) {
				sizeresult = "Medium";
				//text.setText("종류는 " + typeresult + "피자, 토핑은 " + toppingresult + "크기는 " + sizeresult + "을 주문 하셨습니다.");
			} // medium if
			if (e.getSource() == large) {
				sizeresult = "Large";
				//text.setText("종류는 " + typeresult + "피자, 토핑은 " + toppingresult + "크기는 " + sizeresult + "을 주문 하셨습니다.");
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
					toppingresult = "피망,";
					//text.setText("종류는 " + typeresult + "피자, 토핑은 " + toppingresult + "크기는 " + sizeresult + "을 주문 하셨습니다.");
				} 
			} //pepper
			if (source == cheese) {
				if (e.getStateChange() == ItemEvent.DESELECTED) {
					toppingresult = "";
				} else {
					toppingresult = "치즈,";
					//text.setText("종류는 " + typeresult + "피자, 토핑은 " + toppingresult + "크기는 " + sizeresult + "을 주문 하셨습니다.");
				}
			} // cheese
			if (source == pepperoni) {
				if (e.getStateChange() == ItemEvent.DESELECTED) {
					toppingresult = "";
				} else {
					toppingresult = "페페로니,";
					//text.setText("종류는 " + typeresult + "피자, 토핑은 " + toppingresult + "크기는 " + sizeresult + "을 주문 하셨습니다.");
				}
			} // pepperoni
			if (source == bacon) {
				if (e.getStateChange() == ItemEvent.DESELECTED) {
					toppingresult = "";
				} else {
					toppingresult = "베이컨,";
					//text.setText("종류는 " + typeresult + "피자, 토핑은 " + toppingresult + "크기는 " + sizeresult + "을 주문 하셨습니다.");
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
			aDialog.setVisible(true); // 창으로 생성
			b1.requestFocus(); // 초점 이동
		}
		if(e.getSource() == b2) {
			System.exit(0); // 프로세스 종료
		}
	} // action
		
}


/*	private class JPanel {
		//private JPanel WelcomPanel, TypePanel, SizePanel, ToppingPanel, ButtonPanel;
	}
	private class WelcomPanel extends JPanel {
		JPanel WelcomPanel = new JPanel();
		JLabel label = new JLabel("자바 피자에 오신 것을 환영합니다.");
		
	}
}
	private class TypePanel extends JPanel {
		TypePanel = new JPanel();
		combo = new JRadioButton("콤보");
		potato = new JRadioButton("포테이토");
		bulgogi = new JRadioButton("불고기");
		
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
		
		Border TypeBorder = BorderFactory.createTitledBorder("종류");
		TypePanel.setBorder(TypeBorder);
		pizza.add(TypePanel, BorderLayout.WEST);
	}
	
	private class ToppingPanel extends JPanel {
		ToppingPanel = new JPanel();
		pepper = new JCheckBox("피망");
		cheese = new JCheckBox("치즈");
		pepperoni = new JCheckBox("페페로니");
		bacon = new JCheckBox("베이컨");
		
		ToppingPanel.add(pepper);
		ToppingPanel.add(cheese);
		ToppingPanel.add(pepperoni);
		ToppingPanel.add(bacon);
		
		pepper.addItemListener(new CheckBoxListener());
		cheese.addItemListener(new CheckBoxListener());
		pepperoni.addItemListener(new CheckBoxListener());
		bacon.addItemListener(new CheckBoxListener());
		
		Border ToppingBorder = BorderFactory.createTitledBorder("추가 토핑");
		ToppingPanel.setBorder(ToppingBorder);
		pizza.add(ToppingPanel, BorderLayout.CENTER);
		// 토핑 패널 마지막
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
		
		Border SizeBorder = BorderFactory.createTitledBorder("종류");
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