package sep23;
import java.util.*;
public class q16_hashtotree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String> s = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of elements");
		int n= sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("entr the elements");
			String e=sc.next();
			s.add(e);
			
			
		}
		
		System.out.println("Hash Set"+s);
		
		Set <String> t = new TreeSet<>(s);
		System.out.println("Tree set"+t);
		
	}

}
