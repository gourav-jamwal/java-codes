//package Assignment3;
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class Question7 {
//
//	public static void main(String[] args) {
////		Given an array of integers, there we cyclically permute its elements, that is, shift each array element to the left by one index.
//		//The first value will go into the last index.
////
////		Example:
////
////		Input:    [1,2,3,4,5]
////		Output: [2,3,4,5,1]
////
////		Input:     [2,3,1,5,6]
////		Output:    [3,1,5,6,2]
//		
//		Scanner obj=new Scanner(System.in);
//		int n=obj.nextInt();
//		int []arr=new int[n];
//		
//		try {
//			for(int i=0;i<n;i++) {
//				System.out.print("Element "+(i+1));
//				arr[i]=obj.nextInt(); 
//			}
//			}
//			catch(InputMismatchException e) {
//				 System.out.println("Not an integer, please try again");
//			}
//		int temp=arr[0];
//		for(int i=0;i<n-1;i++) {
//			arr[i]=arr[i+1];
//		}
//		arr[n-1]=temp;
//		for(int i=0;i<n;i++) {
//			System.out.println(arr[i]);
//		}	
//		
//		
//		 
//
//	}
//
//}




package Assignment3;

import java.util.InputMismatchException;
import java.util.Scanner;
class Permute{
	void CyclicPermute(int []arr,int n) {
		int temp=arr[0];
		for(int i=0;i<n-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[n-1]=temp;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}	
	}
}
public class Question7 {

	public static void main(String[] args) {
//		Given an array of integers, there we cyclically permute its elements, that is, shift each array element to the left by one index.
		//The first value will go into the last index.
//
//		Example:
//
//		Input:    [1,2,3,4,5]
//		Output: [2,3,4,5,1]
//
//		Input:     [2,3,1,5,6]
//		Output:    [3,1,5,6,2]
		
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int []arr=new int[n];
		
		try {
			for(int i=0;i<n;i++) {
				System.out.print("Element "+(i+1));
				arr[i]=obj.nextInt(); 
			}
			}
			catch(InputMismatchException e) {
				 System.out.println("Not an integer, please try again");
			}
		Permute obj1=new Permute();
		obj1.CyclicPermute(arr,n);
		
	}

}
