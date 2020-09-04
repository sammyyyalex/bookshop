//subclass
public class NonFiction extends Book
{
	private double helpRating;
	private boolean isBestseller;
	private boolean aboutCelebrity;
	
	//Constructor 1: declaring minimum book requirement and every nonfiction requirement
	public NonFiction(String title, String author, double price, double helpRating, boolean isBestseller, boolean aboutCelebrity)
	{
		super(title, author, price);
		this.helpRating = helpRating;
		this.isBestseller = isBestseller;
		this.aboutCelebrity = aboutCelebrity;
	}
	
	//Constructor 2: declaring every book requirement and every nonfiction requirement
	public NonFiction(String title, String author, double price, int starRating, int hardCovers, int softCovers, int sold, double helpRating, boolean isBestseller, boolean aboutCelebrity)
	{
		super(title, author, price, starRating, hardCovers, softCovers, sold);
		this.helpRating = helpRating;
		this.isBestseller = isBestseller;
		this.aboutCelebrity = aboutCelebrity;
	}
	
	//Constructor 3: declaring only book title, author, price, star rating, and every nonfiction requirement
	public NonFiction(String title, String author, double price, int starRating, double helpRating, boolean isBestseller, boolean aboutCelebrity)
	{
		super(title, author, price, starRating);
		this.helpRating = helpRating;
		this.isBestseller = isBestseller;
		this.aboutCelebrity = aboutCelebrity;
	}
	
	//Constructor 4: declaring minimum book requirement and minimum nonfiction requirement
	public NonFiction(String title, String author, double price, double helpRating, boolean isBestseller)
	{
		super(title, author, price);
		this.helpRating = helpRating;
		this.isBestseller = isBestseller;
		aboutCelebrity = false;
	}
	
	//Constructor 5: declaring every book requirement and minimum nonfiction requirement
	public NonFiction(String title, String author, double price, int starRating, int hardCovers, int softCovers, int sold, double helpRating, boolean isBestseller)
	{
		super(title, author, price, starRating, hardCovers, softCovers, sold);
		this.helpRating = helpRating;
		this.isBestseller = isBestseller;
		aboutCelebrity = false;
	}
	
	//Constructor 6: declaring only book title, author, price, star rating, and minimum nonfiction requirement
	public NonFiction(String title, String author, double price, int starRating, double helpRating, boolean isBestseller)
	{
		super(title, author, price, starRating);
		this.helpRating = helpRating;
		this.isBestseller = isBestseller;
		aboutCelebrity = false;
	}
	
	//Setters
	//sets helpfulness rating
	public void setHelpRating(double rating)
	{
		helpRating = rating;
	}
	
	//sets if it is a bestseller
	public void setIsBestSeller(boolean bestseller)
	{
		isBestseller = bestseller;
	}
	
	//sets if it is about a celebrity
	public void setAboutCelebrity(boolean celebrity)
	{
		aboutCelebrity = celebrity;
	}
	
	//Getters
	//returns helpfulness rating
	public double getHelp() //we are NOT doing get help
	{
		return helpRating;
	}
	
	//returns if it is a bestseller
	public boolean getIsBestseller()
	{
		return isBestseller;
	}
	
	//returns if it is about a celebrity
	public boolean getAboutCelebrity()
	{
		return aboutCelebrity;
	}
	
	//extra functions
	//returns tagline
	public String toString()
	{
		if (helpRating > 5 && isBestseller)
		{
			String str =  "\nThe book \"" + getTitle() + "\" was written by " + getAuthor() + ". \nThe price is " + getPrice() + " and is rated at " + getStarRating() + " stars. "
		    		+ "\nWe have " + getHardCovers() + " hard covers and " + getSoftCovers() + " soft covers available. \n" + getSold() + " copies have already been sold."
		    				+ "\nThe back of the book has this quote printed: \"You must read this book!\n";	
			return str;
		}
		else
		{
			String str =  "\nThe book \"" + getTitle() + "\" was written by " + getAuthor() + ". \nThe price is " + getPrice() + " and is rated at " + getStarRating() + " stars. "
		    		+ "\nWe have " + getHardCovers() + " hard covers and " + getSoftCovers() + " soft covers available. \n" + getSold() + " copies have already been sold."
		    				+ "\nThe back of the book has this quote printed: \"Worth the read!\n";	
			return str;			
		}  
	}
}