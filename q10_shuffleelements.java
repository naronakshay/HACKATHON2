package sep23;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class q10_shuffleelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Jai");
        linkedList.add("Mahesh");
        linkedList.add("Naren");
        linkedList.add("Vivek");
        linkedList.add("Vishal");
        linkedList.add("Hemant");
        System.out.println("Actual LinkedList:"+linkedList);
        Collections.shuffle(linkedList);
            System.out.println("Results after shuffle operation:" + linkedList);      
            Collections.shuffle(linkedList);
            System.out.println("Results after shuffle operation:" + linkedList);
      
	}

}
