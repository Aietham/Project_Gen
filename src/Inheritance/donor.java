package Inheritance;

import java.util.Scanner;

class Person {                              //cant accept public
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
    private String boodtype;
    private String donationdate;

    public String getBloodbankname() {
        return bloodbankname;
    }

    public void setBloodbankname(String bloodbankname) {
        this.bloodbankname = bloodbankname;
    }

    public String getBoodtype() {
        return boodtype;
    }

    public void setBoodtype(String boodtype) {
        this.boodtype = boodtype;
    }

    public String getDonationdate() {
        return donationdate;
    }

    public void setDonationdate(String donationdate) {
        this.donationdate = donationdate;
    }

    public void DisplayDonantionDetails(){

    }

    public static void main(String[] strgs){
        Person a = new donor();
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
        a.set
    }
}
