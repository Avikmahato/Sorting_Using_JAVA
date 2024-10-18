public class Quick_Sort {
    public static int partition(int[] arr ,int p,int q){
        int i=p;
        int j=p-1;
        int temp;
        int pivot=arr[q];
        while(i<q){
            if(arr[i]<=pivot){
                temp=arr[i];
                arr[i]=arr[++j];
                arr[j]=temp;
            }
            i++;
        }
        temp=arr[q];
        arr[q]=arr[++j];
        arr[j]=temp;
        return j; 
    }
    public static void Quick(int[] arr,int a,int b){
        if(a<b){
            int s=partition(arr, a, b);
            Quick(arr, a, s-1);
            Quick(arr,s+1,b);
        }
    }
    public static void main(String[] args) {
        int[] arr={4,2,1,3,5,6,8,9,12};
        int size=arr.length;
        Quick(arr, 0, size-1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
