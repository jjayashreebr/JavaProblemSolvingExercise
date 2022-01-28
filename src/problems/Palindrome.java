package problems;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner myStr = new Scanner(System.in);
		System.out.println("Enter string");
		String input = myStr.next();
		System.out.println(input+" is palindrome?"+isPalindrome(input));

	}

	private static boolean isPalindrome(String input) {
		if(input==null) {
			return false;
		}
	    char[] ch = input.toCharArray();
	    int len =ch.length;
	    if(len<=1) {
	    	return false;
	    }
	    boolean flag=true;
	    int i=0;
	    int j=len-1;
	    while(i<j) {
	    	if(ch[i]==ch[j]) {
	    		i=i+1;
	    		j=j-1;
	    	}else {
	    		flag=false;
	    		break;
	    	}
	    }
		return flag;
	}

}
