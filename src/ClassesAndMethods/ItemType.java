package ClassesAndMethods;

import java.util.Scanner;

public class ItemType {
    String name;
    Double CostPerDay;
    Double Deposit;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCostPerDay() {
        return CostPerDay;
    }

    public void setCostPerDay(Double costPerDay) {
        CostPerDay = costPerDay;
    }

    public Double getDeposit() {
        return Deposit;
    }

    public void setDeposit(Double deposit) {
        Deposit = deposit;
    }

    public void display(){

        System.out.println("Item Type Details");
        System.out.println("Nmae: "+ getName());
        System.out.println("cost Per Day: "+ getCostPerDay());
        System.out.println("Deposit: "+ getDeposit());


    }

    public static void main(String[] args){
        ItemType a = new ItemType();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the item tpye");
        a.setName(s.nextLine());
        System.out.println("nter the cost per day");
        a.setCostPerDay(s.nextDouble());
        System.out.println("enetr the deposit amt");
        a.setDeposit(s.nextDouble());

        a.display();


    }
}
