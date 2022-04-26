package company;

import java.util.Scanner;

public class functionexample {
    public void show(){
        System.out.println("1st function");
    }
    public float add(float a,float b){
        float c = a+b;
        return c;
    }
    public float add(float a, float b, float c){
        float d = a+b+c;
        return d;
    }
    public static void main(String[] args){
        functionexample as = new functionexample() ;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the value of a");
        float a = s.nextFloat();
        System.out.println("enter the value of b");
        float b = s.nextFloat();
        System.out.println("enter the value of c");
        float c = s.nextFloat();
        as.show();
        System.out.println(as.add(a,b));
        System.out.println(as.add(a,b,c));
    }

}
class b{
    public static void main(String[]args){
    functionexample b = new functionexample();
        System.out.println(b.add(5f,6f));
        }
}
