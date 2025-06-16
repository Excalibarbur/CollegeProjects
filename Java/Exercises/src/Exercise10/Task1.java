package Exercise10;
import java.util.Scanner;

public class Task1 
{

	public static void main(String[] args)
	{
		Book b1 = new Book("Java Software Solutions: Foundations of Program Design", "John Lewis and William Loftus", 500, 792);
		Book b2 = new Book("Clean Code", "John Lewis and William Loftus", 500, 792);
		Book b3 = new Book("Agile Software Development", "John Lewis and William Loftus", 500, 800);

		BookStore store = new BookStore("The Wandering Book");
		store.addBook(b1, 5, b1.getPrice() * 5);
		store.addBook(b2, 5, b2.getPrice() * 5);
		store.addBook(b3, 5, b3.getPrice() * 5);
		
		for(int i = 0; i < store.getSize(); i++)
		{
			System.out.println(store.getBook()[i].toString() + "\n");
		}
		
		System.out.println(store.toString());
		
		System.out.printf("Earnings: %.2f\n", store.getEarnings());
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter book name that you want to buy: ");
		String name = scan.nextLine();
		
		System.out.print("Enter quantity of this book: ");
		int quantity = scan.nextInt();
		
		store.sellBook(name, quantity);
		
		System.out.printf("Earnings: %.2f\n\n", store.getEarnings());
		
		int maxPagesIndex = 0;
		for(int i = 0; i < store.getSize(); i++)
		{
			Book book = store.getBook()[i];
			if(book.getNumPages() > store.getBook()[maxPagesIndex].getNumPages())
				maxPagesIndex = i;
		}
		System.out.printf("The book with most pages is: %s\n", store.getBook()[maxPagesIndex].getTitle());
		
	}

}
