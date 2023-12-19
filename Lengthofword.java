import java.util.*;
class Lengthofword{
public static void main(String str[]){
String a,delimiter;
Scanner s=new Scanner(System.in);
System.out.println("Enter the string : ");
a=s.nextLine();
int c=0;
int n=a.length();
for(int i=n-1;i>0;i--){
if(a.charAt(i).equals(" ")){
break;
}x
else{
c++;
}
}
System.out.println(c);
}
}


