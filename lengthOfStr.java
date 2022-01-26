public class lengthOfStr {
    public static void main(String[] args) {
        System.out.println(countStr("acbd",0));
    }
    static int countStr(String s,int count)
    {
        if(s.isEmpty())
        {
            return count;
        }
        return countStr(s.substring(1), count+1);
    }
    
}
