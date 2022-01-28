package problems;

import java.util.Scanner;

public class CheckNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myNumber = new Scanner(System.in);
		int number = myNumber.nextInt();

		if (number > 0)

		{
			System.out.println("Number is positive");
		}

		else if (number < 0) {
			System.out.println("Number is negative");
		}

		else {
			System.out.println("Number is 0");
		}

	}

}
