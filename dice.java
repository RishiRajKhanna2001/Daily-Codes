public class dice {
    public static void main(String[] args) {
        dice(4, "");
    }
    static void dice(int target,String p)
    {
        if (target==0) {
            System.out.println(p);
            return;
            
        }

        for(int i=1;i<=6 && i<=target ;i++)
        {

            dice(target-i, p+i);
        }
    }
    
}
