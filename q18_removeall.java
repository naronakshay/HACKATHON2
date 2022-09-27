package sep23;
import java.util.*;

public class q18_removeall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String> s= new HashSet<>();
		s.addAll(Arrays.asList(new String [] {"akshay","irene","adhwaith","krishnapriya"}));
		
		System.out.println("hash set "+s);
		
		s.clear();
		
		System.out.println("cleared hash set"+s);
	}

}
