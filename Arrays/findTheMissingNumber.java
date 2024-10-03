package Arrays;

public class findTheMissingNumber {
    
    public static void main(String[] args) {
     // an array of size n. it should contain elements 1 to n.
     // but the given array has n-1 elements , find the missing array element
     
     int a[]={1,2,3,4,6,7,8};

     System.out.println("Finding the missing element brute force");
    int missingElement=Integer.MAX_VALUE;
     int n=a.length+1;
        boolean hasMissingElementBeenFound=true;
     for( int i=1;i<=n;i++){
        hasMissingElementBeenFound=true;
        for(int j=0;j<a.length;j++){
            if(i==a[j]){
                hasMissingElementBeenFound=false;
                break;
            }
        }
        //if the flag remains to be true.
        if(hasMissingElementBeenFound==true){
            missingElement=i;
        }
     }
     System.out.println("Missing Element "+missingElement);
     

     //Better approach will be to use hasharray

     int[] hasharray= new int[a.length+1];
     int missingElementFromHashArray=Integer.MIN_VALUE;
     boolean allElementsAreThere=true;
     for( int e: hasharray){
        //initialising all elements to zero
        e=0;
     }

     for( int i=1;i<=a.length;i++){
        if(a[i-1]==i){
            hasharray[i]++;
        }
     }
     for( int i=1;i<hasharray.length;i++){
        if(hasharray[i]!=1){
            allElementsAreThere=false;
            missingElementFromHashArray=i;
            break;
        }
     }
     if(allElementsAreThere==false){
        System.out.println("Missing element from hash array "+missingElementFromHashArray);
     }


     // Most optimal solution will be to use XOR operations
     // XOR operations are denoted by ^ and X^X=0 and X^0=X

     int XOR_1=0; // XOR of first N integers
     int XOR_2=0;

     int n2=a.length;
     for( int i=0;i<n2;i++){
        XOR_1 = XOR_1^(i+1);// because i is starting from 0 we need add 1;
        XOR_2 = XOR_2^(a[i]);
     }
     XOR_1=XOR_1^(n2+1);// the end element needs to be XORed as it not XORed in the loop

     System.out.println("Missing element with optimal approach is " + (XOR_1^XOR_2));
    }
}
