package Exercise10;

public class BookStore
{
	private String name;
	private Book[] books;
	private int size;
	private int[] quantities;
	private double earnings;
	private double expences;
	
	public BookStore()
	{
		this.name = "Unknown";
		this.earnings = 0.0;
		this.expences = 0.0;
		
		this.books = new Book[10];
		this.quantities = new int[10];
	}
	
	public BookStore(String name)
	{
		this.name = name;
		this.books = new Book[10];
		this.quantities = new int[10];
		this.size = 0;
		this.earnings = 0.0;
		this.expences = 0.0;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public Book[] getBook()
	{
		return this.books;
	}
	
	public int[] getQuantities()
	{
		return this.quantities;
	}
	
	public int getSize()
	{
		return this.size;
	}
	
	public double getEarnings()
	{
		return this.earnings;
	}
	
	public double getExpences()
	{
		return this.expences;
	}
	
	
	
	public int isBookInStore(String title)
	{
		for(int i = 0; i < this.size; i++)
		{
			Book book = this.books[i];
			if(book.getTitle().toLowerCase().equals(title.toLowerCase()))
				return i;
		}
		return -1;
	}
	
	public String toString()
	{
		String spacer = "---------------------";
		
		String list = "";
		for(int i = 0; i < this.size; i++)
		{
			//if(this.books[i] == null)
			//	continue;
			
			list += String.format("Title: %s\nQuantity: %d\n", this.books[i].getTitle(), this.quantities[i]);
			
			if(i != this.size - 1)
				list += spacer + "\n";
		}
		
		return String.format("Store Name: %s\nTotal Unique Books: %s\n%s\n%s", this.name, this.size, spacer, list);
	}
	
	
	public void addBook(Book book, int quantity, double expense)
	{
		for(int i = 0; i < this.size; i++)
		{
			if(this.books[i].getTitle().equals(book.getTitle()))
			{
				this.quantities[i] += quantity;
				expense += expense;
				return;
			}
		}
		
		if(this.size == this.books.length)
		{
			Book[] newBookArr = new Book[this.size * 2];
			
			for(int i = 0; i < this.books.length; i++)
				newBookArr[i] = this.books[i];
			
			this.books = newBookArr;
		}
		
		
		int index = this.size++;
		this.books[index] = book;
		this.quantities[index] = quantity;
		this.expences += expense;
	}
	
	public void sellBook(String title, int copies)
	{
		if(isBookInStore(title) == -1)
		{
			System.out.println("ERROR: Book not found in store.");
			return;
		}
		
		for(int i = 0; i < this.size; i++)
		{
			Book curr = this.books[i];
			if(curr.getTitle().equals(title))
			{
				if(this.quantities[i] < copies)
				{
					System.out.println("ERROR: Book missing quantities.");
					return;
				}
				
				this.quantities[i] -= copies;
				this.earnings += curr.getPrice() * copies;
				
				return;
			}
		}
	}
	
	public double calculateProfit()
	{
		return this.earnings / this.expences;
	}
	
}
