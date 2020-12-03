import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Library 
{
	
    public static Scanner keyboardInput;

	public static void menu() throws IOException {
        keyboardInput = new Scanner(System.in);
                int choice;
                do {
                	System.out.println("\n************* MENU *************");
                    System.out.println("1. Add Members");
                    System.out.println("2. Add Books");
                    System.out.println("3. View Books");
                    System.out.println("4. Search Books");
                    System.out.println("5. Add Jornals");
                    System.out.println("6. View Jornals");
                    System.out.println("7. Search Jornals");
                    System.out.println("0. Exit System");
                    System.out.print("\nPlease choose an option from the above MAIN MENU: ");
                    choice = keyboardInput.nextInt();

                    if (choice == 1)
                    {
                    	//insert choice 1 code here?
                    }
                    else if (choice == 2) 
                    {
                    	//insert choice 2 code here?
                    } 
                    else if (choice == 3) 
                    {
                    	//insert choice 3 code here?
                    } 
                    else if (choice == 4) 
                    {
                    	//insert choice 4 code here?
                    }  
                    else if (choice == 5) 
                    {
                    	//insert choice 5 code here?
                    }  
                    else if (choice == 6) 
                    {
                    	//insert choice 6 code here?
                    } 
                    else if (choice == 7) 
                    {
                    	//insert choice 7 code here?
                    }  
                } while (choice == 0);
                System.out.println("You exit the program.");
                System.exit(0); //Exit the program.
	}
                    	
	Library HendersonDuffy = new Library();

	List<Member>members;

	List<Stock>stock;

	void addMember(String nm, int yr, String St, String Twn, String strpc) 
	{
		//insert addMember function here?
	}

	String getMembers()
	{
		//insert getMembers function here?
	}

	void addJournal(int v, String t, int numCopies)
	{
		//insert addJournal here?
	}

	void addBook(String a, String t, int numCopes)
	{
		//insert addBook?
	}

	String getStock()
	{
		//insert getStock function here?
	}

	String getBooks()
	{
		//insert getBooks function here?
	}

	String getJournals()
	{
		//insert getJournals function here?
	}









}

