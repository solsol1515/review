package basic_04;

import java.util.Scanner;

public class CalculatorExpr {
	
	private int num1;
	private int num2;
	
	int getAddition(){
		return num1+num2;
	}
	
	int getSubtraction () {
		return num1-num2;
	}
	
	int getMultiplication() {
		return num1*num2;
	}
	
	double getDivision() {
		return num1/(double)num2;
	}
	
	public int getNum1(int num1) {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2(int num2) {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public static void main(String[] args) {
		
		// Calc c = new Calc(10, 15);
		//c.num1 = 10;
		//c.num2 = 15;
		
	}
	
}
