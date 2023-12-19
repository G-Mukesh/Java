
import java.math.*;
public class decimaltobinary {
    public static void main(String str[]){
        int n=16,res=0;
        while(n!=0){
            int r=n%2;
            res=res+(r*pow(10,r));
            n=n/2;
        }
        System.out.println(res);
        int rev=0;
        while(res!=0){
            int a=res%10;
            rev=rev*10 + a;
            res=res/10;
        }
        System.out.println("The binary equivalent is ");
        System.out.println(rev);
    }

    
} 
    

