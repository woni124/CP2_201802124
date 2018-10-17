package test01_pizza;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SimpleDialog extends JDialog implements ActionListener {

	JPanel Panel;
	JButton okButton;
	
	SimpleDialog(Frame parent, String str) {
		
		Panel = new JPanel();
		okButton = new JButton("주문완료");
		okButton.addActionListener(this);
		Panel.add(okButton);
		//Panel.add(pizza.text);
		add(Panel, BorderLayout.CENTER);
		//add(pizza.text, BorderLayout.SOUTH);
		setTitle("주문 확인");
		setSize(300, 100);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == okButton) {
			System.exit(0);
		} 
	} // action

}

