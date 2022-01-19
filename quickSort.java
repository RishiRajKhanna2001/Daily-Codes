import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
    int[] arr={5,4,3,2,1};
    sort(arr,0,arr.length-1);
    System.out.println(Arrays.toString(arr));    
    }

    static void sort(int[] arr,int low,int high)
    {
        if(low>=high)
        {
            return;
        }

        int s=low;
        int e=high;
        int m=s+(e-s)/2;
        int pivot=arr[m];

        while(s<=e)
        {
            while(arr[s]<pivot)
            {
                s++;
            }
            while(arr[e]>pivot)
            {
                e--;
            }
            if(s<=e)
            {
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        //now sort two halfs
        sort(arr, s, high);
        sort(arr, low, e);
    }
    
}
