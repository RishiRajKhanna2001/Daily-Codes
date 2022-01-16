public class productOfDigits {
    public static void main(String[] args) {
        int n=1543;
        System.out.print(prod(n));
    }
    static int prod(int n)
    {
       if(n==0)
       {
           return 1;
       }

       return prod(n/10)*(n%10);

    }
}
