import java.util.*;
class Remove{
public static void main(String str[]){
String st1,st2;
Scanner s=new Scanner(System.in);
System.out.println("Enter the String");
st1=s.nextLine();
int n=st1.length();
int j=0;
for(int i=0;i<n;i++){
if(st[i]=="a" || st1[i]=="e" || st1[i]=="i" || st1[i]=="o" || st1[i]=="u"){
st2=st2+"";
j++;
}
else{
st2=st2+st1[i];
}
}
System.out.println("String after remoing the vowels : "+st2);
}
}