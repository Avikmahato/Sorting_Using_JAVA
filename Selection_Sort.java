public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr={5,1,2,4,3};
        int size=arr.length;
        int i,j,min,pos,temp;
        for(i=0;i<size-1;i++){
            min=arr[i];
            pos=i;
            for(j=i+1;j<size;j++){
                if(min>arr[j]){
                    min=arr[j];
                    pos=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[pos];
            arr[pos]=temp;
        }
        for (int k : arr) {
            System.out.print(k+" ");
        }
    }
}
