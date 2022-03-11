package array;

import java.util.Arrays;

public class PrintDuplicate {
	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Arrays.sort(arr);
		int length=arr.length;
		System.out.println(length);
		int count;
		for(int i=0;i<arr.length-1;i++)
		{
			count=0;
			for(int i1=i+1;i1<arr.length;i1++)
			{
				if(arr[i]==arr[i1])
				{
					count=count+1;
				}
					}
			if(count>0)
			{
				System.out.println(arr[i]);
			}
	}
	}
}
