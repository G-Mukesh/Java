import java.util.Scanner;

/**
 * Prime_thread
 */
public class Prime_thread extends Thread {
    public void run(int n){
        int i;
        for(i=2;i<n;i++){
            if(n%i==0){
                System.out.println(n + " is a prime ");
            }
        }

    }
    public static void main(String str[]){
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println('Enter the number n ');
        n=s.nextInt();
        

    }

    
}