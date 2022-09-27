package sep23;
import java.util.*;

public class q17_comapreandretain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String> s = new  HashSet<>();
		Set <String> s2 = new  HashSet<>();
		
		s.addAll(Arrays.asList(new String [] {"akshay","irene","adhwaith","krishnapriya"}));
		s2.addAll(Arrays.asList(new String [] {"nahla","vyshak","adhwaith","krishnapriya"}));
		
		System.out.println("hashset 1"+s);
		System.out.println("hashset 1"+s2);
		
		Set <String> s3 = new  HashSet<>(s);
		s3.retainAll(s2);
		
		System.out.println("compared set"+s3);
	}

}
