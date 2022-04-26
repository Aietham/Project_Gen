package company;

import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String []args){
        Scanner a = new Scanner(System.in);
        System.out.println("enter the month no");
        int i = a.nextInt();
        switch (i){
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("feb");
                break;
            case 3:
                System.out.println("march");
                break;
            default:
                System.out.println("out of bound");
        }





    }
}
