package problems;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 11, 4, 23, 34,4,4,34 };
		int n = arr.length;

		Sort.sort(arr, 0, n-1);
		printArray(arr,arr.length);
		int length=removeDuplicat(arr,n-1);
		System.out.println(length);
		printArray(arr,length+1);
		
	}
	
	
	static void printArray(int[] arr,int size) {
		//int size = arr.length;
		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	public static int removeDuplicat(int[] arr, int len)
	{
		int[] temp = new int[len+1];
		int k=0;
		for(int i=0;i<len;i++)
		{
			if(arr[i]!=arr[i+1]) {
				temp[k]=arr[i];
				k=k+1;
				
			}
		}
		temp[k]=arr[len];
		
		for(int i=0;i<=k;i++) {
			arr[i]=temp[i];
		}
		
		return k;
	}
	

}
