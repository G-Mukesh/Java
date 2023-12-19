import java.util.Scanner;

public class Armstrongnumber {
    public static void main(String str[]){
        int n,sum=0;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number : ");
        n=s.nextInt();
        int n1=n;
        while(n!=0){
            int x=n%10;
            sum+=x*x*x;
            n=n/10;
        }
        if(sum==n1){
            System.out.println(n1+ " Is an armstrong  number ");
        }
        else{
            System.out.println("Not an armstrong number");
        }

        
    }
    
}
