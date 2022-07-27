package PracticeProject;
import java.util.Scanner;
public class ArithmeticCalculator {
	public static void main(String[] args) {
		char function;
		double num1,num2,finalvalue;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		num1=sc.nextDouble();
		System.out.println("Enter Operator");
		function=sc.next().charAt(0);
		System.out.println("Enter Number");
		num2=sc.nextDouble();
		switch(function){
			case '+':
				finalvalue=num1+num2;
				System.out.println(finalvalue);
				break;
			case '-':
				finalvalue=num1-num2;
				System.out.println(finalvalue);
				break;
			case '*':
				finalvalue=num1*num2;
				System.out.println(finalvalue);
				break;
			case '/':
				finalvalue=num1/num2;
				System.out.println(finalvalue);
				break;
				
		}
		
	}

}

