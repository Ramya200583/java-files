import java.util.Stack;
public class stack2
{
	public static void main(String[] args) {
	    Stack s=new Stack <> ();
	    s.push(1);
	    s.push(2);
	    s.push(3);
	    System.out.println("elements are "+s);
	    System.out.println("peek element is "+s.peek());
	    System.out.println("pop element is "+s.pop());
	    System.out.println("after popping the elements are "+s);
}
}