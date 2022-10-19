package pkg;
import java.util.*;
import java.io.*;

public class Reply extends Message {
		ArrayList <String> childList = new ArrayList<String>();

		String author;
		String subject;
		String body;
		int id;
	// Default Constructor
	public Reply() {
		auth= subj=bod = "";
		id = -1;

	}

	// Parameterized Constructor
	public Reply(String auth, String subj, String bod, int i) {
		childList = new ArrayList<>();
		author = auth;
		body = bdy;
		subject = subj;
		id = i;
	}

	// Returns if this is a reply (true)
	public boolean isReply(){
		return true;
	}
}
