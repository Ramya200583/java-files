public class Recursion 
{
    public static void add(int n)
    {
        if(n==11) return;
        System.out.println(n);
        add(n+1);
    }
    public static void main(String[] args){
        add(1);
    }
}