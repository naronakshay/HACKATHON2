package sep23;





public class q25_sortarrayusingselection {
	
	 public static void selectionSort(int[] arr){  
	        for (int i = 0; i < arr.length - 1; i++)  
	        {  
	           
	            for (int j = i + 1; j < arr.length; j++){  
	                if (arr[j] < arr[i]){  
	                    int t=arr[j];
	                    arr[j]=arr[i];
	                    arr[i]=t;
	                    
	                }  
	            }  
	           
	        }  
	    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {9,14,3,2,43,11,58,22};  
        System.out.println("Before Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        selectionSort(arr1);
         
        System.out.println("After Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  

	}

}
