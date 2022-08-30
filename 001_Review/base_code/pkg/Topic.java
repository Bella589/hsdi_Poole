package pkg;
import java.util.*;
import java.io.*;

public class Topic extends Message{ 
ArrayList <String> childList = new ArrayList<String>();

		String author;
		String subject;
		String body;
		int id;
		
		String auth;
		String subj;
		String bod;
		
	// Default Constructor
	public Topic() {
		auth= subj=bod = "";
		id = -1;

	}

	// Parameterized constructor
	public Topic(String auth, String subj, String bod, int i) {
		childList = new ArrayList<>();
		author = auth;
		body = bod;
		subject = subj;
		id = i;
	}

	// Returns if it's a reply (false)
	public boolean isReply(){
		return false;

	}
}
