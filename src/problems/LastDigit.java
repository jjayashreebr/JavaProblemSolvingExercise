package problems;

import java.util.Scanner;

public class LastDigit {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner myNumber = new Scanner(System.in);
		System.out.println("Enter first number");
		int number1 = myNumber.nextInt();
		System.out.println("Enter second number");
		int number2 = myNumber.nextInt();
		System.out.println(lastDigit(number1,number2));

	}

	private static boolean lastDigit(int number1, int number2) {
		// TODO Auto-generated method stub
		boolean check =false;
		int x= number1%10;
		int y= number2%10;
		if(x==y) {
			check =true;
		}
		return check;
	}
	
	

}
