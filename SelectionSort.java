import java.util.*;
public class SelectionSort
{
	public static void main(String[] args) {
		int [] a=new int[5];
		Scanner sc=new Scanner (System.in);
		for(int i=0;i<a.length;i++)
		{
		    a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length-1;i++)
		{
		    int m=i;
		    for(int j=i+1;j<a.length;j++)
		    {
		        if(a[j]<a[m]) m=j;
		    }
		    int temp=a[i];
		    a[i]=a[m];
		    a[m]=temp;
		}
		for(int i=0;i<a.length;i++)
		{
		    System.out.println(a[i]);
		}
	}
}