public class factorial {
    public static void main(String[] args) {
        int n=4;
        System.out.println(factorial(n));
    }

    public static int factorial(int n)
    {
        if(n==0 || n==1)
        {
            // System.out.print(n);
            return n;
        }
      
        return n*factorial(n-1);

    
    }
}
