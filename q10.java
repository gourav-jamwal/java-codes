package Assignment3;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int []arr=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Element "+(i+1));
			arr[i]=obj.nextInt(); 
		}
		int Key=obj.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i]==Key) {
			System.out.print(Key+" is present at index "+i);

			}
		}

	}

}
