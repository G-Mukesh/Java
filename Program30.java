import java.util.Scanner;

/**
 * Program30
 */
public class Program30 {
    public static void main(String str[]){
        int n,i,j;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no.of rows :");
        n=s.nextInt();
        for(i=0;i<n;i++){
            System.out.println();
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
        }

        
    }

    
}
