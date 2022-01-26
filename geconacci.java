import java.util.Scanner;

public class geconacci {
    public static void main(String[] args) {
        // Scanner in=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++)
	    {
	        int a=sc.nextInt();
	        int b=sc.nextInt();
	        int c=sc.nextInt();
	        int n=sc.nextInt();
		System.out.print(number(n,a,b,c));
	    }
	}
	static int number(int n,int a,int b,int c)
	{
	    if(n==0)
	    {
	        return a;
	    }
	    if(n==1)
	    {
	        return b;
	    }
	    if(n==2)
	    {
	        return c;
	    }
	    
	    return number(n-1,a,b,c);
	}
}
