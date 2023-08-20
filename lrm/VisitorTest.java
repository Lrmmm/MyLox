package lrm;

public class VisitorTest {
    public static void main(String[] args) {
        Beinget beinget = new Beinget(0, "lrm");
        beinget.printInfo();
        UpdateVisitor visitor = new UpdateVisitor();
        beinget.accept(visitor);
        beinget.printInfo();
    }
}
abstract class Pastry{
    abstract void accept(PastryVisitor visitor);
    Pastry(int age,String name){
        this.age = age;
        this.name = name;
    }
    public void printInfo(){
        System.out.println("name:" + name + "  age:" + age);
    }
    int age;
    String name;

}

class Beinget extends Pastry{
    Beinget(int age, String name){
        super(age, name);
    }
    @Override
    void accept(PastryVisitor visitor){
        visitor.visitBeignet(this);
    }
}

class Cruller extends Pastry{
    Cruller(int age, String name){
        super(age, name);
    }
    @Override
    void accept(PastryVisitor visitor){
        visitor.visitCruller(this);
    }
}

interface PastryVisitor{
    public void visitBeignet(Beinget beinget);
    public void visitCruller(Cruller cruller);
}

class UpdateVisitor implements PastryVisitor{
    @Override
    public void visitBeignet(Beinget beinget){
        beinget.age = 99;
        beinget.name = "XHY";
    }
    @Override
    public void visitCruller(Cruller cruller){

    }
}
