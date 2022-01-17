import java.util.ArrayList;

public class findtargets {
    public static void main(String[] args) {
        int[] arr1={1,1,2,1,4,1};
        int[] arr2={1,1,2,1,4,1,5,1};
        int[] arr3={1,1,2,1,4,1,1,2,1};
        search1(arr1,1,0);
        System.out.println(list);
        System.out.println(search2(arr2,1,0,new ArrayList<>()));
        System.out.print(search3(arr3,1,0));
    }
    static ArrayList<Integer> list=new ArrayList<>();

    static void search1(int[] arr,int target,int index)
    {
       if(index==arr.length)
       {
           return;
       }

       if(arr[index]==target)
       {
           list.add(index);
       }
       search1(arr,target,index+1);
    }

    static ArrayList search2(int[] arr,int target,int index,ArrayList<Integer> List)
    {
       if(index==arr.length)
       {
           return List;
       }

       if(arr[index]==target)
       {
           List.add(index);
       }
       return search2(arr,target,index+1,List);
    }
    static ArrayList search3(int[] arr,int target,int index)
    {
        ArrayList<Integer> listt=new ArrayList<>();
       if(index==arr.length)
       {
           return listt;
       }

       if(arr[index]==target)
       {
           listt.add(index);
       }
       ArrayList<Integer> ansFromBelow=search3(arr,target,index+1);

       listt.addAll(ansFromBelow);

       return listt; 
    }
}
