package test02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class button implements ActionListener {
	private static int num1;
	private static int num2;
	private static String calc;
	private int sum;
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == test02.btnNewButton) {
			if (test02.textField.getText().equals("")) {
				test02.textField.setText("");
			} else {
				test02.textField.setText("0");
			}
		}
		
		if (e.getSource() == test02.btnNewButton_1) {
			if (test02.textField.getText().equals("0")) {
				test02.textField.setText("7");
			} else if (test02.textField.getText().equals("+") || test02.textField.getText().equals("-") || test02.textField.getText().equals("*") || test02.textField.getText().equals("/")) {
				test02.textField.setText("7");
			} else {
				test02.textField.setText(test02.textField.getText() + "7");
			}
		}
		
		if (e.getSource() == test02.button) {
			if (test02.textField.getText().equals("0")) {
				test02.textField.setText("8");
			} else if (test02.textField.getText().equals("+") || test02.textField.getText().equals("-") || test02.textField.getText().equals("*") || test02.textField.getText().equals("/")) {
				test02.textField.setText("8");
			} else {
				test02.textField.setText(test02.textField.getText() + "8");
			}
		}
		
		if (e.getSource() == test02.button_1) {
			if (test02.textField.getText().equals("0")) {
				test02.textField.setText("9");
			} else if (test02.textField.getText().equals("+") || test02.textField.getText().equals("-")|| test02.textField.getText().equals("*") || test02.textField.getText().equals("/")) {
				test02.textField.setText("8");
			} else {
				test02.textField.setText(test02.textField.getText() + "9");
			}
		}
		
		if (e.getSource() == test02.button_2) { // /
			if (test02.textField.getText().equals("0")) {
				test02.textField.setText("");
			} else {
				num1 = Integer.valueOf(test02.textField.getText());
				calc = "/";
				test02.textField.setText("/");
			}
		}
		
		if (e.getSource() == test02.button_3) {
			if (test02.textField.getText().equals("0")) {
				test02.textField.setText("4");
			} else if (test02.textField.getText().equals("+") || test02.textField.getText().equals("-") || test02.textField.getText().equals("*") || test02.textField.getText().equals("/")) {
				test02.textField.setText("4");
			} else {
				test02.textField.setText(test02.textField.getText() + "4");
			}
		}
		
		if (e.getSource() == test02.button_4) {
			if (test02.textField.getText().equals("0")) {
				test02.textField.setText("5");
			} else if (test02.textField.getText().equals("+") || test02.textField.getText().equals("-") || test02.textField.getText().equals("*") || test02.textField.getText().equals("/")) {
				test02.textField.setText("5");
			} else {
				test02.textField.setText(test02.textField.getText() + "5");
			}
		}
		
		if (e.getSource() == test02.button_5) {
			if (test02.textField.getText().equals("0")) {
				test02.textField.setText("6");
			} else if (test02.textField.getText().equals("+") || test02.textField.getText().equals("-") || test02.textField.getText().equals("*") || test02.textField.getText().equals("/")) {
				test02.textField.setText("6");
			} else {
				test02.textField.setText(test02.textField.getText() + "6");
			}
		}
		
		if (e.getSource() == test02.button_6) { // *
			if (test02.textField.getText().equals("0")) {
				test02.textField.setText("");
			} else {
				num1 = Integer.valueOf(test02.textField.getText());
				calc = "*";
				test02.textField.setText("*");
			}
		}
		
		if (e.getSource() == test02.button_7) {
			if (test02.textField.getText().equals("0")) {
				test02.textField.setText("1");
			} else if (test02.textField.getText().equals("+") || test02.textField.getText().equals("-") || test02.textField.getText().equals("*") || test02.textField.getText().equals("/")) {
				test02.textField.setText("1");
			} else {
				test02.textField.setText(test02.textField.getText() + "1");
			}
		}
		
		if (e.getSource() == test02.button_8) {
			if (test02.textField.getText().equals("0")) {
				test02.textField.setText("2");
			} else if (test02.textField.getText().equals("+") || test02.textField.getText().equals("-") || test02.textField.getText().equals("*") || test02.textField.getText().equals("/")) {
				test02.textField.setText("2");
			} else {
				test02.textField.setText(test02.textField.getText() + "2");
			}
		}
		
		if (e.getSource() == test02.button_9) {
			if (test02.textField.getText().equals("0")) {
				test02.textField.setText("3");
			} else if (test02.textField.getText().equals("+") || test02.textField.getText().equals("-") || test02.textField.getText().equals("*") || test02.textField.getText().equals("/")) {
				test02.textField.setText("3");
			} else {
				test02.textField.setText(test02.textField.getText() + "3");
			}
		}
		
		if (e.getSource() == test02.button_10) { // - 
			if (test02.textField.getText().equals("0")) {
				test02.textField.setText("");
			} else {
				num1 = Integer.valueOf(test02.textField.getText());
				test02.textField.setText("-");
				calc = String.valueOf(test02.textField.getText());
			}
		}
		
		if (e.getSource() == test02.button_11) { // 0
			if (test02.textField.getText().equals("0")) {
				test02.textField.setText("0");
			} else {
				test02.textField.setText(test02.textField.getText() + "0");
			}
		}
		
		if (e.getSource() == test02.button_12) { // 00
			if (test02.textField.getText().equals("0")) {
				test02.textField.setText("0");
			} else {
				test02.textField.setText(test02.textField.getText() + "00");
			}
		}
		
		if (e.getSource() == test02.button_13) { // + 
			if (test02.textField.getText().equals("0")) {
				test02.textField.setText("");
			} else {
				num1 = Integer.valueOf(test02.textField.getText());
				calc = "+";
				test02.textField.setText("+");
			}
		}
		
		if (e.getSource() == test02.button_14) { // =
			if (test02.textField.getText().equals("0")) {
				test02.textField.setText("");
			} else if (button.calc.equals("+")) {
				num2 = Integer.valueOf(test02.textField.getText());
				sum = num1 + num2;
				test02.textField.setText(sum + "");
			} else if (calc.equals("-")) {
				num2 = Integer.valueOf(test02.textField.getText());
				sum = num1 - num2;
				test02.textField.setText(sum + "");
			} else if (calc.equals("*")) {
				num2 = Integer.valueOf(test02.textField.getText());
				sum = num1 * num2;
				test02.textField.setText(sum + "");
			} else if (calc.equals("/")) {
				num2 = Integer.valueOf(test02.textField.getText());
				sum = num1 / num2;
				test02.textField.setText(sum + "");
			}
			else {
				test02.textField.setText("값을 제대로 입력하십시오.");
			}
		}
		
	}

}
