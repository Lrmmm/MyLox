package lrm;

public class Person {
    public int age = 0;
    public String name = "";
    Person(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    public void printPerson()
    {
        System.out.println("name="+name);
        System.out.println("age="+age);
    }

    public static void main(String[] args) {
        Person p1 = new Person(18, "lrm");
        p1.printPerson();
        // changePerson(p1);
        Person p2 = p1;
        p2.printPerson();
        changePerson(p2);
        p2.printPerson();
        p1.printPerson();

    }

    public static void changePerson(Person p)
    {
        p.age = 999;
        p.name = "999";
    }


}
