package array;

import java.util.Arrays;

public class MissingElements {
	public static void main(String[] args) {
		 int[] arr= {1,2,3,4,7,6,8};  
			Arrays.sort(arr);
			int length=arr.length;
			System.out.println(length);
			for (int i = 0; i <= arr.length; i++) { 
				if (i!=arr[i+1]) { 
					System.out.println(i);	
					
					}
				}
			}
	}




