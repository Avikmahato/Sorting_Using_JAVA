public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr={4,1,2,3,5};
        int size=arr.length;
        int i,j,temp;
        for(i=1;i<size;i++){
            for(j=0;j<size-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int k : arr) {
            System.out.print(k+" ");
        }
    }
}
