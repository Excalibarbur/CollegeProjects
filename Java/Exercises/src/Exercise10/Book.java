package Exercise10;

public class Book
{
	private String title;
	private String author;
	private double price;
	private int numPages;
	
	public Book()
	{
		this.title = "Unknown";
		this.author = "Unknown";
		this.price = 0.0;
		this.numPages = 0;
	}
	
	public Book(String title, String author, double price, int numPages)
	{
		this.title = title;
		this.author = author;
		this.price = price;
		this.numPages = numPages;
	}
	
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	
	public void setAuthor(String author)
	{
		this.author = author;
	}
	
	public String getAuthor()
	{
		return this.author;
	}
	
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	
	public void setNumPages(int numPages)
	{
		this.numPages = numPages;
	}
	
	public int getNumPages()
	{
		return this.numPages;
	}
	
	
	public String toString()
	{
		return String.format("Title: %s\nAuthor: %s\nPrice: %.1f₪\nNumber Of Pages: %d", this.title, this.author, this.price, this.numPages);
	}
	
}
