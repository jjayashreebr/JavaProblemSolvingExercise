package problems;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner myNumber = new Scanner(System.in);
		System.out.println("Enter number");
		int number = myNumber.nextInt();
		System.out.println(reverse(number));
	}

	private static int reverse(int number) {
		// TODO Auto-generated method stub
        if(number<10) {
        	return number;
        }
        int output=0;
        int temp=0;
        while(number>=1) {
        	temp=number%10;
        	output=temp+(output*10);
        	number=number/10;
        	//System.out.println(output);
        }
        return output;
	}
	
	

}
