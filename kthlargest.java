import java.util.*;
class Sort{
	
	public int sorting(int[] arr){
		int i,j,small;
		int l=arr.length;
		for(i=0;i<l;i++){
			int temp=arr[i];
			for(j=i;j<l;j++){
				if(temp>arr[j]){
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return new arr[];
	}
}

class Find{
	public static void main(String atr[]){
		int[] arr=new int[50];
		int n,i,k;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no.of elements in the array");
		n=s.nextInt();
		for(i=0;i<n;i++){
			System.out.println("Enter the"+i+"th element ");
			arr[i]=s.nextInt();
		}
		arr[]=sorting(arr);
		System.out.println("enter the kth largest element to be printed");
		k=s.nextInt();
		System.out.println(arr[k-1]+"is the "+k+"th largest element");
	}
}
