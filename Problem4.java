import java.util.Scanner;

/**
 * Problem4
 */
public class Problem4 {
    public static void main(String str[]){
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number n :");
        n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the number " + i);
            arr[i]=s.nextInt();
        }
        System.out.println("The number not in the array");
        for(int i=0;i<=n;i++){
            int flag=0;
            for(int j=0;j<n;j++){
                if(i==arr[j]){
                    flag=1;
                }
            

            }
            if(flag==0){
                System.out.print(i+" ");
            }
        }
    }

    
}