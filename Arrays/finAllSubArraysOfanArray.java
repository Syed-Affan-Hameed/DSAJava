package Arrays;

public class finAllSubArraysOfanArray {
    
    public static void main(String[] args) {
        System.out.println("Finding all the subarray of a given array");
        int a[]={1,2,3,4,5,6};
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(a[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
