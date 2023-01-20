//package Assignment3;
//
//import java.util.Scanner;
//
//public class Question3nd4 {
//
//	public static void main(String[] args) {
//		Scanner obj=new Scanner(System.in);
//		int n=obj.nextInt();
//		int []arr=new int[n];
//		
//		for(int i=0;i<n;i++) {
//			System.out.println("Element "+(i+1));
//			arr[i]=obj.nextInt(); 
//		}
//		int maxxi=arr[0];
//		int minni=arr[0];
//		for(int i=0;i<n;i++) {
//			if(arr[i]>maxxi) {
//				maxxi=arr[i];
//			}
//			if(minni>arr[i]) {
//				minni=arr[i];
//			}
//		}
//     System.out.println("Maximum Element= "+maxxi);
//     System.out.println("Minimum Element= "+minni);
//     int secondmaxxi=Integer.MIN_VALUE;
//     int secondminni=Integer.MAX_VALUE;
// 	for(int i=0;i<n;i++) {
//		if(arr[i]>secondmaxxi && arr[i]!=maxxi) {
//			secondmaxxi=arr[i];
//		}
//		if(secondminni>arr[i] && arr[i]!=minni) {
//			secondminni=arr[i];
//		}
//	}
// 	 System.out.println("Second Maximum Element= "+secondmaxxi);
//     System.out.println("Second Minimum Element= "+secondminni);
//     
//	}
//
//}

package Assignment3;

import java.util.InputMismatchException;
import java.util.Scanner;
class maximumAndminimum{
	int maximum(int []arr,int n) {
		int maxxi=arr[0];
		
		for(int i=0;i<n;i++) {
			if(arr[i]>maxxi) {
				maxxi=arr[i];
			}
		}
		return maxxi;
	}
    int minimum(int arr[],int n) {
    	
		int minni=arr[0];
		for(int i=0;i<n;i++) {
		
			if(minni>arr[i]) {
				minni=arr[i];
			}
		}
		return minni;
	}
    int Secondmaximum(int arr[],int n,int maxxi) {
    	int secondmaxxi=Integer.MIN_VALUE;
     
  	for(int i=0;i<n;i++) {
 		if(arr[i]>secondmaxxi && arr[i]!=maxxi) {
 			secondmaxxi=arr[i];
 		}
 		
 	}
  	return secondmaxxi;
    }
   int Secondminimum(int []arr,int n,int minni) {
	  
     int secondminni=Integer.MAX_VALUE;
 	for(int i=0;i<n;i++) {
	
		if(secondminni>arr[i] && arr[i]!=minni) {
			secondminni=arr[i];
		}
	}
   
   return secondminni;
   }
}
public class Question3nd4 {


	public static void main(String[] args) {
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
		maximumAndminimum obj1=new maximumAndminimum();
		System.out.println(obj1.maximum(arr, n));
		System.out.println(obj1.minimum(arr, n));
		int n1=obj1.minimum(arr, n);
		int n2=obj1.maximum(arr, n);
		System.out.println(obj1.Secondminimum(arr, n, n1));
		System.out.println(obj1.Secondmaximum(arr, n, n2));

     
	}
}
