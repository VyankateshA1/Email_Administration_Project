package EmailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String passward;
    private String department;
    private String email;
    private int mailnboxCapacity = 500;
    private int deafultPasswordLength = 10;
    private String AlternateEmail;
    private String compnaySfffix = "aeycompany.com";


    //Constructore to receive first and last name.

    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
       // System.out.println("Email Created: " + this.firstName+" "+this.lastName);
        //call a method asking for the deparment and returen the department 

        this.department = setDepartment();
      //  System.out.println("Department :"+ this.department);

        // call a method that return a random password
        this.passward = randomPassword(deafultPasswordLength);
        System.out.println("Your password is :"+ this.passward);

        // Combine elements to generate Email.
        email = firstName.toLowerCase()+ "."+lastName.toLowerCase()+"@"+department+"."+compnaySfffix;
       // System.out.println("Your Email is :"+ email);

    }
    //ask for department
    private String setDepartment(){
        System.out.print("New worker :"+firstName+"\n Department Code \n " +
                "1 for Sales \n" +
                " 2 fro Developement \n " +
                "3 for Accounting " +
                "\n 0 for Non \n Enter Department code : ");

        Scanner in = new Scanner(System.in);
        int depChoice=in.nextInt();
        if (depChoice==1){
            return "Sales";
    } else if (depChoice==2) {
            return "Devlopment";
        } else if (depChoice==3) {
            return "Accounting";
        }else {
            return "";
        }

    }
        //Generate random password
    private String randomPassword(int length){
     String passwordSet = "ABCDEFGHIJKLMNOPQSRTUVWXYZ!@#$%&0123456789";
     char password[]= new char[length];
        for (int i = 0; i < length; i++) {
           int rand =  (int)(Math.random() * passwordSet.length());
           password [i] = passwordSet.charAt(rand);
        }
    return new String(password);
    }
    //set the mailbox capacity
    public void setMailnboxCapacity(int capacity){
        this.mailnboxCapacity=capacity;
    }
    public int getMailboxCapacity(){
        return mailnboxCapacity;
    }
    //set alternative email
    public void setAlternateEmail(String altEmail){
        this.AlternateEmail = altEmail;
    }
    public String getAlternateEmail(){
        return AlternateEmail;
    }


    //set change passward.
    public void changePassward(String passward ){
        this.passward = passward;
    }
    public String getPassward() {
        return passward;

    }

        public String showInfo(){

            return "Display Name : "+ firstName+" "+lastName +
                    "\nCompany Email : "+ email+
                    "\nMailbox Capacity : "+mailnboxCapacity +"mb";
        }


}
