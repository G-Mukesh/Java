import java.util.Scanner;

public class Program1_day3 {
    public static void main(String str[]){
        int n,y=0,w=0,d=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of days :");
        n=s.nextInt();
        y=n/365;
        int x=n%365;
        int z=0;
        if(x>0){
            w=x/7;
            z=x%7;

        }
        if(z>0){
            d=z;
        }
        System.out.println("Years : " + y);
        System.out.println("Weekd : " + w);
        System.out.println("Days : " + d);

    }
    
}
