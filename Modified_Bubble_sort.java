public class Modified_Bubble_sort {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int size=arr.length;
        int i,j,temp;
        int flag=0;
        int count=0;
        for(i=1;i<size;i++){
            for(j=0;j<size-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    flag=1;
                }
            }
            count++;
            if(flag==0){
                break;
            }
        }
        System.out.println(count);
        for (int k : arr) {
            System.out.print(k+" ");
        }
    }
}
