public class productOfTwo {
    public static void main(String[] args) {
        System.out.println(product(5, 6));
    }
    static int product(int a,int b)
    {
      if(b==1)
      {
          return a;
      }
      return a+product(a, b-1);
    }
    
}
