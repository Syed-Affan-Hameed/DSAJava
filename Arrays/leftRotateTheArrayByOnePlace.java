package Arrays;

public class leftRotateTheArrayByOnePlace {
    public static void main(String[] args) {
        System.out.println("Left rotate the array by once place");
        int a[] = {1,2,3,4,5,6,7,8};
        int rotateElement=a[0];
        int n=a.length;
        for(int i=1;i<n;i++){
            a[i-1]=a[i];
        }
        a[n-1]=rotateElement;

        System.out.println("rotated array");
        for(int e:a){
            System.out.print(e+" ");
        }
    }
}
