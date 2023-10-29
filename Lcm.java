import java.util.*;
class Lcm{
int n,m;
int gcd,lcm;

void get(){
Scanner s=new Scanner(System.in);
System.out.println("Enter the first number");
n=s.nextInt();
System.out.println("Enter the Second number");
m=s.nextInt();
}

void Gcd(){
int i;
for(i=2;i<=n && i<=m;i++){
if((n%i==0) && (m%i==0)){
gcd=i;
}
lcm=(n*m)/gcd;
}
}

void print(){
System.out.println("The GCD of the given numbers is "+gcd);
System.out.println("The LCM of the given numbers is "+lcm);
}

public static void main(String str[]){
Lcm obj=new Lcm();
obj.get();
obj.Gcd();
obj.print();
}
}