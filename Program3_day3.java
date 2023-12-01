import java.util.Scanner;

public class Program3_day3 {
    public static void main(String str[]){
        int number,i,c,n;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number :");
        number=s.nextInt();
        System.out.print("Enter the nth factor to be displayed : ");
        n=s.nextInt();
        c=0;
        int x=0,flag=0;
        for(i=1;i<=number;i++){
            if(number%i==0){
                c++;
            }
            if(c==n && flag==0){
                x=i;
                flag=1;

            }
        }
        System.out.println("No.of factors : " + c);
        System.out.println("The " + n + "th factor : " + x);

    }
    
}
