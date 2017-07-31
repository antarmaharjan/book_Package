package book_package;

//import java.util.ArrayList;
import java.util.Scanner;

public class BookDBApp {

	public static void main(String[] args) {
		/**
		 * This is a bookDatabase project which allows user to search the books by its SKU, then it displays 
		 * detail information about that book.
		 */
				
				System.out.println("Please enter the sku");
				Scanner sc=new Scanner(System.in);
				
				String sku=sc.nextLine();
				sku=sku.toUpperCase();						
				BookDB b = new BookDB();					
			    
				System.out.println(b.returnBook(sku));
										
	}

}
