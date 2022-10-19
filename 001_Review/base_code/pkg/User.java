package pkg;
import java.util.*;
import java.io.*;

public class User {
	Scanner sc = new Scanner(System.in);
	String usr;
	String pwd;
	String oldpass;
	
	// Creates a User with empty name and password.
	public User() {
		String usr = "";
		String pwd = "";
	}

	// Creates a User with given username and password.
	public User(String usr, String pwd) {
		this.usr = usr;
		this.pwd = pwd;
	}

	// Returns the username
	public String getUsername(){
		return usr;

	}

	// Returns true if the stored username/password matches the parameters. Otherwise returns false.
	// Note that, even with a User with empty name and password, this is actually a valid User object (it is the default User), 
	// This function must still return false if given an empty username string.  
	public boolean check(String usrr, String psd){
       if((this.usr.equals(usr)) && (pwd.equals(psd))){
       	return true;
       }
       if(usr.equals("") && pwd.equals("")){
       	return false;
       }
       
	}

	// Sets a new password.
	// This function should only set the password if the current (old) password is passed in.
	// Also, a default User cannot have its password changed. 
	// Return true if password changed, return false if not.
	public boolean setPassword(String oldPass, String newPass){
		if(usr.equals("")){
			return false;
		}
		if(oldpass.equals(pwd)){
			pwd = newPass;
			return true;
		}
		else{
			return false;
		}
	}
}
