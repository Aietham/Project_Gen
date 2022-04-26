package company;

public class Person {
    float height ;
    float weight ;
    String name ;
    int age ;
    int legs;

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    Person(){this.legs = 2;}
    public static void main(String[]args){
        Person p1 = new Person();
        p1.setName("vivek");
        p1.setHeight(6.2f);
        p1.setAge(25);
        p1.setWeight(95);

        Person p2 =new Person();
        p2.setName("Aietham");
        p2.setHeight(6.0f);
        p2.setAge(22);
        p2.setWeight(100);
        p2.setLegs(4);

        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getHeight());
        System.out.println(p1.getLegs());

        System.out.println("for 2nd person");
        System.out.println(p2.getLegs());

    }

}
