package officeWork;

/*
 * Given an array of integers, return indices of the two numbers such that they add up to a 
 * specific target.You may assume that each input would have exactly one solution, 
 * and you may not use the same element twice.
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		int num[]={0,4,3,0};
		int target=0;
		int myoutput[]=myTwoSum(num,target);
		System.out.println(Arrays.toString(myoutput));
		
	}
	 public static int[] myTwoSum(int[] nums, int target) {
		 int fNum=0,sNum=0;
		 int result[] = new int[2];
	      for ( int i=0;i<nums.length;i++){
	    		  fNum=nums[i];
	    	  for(int j=i+1;j<nums.length;j++){
	 	    		  sNum=nums[j];
	    		  if(fNum+sNum==target){
	    			  result[0]=i;
	    			  result[1]=j;
	    			  break;
	    		  }
	    	  }
	    	  if(fNum+sNum==target){
    			  break;
    		  }
	      }
		 return result;
	    }
	 
	 
}
