package calculation;

import java.util.Stack;

public class CalculatePostfix {
	//private double answer;
	public static Stack<Double> stack = new Stack<Double>();
	
	public static String calculate(String[] elementMath) {
		try {
			int length = elementMath.length;
			double ans;
			for(int i = 1; i < length; i++) {
				char c = elementMath[i].charAt(0);
				if(!ChangeInfixToPostfix.isOperator(c)) {
					stack.push(Double.parseDouble(elementMath[i]));
				}
				else {
					switch(elementMath[i]) {
					case "+":
						ans = stack.pop()+stack.pop();
						stack.push(ans);
						break;
					case "-":
						ans = -stack.pop()+stack.pop();
						stack.push(ans);
						break;
					case "*":
						ans = stack.pop()*stack.pop();
						stack.push(ans);
						break;
					case "/":
						ans = 1/(stack.pop()/stack.pop());
						stack.push(ans);
						break;
					default:
						double hat = stack.pop();
						ans = Math.pow(stack.pop() ,hat);
						stack.push(ans);
					}	
				}
			}
			return Double.toString(stack.pop());
		} catch(Exception e) {
			return "Syntax Error";
		}
	}

}
