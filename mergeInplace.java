import java.util.Arrays;

public class mergeInplace {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        sort(arr,0,arr.length);
        System.out.print(Arrays.toString(arr));
    }

    static void sort(int[] arr,int s,int e)
    {
        if(e-s==1)
        {
            return;
        }
        int m=(s+e)/2;
        sort(arr,s,m);
        sort(arr,m,e);
        merge(arr,s,m,e);
    }

    static void merge(int[] arr,int s,int m,int e)
    {
        int[] merged=new int[e-s];

        int i=s;
        int j=m;
        int k=0;

        while(i<m && j<e)
        {
            if(arr[i]<arr[j])
            {
                merged[k]=arr[i];
                k++;
                i++;
            }
            else{
                merged[k]=arr[j];
                k++;
                j++;
            }
        }
        while(i<m)
        {
            merged[k]=arr[i];
            k++;
            i++;
        }
        while(j<e)
        {
            merged[k]=arr[j];
            k++;
            j++;
        }
        //for copying merged ke elemens to original array
        for(int q=0,p=s;i<merged.length;q++,p++)
        {
               arr[p]=merged[q];
        }
    }
    
}
