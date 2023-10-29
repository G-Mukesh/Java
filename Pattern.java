import java.util.*;
class Pattern{
public static void main(String str[]){
int n,i,j,k;
n=5;
for(i=1;i<n;i++){
System.out.println();
for(j=n;j>i;j--){
System.out.print(" ");
}
for(k=0;k<i;k++){
System.out.print(i+" ");
}
}
for(i=3;i>0;i--){
System.out.println();
for(j=4;j>=i;j--){
System.out.print(" ");
}
for(k=0;k<i;k++){
System.out.print(i+" ");
}
}
}
}