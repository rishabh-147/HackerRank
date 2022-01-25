package Thirty_days_of_Code_2022;
import java.util.*;
abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}

// Declare your class here. Do not use the 'public' access modifier.
    // Declare the price instance variable
   class MyBook extends Book{
	   int price;
	MyBook(String title, String author, int Price) {
		super(title, author);
		// TODO Auto-generated constructor stub
		this.price = Price;
	}
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Title: "+title + "\nAuthor: "+author+"\nPrice: "+price);
	}
	   
	   
   }
    /**   
    *   Class Constructor
    *   
    *   @param title The book's title.
    *   @param author The book's author.
    *   @param price The book's price.
    **/
    // Write your constructor here
    
    /**   
    *   Method Name: display
    *   
    *   Print the title, author, and price in the specified format.
    **/
    // Write your method here
    
// End class

public class day_13 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}

/*
Alchemist
Paulo Cohelo
230
Title: Alchemist
Author: Paulo Cohelo
Price: 230
*/