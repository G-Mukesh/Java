import java.util.*;
class Remove{
public static void main(String str[]){

int n,k=0;
int arr[]=new int[20];
Scanner s=new Scanner(System.in);
System.out.println("Enter the no.of elements in array : ");
n=s.nextInt();
for(int i=0;i<n;i++){
System.out.println("\nElement : " + i);
arr[i]=s.nextInt();

}
int newarr[]=new int[n];
for(int i=0;i<n;i++){
int c=0;
for(int j=0;j<k;j++){
if(newarr[j]==arr[i]){
c++;
}
}
if(c==0){
newarr[k]=arr[i];
k++;
}
}
System.out.println("The elements afte removal of duplicate elements \n");
for(int i=0;i<k;i++){
System.out.print(newarr[i]+" ");
}
}
}
