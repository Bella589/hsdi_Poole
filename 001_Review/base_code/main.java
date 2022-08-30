import pkg.*;
import java.util.*;
import java.io.*;       

class main {        // This should be all that is in your main.java file.
	public static void main(String args[]) throws FileNotFoundException {
        BBoard x = new BBoard("menu");   // Feel free to change the name.
        User y = new User();
        Topic t = new Topic();
         
       
        x.loadUsers(args[0]);
        x.login(); 
        x.run();


        
        
    

        // Feel free to add code for testing purposes. 

        // Examine data.txt for example Messages displayed from the BBoard

        // Examine users.txt for the format of users and their passwords. 
	}
}
