import java.util.*;
class Convert{
int n;
int b[]=new int[50];
int o[]=new int[50];

void get(){
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
n=s.nextInt();

}
void calc(){
int i=0,j=0;
int a=n;
while (n>1){
b[i]=n%2;
n=n/2;
i++;
}
while(a>1){
o[j]=a%8;
a=a/8;
j++;
}
}

void print(){
int i,j;
int l1=b.length;
int l2=o.length;
System.out.println("The binary value of the given number is");
for(i=l1-1;i>=0;i--){
System.out.print(b[i]);
}
System.out.println("The octal value of the given number is");
for(j=l2-1;j>=0;j--){
System.out.print(o[j]);
}
}

public static void main(String str[]){

Convert obj=new Convert();
obj.get();
obj.calc();
obj.print();
}
}
