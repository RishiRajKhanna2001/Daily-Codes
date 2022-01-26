import java.util.ArrayList;

public class subseq {
    public static void main(String[] args) {
        // subseq("", "abc");
        // System.out.println(subSeq("", "abc"));
        // subSeqAscii("", "abc");
        System.out.println(subSeqAsciiList("", "abc"));
    }
    static ArrayList<String>  subSeq(String p,String up)
    {
        if (up.isEmpty()) {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);

        ArrayList<String> left= subSeq(p+ch, up.substring(1));
        ArrayList<String> right= subSeq(p, up.substring(1));

        left.addAll(right);
        return left;
        
    }
    static ArrayList<String>  subSeqAsciiList(String p,String up)
    {
        if (up.isEmpty()) {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);

        ArrayList<String> first= subSeqAsciiList(p+ch, up.substring(1));
        ArrayList<String> second= subSeqAsciiList(p+(ch+0), up.substring(1));
        ArrayList<String> third= subSeqAsciiList(p, up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
        
    }
    static void  subSeqAscii(String p,String up)
    {
        if (up.isEmpty()) {
          System.out.println(p);;
          return;
        }
        char ch=up.charAt(0);

        subSeqAscii(p+ch, up.substring(1));
        subSeqAscii(p+(ch+0), up.substring(1));
        subSeqAscii(p, up.substring(1));

    }
}
