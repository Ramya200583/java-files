import java.util.*;
public class BubbleSort
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
		    for(int j=0;j<a.length-1-i;j++)
		    {
		        if(a[j]>a[j+1])
		        {
		            int temp=a[j];
		            a[j]=a[j+1];
		            a[j+1]=temp;
		        }
		    }
		}
		System.out.println("the sorting order of numbers are:");
		for(int i=0;i<a.length;i++)
		{
		    System.out.println(a[i]);
		}
	}

}