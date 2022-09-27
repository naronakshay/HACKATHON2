package sep23;
import java.util.*;
public class q12_jointwolinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l1 = new LinkedList<Integer>();
        l1.add(1);
        l1.add(3);
        l1.add(5);
LinkedList<Integer> l2 = new LinkedList<Integer>();
        l2.add(2);
        l2.add(4);
        l2.add(6);
        LinkedList<Integer> merge = new LinkedList<Integer>();
        merge.addAll(l1);
        merge.addAll(l2);
System.out.println("L1 : "+l1);
System.out.println("L2 : "+l2);
System.out.println("Merged : "+merge);
	}

}
