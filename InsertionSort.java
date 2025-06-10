import java.util.*;
public class InsertionSort
{
	public static void main(String[] args) {
		int [] a=new int[5];
		Scanner sc=new Scanner (System.in);
		for(int i=0;i<a.length;i++)
		{
		    a[i]=sc.nextInt();
		}
		for(int i=1;i<a.length;i++)
		{
		    int key=a[i];
		    int j=i-1;
		    while(j>=0 && a[j]>key)
		    {
		        a[j+1]=a[j];
		        j-=1;
		    }
		    a[j+1]=key;
		}
		for (int i=0;i<a.length;i++)
		{
		    System.out.println(a[i]);
		}
	}
		
}