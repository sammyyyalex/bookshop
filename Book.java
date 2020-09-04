//parent class
public class Book 
{
	  private String title;
	  private String author;
	  private double price;
	  private int starRating;
	  private int hardCovers;
	  private int softCovers;
	  private int sold;

	  //default constructor
	  public Book()
	  {
		  title = "";
		  author = "";
		  price = 0.0;
		  starRating = 0;
		  hardCovers = 0;
		  softCovers = 0;
		  sold = 0;
	  }
	  
	  //Constructor 1
	  public Book (String title, String author, double price, int starRating, int hardCovers, int softCovers, int sold)
	  {
	    this.title = title;
	    this.author = author;
	    this.price = price;
	    this.starRating = starRating;
	    this.hardCovers = hardCovers;
	    this.softCovers = softCovers;
	    this.sold = sold;
	  }

	  //Constructor 2
	  public Book (String title, String author, double price, int starRating)
	  {
	    this.title = title;
	    this.author = author;
	    this.price = price;
	    this.starRating = starRating;
	    hardCovers = 0;
	    softCovers = 0;
	    sold = 0;
	  }

	  //Constructor 3
	  public Book (String title, String author, double price)
	  {
	    this.title = title;
	    this.author = author;
	    this.price = price;
	    starRating = 0;
	    hardCovers = 0;
	    softCovers = 0;
	    sold = 0;
	  }
	  
	  //Setters
	  //Sets the title
	  public void setTitle(String title)
	  {
		  this.title = title;
	  }
	  
	  //Sets the author
	  public void setAuthor(String author)
	  {
		  this.author = author;
	  }
	  
	  //sets the price
	  public void setPrice(double price)
	  {
		  this.price = price;
	  }
	  
	  //Sets the book's rating
	  public void setStarRating(int rating)
	  {
	    starRating = rating;
	  }

	  //Sets the number of hardcovers available
	  public void setHardCover(int num)
	  {
	    hardCovers = num;
	  }

	  //Sets the number of softcovers available
	  public void setSoftCover(int num)
	  {
	    softCovers = num;
	  }

	  //Getters
	  //returns the title of the book
	  public String getTitle()
	  {
	    return title;
	  }

	  //returns the author of the book
	  public String getAuthor()
	  {
	    return author;
	  }

	  //returns the price of the book
	  public double getPrice()
	  {
	    return price;
	  }

	  //returns the star rating of the book 
	  public int getStarRating()
	  {
	    return starRating;
	  }

	  //returns the number of hardcovers available
	  public int getHardCovers()
	  {
	    return hardCovers;
	  }

	  //returns the number of softcovers available
	  public int getSoftCovers()
	  {
	    return softCovers;
	  }

	  //returns the number of copies sold
	  public int getSold()
	  {
	    return sold;
	  }

	  //extra functions
	  //adds number of hardcovers available
	  public void addHardCovers(int num)
	  {
		  hardCovers += num;
	  }
	  
	  //adds number of softcovers available
	  public void addSoftCovers(int num)
	  {
		  softCovers += num;
	  }
	  
	  //adds a number of books sold
	  public void addSold(int num)
	  {
	    sold +=num;
	  }
	  
	  //subtracts a number of hardcovers available
	  public void subtractHardCovers(int num)
	  {
	    hardCovers -= num;
	  }

	  //subtracts a number of softcovers available
	  public void subtractSoftCovers(int num)
	  {
	    softCovers -= num;
	  }

	  public String toString()
	  {
	    return "\nThe book \"" + title + "\" was written by " + author + ". \nThe price is " + price + " and is rated at " + starRating + " stars. \nWe have " + hardCovers + " hard covers and " + softCovers + " soft covers available. \n" + sold + " copies have already been sold.\n\n";
	  }
}