public class clearBit {
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int  mask=1<<pos;
        int oriMask=~(mask);
        

        System.out.print(oriMask&n);
    }
    
}
