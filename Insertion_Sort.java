public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr={5,4,3,1,2};
        int size=arr.length;
        int i,j,temp;
        for(i=0;i<size;i++){
            temp=arr[i];
            for(j=i-1;j>=0&&arr[j]>temp;j--){
                arr[j+1]=arr[j];
            }
            arr[j+1]=temp;
        }
        for (int k : arr) {
            System.out.print(k+" ");
        }
    }
}
