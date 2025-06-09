public class Recursion3
{
	public void fun(int n)
	{
	    if(n==11) 
	    {
	       System.out.println("biryani");
	       return;
	    }
	    System.out.println(n);
	     fun(n+1);
	    System.out.println(n);
	   
	}
	public static void main(String[] args){
	    Main m=new Main();
	    m.fun(1);
	}
}
		