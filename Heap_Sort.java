public class Heap_Sort{
    public static void Heapify(int[] arr,int size,int i){
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;
        if(left<size && arr[left]>arr[largest]){
            largest=left;
        }
        if(right<size && arr[right]>arr[largest]){
            largest=right;
        }
        if(i!=largest){
            int temp=arr[largest];
            arr[largest]=arr[i];
            arr[i]=temp;
            Heapify(arr,size,largest);
        }
    }
    public static void Heap(int[] arr,int size){
        for(int i=size/2-1;i>=0;i--){
            Heapify(arr,size,i);
        }
        for(int i=size-1;i>0;i--){
            int temp=arr[i];
            arr[i]=arr[0];
            arr[0]=temp;
            Heapify(arr,i,0);
        }
    }
    public static void main(String[] args) {
        int arr[]={4,3,1,2,7,6,5};
        int size=arr.length;
        Heap(arr, size);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}