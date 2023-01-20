package Assignment3;
import java.util.Scanner;
import java.util.Scanner.*;
class DeletionArray{
	void Array(int n){
		
		Scanner obj=new Scanner(System.in);
		int a[]=new int[50];
		for(int i=0;i<n;i++) {
			System.out.println("Element "+(i+1));
			 a[i]=obj.nextInt(); 
		}
		System.out.println("Enter the Position you want to delete");
		int pos=obj.nextInt();
		
		for(int i=pos;i<=n;i++) {
			a[i-1]=a[i];
		}
		for(int i=0;i<n-1;i++) {
			System.out.println(a[i]);
		}
		
	}
	
	
}
public class Question6Deletion {

	public static void main(String[] args) {
	System.out.println("Enter n");
	Scanner obj=new Scanner(System.in);
	int n=obj.nextInt();
	DeletionArray obj1=new DeletionArray();
	obj1.Array(n);
	

	}

}
