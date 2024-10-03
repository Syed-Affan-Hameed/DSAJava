package Arrays;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        // find the first occurence of any given element;
        int a[]={0,1,44,4,4,7,8,99,99,100};
        Scanner sc= new Scanner(System.in);
        System.out.println("Input the element to find");
        int element=sc.nextInt();
        int n= a.length;
        int index=-1;
        for(int i=0;i<n;i++){
            if(a[i]==element){
                index=i;
                System.out.println("Element found at index " +index);
                break;
            }
        }
        if(index==-1){
            System.out.println("Element not found");
        }
    }
}
