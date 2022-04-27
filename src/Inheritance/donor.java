package Inheritance;

import java.util.Scanner;


class Person {                              //cant accept public in parent class?
    private String name;
    private String dateofbirth;
    private String gender;
    private String mobilenumber;
    private String bloodgroup;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }
}

public class donor extends Person{
    private String bloodbankname;
    private String bloodtype;
    private String donationdate;

    public String getBloodbankname() {
        return bloodbankname;
    }

    public void setBloodbankname(String bloodbankname) {
        this.bloodbankname = bloodbankname;
    }

    public String getDonarType() {
        return bloodtype;
    }

    public void setDonarType(String DonarType) {
        this.bloodtype = DonarType;
    }

    public String getDonationdate() {
        return donationdate;
    }

    public void setDonationdate(String donationdate) {
        this.donationdate = donationdate;
    }

    public void DisplayDonantionDetails(donor a){
        System.out.println("Donation Details");
        System.out.println("name"+ a.getName() );
        System.out.println("Date of birth"+ a.getDateofbirth());
        System.out.println("mobile no"+a.getMobilenumber());
        System.out.println("blood group"+getBloodgroup());
        System.out.println("blood bank name"+getBloodbankname());
        System.out.println("donor type"+ getDonarType());
        System.out.println("donation date"+getDonationdate());

    }

    public static void main(String[] strgs){
        donor a = new donor();                      //sub-class object?
        Scanner s= new Scanner(System.in);

        System.out.println("enter the name: ");
        a.setName(s.nextLine());
        System.out.println("nter the dob");
        a.setDateofbirth(s.nextLine());
        System.out.println("enter the gender");
        a.setGender(s.nextLine());
        System.out.println("enter the mobile no.");
        a.setMobilenumber(s.nextLine());
        System.out.println("enter the blood group");
        a.setBloodgroup(s.nextLine());
        System.out.println("nter the blood bank name");
        a.setBloodbankname(s.nextLine());
        System.out.println("Enter donor type");
        a.setDonarType(s.nextLine());
        System.out.println("enter donation date");
        a.setDonationdate(s.nextLine());
        s.close();
        a.DisplayDonantionDetails(a);        //all the methods stored in the obj?
    }
}
