// package MathsForDSA;
class isPrime {
public static void main(String[] args) {
    int a=20;
    for(int i=1;i<=a;i++)
    {
        // System.out.println(i+" "+isPrime(i));
        // System.out.println();
        if (isPrime(i)) {
            System.out.println(i);
            
        }
        
    }
}

static boolean isPrime(int n)
{
    if(n<=1)
    {
        return false;
    }
    int c=2;
    while(c*c<=n)
    {
        if(n%c==0)
        {
            return false;
        }
        c++;
    }
    return true;
}
    
}