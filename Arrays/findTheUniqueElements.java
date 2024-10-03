package Arrays;

public class findTheUniqueElements {
    public static void main(String[] args) {
        System.out.println("Program to find the unique elements in an array (inplace)");

        int a[]={0,1,44,4,4,7,8,99,99,100};
        int n=a.length;
        int i,j;
        i=0;
        for(j=0;j<n;j++){
            if(a[i]!=a[j]){
                a[i+1]=a[j];
                i++;
            }
        }
        // Now i+1 is the number of unique elements of the array

        System.out.println("The number of unique elements in the array are :"+(i+1));
        System.out.println("The inplace array is");
        for(int e:a){
            System.out.print(e+" ");
        }
    }
}
