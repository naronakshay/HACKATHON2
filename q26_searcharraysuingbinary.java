package sep23;

public class q26_searcharraysuingbinary {

	 public static int binarySearch(int[] a, int x,int l, int h) {
		 
		 if(h>=l)
			{
				int mid =(l+h)/2;
				if(a[mid]==x)
					return mid;
				if(a[mid]>x)
					return binarySearch(a,x,l,mid-1);
				else
					return binarySearch(a,x,mid+1,h);
			
			
		}
			return -1;
		 
	      
	   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method 
		int[] nums = {1, 5, 6, 7, 8, 11};
			for(int n:nums)
				System.out.print(n+" ");
	       int search_num = 7;
	       System.out.println();
	       int index = binarySearch(nums, search_num,0,nums.length);
	       if (index == -1) {
	           System.out.println(search_num + " is not in the array");
	       } else {
	           System.out.println(search_num + " is at index " + index);
	       }

	}

}
