import java.util.*;
public class count_string
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String a=sc.nextLine();
	    int count=0;
	    char b=sc.next().charAt(0);
	    for(int i=0;i<a.length();i++)
	    {
	        if(b==a.charAt(i))
	        {
	            count+=1;
	        }
	    }
	    System.out.println(count);
	 
	}
}