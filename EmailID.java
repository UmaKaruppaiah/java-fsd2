package PracticeProject;

import java.util.ArrayList;
import java.util.Scanner;
public class EmailID {

	public static void main(String[] args) {
    ArrayList<String> email = new ArrayList<String>();
   
        email.add("john.smith@gmail.com");
        email.add("peter.parker@zylker.com");
        email.add("firstname@domain.com");
        email.add("ram@453gmail.com");
        email.add("Raji8454@gmail.com");
        email.add("pooja.puvi@gmail.com");
        email.add("dhanush@gmail.com");
        email.add("emailid2022@gmail.com");
        email.add("ajithkumar@gmail.com");
        email.add("salman@gmail.com");
        email.add("ajay@3gmail.com");
        email.add("scarlett.1@gmail.com");
        email.add("tom.Jerry@gmail.com");
        
         String SearchEmailId = null;
         try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter email Id to Search : ");
          SearchEmailId = sc.nextLine(); 
		}
             if(email.contains(SearchEmailId)){
          System.out.println("EmailID is Found");
      }
      else{
          System.out.println( "EmailID  is not Found");
      }

	}

}

