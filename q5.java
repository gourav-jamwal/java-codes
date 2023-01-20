//package Assignment3;
//
//import java.util.Scanner;
//
//public class Question5 {
//
//	public static void main(String[] args) {
//		
//		Scanner obj=new Scanner(System.in);
//		int n=obj.nextInt();
//		int []arr=new int[n];
//		
//		for(int i=0;i<n;i++) {
//			System.out.print("Element "+(i+1));
//			arr[i]=obj.nextInt(); 
//		}
//		int minni=Integer.MAX_VALUE;
//		for(int i=0;i<n-2;i++) {
//			if(minni>arr[i+1]-arr[i]) {
//				minni=arr[i+1]-arr[i];
//			}
//		}
//       System.out.println(minni);
//	}
//
//}

package Assignment3;

import java.util.InputMismatchException;
import java.util.Scanner;
class diff{
	int difference(int []arr,int n) {
		int minni=Integer.MAX_VALUE;
		for(int i=0;i<n-2;i++) {
			if(minni>arr[i+1]-arr[i]) {
				minni=arr[i+1]-arr[i];
			}
		}
		return minni;
	}
}
public class Question5 {

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
		diff obj1=new diff();
		
	
    
	}

}
