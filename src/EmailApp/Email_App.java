package EmailApp;

public class Email_App {
    public static void main(String[] args) {
        Email em1 = new Email("John","Smith");

//        em1.setAlternateEmail("js@$$gmail.com");
//        System.out.println("Your Alternative Email is: "+em1.getAlternateEmail());

        System.out.println(em1.showInfo());



    }
}
