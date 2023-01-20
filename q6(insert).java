package Assignment3;
import java.util.Scanner;
class InsertionArray{

	void Array(int n){
		
	Scanner obj=new Scanner(System.in);
	int[] a=new int[50];
	int i=0;
	
	for(i=0;i<n;i++) {
		System.out.println("Element "+(i+1));
		
				 a[i]=obj.nextInt(); 
	}
	System.out.println("Enter the position where you want to enter");
	int pos=obj.nextInt();
	System.out.println("Enter the element you want to insert");
	int insert=obj.nextInt();
	if(pos>n) {
		System.out.println("Invalid Size");
	}
	else {
    /*for(i=n;i>=pos;i--) {
		a[i]=a[i-1];
		
	}*/
		//a[pos-1]=insert;
		//Second Approach
		for(i=pos;i<=n;i++) {
			
			a[i]=a[i-1];  
			//System.out.println("Hello");
		}
		a[pos-1]=insert;
	
	for(i=0;i<n+1;i++) {
		System.out.println(a[i]);
		
	}
	}
	}
}
public class Question6Insertion {

	public static void main(String[] args) {
		System.out.println("Enter n");
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		InsertionArray obj1=new InsertionArray();
        obj1.Array(n);
	}

}
