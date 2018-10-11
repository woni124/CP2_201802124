package test01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class button implements ActionListener {

	private int money;
	private double rate;
	private double calc;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == test01.btnNewButton) {
			if (test01.textField.getText().equals("")) {
				money = 0;
			} else if (test01.textField_1.getText().equals("")) {
				rate = 1;
			} else {
				money = Integer.valueOf(test01.textField.getText());
				rate = Double.valueOf(test01.textField_1.getText());
			}
			calc = (double) money * (rate/100);
			
			test01.textField_2.setText("이자는 연 " + calc + "원 입니다.");
		}
	}

}
