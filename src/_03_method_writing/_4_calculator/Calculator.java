package _03_method_writing._4_calculator;

import javax.swing.JOptionPane;

public class Calculator {

	//GOAL: MAKE A CALCULATOR
	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("Enter your first number");
		String input2 = JOptionPane.showInputDialog("Enter your second number");
		int number1 = Integer.parseInt(input1);
		int number2 = Integer.parseInt(input2);
		int task = JOptionPane.showOptionDialog(null, "What do you choose?", "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "divide", "multiply", "subtract", "add" }, null);
		if (task==0){
			divide(number1,number2);
		}
		if (task==1){
			multiply(number1,number2);
		}
		if (task==2){
			subtract(number1,number2);
		}
		if (task==3){
			add(number1,number2);
		}
		
		// 4) Call the result() method and put the answer in a pop-up
	}
	
	// 1) Make 4 static methods (add, subtract, multiply, divide)
	//		They should each take 2 numbers as parameters
	//		and return the answer.
	 public static void divide(Integer number1, Integer number2) {
		int total=0;
		total =number1/number2;
		result(total);
	 }
	 public static void multiply(Integer number1, Integer number2) {
		int total=0;
		total =number1*number2;
		result(total);
	 }
	 public static void subtract(Integer number1, Integer number2) {
		int total=0;
		total =number1-number2;
		result(total);
	 }
	 public static void add(Integer number1, Integer number2) {
		int total=0;
		total =number1+number2;
		result(total);
	 }
	 public static void result(Integer total) {
		JOptionPane.showMessageDialog(null, "Your answer is "+total);
	 }
	
	// 2) Make a static method called " result" that takes a number
	//		as a parameter and returns the number in a string
	//		EX: "Your answer is " + number;

	
}
