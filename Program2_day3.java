import java.util.Scanner;

public class Program2_day3 {
    public static void main(String str[]){

        String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] daysOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        int num = 0;
        int year,month,day;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the day, month and year : ");
        day=s.nextInt();
        month=s.nextInt();
        year=s.nextInt();
        for (int i = 1971; i < year; i++) {
            if (i % 4 == 0) {
                num += 366;
            }
            else {
                num += 365;
            }
        }
        if (year % 4 == 0) daysOfMonth[1] = 29;
        for (int i = 0; i < month - 1; i++) {
            num += daysOfMonth[i];
        }
        num += day - 1;
        System.out.println(week[(num + 5) % 7]);
    }
  
    
    
}
