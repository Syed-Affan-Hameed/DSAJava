package Arrays;

public class FindTheNumberWhichAppearsOnce {

    public static void main(String[] args) {
        
        int a[]={1,1,2,2,3,3,4,5,5,6,6};

        //Most Optimal Solution.
        int XorElement=0;
        for(int i=0;i<a.length;i++){
            XorElement=XorElement^a[i];
        }

        System.out.println("The element which appears only once is "+ XorElement);

    }
}
