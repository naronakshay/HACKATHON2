package sep23;
import java.util.*;
public class q1_comparearraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   ArrayList<String> c1= new ArrayList<String>();
	        c1.add("Red");
	        c1.add("Green");
	        c1.add("Black");
	        c1.add("White");
	        c1.add("Pink");

	 

	 

	       ArrayList<String> c2= new ArrayList<String>();
	        c2.add("Red");
	        c2.add("Green");
	        c2.add("Black");
	        c2.add("Pink");

	 

	 

	       
	        ArrayList<String> c3 = new ArrayList<String>();
	        for (String e : c1)
	           c3.add(c2.contains(e) ? "Yes" : "No");
	        System.out.println(c3);
	        if(c3.equals(c1))
	        {
	        	System.out.println("equal");
	        }
	        else
	        	System.out.println("not equal");
	}

}
