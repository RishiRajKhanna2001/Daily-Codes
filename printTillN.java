class printTillN{
    public static void main(String[] args) {
        int n=5;
        // printN(n);
        // printNreverse(n);
        printNboth(n);
    }
    public static void printN(int n)
    {
        if(n==0)
        {
            return;
        }

        printN(n-1);
        System.out.println(n);
    }
    public static void printNreverse(int n)
    {
        if(n==0)
        {
            return;
        }

        System.out.println(n);
        printNreverse(n-1);
    }
    public static void printNboth(int n)
    {
        if(n==0)
        {
            return;
        }

        System.out.println(n);
        printNboth(n-1);
        System.out.println(n);
    }
}