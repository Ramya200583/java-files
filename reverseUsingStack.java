import java.util.*;
public class reverseUsingStack
{
	public static void main(String[] args) {
	    Stack st=new Stack<> ();
	    Scanner sc=new Scanner(System.in);
	    String a=sc.nextLine();
	    for(int i=0;i<a.length();i++)
	    {
	        st.push(a.charAt(i));
	    }
	    String b="";
	    for(int i=0;i<a.length();i++)
	    {
	        b=b+st.pop();
	    }
	    System.out.println(b);
}
}