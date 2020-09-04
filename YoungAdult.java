//subclass
public class YoungAdult extends Book
{
	private boolean hasRomance;
	private boolean isDystopian;
	private int readingLevel;
	
	//Constructor 1: declaring minimum book requirement and every young adult requirement
	public YoungAdult(String title, String author, double price, boolean hasRomance, boolean isDystopian, int readingLevel)
	{
		super(title, author, price);
		this.hasRomance = hasRomance;
		this.isDystopian = isDystopian;
		this.readingLevel = readingLevel;
	}
	
	//Constructor 2: declaring every book requirement and every young adult requirement
	public YoungAdult(String title, String author, double price, int starRating, int hardCovers, int softCovers, int sold, boolean hasRomance, boolean isDystopian, int readingLevel)
	{
		super(title, author, price, starRating, hardCovers, softCovers, sold);
		this.hasRomance = hasRomance;
		this.isDystopian = isDystopian;
		this.readingLevel = readingLevel;
	}
	
	//Constructor 3: declaring only book title, author, price, star rating, and every young adult requirement
	public YoungAdult(String title, String author, double price, int starRating, boolean hasRomance, boolean isDystopian, int readingLevel)
	{
		super(title, author, price, starRating);
		this.hasRomance = hasRomance;
		this.isDystopian = isDystopian;
		this.readingLevel = readingLevel;
	}
	
	//Constructor 4: declaring minimum book requirement and minimum young adult requirement
	public YoungAdult(String title, String author, double price, boolean hasRomance, int readingLevel)
	{
		super(title, author, price);
		this.hasRomance = hasRomance;
		isDystopian = false;
		this.readingLevel = readingLevel;
	}
	
	//Constructor 5: declaring every book requirement and minimum young adult requirement
	public YoungAdult(String title, String author, double price, int starRating, int hardCovers, int softCovers, int sold, boolean hasRomance, int readingLevel)
	{
		super(title, author, price, starRating, hardCovers, softCovers, sold);
		this.hasRomance= hasRomance;
		isDystopian = false;
		this.readingLevel = readingLevel;
	}
	
	//Constructor 6: declaring only book title, author, price, star rating, and minimum young adult requirement
	public YoungAdult(String title, String author, double price, int starRating, boolean hasRomance, int readingLevel)
	{
		super(title, author, price, starRating);
		this.hasRomance = hasRomance;
		isDystopian = false;
		this.readingLevel = readingLevel;
	}
	
	//Setters	
	//sets if it has romance
	public void setHasRomance(boolean romance)
	{
		hasRomance = romance;
	}
	
	//sets if it is dystopian
	public void setIsDystopian(boolean dystopian)
	{
		isDystopian = dystopian;
	}
	
	//sets the reading level
	public void setReadingLevel(int level)
	{
		readingLevel = level;
	}
	
	//Getters	
	//returns if it has romance
	public boolean getRomance()
	{
		return hasRomance;
	}

	//returns if it is dystopian
	public boolean getDystopian()
	{
		return isDystopian;
	}
	
	//returns reading level
	public int getReadingLevel()
	{
		return readingLevel;
	}
	
	//extra functions
	//returns recommendation
	public String toString()
	{
		if (hasRomance && readingLevel > 12)
		{
			String str =  "\nThe book \"" + getTitle() + "\" was written by " + getAuthor() + ". \nThe price is " + getPrice() + " and is rated at " + getStarRating() + " stars. "
		    		+ "\nWe have " + getHardCovers() + " hard covers and " + getSoftCovers() + " soft covers available. \n" + getSold() + " copies have already been sold."
		    				+ "\nRecommended for the hopeless romantic!\n";	
			return str;
		}
		else
		{
			String str =  "\nThe book \"" + getTitle() + "\" was written by " + getAuthor() + ". \nThe price is " + getPrice() + " and is rated at " + getStarRating() + " stars. "
		    		+ "\nWe have " + getHardCovers() + " hard covers and " + getSoftCovers() + " soft covers available. \n" + getSold() + " copies have already been sold."
		    				+ "\nRecommended for the blossoming reader.\n";	
			return str;			
		}  
	}
}