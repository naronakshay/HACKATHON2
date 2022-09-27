package sep23;
import java.util.*;
public class q19_comparetree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <Integer> n = new TreeSet<>();
		Set <Integer> n1 = new TreeSet<>();
		
		n.addAll(Arrays.asList(new Integer [] {1,2,3,4,5,6}));
		n1.addAll(Arrays.asList(new Integer [] {1,2,3,4,5,6}));
		
		if(n.equals(n1))
			System.out.println("equal");
		else
			System.out.println("not equal");

	}

}
