package winter;

import java.util.*;

class books{
	String title;
	boolean[] flag=new boolean[15];
	
	void beingcheckedout(int i) {
		if(flag[i]==true)
			flag[i]=false;
	}
	void beingreturned(int j) {
		if(flag[j]==false)
			flag[j]=true;
		System.out.println("book is returned to library");
	}

}
class library extends books{
	books b=new books();
	String[] books=new String[10];
	int[] rate=new int[10];
	int i=0;
	
	void addbook(String title) {
		books[i++]=title;
		System.out.println("book is added to library");
	}
	void checkout(String name) {
		int j,index=0;
		for(j=0;j<i;j++) {
			if(books[j].equals(name)) {
				index=j;
				System.out.println("book is checked/issued out");
			}
			}
		beingcheckedout(index);
	}
	void library(String name) {
		int j,index=0;
		for(j=0;j<3;j++) {
			if(books[j].equals(name)) {
				index=j;
			}
			
		}
		beingreturned(index);
	}

	void listinventory() {
		int i;
		for(i=0;i<10;i++) {
			if(flag[i]==true)
				System.out.println(books[i]+" : "+flag[i]);
		}
	}
}


public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    library a=new library();
	    Arrays.fill(a.flag,true);
	    a.addbook("the jungle book");
	    a.addbook("helen keller");
	    a.addbook("the noddy");
	    int i=1;
	    while(i>0) {
	    System.out.println("\n choose desired option: \n 1.rent book \n 2.return book  \n 3.list books \n 4.add a book ");
	    System.out.println("\n 5.EXIT");
	    
	    int ch=sc.nextInt();
	    switch(ch) {
	       case 1:
               System.out.print("\nEnter title of book you want to rent: ");
               String title1= sc.nextLine();
               sc.nextLine();
               a.checkout(title1);
               break;

           case 2:
               System.out.print("\nEnter title of book you want to return: ");
               String title2= sc.nextLine();
               sc.nextLine();

               a.library(title2);

           case 3:
               a.listinventory();
               break;
           case 4:
               System.out.print("\nEnter number of books you want to add: ");
               int n = sc.nextInt();
               for(int j = 0; j < n; j++)
               {
                   System.out.print("\nEnter title of book " + (j + 1) + ": ");
                   String title= sc.nextLine();
                   sc.nextLine();
                   a.addbook(title);
                   System.out.println("book added successfully!!");
               }
               break;
           default:
               sc.close();
               return;
	    }

	    }
	}

}
