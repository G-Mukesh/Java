import java.util.*;
class Count{
    public static void main(String str[]){
        String a;
        int c=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string");
        a=s.nextLine();
        for(int i=0;i<a.length();i++){
            if(!Character.isDigit(a.charAt(i)) && !Character.isLetter(a.charAt(i)) && !Character.isWhitespace(a.charAt(i))){
                c++;
            }
        }
        if(c==0){
        System.out.println("The string does not have any special characters ");
    }
    else{
        System.out.println("There are " + c + "Speciall characters");
    }
    }
    

}