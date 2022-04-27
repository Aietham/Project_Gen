package ClassesAndMethods;

import java.util.Scanner;

public class User {
    private String name;
    private String Username;
    private long PhoneNumber;
    private String password;

    public static boolean comparePhoneNumber(User a, User b) {         //passing object as an argument?
        System.out.println(a.getPhoneNumber());
        System.out.println(b.getPhoneNumber());
        return(a.getPhoneNumber() == b.getPhoneNumber() );            //does not return true?

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public long getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        User a = new User();
        System.out.println("Enter the name: ");
        a.setName(s.nextLine());
        System.out.println("enter the username");
        a.setUsername(s.nextLine());
        System.out.println("enter the password");
        a.setPassword(s.nextLine());
        System.out.println("enter trhe phone no.");
        a.setPhoneNumber(s.nextLong());


        User b = new User();
        System.out.println("Enter the name: ");
        s.nextLine();
        b.setName(s.nextLine());
        System.out.println("enter the username");
        b.setUsername(s.nextLine());
        System.out.println("enter the password");
        b.setPassword(s.nextLine());
        System.out.println("enter trhe phone no.");
        b.setPhoneNumber(s.nextLong());

        

        System.out.println(comparePhoneNumber(a,b));
    }


}
