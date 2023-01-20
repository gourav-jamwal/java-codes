package Assignment3;

import java.util.InputMismatchException;
import java.util.Scanner;
class Reverse {
	int temp;
 void ReverseMethod(int a[],int start,int end){	
	 while(start<=end) {
		 temp=a[start];
		 a[start]=a[end];
		 a[end]=temp;
		 start++;
		 end--;
	 }
 }
}
public class Question2 {

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
		int d=obj.nextInt();
		Reverse obj1=new Reverse();
		obj1.ReverseMethod(arr,0,n-1);
		obj1.ReverseMethod(arr,0,d-1);
		obj1.ReverseMethod(arr,d,n-1);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		

	}

}
