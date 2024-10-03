package Arrays;

public class moveAllTheZerosToTheEnd {
    
    public static void main(String[] args) {

        int a[]={0,1,3,0,5,3,8,0,1,0};

        int j;
        int n=a.length;
        j=-1;
        //finding the first zero
        for( int i=0;i<n;i++){
            if(a[i]==0){
            j=i;
            break;
            }
        }
        // j will always be pointing to 0.
        for(int i=j+1;i<n;i++){
            if(a[i]!=0){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
            }

        }
        for(int e:a){
            System.out.print(e+" ");
        }
    }
}
