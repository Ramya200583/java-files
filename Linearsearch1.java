import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int [] a=new int[6];
		Scanner sc=new Scanner (System.in);
		for(int i=0;i<a.length-1;i++)
		{
		    a[i]=sc.nextInt();
		}
		System.out.println("enter s:");
		int s=sc.nextInt();
		for(int i=0;i<a.length-1;i++)
		{
		    if(a[i]==s)
		    {
		        System.out.println(i);
		        System.exit(0);
		    }
		}
		System.out.println("not found");
	}
}