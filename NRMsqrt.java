public class NRMsqrt {
    public static void main(String[] args) {
        int n=40;
        System.out.print(sqrt(n));
    }
    static double sqrt(int n)
    {
       double x=n;
       double root;
       while(true)
       {
          root=0.5*(x+n/x);
          if(Math.abs(root-x)<1)
          {
              break;
          }
          x=root;
       }
       return root;
    }
    
}
