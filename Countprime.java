import java.util.Scanner;

public class Countprime {
    public static void main(String str[]){
        int n,i,p=0,c=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        n=s.nextInt();
        int a;
        System.out.println("Enetr the numbers");
        for(i=0;i<n;i++){
            a=s.nextInt();
            int flag=0;
            for(int j=2;j<a;j++){
                if(a%j==0){
                    flag=1;
                }
            }
            if(flag==1){
                c+=1;
            }
            else{
                p+=1;
            }

        }
        System.out.println("Composite number : " + c);
        System.out.println("Prime numbers : " + p);

    }
    
}
