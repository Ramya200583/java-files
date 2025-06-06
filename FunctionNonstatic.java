public class FunctionNonstatic 
{
    public  void add()
    {
        int a=6;
        int b=4;
        int c=a+b;
        System.out.println(c);
    }
    public static void main(String[] args){
        Main m=new Main();
        m.add();
    }
}