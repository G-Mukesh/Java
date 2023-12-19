import java.util.*;
class Commonelements{
public static void main(String str[]){
int n1,n2;
Scanner s=new Scanner(System.in);
System.out.println("Enter the no.of elements in the first array : ");
n1=s.nextInt();
int arr1[]=new int[n1];
for(int i=0;i<n1;i++){
System.out.println("Enter the element " + i);
arr1[i]=s.nextInt();
}
System.out.println("Enter the elements in the second array : ");
n2=s.nextInt();
int arr2[]=new int[n2];
for(int i=0;i<n2;i++){
System.out.println("Enter the element "+ i);
arr2[i]=s.nextInt();
}
int arr3[]=new int[n2];
int k=0;
for(int i=0;i<n1;i++){
for(int j=0;j<n2;j++){
if(arr1[i]==arr2[j]){
arr3[k]=arr[i];
k++;
}
}
}
System.out.println( "The common elements are : \n");
for(int i=0;i<arr3.length();i++){
System.out.print(arr3[i] + " ");
}
}
}




