package Arrays;

import java.util.HashMap;

public class longestSubArrayWithSumK {
    public static void main(String[] args) {
        
        int a[]={1,2,3,1,1,1,1,5,6};
        int n=a.length;
        int Sum=5; // given length for the problem
        //brute force approach O(n2)
        int longestLength=0;// variable used to track the longest subarray's length
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
            
                    sum=sum+a[j];
                    if(sum==Sum)
                    {
                        longestLength=Math.max(longestLength, j-i+1);// +1 is because fo zero based indexing
                    }
                
            }
        }
        System.out.println(longestLength);

        //optimal approach - using HashMap

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        // int a Sum=4

        int currSum=0;
        int sum=5;
        int start =0;
        int end=-1;
        int maxLen=0;

        for(int i=0;i<n;i++){

            currSum+=a[i];
            
            if(map.containsKey(currSum-sum)){
                start = map.get(currSum-sum)+1;
                end = i;
                maxLen=Math.max(maxLen, (end-start)+1);
            }
                map.put(currSum, i);
        }
        if(end==-1){
            System.out.println("Sum not found!");
        }
        else{
            System.out.println(maxLen);
        }



    }
}
