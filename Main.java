//Samantha Paradero
//tester class
import java.util.Scanner;
import java.util.ArrayList;
class Main 
{
	
  public static void main(String[] args) 
  {
    System.out.println();
    Scanner scan = new Scanner(System.in);
    ArrayList <Book> books = new ArrayList <Book>();
    ArrayList <Fiction> fic = new ArrayList <Fiction>();
    ArrayList <YoungAdult> ya = new ArrayList <YoungAdult>();
    ArrayList <NonFiction> nonfic = new ArrayList <NonFiction>();
    
    System.out.println("Welcome to Winter's Bookshop!");
    boolean userContinues = true;

    //the program continues to run until user chooses to exit
    while (userContinues)
    {
      //prompts the user and saves the decision
      int userChoice1 = actionCue();
      
      //user wants to create a book
      if (userChoice1 == 1)
      {
        System.out.println("Do you know the genre of the book you would like to create? The genres are fiction, young adult, and nonfiction.");
        int userChoice2 = choice();
        //creates a book that you know the genre of
        if (userChoice2 == 1)
        {
        	System.out.println("Is the genre fiction?");
        	int userChoice3 = choice();
        	//creates a fiction book
        	if (userChoice3 == 1)
        	{
        		Fiction book = inputFiction();
        		fic.add(book);
        		books.add(book);
        	}
        	else
        	{
        		System.out.println("Is the genre young adult?");
        		int userChoice4 = choice();
        		//creates a young adult book
        		if (userChoice4 == 1)
        		{
        			YoungAdult book = inputYoungAdult();
        			ya.add(book);
        			books.add(book);
        		}
        		//creates a nonfiction book
        		else
        		{
        			NonFiction book = inputNonFiction();
        			nonfic.add(book);
        			books.add(book);
        		}
        	}
        }
        //creates a book that you dont know the genre of
        else
        {
        	books.add(inputBook());
        }
        System.out.println("The book was created!");
      }
      
      //user wants to see the books in the system
      else if (userChoice1 == 2)
      {
    	if(books.isEmpty())
    	{
    		System.out.println("There are currently no books in the system. Please create a book first.");
    	}
    	else
    	{
    		System.out.println(books);
    	}
      }
      
      //user wants to edit a book's book-specific properties
      else if (userChoice1 == 3)
      {
        if(books.isEmpty())
        {
          System.out.println("Not valid. Please create a book first.");
        }
        else
        {
          //MUST HAVE CORRECT CAPITALIZATION
          scan.nextLine();
          System.out.println("What is the title of the book you want to edit?");
          String title = scan.nextLine();
          scan.nextLine();
          System.out.println("Who is the author of the book you want to edit?");
          String author = scan.nextLine();
          int index = 0;
        
          //assumes that the title entered is a valid title, if not will return the first book
          //iteratates through ArrayList and finds the index of the book the user wants to access
          for (int i = 0; i < books.size(); i++)
          {
            if (books.get(i).getTitle().equals(title) && books.get(i).getAuthor().equals(author))
            {
              index = i;
              break;
            }
          }
        
          //assumes that the response is a valid int
          System.out.println("What do you want to edit about the book?");
          System.out.println();
          System.out.println("If you want to edit the star rating, input 1.");
          System.out.println("If you want to edit the number of hardcovers available, input 2.");
          System.out.println("If you want to edit the number of softcovers available, input 3.");
          System.out.println("If you want to edit the number of copies sold, input 4.");
          System.out.println("If you want to edit the title, input 5.");
          System.out.println("If you want to edit the author, input 6.");
          System.out.println("If you want to edit the price, input 7.");
          int x = scan.nextInt(); 

          //user wants to change the star rating
          if (x == 1)
          {
            System.out.println("What positive integer do you want to change the star rating to?");
            int star = scan.nextInt();
            books.get(index).setStarRating(star);
            System.out.println();
            System.out.println("Star rating changed! " + books.get(index).getTitle() + " now has a rating of " + books.get(index).getStarRating());
          }

          //user wants to edit the number of hardcovers available
          else if (x == 2)
          {
            System.out.println();
            System.out.println("Do you want to set the number of hardcovers available or subtract or add from the number of hardcovers available?\nIf you subtract, it is assumed that copies have been sold. If you set, you should only increase the number of copies available.");
            System.out.println("Input 1 to set, and 2 to subtract or add.");
            int y = scan.nextInt();

            if (y == 1)
            {
              System.out.println("What do you want to set the number of hardcovers to?");
              int z = scan.nextInt();
              books.get(index).setHardCover(z); 
            }
            else
            {
            	System.out.println("Do you want to add to the number of hardcovers available?");
                if (choice() == 1) 
                {
              	  System.out.println("How many hardcovers do you want to add?");
              	  int z  = scan.nextInt();
              	  books.get(index).addHardCovers(z);
                }
                else
                {
              	  System.out.println("How many hardcovers do you want to subtract?");
              	  int z  = scan.nextInt();
              	  books.get(index).subtractHardCovers(z);
                }
            }
            System.out.println();
            System.out.println("Number of hardcovers has been changed! " + books.get(index).getTitle() + " now has " + books.get(index).getHardCovers() + " hardcovers available.");              
          }

          //user wants to edit the number of softcovers available
          else if (x == 3)
          {
            System.out.println();
            System.out.println("Do you want to set the number of softcovers available or subtract or add from the number of softcovers available?\nIf you subtract, it is assumed that copies have been sold. If you set, you should only increase the number of copies available.");
            System.out.println("Input 1 to set, and 2 to subtract or add.");
            int y = scan.nextInt();

            if (y == 1)
            {
              System.out.println("What do you want to set the number of softcovers to?");
              int z = scan.nextInt();
              books.get(index).setSoftCover(z); 
            }
            else
            {
              System.out.println("Do you want to add to the number of softcovers available?");
              if (choice() == 1) 
              {
            	  System.out.println("How many softcovers do you want to add?");
            	  int z  = scan.nextInt();
            	  books.get(index).addSoftCovers(z);
              }
              else
              {
            	  System.out.println("How many softcovers do you want to subtract?");
            	  int z  = scan.nextInt();
            	  books.get(index).subtractSoftCovers(z);
              }
            }
            System.out.println();
            System.out.println("Number of softcovers has been changed! " + books.get(index).getTitle() + " now has " + books.get(index).getSoftCovers() + " softcovers available.");              
          }

          //user wants to edit the number of copies sold
          else if (x == 4)
          {
            System.out.println("How many hardcover copies were sold? Please enter an integer.");
            int z = scan.nextInt();
            books.get(index).subtractHardCovers(z);
            System.out.println("How many softcover copies were sold? Please enter an integer.");
            int a = scan.nextInt();
            books.get(index).subtractSoftCovers(a);
              
            books.get(index).addSold(z + a); 
     
            System.out.println();
            System.out.println("Number of copies sold has been changed! " + books.get(index).getTitle() + " now has " + books.get(index).getSold() + " copies sold.");
          }
          
          //user wants to edit the title
          else if (x == 5)
          {
        	  scan.nextLine();
        	  System.out.println("What is the new title of the book?");
        	  String title1 = scan.nextLine();
        	  books.get(index).setTitle(title1);
        	  
        	  System.out.println();
        	  System.out.println("The title has been changed! The book is now titled " + books.get(index).getTitle());
          }
          
          //user wants to edit the author
          else if (x == 6)
          {
        	  scan.nextLine();
        	  System.out.println("Who is the new author of the book?");
        	  String author1 = scan.nextLine();
        	  books.get(index).setAuthor(author1);
        	  
        	  System.out.println();
        	  System.out.println("The author has been changed! " + books.get(index).getTitle() + " now has the author " + books.get(index).getAuthor());       	  
          }
          
          //user wants to edit the price
          else
          {
        	  System.out.println("What is the new price of the book? Exclude the dollar sign.");
        	  double price1 = scan.nextDouble();
        	  books.get(index).setPrice(price1);
        	  
        	  System.out.println();
        	  System.out.println("The price has been changed! " + books.get(index).getTitle() + " now has a price of " + books.get(index).getPrice());
          }
        }
      }

      //user wants to exit
      else if (userChoice1 == 4)
      {
        userContinues = false;
      }
      
      //user wants to browse books by genre
      else if (userChoice1 == 5)
      {
    	  if (books.isEmpty())
    	  {
    		  System.out.println("Not valid. Please create a book first.");
    	  }
    	  else
    	  {
    		  //assumes that user inputs valid answer
        	  System.out.println("What genre do you want to browse? Input 1 for fiction, 2 for young adult, or 3 for nonfiction.");
        	  int genre = scan.nextInt();
        	  if (genre == 1 && !fic.isEmpty())
        	  {
        		  System.out.println(fic);
        	  }
        	  else if (genre == 2 && !ya.isEmpty())
        	  {
        		  System.out.println(ya);
        	  }
        	  else if (genre == 3 && !nonfic.isEmpty())
        	  {
        		  System.out.println(nonfic);
        	  }
        	  else
        	  {
        		  System.out.println("Not valid. Please create a book of that genre first.");
        	  }    		  
    	  }
      }
      
      //user wants to edit a fiction book's subgenre, page count, or year published
      else if (userChoice1 == 6)
      {
    	  if(fic.isEmpty())
          {
            System.out.println("Not valid. Please create a fiction book first.");
          }
          else
          {
            //MUST HAVE CORRECT CAPITALIZATION
            scan.nextLine();
            System.out.println("What is the title of the fiction book you want to edit?");
            String title = scan.nextLine();
            int index = 0;
          
            //assumes that the title entered is a valid title, if not will return the first book
            //iteratates through ArrayList and finds the index of the book the user wants to access
            for (int i = 0; i < fic.size(); i++)
            {
              if (fic.get(i).getTitle().equals(title))
              {
                index = i;
                break;
              }
            }
            //assumes that the response is a valid int
            System.out.println("What do you want to edit about the fiction book?");
            System.out.println();
            System.out.println("If you want to edit the subgenre, input 1.");
            System.out.println("If you want to edit the page count, input 2.");
            System.out.println("If you want to edit the year published, input 3.");
            int x = scan.nextInt();            
            
            //edit subgenre of a fiction book
            if (x == 1)
            {
            	scan.nextLine();
            	System.out.println("What is the new subgenre of the book?");
            	String subgenre = scan.nextLine();
            	fic.get(index).setSubgenre(subgenre);
            	System.out.println("Subgenre has been changed! The subgenre of " + fic.get(index).getTitle() + " is now " + fic.get(index).getSubgenre() + "!");
            }
            
            //edit page count
            else if (x == 2)
            {
            	System.out.println("What is the new page count of the book?");
            	int pageCount = scan.nextInt();
            	fic.get(index).setPageCount(pageCount);
            	System.out.println("Page count has been changed! The page count of " + fic.get(index).getTitle() + " is now " + fic.get(index).getPageCount() + "!");
            }
            
            //edit the year published
            else
            {
            	System.out.println("What is the new year published?");
            	int year = scan.nextInt();
            	fic.get(index).setYearPublished(year);
            	System.out.println("The year has been changed! " + fic.get(index).getTitle() + " now has " + fic.get(index).getYearPublished() + " listed as the year published!");
            } 
          }
      //closing the edit fiction book option
      }
      
      // user wants to edit a young adult books' reading level, whether or not it has romance, or whether or not it is dystopian
      else if (userChoice1 == 7)
      {
    	  if(ya.isEmpty())
          {
            System.out.println("Not valid. Please create a young adult book first.");
          }
          else
          {
            //MUST HAVE CORRECT CAPITALIZATION
            scan.nextLine();
            System.out.println("What is the title of the young adult book you want to edit?");
            String title = scan.nextLine();
            int index = 0;
          
            //assumes that the title entered is a valid title, if not will return the first book
            //iterates through ArrayList and finds the index of the book the user wants to access
            for (int i = 0; i < ya.size(); i++)
            {
              if (ya.get(i).getTitle().equals(title))
              {
                index = i;
                break;
              }
            }
            //assumes that the response is a valid int
            System.out.println("What do you want to edit about the young adult book?");
            System.out.println();
            System.out.println("If you want to edit the reading level, input 1.");
            System.out.println("If you want to edit whether or not it has romance, input 2.");
            System.out.println("If you want to edit whether or not it is dystopian, input 3.");
            System.out.println();
            int x = scan.nextInt();            
            
            //edit reading level of a young adult book
            if (x == 1)
            {
            	System.out.println("What is the new reading level of the book? Input the youngest age. (Ex: Reading Level listed is 12+, the user would input 12)");
            	int level = scan.nextInt();
            	ya.get(index).setReadingLevel(level);
            	System.out.println("Reading level has been changed! " + ya.get(index).getTitle() + " now has a reading level of " + ya.get(index).getReadingLevel() + "+");
            }
            
            //edit if it has romance
            else if (x == 2)
            {
            	System.out.println("Does the book have romance?");
            	boolean romance;
            	if (choice() == 1)
            	{
            		romance = true;
            	}
            	else
            	{
            		romance = false;
            	}
            	ya.get(index).setHasRomance(romance);
            	if (romance)
            	{
            		System.out.println( ya.get(index).getTitle() + " is now recorded to have romance!");
            	}
            	else
            	{
            		System.out.println( ya.get(index).getTitle() + " is now recorded to not have romance!");
            	}
            }
            
            //edit if it is dystopian
            else
            {
            	System.out.println("Is the book dystopian");
            	boolean dystopian;
            	if (choice() == 1)
            	{
            		dystopian = true;
            	}
            	else
            	{
            		dystopian = false;
            	}
            	ya.get(index).setIsDystopian(dystopian);
            	if (dystopian)
            	{
            		System.out.println( ya.get(index).getTitle() + " is now recorded to be dystopian!");
            	}
            	else
            	{
            		System.out.println( ya.get(index).getTitle() + " is now recorded to not be dystopian!");
            	}
            } 
          }
      //closing bracket of the edit young adult book option    	  
      }
      
      //edit a nonfiction book's helpfulness rating, whether or not it is a bestseller, or whether or not it is about a celebrity
      else if (userChoice1 == 8)
      {
    	  if(nonfic.isEmpty())
          {
            System.out.println("Not valid. Please create a nonfiction book first.");
          }
          else
          {
            //MUST HAVE CORRECT CAPITALIZATION
            scan.nextLine();
            System.out.println("What is the title of the nonfiction book you want to edit?");
            String title = scan.nextLine();
            int index = 0;
          
            //assumes that the title entered is a valid title, if not will return the first book
            //iterates through ArrayList and finds the index of the book the user wants to access
            for (int i = 0; i < nonfic.size(); i++)
            {
              if (nonfic.get(i).getTitle().equals(title))
              {
                index = i;
                break;
              }
            }
            //assumes that the response is a valid int
            System.out.println("What do you want to edit about the nonfiction book?");
            System.out.println();
            System.out.println("If you want to edit the helpfulness rating, input 1.");
            System.out.println("If you want to edit whether or not it is a bestseller, input 2.");
            System.out.println("If you want to edit whether or not it is about a celebrity, input 3.");
            System.out.println();
            int x = scan.nextInt();            
            
            //edit helpfulness rating of a nonfiction book
            if (x == 1)
            {
            	System.out.println("What is the new helpfulness rating of the book? You may enter a double.");
            	double rating = scan.nextInt();
            	nonfic.get(index).setHelpRating(rating);
            	System.out.println("Helpfulness rating has been changed! " + nonfic.get(index).getTitle() + " now has a helpfulness rating of " + nonfic.get(index).getHelp());
            }
            
            //edit if it is a bestseller
            else if (x == 2)
            {
            	System.out.println("Is the book a bestseller?");
            	boolean best;
            	if (choice() == 1)
            	{
            		best = true;
            	}
            	else
            	{
            		best = false;
            	}
            	nonfic.get(index).setIsBestSeller(best);
            	if (best)
            	{
            		System.out.println( nonfic.get(index).getTitle() + " is now recorded as a bestseller!");
            	}
            	else
            	{
            		System.out.println( nonfic.get(index).getTitle() + " is now recorded as not being a bestseller!");
            	}
            }
            
            //edit if it is about a celebrity
            else
            {
            	System.out.println("Is the book about a celebrity?");
            	boolean celebrity;
            	if (choice() == 1)
            	{
            		celebrity = true;
            	}
            	else
            	{
            		celebrity = false;
            	}
            	nonfic.get(index).setAboutCelebrity(celebrity);
            	if (celebrity)
            	{
            		System.out.println( nonfic.get(index).getTitle() + " is now recorded to be about a celebrity!");
            	}
            	else
            	{
            		System.out.println( nonfic.get(index).getTitle() + " is now recorded to not be about a celebrity!");
            	}
            } 
          }
      //closing bracket of the edit nonfiction book option
      }
      
      //user wants to search for a book
      else
      {
    	  if(books.isEmpty())
    	  {
    		  System.out.println("Not valid. Please create a book first.");
    	  }
    	  
    	  else
    	  {
    		  ArrayList <Book> search = new ArrayList <Book>();
    		  System.out.println();
    		  System.out.println("What data do you want to use to search for your book ");
    		  System.out.println();
    		  System.out.println("Input 1 to search for a book by its title.");
    		  System.out.println("Input 2 to search for a book by its author.");
    		  System.out.println("Input 3 to search for a book by its price.");
    		  System.out.println("Input 4 to search for a book by its star rating.");
    		  System.out.println("Input 5 to search for a book by the number of hardcovers available.");
    		  System.out.println("Input 6 to search for a book by the number of softcovers available.");
    		  System.out.println("Input 7 to search for a book by the number of copies sold.");	
    		  int userChoice2 = scan.nextInt();
    		  System.out.println();
    		  
    		  //search by title
    		  if (userChoice2 == 1)
    		  {
    			//MUST HAVE CORRECT CAPITALIZATION
    	        scan.nextLine();
    	        System.out.println("What is the title of the book?");
    	        String title = scan.nextLine();
    	         
    	        //assumes that the title entered is a valid title, if not will return the first book
    	        //iterates through ArrayList and finds the index of the book the user wants to access
    	        for (int i = 0; i < books.size(); i++)
    	        {
    	        	if (books.get(i).getTitle().equals(title))
    	        	{
    	        		search.add(books.get(i));
    	        	}
    	        }
    	        System.out.println(search);
    		  }
    		  
    		  //search by author
    		  else if (userChoice2 == 2)
    		  {
    			//MUST HAVE CORRECT CAPITALIZATION
      	        scan.nextLine();
      	        System.out.println("Who is the author of the book?");
      	        String author = scan.nextLine();
      	         
      	        //assumes that the title entered is a valid title, if not will return the first book
      	        //iterates through ArrayList and finds the index of the book the user wants to access
      	        for (int i = 0; i < books.size(); i++)
      	        {
      	          if (books.get(i).getAuthor().equals(author))
     	              {
     	                search.add(books.get(i));
     	              }
      	        }
      	        System.out.println(search);    			  
    		  }
    		
    		  //search by price
    		  else if (userChoice2 == 3)
    		  {
      	        System.out.println("What is the price of the book?");
      	        double price = scan.nextDouble();
      	         
      	        //assumes that the title entered is a valid title, if not will return the first book
      	        //iterates through ArrayList and finds the index of the book the user wants to access
      	        for (int i = 0; i < books.size(); i++)
      	        {
      	          if (books.get(i).getPrice() == price)
     	              {
     	                search.add(books.get(i));
     	              }
      	        }
      	        System.out.println(search);    			  
    		  }
    		  
    		  //search by star rating
    		  else if (userChoice2 == 4)
    		  {
      	        System.out.println("What is the star rating of the book? Please enter an integer.");
      	        int rate = scan.nextInt();
      	         
      	        //assumes that the title entered is a valid title, if not will return the first book
      	        //iterates through ArrayList and finds the index of the book the user wants to access
      	        for (int i = 0; i < books.size(); i++)
      	        {
      	          if (books.get(i).getStarRating() == rate)
     	              {
     	                search.add(books.get(i));
     	              }
      	        }
      	        System.out.println(search);    			  
    		  }
    		  
    		  //search by num of hardcovers available
    		  else if (userChoice2 == 5)
    		  {
      	        System.out.println("How many hardcovers are available?");
      	        int hard = scan.nextInt();
      	         
      	        //assumes that the title entered is a valid title, if not will return the first book
      	        //iterates through ArrayList and finds the index of the book the user wants to access
      	        for (int i = 0; i < books.size(); i++)
      	        {
      	          if (books.get(i).getHardCovers() == hard)
     	              {
     	                search.add(books.get(i));
     	              }
      	        }
      	        System.out.println(search);    			  
    		  }
    		  
    		  //search by softcovers available
    		  else if (userChoice2 == 6)
    		  {
      	        System.out.println("How many softcovers are available?");
      	        int soft = scan.nextInt();
      	         
      	        //assumes that the title entered is a valid title, if not will return the first book
      	        //iterates through ArrayList and finds the index of the book the user wants to access
      	        for (int i = 0; i < books.size(); i++)
      	        {
      	          if (books.get(i).getSoftCovers() == soft)
     	              {
     	                search.add(books.get(i));
     	              }
      	        }
      	        System.out.println(search);    			  
    		  }
    		  
    		  //search by copies sold
    		  else
    		  {
      	        System.out.println("How many copies were sold?");
      	        int sold = scan.nextInt();
      	         
      	        //assumes that the title entered is a valid title, if not will return the first book
      	        //iterates through ArrayList and finds the index of the book the user wants to access
      	        for (int i = 0; i < books.size(); i++)
      	        {
      	          if (books.get(i).getSold() == sold)
     	              {
     	                search.add(books.get(i));
     	              }
      	        }
      	        System.out.println(search);    			  
    		  }
    	  //closes else  
    	  }
      //closes search
      }  
    //closing bracket of while loop
    }

    System.out.println("This concludes the program. Thanks for shopping at Winter's Bookshop!");
    return; 
  }

