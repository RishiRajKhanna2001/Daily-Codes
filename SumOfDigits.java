public class SumOfDigits {
    public static void main(String[] args) {
        int n=1543;
        System.out.print(sum(n));
    }
    static int sum(int n)
    {
       if(n==0)
       {
           return 0;
       }

       return sum(n/10)+(n%10);

    }
    
}
