package sep23;
import java.util.*;
public class q15_hashsettoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
        set.add("1");
        set.add("13");
        set.add("27");
        set.add("87");
        set.add("19");
  
        System.out.println("Hash Set Contains :" + set);
        String arr[] = new String[set.size()];
          
        int i=0;
        
        // iterating over the hashset
        for(String ele:set){
          arr[i++] = ele;
        }
  
        for (String n : arr)
            System.out.println(n);
	}

}
