import java.util.Scanner;

public class Revstring {
    public static void main(String str[]){
        String st[]=new String[50];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string");
        st=s.nextLine();
        int n=st.length();
        String rev[]=new String[50];
        int j=0;
        for(int i=n;i>=0;i--){
            st[i]=rev[j];
            j++;


        }
        System.out.println(rev);
    }
    
}
