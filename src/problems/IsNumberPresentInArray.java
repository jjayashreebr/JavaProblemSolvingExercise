package problems;

import java.util.Arrays;

public class IsNumberPresentInArray {

	public static void main(String[] args) {
		int arr[] = { 11, 23, 45, 65, 4, -987, 789999 };
		int number = 65;
		System.out.println("The index of number " + number + " in array is " + isNumberPresentInArray(arr, number));

	}

	private static int isNumberPresentInArray(int[] arr,int number) {
		System.out.println("hello");
		if(arr==null) {
			return -1;
		}
		
		int start=0;
		int end =arr.length-1;
		
		if(end<=0) {
			if(arr[0]==number) {
				return 0;
			}else {
				return -1;
			}
		}
		
		int index=-1;
		Arrays.sort(arr);
		
		if(number<arr[start] || number>arr[end]) {
			return -1;
		}
		
		int middle =0;
		
		while(start<=end) {
			 middle =start+((end-start)/2);
			if(number==arr[middle]) {
				return middle;
			}else if(number<arr[middle]) {
				end=middle-1;
				
			} else {
				start=middle+1;
			
			}
		}
		return index;
	}

}
