package Arrays;

public class findTheSecondLargestElement {
    
    public static void main(String[] args) {
        System.out.println("Given an array find the second largest element");

        int a[]={3,3};
        int secondLargest=Integer.MIN_VALUE;
        int largest=a[0];
        int n= a.length;
        for( int i=0;i<n;i++){
            if(a[i]>largest){
                secondLargest=largest;
                largest=a[i];
            }
            if(a[i]==largest){
                continue;
            }
            if(a[i]<largest && a[i]>secondLargest){
                secondLargest=a[i];
            }
        }
        if(largest==secondLargest|| secondLargest==Integer.MIN_VALUE){
          System.out.println(-1);
        }
        System.out.println("Second largest element in array");
        System.out.println(secondLargest);
    }
}
