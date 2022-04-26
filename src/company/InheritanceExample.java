package company;

class a {
    void show(){
        System.out.println("ello");
    }
    int add (int a, int b){
        int c = a+b;
        return c;
    }
}


public class InheritanceExample extends a {
    int add(int a, int b,int c){
        int d =a+b+c;
        return d;
    }

    public static void main(String[] args){
        InheritanceExample a = new InheritanceExample();
        System.out.println(a.add(5,6));
        System.out.println(a.add(10,20,30));
    }
}
