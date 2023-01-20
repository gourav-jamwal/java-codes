package LibManagement;

//here book class is created to access information related to a particular book
import java.util.Scanner;


public class book {

	
	public int sNo;
	public String bookName;
	public String authorName;
	public int bookQty;
	public int bookQtyCopy;

	Scanner input = new Scanner(System.in);

	
	// To add book details
	public book()
	{
		
		System.out.println("Enter Serial No of Book:");
		this.sNo = input.nextInt();
		input.nextLine();

		System.out.println("Enter Book Name:");
		this.bookName = input.nextLine();

		System.out.println("Enter Author Name:");
		this.authorName = input.nextLine();

		System.out.println("Enter Quantity of Books:");
		this.bookQty = input.nextInt();
		bookQtyCopy = this.bookQty;
	}
}
