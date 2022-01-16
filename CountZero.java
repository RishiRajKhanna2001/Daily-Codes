public class CountZero {

    static int zero(int n,int c)
    {
        if (n==0) {
            return c;
        }

        if(n%10==0)
        {
            return zero(n/10, c+1);
        }
        else{
            return zero(n/10, c);

        }
    }
    static int count(int n)
    {
        int c=0;
        return zero(n,c);
    }
    public static void main(String[] args) {
        System.out.print(count(1002030020));
    }
    
}
