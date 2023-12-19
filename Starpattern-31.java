import java.util.Scanner;

public class Starpattern-31 {
    public static void main(String str[]){
        int n,i;
        Scanner s=new Scanner(System.in);
        System.out.println("ENter the no.of rows :");
        n=s.nextInt();
        for(i=0;i<n;i++){
            System.out.println();
            for(int j=0;j<=i;j++){
                System.out.println("* ");
            }

        }

    }
    
}
