class ClassA {
    public void printa(){
        System.out.println("This is parent class");
    }
    
}
public class ClassB extends ClassA {
    public void printb(){
        System.out.println("This is child class ");
    }

    public static void main(String str[]){
        ClassB obj=new ClassB();
        obj.printa();
        obj.printb();
    }

    
}
