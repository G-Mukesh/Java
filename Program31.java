import java.util.Scanner;

public class Program31 {
    public static void main(String str[]){
        int n,i,j;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no.of rows :");
        n=s.nextInt();
        for(i=1;i<=n;i++){
            System.out.println();
            for(j=1;j<=i;j++){
                System.out.print(i + " ");
            }
        }

        
    }

    
}
