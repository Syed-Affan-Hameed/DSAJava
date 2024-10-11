package Arrays;

public class findTheMaxConsecutive1s {
    public static void main(String[] args) {
        
        System.out.println("Finding the max no of consecutive 1s");
        int a[]={1,0,1,1,1,0,0,0,0,1};
        int n=a.length;
        int maxConsecOnes=0;
        int currentOnesCount=0;
        for(int i=0;i<n-1;i++){
            if((a[i]==1)){
                currentOnesCount++;
                maxConsecOnes=(maxConsecOnes>currentOnesCount)?maxConsecOnes:currentOnesCount;
            }
            else{
                currentOnesCount=0;
            }
        }
System.out.println(maxConsecOnes);
    }
}
