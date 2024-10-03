package Arrays;

import java.util.ArrayList;
import java.util.List;

public class UnionOfTwoSortedArrays {
   public static void main(String[] args) {
    
    //Find the union of two sorted arrays

    int a[]={1,2,3,4,5,6};
    int b[]={4,5,6,7,8,9,9,9,9,10};

    int n=a.length;
    int m=b.length;
    List<Integer> union= new ArrayList<Integer>();
    int i=0,j=0;

    while(i<a.length && j<b.length){

        while(i<a.length-1 && a[i]==a[i+1]){
            i++;
        }
        while(j<b.length-1 && b[j]==b[j+1]){
            j++;
        }

        if(a[i]<b[j]){
            union.add(a[i]);
            i++;
        }
        else if(a[i]>b[j]){
            union.add(b[j]);
            j++;
        }
        else{
            union.add(a[i]);
            i++;j++;
        }


    }

    while(i<a.length ){
        if(i<a.length-1 && a[i]==a[i+1]){
            i++;
        }
        else{
            union.add(a[i]);
            i++;
        }
      
    
    }
    while(j<b.length){
        if(j<b.length-1 && b[j]==b[j+1]){
            j++;
        }
        else{
            union.add(b[j]);
            j++;
        }
    }
    for(Integer e: union){
        System.out.print(e+" ");
    }

   } 
}