  //user prompt
  //assumes that the user inputs a valid int
  //assumes that the user doesn't choose 3 if they have not created a book
  public static int actionCue()
  {
    Scanner scan = new Scanner(System.in);
    System.out.println();
    System.out.println("What would you like to do?");
    System.out.println();
    System.out.println("Input 1 to create a book.");
    System.out.println("Input 2 to access all the books available.");
    System.out.println("Input 3 to edit a book's properties/number of copies sold that you did not input the genre of.");
    System.out.println("Input 4 to end the program.");
    System.out.println("Input 5 to browse books by genre.");
    System.out.println("Input 6 to edit a fiction book's subgenre, page count, or year published.");
    System.out.println("Input 7 to edit a young adult book's reading level, whether or not it has romance, or whether or not it is dystopian.");
    System.out.println("Input 8 to edit a nonfiction book's helpfulness rating, whether or not it is a bestseller, or whether or not it is about a celebrity.");
    System.out.println("Input 9 if you want to search for a book.");
    
    int x = scan.nextInt();
    System.out.println();
    return x;
  }

  //cues the user to make a choice
  public static int choice()
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Input 1 for yes, and 2 for no.");
    int x = scan.nextInt();
    System.out.println();
    return x;
  }

  //cues the user to input information to create a book object
  public static Book inputBook()
  {
	  Scanner scan = new Scanner(System.in);
	  scan.nextLine();
	  System.out.println("What is the title of the book?");
	  String title = scan.nextLine();
	  System.out.println("Who is the author of the book?");
	  String author = scan.nextLine();
	  System.out.println("What is the price of the book? Exclude the dollar sign.");
	  double price = scan.nextDouble();
	  System.out.println();
	  System.out.println("Do you know the star rating of the book?");
	  if (choice()==1)
	  {
	    System.out.println("What is the star rating of the book? Input a positive whole number.");
	    int star = scan.nextInt();
	    System.out.println();
	    System.out.println("Do you know the number of copies sold?");
	    if(choice()==1)
	    {
	      System.out.println("How many copies were sold?");
	      int sold = scan.nextInt();
	      System.out.println("How many hardcovers are available?");
	      int hard = scan.nextInt();
	      System.out.println("How many softcovers are availble?");
	      int soft = scan.nextInt();
	      Book book = new Book(title, author, price, star, hard, soft, sold);
	      return book;
	    }
	    else
	    {
	      Book book = new Book(title, author, price, star);
	      return book;
	    }
	  }
	  else
	  {
	    Book book = new Book(title, author, price);
	    return book;
	  }
  //closing inputBook() bracket
  }
  
  //cues the user to input information to create a fiction object
  public static Fiction inputFiction()
  {
	  Scanner scan = new Scanner (System.in);
	  System.out.println("How many pages does the book have?");
	  int pages = scan.nextInt();
	  System.out.println("What year was the book published?");
	  int year = scan.nextInt();
	  System.out.println("Do you know the subgenre of the book?");
	  //creates a fiction object with a subgenre
	  if (choice()==1)
	  {
		  scan.nextLine();
		  System.out.println("What is the subgenre of the book?");
		  String subgenre = scan.nextLine();
		  System.out.println("What is the title of the book?");
		  String title = scan.nextLine();
		  System.out.println("Who is the author of the book?");
		  String author = scan.nextLine();
		  System.out.println("What is the price of the book? Exclude the dollar sign.");
		  double price = scan.nextDouble();
		  System.out.println();
		  System.out.println("Do you know the star rating of the book?");
		  if (choice()==1)
		  {
		    System.out.println("What is the star rating of the book? Input a positive whole number.");
		    int star = scan.nextInt();
		    System.out.println();
		    System.out.println("Do you know the number of copies sold?");
		    if(choice()==1)
		    {
		      System.out.println("How many copies were sold?");
		      int sold = scan.nextInt();
		      System.out.println("How many hardcovers are available?");
		      int hard = scan.nextInt();
		      System.out.println("How many softcovers are availble?");
		      int soft = scan.nextInt();
		      Fiction book = new Fiction(title, author, price, star, hard, soft, sold, subgenre, pages, year);
		      return book;
		    }
		    else
		    {
		      Fiction book = new Fiction(title, author, price, star, subgenre, pages, year);
		      return book;
		    }
		  }
		  else
		  {
		    Fiction book = new Fiction(title, author, price, subgenre, pages, year);
		    return book;
		  }		  
	  }
	  //creates a fiction book without subgenre
	  else
	  {
		  scan.nextLine();
		  System.out.println("What is the title of the book?");
		  String title = scan.nextLine();
		  System.out.println("Who is the author of the book?");
		  String author = scan.nextLine();
		  System.out.println("What is the price of the book? Exclude the dollar sign.");
		  double price = scan.nextDouble();
		  System.out.println();
		  System.out.println("Do you know the star rating of the book?");
		  if (choice()==1)
		  {
		    System.out.println("What is the star rating of the book? Input a positive whole number.");
		    int star = scan.nextInt();
		    System.out.println();
		    System.out.println("Do you know the number of copies sold?");
		    if(choice()==1)
		    {
		      System.out.println("How many copies were sold?");
		      int sold = scan.nextInt();
		      System.out.println("How many hardcovers are available?");
		      int hard = scan.nextInt();
		      System.out.println("How many softcovers are availble?");
		      int soft = scan.nextInt();
		      Fiction book = new Fiction(title, author, price, star, hard, soft, sold, pages, year);
		      return book;
		    }
		    else
		    {
		      Fiction book = new Fiction(title, author, price, star, pages, year);
		      return book;
		    }
		  }
		  else
		  {
		    Fiction book = new Fiction(title, author, price, pages, year);
		    return book;
		  }
	  }
  //closing inputFiction() bracket
  }

  public static YoungAdult inputYoungAdult()
  {
	Scanner scan = new Scanner(System.in);
	System.out.println("Does the book have romance?");
	boolean hasRomance;
	if (choice() == 1) 
	{
		hasRomance = true;
	}
	else
	{
		hasRomance = false;
	}
	System.out.println("What is the reading level of the book? Input the youngest age. (Ex: Reading Level listed is 12+, the user would input 12)");
	int level = scan.nextInt();
	System.out.println();
	System.out.println("Do you know if the book is dystopian?");
	//creates a young adult book which you know if it is dystopian
	if (choice()== 1)
	{
		System.out.println("Is the book dystopian?");
		boolean isDystopian;
		if (choice() == 1) 
		{
			isDystopian = true;
		}
		else
		{
			isDystopian = false;
		}
		scan.nextLine();
		System.out.println("What is the title of the book?");
		String title = scan.nextLine();
		System.out.println("Who is the author of the book?");
		String author = scan.nextLine();
		System.out.println("What is the price of the book? Exclude the dollar sign.");
		double price = scan.nextDouble();
		System.out.println();
		System.out.println("Do you know the star rating of the book?");
		//creates a young adult book that you know if its dystopian and know the star rating of
		if (choice()==1)
		{
		  System.out.println("What is the star rating of the book? Input a positive whole number.");
		  int star = scan.nextInt();
		  System.out.println();
		  System.out.println("Do you know the number of copies sold?");
		  //creates a young adult book that you know if its dystopian and know all of the book information 
		  if(choice()==1)
		  {
		    System.out.println("How many copies were sold?");
		    int sold = scan.nextInt();
		    System.out.println("How many hardcovers are available?");
		    int hard = scan.nextInt();
		    System.out.println("How many softcovers are availble?");
		    int soft = scan.nextInt();
		    YoungAdult book = new YoungAdult(title, author, price, star, hard, soft, sold, hasRomance, isDystopian, level);
		    return book;
		  }
		  //creates a young adult book that you know if its dystopian and know the book title, author, price, and star rating
		  else
		  {
		    YoungAdult book = new YoungAdult(title, author, price, star, hasRomance, isDystopian, level);
		    return book;
		  }
		}
		//creates a young adult book that you know if its dystopian that you don't know the star rating of
		else
		{
		  YoungAdult book = new YoungAdult(title, author, price, hasRomance, isDystopian, level);
		  return book;
		}
	}
	//creates a young adult book that you don't know if its dystopian
	else
	{
		scan.nextLine();
		System.out.println("What is the title of the book?");
		String title = scan.nextLine();
		System.out.println("Who is the author of the book?");
		String author = scan.nextLine();
		System.out.println("What is the price of the book? Exclude the dollar sign.");
		double price = scan.nextDouble();
		System.out.println();
		System.out.println("Do you know the star rating of the book?");
		//creates a young adult book that you don't know if its dystopian and know the star rating of
		if (choice()==1)
		{
		  System.out.println("What is the star rating of the book? Input a positive whole number.");
		  int star = scan.nextInt();
		  System.out.println();
		  System.out.println("Do you know the number of copies sold?");
		  //creates a young adult book that you don't know if its dystopian and know all of the book information 
		  if(choice()==1)
		  {
		    System.out.println("How many copies were sold?");
		    int sold = scan.nextInt();
		    System.out.println("How many hardcovers are available?");
		    int hard = scan.nextInt();
		    System.out.println("How many softcovers are availble?");
		    int soft = scan.nextInt();
		    YoungAdult book = new YoungAdult(title, author, price, star, hard, soft, sold, hasRomance, level);
		    return book;
		  }
		  //creates a young adult book that you don't know if its dystopian and know the book title, author, price, and star rating
		  else
		  {
		    YoungAdult book = new YoungAdult(title, author, price, star, hasRomance, level);
		    return book;
		  }
		}
		//creates a young adult book that you don't know if its dystopian that you don't know the star rating of
		else
		{
		  YoungAdult book = new YoungAdult(title, author, price, hasRomance, level);
		  return book;
		}	
	}
  //closing inputYoungAdult() bracket
  }
  
  public static NonFiction inputNonFiction()
  {
	Scanner scan = new Scanner(System.in);
	System.out.println("What is the helpfulness rating?");
	double rating = scan.nextDouble();
	System.out.println("Is the book a bestseller?");
	boolean bestseller;
	if (choice() == 1)
	{
		bestseller = true;
	}
	else
	{
		bestseller = false;
	}
	System.out.println("Do you know if the book is about a celebrity?");
	//creates a Nonfiction book that we know if it is about a celebrity
	if (choice() == 1)
	{
		System.out.println("Is the book about a celebrity?");
		boolean aboutCelebrity;
		if (choice() == 1)
		{
			aboutCelebrity = true;
		}
		else
		{
			aboutCelebrity = false;
		}
		scan.nextLine();
		System.out.println("What is the title of the book?");
		String title = scan.nextLine();
		System.out.println("Who is the author of the book?");
		String author = scan.nextLine();
		System.out.println("What is the price of the book? Exclude the dollar sign.");
		double price = scan.nextDouble();
		System.out.println();
		System.out.println("Do you know the star rating of the book?");
		//creates a nonfiction book that we know if it's about a celebrity that we know the star rating of
		if (choice()==1)
		{
		  System.out.println("What is the star rating of the book? Input a positive whole number.");
		  int star = scan.nextInt();
		  System.out.println();
		  System.out.println("Do you know the number of copies sold?");
		  //creates a nonfiction book that we know if it's about a celebrity that we know all the book info of
		  if(choice()==1)
		  {
	        System.out.println("How many copies were sold?");
	        int sold = scan.nextInt();
	        System.out.println("How many hardcovers are available?");
		    int hard = scan.nextInt();
		    System.out.println("How many softcovers are availble?");
		    int soft = scan.nextInt();
		    NonFiction book = new NonFiction(title, author, price, star, hard, soft, sold, rating, bestseller, aboutCelebrity);
		    return book;
		  }
		  //creates a nonfiction book that we know if it's about a celebrity that we know the star rating of
		  else
		  {
		    NonFiction book = new NonFiction(title, author, price, star, rating, bestseller, aboutCelebrity);
		    return book;
		  }
		}
		//creates a nonfiction book that we know if it's about a celebrity that we don't know the star rating of
		else
		{
		  NonFiction book = new NonFiction(title, author, price, rating, bestseller, aboutCelebrity);
		  return book;
		}
	}
	//creates a Nonfiction book that we don't know if it is about a celebrity
	else
	{
		scan.nextLine();
		System.out.println("What is the title of the book?");
		String title = scan.nextLine();
		System.out.println("Who is the author of the book?");
		String author = scan.nextLine();
		System.out.println("What is the price of the book? Exclude the dollar sign.");
		double price = scan.nextDouble();
		System.out.println();
		System.out.println("Do you know the star rating of the book?");
		//creates a Nonfiction book that we don't know if it is about a celebrity and know the star rating of
		if (choice()==1)
		{
		  System.out.println("What is the star rating of the book? Input a positive whole number.");
		  int star = scan.nextInt();
		  System.out.println();
		  System.out.println("Do you know the number of copies sold?");
		  //creates a nonfiction book that we don't know if it about a celebrity and know all the book info of
		  if(choice()==1)
		  {
			System.out.println("How many copies were sold?");
		    int sold = scan.nextInt();
		    System.out.println("How many hardcovers are available?");
		    int hard = scan.nextInt();
		    System.out.println("How many softcovers are availble?");
		    int soft = scan.nextInt();
		    NonFiction book = new NonFiction(title, author, price, star, hard, soft, sold, rating, bestseller);
		    return book;
		  }
		  //creates a nonfiction book where we don't know if it is about a celebrity and know the title, author, price, and star rating
		  else
		  {
			NonFiction book = new NonFiction(title, author, price, star, rating, bestseller);
		    return book;
		  }
		}
		//creates a nonfiction book that we don't know if it about a celebrity and don't know the star rating of
		else
		{
		  NonFiction book = new NonFiction(title, author, price, rating, bestseller);
		  return book;
		}
	}
  //closing inputNonFiction() bracket
  }
 //closing class bracket
}