package sep23;
import java.util.*;
public class q20_elementslessthan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet <Integer> n = new TreeSet<Integer>();
		
		n.addAll(Arrays.asList(new Integer [] {5,8,-1,9,7,2,3}));

		System.out.println("hashset"+n);
		
		System.out.println("enter the element");
		Scanner sc=new Scanner(System.in);
		Integer e=sc.nextInt();
		
		TreeSet <Integer> n1 = new TreeSet<Integer>();
		
		n1= (TreeSet<Integer>)n.subSet(n.first(),e);
		Iterator i =n1.iterator();
		while(i.hasNext())
			System.out.println(i.next()+" ");

	}

}
