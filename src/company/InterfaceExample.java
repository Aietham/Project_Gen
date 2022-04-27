package company;


interface i{
    void show();
    default void add(int a, int b){
        System.out.println("sum ="+(a+b));
    }
}

public class InterfaceExample implements i {
    public void show (){
        System.out.println("hello");
    }
    
    public static void main(String[]args){
        i a = new InterfaceExample();
        a.show();
        a.add(4, 5);
    }
    
}
