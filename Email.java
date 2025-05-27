package EmailAdministrationApplication;

import java.util.Scanner;

public class Email{
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailBoxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "company.com";

    // Constructor to recieve first name and last name
    public Email(String firstName , String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        // System.out.println(" ");
        // System.out.println("Email Created: " + this.firstName + " " + this.lastName);

        // Call a method asking for the department - return the department
        this.department = setDepartment();
        // System.out.println("Department: " + this.department);

        // Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your Password is: " + this.password);

        // combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + companySuffix;
        // System.out.println("Your Email is: " + email);
    }
    // Ask for the department 
    private String setDepartment(){
        System.out.println("New Worker : " + firstName + "\nDepartment Codes :  \n1 For Sales\n2 For Development\n3 For Accounting\n0 For None \nEnter the department Code:");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice == 1){
            return "Sales";
        } 
        else if(depChoice == 2){
            return "Development";
        } 
        else if(depChoice == 3){
            return "Accounting";
        } 
        else {
            return "";
        }
        
    }
    
    // Generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*";
        char[] password = new char[length];
        for(int i = 0; i < length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //  Set the mailbox capacity
    public void setMailBoxCapacity(int capacity) {
        this.mailBoxCapacity = capacity;
        // System.out.println("Mailbox capacity set to: " + this.mailBoxCapacity + " emails");
    }

    // Set the alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
        // System.out.println("Alternate Email set to: " + this.alternateEmail);
    }

    // Change the password
    public void changePassword(String password) {
        this.password = password;
        // System.out.println("Password changed successfully.");
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return "Display Name: " + firstName + " " + lastName +
               "\nCompant Email : " + email +
               "\nMailbox Capacity: " + mailBoxCapacity + " emails" +
               "\nAlternate Email: " + alternateEmail;
        }
}
