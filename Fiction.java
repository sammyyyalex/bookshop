//subclass
public class Fiction extends Book
{
	private String subgenre;
	private int pageCount;
	private int yearPublished;
	
	//Constructor 1: declaring minimum book requirement and every fiction requirement
	public Fiction (String title, String author, double price, String subgenre, int pageCount, int yearPublished)
	{
		super(title, author, price);
		this.subgenre = subgenre;
		this.pageCount = pageCount;
		this.yearPublished = yearPublished;
	}
	
	//Constructor 2: declaring every book requirement and every fiction requirement
	public Fiction(String title, String author, double price, int starRating, int hardCovers, int softCovers, int sold, String subgenre, int pageCount, int yearPublished)
	{
		super(title, author, price, starRating, hardCovers, softCovers, sold);
		this.subgenre = subgenre;
		this.pageCount = pageCount;
		this.yearPublished = yearPublished;
	}
	
	//Constructor 3: declaring only book title, author, price, star rating, and every fiction requirement
	public Fiction(String title, String author, double price, int starRating, String subgenre, int pageCount, int yearPublished)
	{
		super(title, author, price, starRating);
		this.subgenre = subgenre;
		this.pageCount = pageCount;
		this.yearPublished = yearPublished;
	}
	
	//Constructor 4: declaring minimum book requirement and minimum fiction requirement
	public Fiction (String title, String author, double price, int pageCount, int yearPublished)
	{
		super(title, author, price);
		subgenre = "";
		this.pageCount = pageCount;
		this.yearPublished = yearPublished;
	}
	
	//Constructor 5: declaring every book requirement and minimum fiction requirement
	public Fiction(String title, String author, double price, int starRating, int hardCovers, int softCovers, int sold, int pageCount, int yearPublished)
	{
		super(title, author, price, starRating, hardCovers, softCovers, sold);
		subgenre = "";
		this.pageCount = pageCount;
		this.yearPublished = yearPublished;
	}
	
	//Constructor 6: declaring only book title, author, price, star rating, and minimum fiction requirement
	public Fiction(String title, String author, double price, int starRating, int pageCount, int yearPublished)
	{
		super(title, author, price, starRating);
		subgenre = "";
		this.pageCount = pageCount;
		this.yearPublished = yearPublished;
	}
	
	//Setters
	//sets subgenre
	public void setSubgenre(String subgenre)
	{
		this.subgenre = subgenre;
	}
	
	//sets page count
	public void setPageCount(int pages)
	{
		pageCount = pages;
	}
	
	//sets year published
	public void setYearPublished(int year)
	{
		yearPublished = year;
	}
	
	//Getters
	//returns subgenre
	public String getSubgenre()
	{
		return subgenre;
	}
	
	//returns pagecount
	public int getPageCount()
	{
		return pageCount;
	}
	
	//returns year published
	public int getYearPublished()
	{
		return yearPublished;
	}
	
	//extra functions
	//returns review
	public String toString()
	  {
		if (yearPublished > 1920 && pageCount > 500)
		{
			String str =  "\nThe book \"" + getTitle() + "\" was written by " + getAuthor() + ". \nThe price is " + getPrice() + " and is rated at " + getStarRating() + " stars. "
		    		+ "\nWe have " + getHardCovers() + " hard covers and " + getSoftCovers() + " soft covers available. \n" + getSold() + " copies have already been sold."
		    				+ "\nThe next modern classic!\n";	
			return str;
		}
		else
		{
			String str =  "\nThe book \"" + getTitle() + "\" was written by " + getAuthor() + ". \nThe price is " + getPrice() + " and is rated at " + getStarRating() + " stars. "
		    		+ "\nWe have " + getHardCovers() + " hard covers and " + getSoftCovers() + " soft covers available. \n" + getSold() + " copies have already been sold."
		    				+ "\nA great work of fiction!\n";	
			return str;			
		}  
	  }
}