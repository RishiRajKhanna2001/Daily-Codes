public class specialFibo {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.println(specialFibo(5, a, b));
    }
    static int specialFibo(int n,int a,int b)
    {
        if (n==0) {
            return a;
        }
        if (n==1) {
            return b;
        }

        return specialFibo(n-1, a, b)^specialFibo(n-2, a, b);
    }
    
}
