package pkg;
import java.util.*;
import java.io.*;

public class Message {
		 ArrayList <String> childList = new ArrayList<String>();
		String author;
		String subject;
		String body;
		int id;

	// Default Constructor
	public Message() {
		auth= subj=bod = "";
		id = -1;
	}
	
	// Parameterized Constructor
	public Message(String auth, String subj, String bod, int i) {
		childList = new ArrayList<>();
		author = auth;
		body = bdy;
		subject = subj;
		id = i;
		
		
		
		
	}

	// This function is responsbile for printing the Message
	// (whether Topic or Reply), and all of the Message's "subtree" recursively
	// After printing the Message with indentation n and appropriate format (see output details),
	// it will invoke itself recursively on all of the Replies inside its childList, 
	// incrementing the indentation value at each new level.

	// Note: Each indentation increment represents 2 spaces. e.g. if indentation ==  1, the reply should be indented 2 spaces, 
	// if it's 2, indent by 4 spaces, etc. 
	public void print(int indentation){
		System.out.println("----------------------------------------");
			System.out.print("message #" + id + " " + subj +"from:" + auth);
			System.out.print("     Body:" + bdy);
		System.out.println("----------------------------------------");


	}

	// Default function for inheritance
	public boolean isReply(){
		
	}

	// Returns the subject String
	public String getSubject(){
		return n;
		
	} 

	// Returns the ID
	public int getId(){
		return i;
	}

	// Adds a child pointer to the parent's childList.
	public void addChild(Message child){
		childList.add(child);
	}

}
