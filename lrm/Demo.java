// package lrm;
class Person{
    int age;
    String name;
    Person() {
        age = 0;
        name = " ";
    }
    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
    void printPerson() {
        System.out.println(age);
        System.out.println(name);
    }
}
public class Demo {

    Person p;
    Demo(Demo demo) {
        this.p = demo.p;
    }
    Demo(Person p) {
        this.p = p;
    }
    public static void main(String[] args) {
        Person p1 = new Person(999, "lrm");
        Demo d1 = new Demo(p1);
        d1.p.printPerson();

        Demo d2 =new Demo(d1);
        d2.p.printPerson();
        d1.p.age = 666;
        d2.p.printPerson();

    }
}

