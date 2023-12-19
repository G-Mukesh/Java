import java.util.Scanner;

public class Perfectnumber {
    public static void main(String str[]){
        int n,i,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number : ");
        n=s.nextInt();
        for(i=1;i<n;i++){
            if(n%i==0){
                sum+=i;


            }
        }
        if(sum==n){
            System.out.println("It is a perfect number");
        }
        else{
            System.out.println("It is not a perfect number ");
        }
    }
    
}
