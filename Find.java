import java.util.*;
class Find{
public static void main(String str[]){
String st;
char c;
Scanner s=new Scanner(System.in);
System.out.println("Enter the string");
st=s.nextLine();
System.out.println("ENter the character to be searched");
c=s.nextLine();
int n=st.length();
int flag=0,x;
for(int i=0;i<n;i++){
if(st[i]==c){
flag=1;
x=i+1;
}
}
if(flag==1){
System.out.println("The given character is found in the string at position "+x);
}
else{
System.out.println("The given character is not found in the given string");
}
}
}
