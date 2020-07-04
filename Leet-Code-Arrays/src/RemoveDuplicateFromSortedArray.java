
public class RemoveDuplicateFromSortedArray {
	public int removeDuplicates(int[] nums) {
        if (nums== null) {
             return 0;
        }
      
        int j = 0;
        for (int i = j + 1; i < nums.length; i++) {
             if (nums[i] != nums[j]) {
                        j++;
                        nums[j] = nums[i];
               }
        }
         return j+1;
    }
}
