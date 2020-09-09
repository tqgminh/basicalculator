package application;

import calculation.CalculatePostfix;
import calculation.ChangeInfixToPostfix;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class SampleController {
	@FXML
	public TextField input; 
	
	public void Press1(ActionEvent event) {
		input.setText(input.getText()+"1");
	}
	
	public void Press2(ActionEvent event) {
		input.setText(input.getText()+"2");
	}
	
	public void Press3(ActionEvent event) {
		input.setText(input.getText()+"3");
	}
	
	public void Press4(ActionEvent event) {
		input.setText(input.getText()+"4");
	}
	
	public void Press5(ActionEvent event) {
		input.setText(input.getText()+"5");
	}
	
	public void Press6(ActionEvent event) {
		input.setText(input.getText()+"6");
	}
	
	public void Press7(ActionEvent event) {
		input.setText(input.getText()+"7");
	}
	
	public void Press8(ActionEvent event) {
		input.setText(input.getText()+"8");
	}
	
	public void Press9(ActionEvent event) {
		input.setText(input.getText()+"9");
	}
	
	public void Press0(ActionEvent event) {
		input.setText(input.getText()+"0");
	}
	
	public void PressPi(ActionEvent event) {
		input.setText(input.getText()+Math.PI);
	}
	
	public void PressE(ActionEvent event) {
		input.setText(input.getText()+Math.E);
	}
	
	public void PressDot(ActionEvent event) {
		input.setText(input.getText()+".");
	}
	
	public void PressPlus(ActionEvent event) {
		input.setText(input.getText()+"+");
	}
	
	public void PressMinus(ActionEvent event) {
		input.setText(input.getText()+"-");
	}
	
	public void PressTime(ActionEvent event) {
		input.setText(input.getText()+"*");
	}
	
	public void PressDivide(ActionEvent event) {
		input.setText(input.getText()+"/");
	}
	
	public void PressAC(ActionEvent event) {
		input.setText("");
	}
	
	public void PressDel(ActionEvent event) {
		String str = input.getText(),  newInput = "";
		for(int i = 0; i < str.length()-1; i++)
			newInput = newInput+Character.toString(str.charAt(i));
		input.setText(newInput);
	}
	
	public void PressOpen(ActionEvent event) {
		input.setText(input.getText()+"(");
	}
	
	
	public void PressClose(ActionEvent event) {
		input.setText(input.getText()+")");
	}
	
	public void PressHat(ActionEvent event) {
		input.setText(input.getText()+"^");
	}
	
	
	public void PressEqual(ActionEvent event) {
		String in = input.getText();
		if(in.charAt(0) == '-' || in.charAt(0) == '+')
			in = "0"+in;
		ChangeInfixToPostfix IFP = new ChangeInfixToPostfix();
		String[] process = IFP.processString(in);
		String[] postfix = IFP.postfix(process);
		input.setText(CalculatePostfix.calculate(postfix));
	}
	
	public void PressSin(ActionEvent event) {
		try {
			String in = input.getText();
			if(in.charAt(0) == '-' || in.charAt(0) == '+')
				in = "0"+in;
			ChangeInfixToPostfix IFP = new ChangeInfixToPostfix();
			String[] process = IFP.processString(in);
			String[] postfix = IFP.postfix(process);
			double answer = Double.parseDouble(CalculatePostfix.calculate(postfix));
			answer = Math.sin(answer);
			input.setText(Double.toString(answer));
		} catch(Exception e) {
			input.setText("Syntax Error");
		}
	}
	
	public void PressCos(ActionEvent event) {
		try {
			String in = input.getText();
			if(in.charAt(0) == '-' || in.charAt(0) == '+')
				in = "0"+in;
			ChangeInfixToPostfix IFP = new ChangeInfixToPostfix();
			String[] process = IFP.processString(in);
			String[] postfix = IFP.postfix(process);
			double answer = Double.parseDouble(CalculatePostfix.calculate(postfix));
			answer = Math.cos(answer);
			input.setText(Double.toString(answer));
		} catch(Exception e) {
			input.setText("Syntax Error");
		}
	}
	
	public void PressTan(ActionEvent event) {
		try {
			String in = input.getText();
			if(in.charAt(0) == '-' || in.charAt(0) == '+')
				in = "0"+in;
			ChangeInfixToPostfix IFP = new ChangeInfixToPostfix();
			String[] process = IFP.processString(in);
			String[] postfix = IFP.postfix(process);
			double answer = Double.parseDouble(CalculatePostfix.calculate(postfix));
			answer = Math.tan(answer);
			input.setText(Double.toString(answer));
		} catch(Exception e) {
			input.setText("Syntax Error");
		}
	}
	
	public void PressSqrt(ActionEvent event) {
		try {
			String in = input.getText();
			if(in.charAt(0) == '-' || in.charAt(0) == '+')
				in = "0"+in;
			ChangeInfixToPostfix IFP = new ChangeInfixToPostfix();
			String[] process = IFP.processString(in);
			String[] postfix = IFP.postfix(process);
			double answer = Double.parseDouble(CalculatePostfix.calculate(postfix));
			answer = Math.sqrt(answer);
			input.setText(Double.toString(answer));
		} catch(Exception e) {
			input.setText("Syntax Error");
		}
	}
	
	public void PressLn(ActionEvent event) {
		try {
			String in = input.getText();
			if(in.charAt(0) == '-' || in.charAt(0) == '+')
				in = "0"+in;
			ChangeInfixToPostfix IFP = new ChangeInfixToPostfix();
			String[] process = IFP.processString(in);
			String[] postfix = IFP.postfix(process);
			double answer = Double.parseDouble(CalculatePostfix.calculate(postfix));
			answer = Math.log(answer);
			input.setText(Double.toString(answer));
		} catch(Exception e) {
			input.setText("Syntax Error");
		}
	}
}
