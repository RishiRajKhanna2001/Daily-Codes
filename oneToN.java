import java.util.Scanner;

public class oneToN {
    public static void main(String[] args) {
       
    printTillN(6);   
    }
    static void printTillN(int n)
    {
        if(n==0)
        {
            return;
        }

        printTillN(n-1);
        System.out.println(n);
    }
    
}
    
