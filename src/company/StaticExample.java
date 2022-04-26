package company;

public class StaticExample {
    int a;
    static int a2 ;
    public static void show(){
        System.out.println("hello");
    }

    public static void main(String[] strgs){
        StaticExample a = new StaticExample();
        a.a=2;
        StaticExample.a2=5;
        System.out.println("object a" + a.a );
        System.out.println("object a " + a.a2);

        StaticExample b = new StaticExample();
        b.a= 3;
        b.a2 = 10;

        System.out.println("object b" + b.a);
        System.out.println("object b" + StaticExample.a2);
        show();
    }
}
