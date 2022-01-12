public class getBit {
    public static void main(String[] args) {
        int n=5;
        int pos=3;

        int mask=1<<pos;
        if((n&mask)==0)
        {
            System.out.print(0);
        }
        else{
            
            System.out.print(1);
        }
    }
    
}
