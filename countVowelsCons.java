import java.util.*;
public class countVowelsCons
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String a=sc.nextLine();
	    int vcount=0;
	    int ccount=0;
	    for(int i=0;i<a.length();i++)
	    {
	        char b=a.charAt(i);
	    if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u'){
	        vcount+=1;
	    }
	    else{
	        ccount+=1;
	    }
	 
	}
	System.out.println(vcount);
	System.out.println(ccount);
	}
}
