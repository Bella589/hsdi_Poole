package pkg;
import java.util.*;
import java.io.*;

public class BBoard {	
		Scanner sc = new Scanner(System.in);


	// This is your main file that connects all classes.
	// Think about what your global variables need to be.

	// Default constructor that creates a board with a defaulttitle, empty user and message lists,
	// and no current user
	
	String D;
	String d;
	
	String N;
	String n;
	
	String R;
	String r;

	String P;
	String p;
	
	String Q;
	String q;
	
	String name;
	String pass;

	String message;
	String newTopic;
	
	String c;
	
	
	int messNum;
	String mess;
	 ArrayList <String> m = new ArrayList<String>();
	 ArrayList <String> nt = new ArrayList<String>();

	private ArrayList<String> user1 = new ArrayList<String>();

	
	public BBoard() {
		
		// System.out.println("----------------------------------------------");
		// System.out.println("Message 1:");
	 //   System.out.println("----------------------------------------------");

		
	}

	// Same as the default constructor except it sets the title of the board
	public BBoard(String ttl) {	
			System.out.print(ttl);
	}

	// Gets a filename of a file that stores the user info in a given format (users.txt)
	// Opens and reads the file of all authorized users and passwords
	// Constructs a User object from each name/password pair, and populates the userList ArrayList.
		public void loadUsers(String inputFile) throws FileNotFoundException {
			// user1.add(new File(users.txt));
			while (sc.hasNext()){
			 user1.add(sc.next());
			}
				

	}	

	// Asks for and validates a user/password. 
	// This function asks for a username and a password, then checks the userList ArrayList for a matching User.
	// If a match is found, it sets currentUser to the identified User from the list
	// If not, it will keep asking until a match is found or the user types 'q' or 'Q' as username to quit
	// When the users chooses to quit, sayu "Bye!" and return from the login function
	public void login(){
		System.out.println("What is your user name");
			 name = sc.nextLine();
		System.out.print("What is your password");
			 pass = sc.nextLine();
		

		if(name.equals(user1)){
			System.out.println("User or password is wrong");
		}
		
		else{
			System.out.print("Logged in succesfully");
		}
			login();
		
	}
	
	// Contains main loop of Bulletin Board
	// IF and ONLY IF there is a valid currentUser, enter main loop, displaying menu items
	// --- Display Msessages ('D' or 'd')
	// --- Add New Topic ('N' or 'n')
	// --- Add Reply ('R' or 'r')
	// --- Change Password ('P' or 'p')
	// --- Quit ('Q' or 'q')
	// With any wrong input, user is asked to try again
	// Q/q should reset the currentUser to 0 and then end return
	// Note: if login() did not set a valid currentUser, function must immediately return without showing menu
	public void run(){
		System.out.println("--- Display Messages ('D' or 'd')");
			String d = sc.nextLine();
		System.out.println("--- Add New Topic ('N' or 'n')");
			String n = sc.nextLine();
		System.out.println("--- Add Reply ('R' or 'r')");
			String r = sc.nextLine();
		System.out.println("-- Change Password ('P' or 'p')");
			String p = sc.nextLine();
		System.out.println("--- Quit ('Q' or 'q')");
			String q = sc.nextLine();
		
		if((r.equals("r")||(r.equals("R")))){
			System.out.print("what is your message?");
				 message = sc.nextLine();
			 m.add(message);
		}
		
		if((d.equals("D")||(d.equals("d")))){
			System.out.print(m);
		}
		if((n.equals("n")||(n.equals("N")))){
			System.out.print("you are adding a new topic");
				String newTopic = sc.nextLine();
			nt.add(newTopic);
		}
		if((q.equals("q"))||(q.equals("Q"))){
			System.out.print("You ended succesfully.");
		}
		

	}

	// Traverse the BBoard's message list, and invote the print function on Topic objects ONLY
	// It will then be the responsibility of the Topic object to invoke the print function recursively on its own replies
	// The BBoard display function will ignore all reply objects in its message list
	private void display(){
		System.out.print(newTopic);
		System.out.print(message);
		
	}


	// This function asks the user to create a new Topic (i.e. the first message of a new discussion "thread")
	// Every Topic includes a subject (single line), and body (single line)

	/* 
	Subject: "Thanks"
	Body: "I love this bulletin board that you made!"
	*/

	// Each Topic also stores the username of currentUser; and message ID, which is (index of its Message + 1)

	// For example, the first message on the board will be a Topic who's index will be stored at 0 in the messageList ArrayList,
	// so its message ID will be (0+1) = 1
	// Once the Topic has been constructed, add it to the messageList
	// This should invoke your inheritance of Topic to Message
	private void addTopic(){
		System.out.print("You chose topic, please create one");
			String T = sc.nextLine();
			
	}

	// This function asks the user to enter a reply to a given Message (which may be either a Topic or a Reply, so we can handle nested replies).
	//		The addReply function first asks the user for the ID of the Message to which they are replying;
	//		if the number provided is greater than the size of messageList, it should output and error message and loop back,
	// 		continuing to ask for a valid Message ID number until the user enters it or -1.
	// 		(-1 returns to menu, any other negative number asks again for a valid ID number)
	
	// If the ID is valid, then the function asks for the body of the new message, 
	// and constructs the Reply, pushing back the Reply on to the messageList.
	// The subject of the Reply is a copy of the parent Topic's subject with the "Re: " prefix.
	// e.g., suppose the subject of message #9 was "Thanks", the user is replying to that message:


	/*
			Enter Message ID (-1 for Menu): 9
			Body: It was a pleasure implementing this!
	*/

	// Note: As before, the body ends when the user enters an empty line.
	// The above dialog will generate a reply that has "Re: Thanks" as its subject
	// and "It was a pleasure implementing this!" as its body.

	// How will we know what Topic this is a reply to?
	// In addition to keeping a pointer to all the Message objects in BBoard's messageList ArrayList
	// Every Message (wheather Topic or Reply) will also store an ArrayList of pointers to all of its Replies.
	// So whenever we build a Reply, we must immediately store this Message in the parent Message's list. 
	// The Reply's constructor should set the Reply's subject to "Re: " + its parent's subject.
	// Call the addChild function on the parent Message to push back the new Message (to the new Reply) to the parent's childList ArrayList.
	// Finally, push back the Message created to the BBoard's messageList. 
	// Note: When the user chooses to return to the menu, do not call run() again - just return fro mthis addReply function. 
	private void addReply(){
		System.out.print("What messsage do you want to reply to?");
			messNum = sc.nextInt();
		System.out.print("What is your message")
		
		System.out.println("Re:" + newTopic + message + messnum + mess ".");

	}

	// This function allows the user to change their current password.
	// The user is asked to provide the old password of the currentUser.
	// 		If the received password matches the currentUser password, then the user will be prompted to enter a new password.
	// 		If the received password doesn't match the currentUser password, then the user will be prompted to re-enter the password. 
	// 		The user is welcome to enter 'c' or 'C' to cancel the setting of a password and return to the menu.
	// Any password is allowed except 'c' or 'C' for allowing the user to quit out to the menu. 
	// Once entered, the user will be told "Password Accepted." and returned to the menu.
	private void setPassword(){
		System.out.print("Do you want to change your password[yes/'c' or 'C' for cancel]");
			c = sc.nextLine(); 
		if((c.equals("c")||(c.equals("C")))){
		
			
		}
		if((c.equals("yes")||(c.equals("Yes")))){
			System.out.print("What do you want to change your password to?");
			String passs = sc.nextLine();
			passs = pass;
		}
		
	}

}
