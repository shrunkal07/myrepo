package Calculatorpackage;

import java.util.Scanner;

public class Calculatorclass {
public static int add(int number1, int number2) {
	return number1 + number2;
}
public static int sub(int number1, int number2) {
	return number1 - number2;
}
public static int mul(int number1, int number2) {
	return number1 * number2;
}
public static double div(double number1, double number2) {
	if(number2 ==0) {
		throw new IllegalArgumentException("Number cannot be divided by 0");
	}
	return number1/number2;
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First Number : ");
	int input = sc.nextInt();

	Scanner sc1 = new Scanner(System.in);
	System.out.println("Enter Second Number : ");
	int input1 = sc.nextInt();
	
	System.out.println("the Addition is : " + Calculatorclass.add(input, input1));
	System.out.println("the Subtraction is : " + Calculatorclass.sub(input, input1));
	System.out.println("the Multiplication is : " + Calculatorclass.mul(input, input1));
	System.out.println("the Division is : " + Calculatorclass.div(input, input1));
	
}
}
