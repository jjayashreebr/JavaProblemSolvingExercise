package problems;

public class MaxMinArray {

	public static void main(String[] args) {
		int arr[] =  {11,23,45,65,4,-987,789999} ;
		System.out.println("Max of array"+max(arr));
		System.out.println("Min of array"+min(arr));
	}

	private static int min(int[] arr) {
		// TODO Auto-generated method stub
		int start=0;
		int end =arr.length-1;
		int max=Integer.MIN_VALUE;
		while(start<=end) {
			if(arr[start]>max) {
				max=arr[start];
				}
			start=start+1;
		}
		return max;
	}

	private static int max(int[] arr) {
		// TODO Auto-generated method stub
		int start=0;
		int end =arr.length-1;
		int min=Integer.MAX_VALUE;
		while(start<=end) {
			if(arr[start]<min) {
				min=arr[start];
				}
			start=start+1;
		}
		return min;
	}

}
