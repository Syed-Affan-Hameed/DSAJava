package Arrays;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int b[]={4,5,6,7,8,9,9,9,9,10};
        int i=0;
        int j=0;
            List<Integer> intersection= new ArrayList<Integer>();
        while(i<a.length&&j<b.length){
            while(i<a.length-1&& a[i]==a[i+1]){
                i++;
            }
            while(j<b.length-1 && b[j]==b[j+1]){
                j++;
            }
            if(a[i]<b[j]){

                i++;
            }
            else if(a[i]>b[j]){

                j++;
            }
            else{
                intersection.add(a[i]);
                i++;j++;
            }
        }
        for(Integer e: intersection){
            System.out.print(e+" ");
        }
    }

}
