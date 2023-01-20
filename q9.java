package Assignment3;

import java.util.Scanner;
import java.util.*;
public class Question9 {

	public static void main(String[] args) {
//		Given an array of integers, find and print all the leaders of the array. A leader is defined as an element of the array which is greater than all the elements following it. The rightmost element is always a leader.
//		For example:
//		In the array {8, 7, 4, 3, 5, 2}, leaders are 8, 7, 5 and 2.
//		Explanation:
//
//		8 > 7, 8 > 4, 8 > 3, 8 > 5, 8 > 2.
//		7 > 4, 7 > 3, 7 > 5, 7 > 2.
//		5 > 2.
//		2 is the rightmost element
		
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int []arr=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Element "+(i+1));
			arr[i]=obj.nextInt(); 
		}
		 Vector<Integer> v1= new Vector<>();
		 v1.add(arr[n-1]);
			for(int i=n-1;i>0;i--) {
			    if(arr[i-1]>arr[i]) {
			    	v1.add(arr[i-1]);
			    }
			}
			
				System.out.println(v1);
			
		

	}

}
