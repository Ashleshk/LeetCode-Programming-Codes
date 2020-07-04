
public class MergeSortedArray {
	 public void merge(int[] nums1, int m, int[] nums2, int n) {
	        int i = 0, j = 0; 
	        if(n == 0){
	            return;
	        }
	        
	        while (i < m && j < n) {
	    		if (nums1[i] > nums2[j]) {
	    			for (int j2 = m - 1; j2 >= i; j2--) {
	   					nums1[j2+1] = nums1[j2];
	   				}
	   				m++;
	   				nums1[i] = nums2[j];
	   				j++;
	    		}
	    		i++;
	    	}
	        
	        while (j < n) {
				nums1[i] = nums2[j];
				i++;
				j++;
			}
	    
	    }
}
