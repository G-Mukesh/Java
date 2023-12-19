import java.util.Scanner;

public class divbyzero {
    public static void main(String str[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a and b values : ");
        int a=s.nextInt();
        int b=s.nextInt();
        try{
            int x=a/b;
            System.out.println("output = 0" + x);

        }
        catch(Exception ex){
            System.out.println("Division by zero error ");
            System.out.println("Change the b value");
        }
        finally{
            System.out.println("Executed");
        }
    }
    
}
