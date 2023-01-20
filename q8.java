//Missing number
//package Assignment3;
//
//import java.util.Scanner;
//
//public class Question8 {
//
//	public static void main(String[] args) {
////		Input: arr[] = {1, 2, 4, 6, 3, 7, 8}, N = 8
////				Output: 5
//		Scanner obj=new Scanner(System.in);
//		int n=obj.nextInt();
//		int []arr=new int[n];
//		
//		for(int i=0;i<n;i++) {
//			System.out.println("Element "+(i+1));
//			arr[i]=obj.nextInt(); 
//		}
//		int sum=0;
//		int Total_sum=(n+1)*(n+1+1)/2;
//		for(int i=0;i<n;i++) {
//			sum+=arr[i];
//		}
//        int res=Total_sum-sum;
//		System.out.println(res);
//	}
//
//}


package Assignment3;

import java.util.InputMismatchException;
import java.util.Scanner;
class missingNum{
	int missingNumber(int []arr,int n) {
		int sum=0;
		int Total_sum=(n+1)*(n+1+1)/2;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
        int res=Total_sum-sum;
		return res;
	}
}
public class Question8 {

	public static void main(String[] args) {
//		Input: arr[] = {1, 2, 4, 6, 3, 7, 8}, N = 8
//				Output: 5
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
		missingNum obj1=new missingNum();
		int res=obj1.missingNumber(arr, n);
		System.out.println(res);
		
	}

}
