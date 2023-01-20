//package Assignment3;
//
//import java.util.Scanner;
//
//public class Question1 {
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
//		int countOne=0;
//		int countZero=0;
//		for(int i=0;i<n;i++) {
//			if(arr[i]==1) {
//				countOne++;
//			}
//			else {
//				countZero++;
//			}
//		}
//		for(int i=0;i<countZero;i++) {
//			System.out.print("0"+" ");
//		}
//		for(int i=0;i<countOne;i++) {
//			System.out.print("1"+" ");
//		}
//
//	}
//
//}


// Using classes and methods
package Assignment3;
import java.util.*;
import java.util.Scanner;
class Segregate{
	void SegregateZeroAndOne(int []arr,int n){
		int countOne=0;
		int countZero=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==1) {
				countOne++;
			}
			else {
				countZero++;
			}
		}
		for(int i=0;i<countZero;i++) {
			System.out.print("0"+" ");
		}
		for(int i=0;i<countOne;i++) {
			System.out.print("1"+" ");
		}
	}
}
public class Question1 {

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
		Segregate obj1=new Segregate();
		obj1.SegregateZeroAndOne(arr,n);
	

	}

}
