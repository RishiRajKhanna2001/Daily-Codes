public class firstCapital {
    public static void main(String[] args) {
        capital("geekS");
    }
    static void capital(String s)
    {
        if(s.isEmpty())
        {
            return;
        }
         
        char ch=s.charAt(0);
        if(ch>='A' && ch<='Z')
        {
            System.out.println(ch);
            return;
        }

        capital(s.substring(1));
    } 
    
}
