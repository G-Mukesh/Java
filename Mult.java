import java.util.*;
class Mult{
int n,m;
void get(){
Scanner s=new Scanner(System.in);
System.out.println("Enter the value n");
n=s.nextInt();
System.out.println("Enter the value m");
m=s.nextInt();
}
void calc(){
int i;
for(i=1;i<=n;i++){
System.out.println(i+"*"+m+"="+m*i);
}
}
public static void main(String str[]){

Mult obj=new Mult();
obj.get();
obj.calc();
}
}
