package javaemailapp;

import java.util.Scanner;

public class Email {
    
private String firstName;
private String lastName;
private String password;
private String department;
private String email;
private int mailboxCapacity = 500;
private int defaultPasswordLen = 6;
private String alternateEmail;
private String companySuffix = "company.com";

//Constructor to receive first name and last name
public Email(String firstName , String lastName){
    this.firstName = firstName;
    this.lastName = lastName;
    
    //Call a method asking for the department - return the department
    this.department = setDepartment();
    
    
    //Call a method that return a random password
    this.password = randomPassword(defaultPasswordLen);
    System.out.println("Your password is: "+this.password);
    
    //Combine elements to generate email
    email = firstName.toLowerCase()+ "." + lastName.toLowerCase() + "@" + department+ "." + companySuffix;

}
//Ask for department
private String setDepartment(){
    System.out.print("New worker "+firstName+".\nDepartment Codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
    Scanner in = new Scanner(System.in);
    int depChoice = in.nextInt();
    
    switch(depChoice){
        case 1:
            return "sales";
        case 2:
            return "development";
        case 3: 
            return "accounting";
        default:
            return "";
            
    }
}
//Generate a random password
private String randomPassword(int len){
    String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
    char[] passwrd = new char[len];
    for (int i = 0; i < len; i++) {
       int rand = (int)(Math.random() * passwordSet.length());
       passwrd[i] = passwordSet.charAt(rand);
    }
    return new String (passwrd); 
}

//Set the mailbox capacity
public void setMailboxCapacity(int capacity){
    this.mailboxCapacity = capacity;
}

//Set the alternate email
public void setAlternateEmail(String altEmail){
    this.alternateEmail = altEmail;
}

//Change the password
public void changePassword(String password){
    this.password = password;
}

public int getMailboxCapacity(){
    return mailboxCapacity;
}

public String getAlternateEmail(){
    return alternateEmail;
}

public String getPassword(){
    return password;
}

public String showInfo(){
    return "Display name: "+firstName + " "+lastName+
            "\nCompany email: "+email+
            "\nMailbox capacity: "+ mailboxCapacity + "mb";
}
}
