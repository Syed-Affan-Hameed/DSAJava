package Arrays;

import java.util.HashMap;
import java.util.Map;

public class findDuplicateElementsInAnArray {
    public static void main(String[] args) {

        int a[]={0,1,44,4,4,4,7,8,99,99,100};
        int n=a.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        for( int i=0;i<n;i++){
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            }
            else{
                map.put(a[i], 1);
            }
        }
        System.out.println("The Duplicate elements are:-");
      for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        if(entry.getValue()>1){
            System.out.println(entry.getKey()+" occurs "+entry.getValue()+" times");
        }
        }
    }
}
