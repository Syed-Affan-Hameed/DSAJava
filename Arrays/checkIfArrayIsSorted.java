package Arrays;

public class checkIfArrayIsSorted {
    public static void main(String[] args) {
    System.out.println("Check if array is sorted");
    int a[]={44,95,63};
    int n=a.length;
    boolean isSorted=true;
    for(int i=1;i<n;i++)
    {
        if(a[i-1]<=a[i]){
            isSorted=true;
        }
        else{
            isSorted=false;
            break;
        }
    }
if(isSorted){
    System.out.println("Array is sorted");
}
else{
    System.out.println("Array is not sorted");
}
    }
}
