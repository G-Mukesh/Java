import java.util.Scanner;

public class avgofpositive {
    public static void main(String str[]){
        int n=0,cp=0,cn=0,i,p=0,ng=0;
        System.out.println("Enter -1 to exit");
        Scanner s=new Scanner(System.in);
        while(n!=-1){
            n=s.nextInt();
            if(n>0){
                cp++;
                p+=n;

            }
            else{
                cn++;
                ng+=n;
            }


        }
        p=p/cp;
        ng=ng/cn;
        System.out.println("The average of positive numbers is : " + p);
        System.out.println("The average of negative numbers is : " + ng);
    }
    
}
