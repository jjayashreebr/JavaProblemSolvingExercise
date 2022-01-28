package problems;

import java.util.Scanner;

public class PercentageOfInterest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter gender Female/Male ");
		String gender = myObj.next();
		System.out.println("Enter age 1 to 100");
		int age = myObj.nextInt();
		System.out.println(percentageOfInterest(gender,age)+" %");
	}

	private static float percentageOfInterest(String gender, int age) {
		// TODO Auto-generated method stub
		float per=0;
		if(gender.equals("Female")) {
			if(age>=1 && age<=55) {
				per=(float) 7.52;
			}else if(age<=100){
				per =(float) 10.5;
			}
			
		}else {
			if(age>=1 && age<=55) {
				per=(float) 8.4;
			}else {
				per =(float) 9.5;
			}
			
		}
		
		return per;
	}

}
