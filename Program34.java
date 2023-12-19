public class Program34a extends thread{
    public void run(){
        int a,b;
        a=0;
        b=1;
        System.out.println("Fibonacci Series");

        for(int i=0;i<10;i++){
            sum=a+b;
            a=b;
            b=sum;
            System.out.print(sum " ");


        }
    }

    
}
public class Program34 extends thread {
    public void run(){
        int i;
        System.out.println("1 to 10 in reverse order");
        for(i=10;i>0;i++){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Program34a p=new Program34a();
        Program34 q=new Program34();
        p.start();
        q.start();
    }

    
}
