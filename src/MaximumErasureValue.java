import java.util.HashSet;

public class MaximumErasureValue {
    public static void main(String[] args) {
        int [] arr1 = {};
        int [] arr = {187,470,25,436,538,809,441,167,477,110,275,133,666,345,411,459,490,266,987,965,429,166,809,340,467,318,125,165,809,610,31,585,970,306,42,189,169,743,78,810,70,382,367,490,787,670,476,278,775,673,299,19,893,817,971,458,409,886,434};
        System.out.println(MaxVal.maximumUniqueSubarray(arr));

    }
}
class MaxVal{
    public static int maximumUniqueSubarray(int[] nums) {
        /*int result = 0;
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        for (int i : nums) {
            count.compute(i, (k, v) -> v == null ? 1 : v + 1);
        }
        //count.forEach((a,b) -> System.out.println(a + " " + b));
        for (int j : count.keySet()){
            result+= j;
        }
        return result;*/
        /*int n = nums.length;
        Set<Integer> set = new HashSet<>();
        int i = 0, j = 0, bf = 0, result = 0;
        while (i < n && j < n) {
            if (!set.contains(nums[j])){
                set.add(nums[j++]);
                for(int k : set){
                    bf+=k;
                }
                result = Math.max(result, bf);
                bf =0;
            }
            else {
                set.remove(nums[i++]);
            }
        }
        return result;*/
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        HashSet<Integer> set=new HashSet();
        int l=0;
        for(int i=0;i<nums.length;i++)
        {

            while(set.contains(nums[i]))
            {
                set.remove(nums[l]);
                sum-=nums[l];
                l++;
            }
            set.add(nums[i]);
            sum+=nums[i];
            maxSum=Math.max(sum,maxSum);
        }
        return maxSum;
    }
}
