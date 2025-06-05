import java.util.*;
 public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n value:");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.println("the fibonacci series is:");
        for(int i=1;i<=n;i++)
        {
             int c=a+b;
             System.out.println(c);
            a=b;
            b=c;
        }
        
        
    }     
}

