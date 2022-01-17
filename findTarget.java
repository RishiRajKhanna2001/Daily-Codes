public class findTarget {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(index(arr, 9, 0));
        System.out.println(exist(arr, 9, 0));
    }
    static boolean exist(int[] arr,int target,int index)
    {
        if(index==arr.length)
        {
            return false;
        }

        return arr[index]==target || exist(arr, target, index+1);
    }

    static int index(int[] arr,int target,int index)
    {
        if(index==arr.length)
        {
            return -1;
        }

        if(arr[index]==target)
        {
            return index;
        }
        else{
            return index(arr, target, index+1);
        }
       
    }
    
}
