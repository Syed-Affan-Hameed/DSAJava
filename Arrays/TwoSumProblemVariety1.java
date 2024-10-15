package Arrays;
public class TwoSumProblemVariety1 {
    public static void main(String[] args) {
        
        int a[]={0,1,44,4,4,4,7,8,99,100};
        int n=a.length;
        int targetSum=199;
        // brute force approach
        for( int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]+a[j]==targetSum){
                    System.out.println("TargetSum can be made by adding elements at "+i+" and "+j);
                }
            }
        }

    }
}
