package ClassesAndMethods;

import java.util.Scanner;

public class Rectangle {
    private int length;
    private int width;
    private int dimensionChange;

    public void setLength(int length){
        this.length=length;

    }
    public int getLength(){
        return length;
    }
    public void setWidth(int width){
        this.width=width;
    }
    public int getWidth(){
        return width;
    }
    public void setDimensionChange(int dimensionChange){
        this.dimensionChange=dimensionChange;
    }
    public int getDimensionChange(){
        return dimensionChange;
    }

    public static void area(Rectangle r){
        System.out.println("area ="+(r.getLength()*r.getWidth()));
    }
    public static void display(Rectangle r){
        System.out.println("Reactangle Dimensions:");
        System.out.println("Length= "+ r.getLength());
        System.out.println("Width= "+r.getWidth());
    }
    public static void dimensionChange(Rectangle r){
        r.setLength(r.getLength()*r.getDimensionChange());
        r.setWidth(r.getWidth()*r.getDimensionChange());

    }

    public static void main(String[]args){
        Rectangle r = new Rectangle();
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the length");
        r.setLength(s.nextInt());
        System.out.println("Enter the width");
        r.setWidth(s.nextInt());
        
        display(r);
        area(r);
        System.out.println("Entr the dimension change");
        r.setDimensionChange(s.nextInt());
        dimensionChange(r);
        display(r);
        area(r);


    }

}

