import java.util.*;
class CalcStudent{
public static void main(String str[]){
int user,staff,student;
Scanner s=new Scanner(System.in);
System.out.println("Enter the total no.of users : ");
user=s.nextInt();
System.out.println("Enter the no.of staffs :");
staff=s.nextInt();
int nstaff=staff/3;
student=user-(staff+nstaff);
System.out.println("No.of Students are : " + student);
}
}



