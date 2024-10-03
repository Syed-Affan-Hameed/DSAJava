package Arrays;

public class leftRotateArraybyKplaces {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int k=4;
        int temp[]=new int[k];
        int n=a.length;
        for(int i=0;i<k;i++){
            temp[i]=a[i];
        }
        for(int i=k;i<n;i++){
            a[i-k]=a[i];
        }

        for (int i = 0; i < k; i++) {
            a[n - k + i] = temp[i];  // Use 'i' as the index for temp[]
        }
        System.out.println("Array after rotation of "+k+"places");
        for(int e:a){
            System.out.println(e+" ");
        }
    }
}
