public class Merge_Sort{
    public static void Divide(int[] arr,int size){
        int mid=size/2;
        int i=0,j=0,p=0;
        int[] left=new int[mid];
        int[] right=new int[size-mid];
        if(arr.length==1){
            return;
        }
        for(;i<mid;i++){
            left[i]=arr[p++];
        }
        for(;j<size-mid;j++){
            right[j]=arr[p++];
        }
        Divide(left, mid);
        Divide(right, size-mid);
        Merge(arr,left,right);
    }
    public static void Merge(int[] arr,int[] left,int[] right){
        int lt,rt,p;
        lt=rt=p=0;
        while(lt<left.length && rt<right.length){
            if(left[lt]<=right[rt]){
                arr[p++]=left[lt++];
            }
            else{
                arr[p++]=right[rt++];
            }
        }
        for(;lt<left.length;lt++){
            arr[p++]=left[lt];
        }
        for(;rt<right.length;rt++){
            arr[p++]=right[rt++];
        }
    }
    public static void main(String[] args) {
        int[] arr={5,78,3,56,2,5,7,34};
        int size=arr.length;
        Divide(arr, size);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}