public class RemoveA {
    public static void main(String[] args) {
     String str="baccappedkhaapp";
    //  String ans="";

    //  System.out.print(remove(str, ans, 0));

    //  skip(str, "");
    //  System.out.print(ans);
     
     
    //  System.out.print(skip(str));
     System.out.print(skipStrNotString(str));
    }

    static String remove(String s,String ans,int index)
    {
        if(index==s.length())
        {
            return ans;
        }
        
       
        if(s.charAt(index)!='a')
        {
         ans+=s.charAt(index);
        }
        return remove(s,ans,index+1);

        
    } 

    static void skip(String us,String s)
    {
        if(us.isEmpty())
        {
            System.out.println(s);
            return;
        }

        char ch=us.charAt(0);

        if(ch=='a')
        {
            skip(us.substring(1), s);
        }
        else{
            skip(us.substring(1), s+ch);
        }

    }
    static String skip(String us)
    {
        if(us.isEmpty())
        {
            
            return "";
        }

        char ch=us.charAt(0);

        if(ch=='a')
        {
           return skip(us.substring(1));
        }
        else{
            return ch+skip(us.substring(1));
        }

    }

    static String skipString(String us)
    {
        if(us.isEmpty())
        {
            
            return "";
        }

        char ch=us.charAt(0);

        if(us.startsWith("apple"))
        {
           return skipString(us.substring(5));
        }
        else{
            return ch+skipString(us.substring(1));
        }

    }
    static String skipStrNotString(String us)
    {
        if(us.isEmpty())
        {
            
            return "";
        }

        char ch=us.charAt(0);

        if(us.startsWith("app") && !us.startsWith("apple"))
        {
           return skipStrNotString(us.substring(3));
        }
        else{
            return ch+skipStrNotString(us.substring(1));
        }

    }

    
}
 