package Week_04;

public class JumpGame {
	public static boolean canJump(int[] nums) {
        
        int lastKnownPosition=nums.length-1;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(i+nums[i]>=lastKnownPosition) 
                lastKnownPosition=i;            
    
        }
        return lastKnownPosition==0;
    }
	public static void main(String[] args) {
		int[] nums = {2,3,1,1,4};
		System.out.println(canJump(nums));
	}
}
