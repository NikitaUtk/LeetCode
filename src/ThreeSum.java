import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[]arr = {3,-2,1,0};
        int[]arr2 = {-2,0,1,1,2};
        int[]arr3 = {-1,0,1,2,-1,-4,-2,-3,3,0,4};
        System.out.println(Solution.threeSum(arr));
        System.out.println(Solution.threeSum(arr2));
        System.out.println(Solution.threeSum(arr3));

    }
}
class Solution {

    /*public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
       // while(true){
           // int len = resultList.size();
            for (int i = 0; i < nums.length; i++){
                for(int j = 0; j < nums.length-1; j++){
                    List<Integer> arr = new ArrayList();
                    if(i == j || i == j+1) continue;
                    if(nums[i] + nums[j] + nums[j+1] == 0 ){
                        arr.add(nums[i]);
                        arr.add(nums[j]);
                        arr.add(nums[j+1]);
                        resultList.add(arr);
                    }
                }
            }
          //  if (len == resultList.size()) break;
      //  }

        //System.out.println(resultList);
        while(true) {
            int len = resultList.size();
            for(int i = 0; i < resultList.size(); i++){
                for (int j = i+1; j < resultList.size(); j++){
                    List<Integer> temp = resultList.get(i);
                    List<Integer> temp2 = resultList.get(j);
                    if(temp.size() != temp2.size()) continue;
                    if(temp.stream().sorted().collect(Collectors.toList()).equals(temp2.stream().sorted().collect(Collectors.toList()))) resultList.remove(j);

                }
            }
            if (len == resultList.size()) break;
        }
        *//*System.out.println(resultList);
        for(int i = 0; i < resultList.size(); i++){
            for (int j = 0; j < resultList.size(); j++){
                if(i == j) continue;
                List<Integer> temp = resultList.get(i);
                List<Integer> temp2 = resultList.get(j);
                if(temp.size() != temp2.size()) continue;
                if(temp.stream().sorted().collect(Collectors.toList()).equals(temp2.stream().sorted().collect(Collectors.toList()))) resultList.remove(j);

            }


        }*//*

        return resultList;
    }*/
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            while (j < k) {
                if (k < nums.length - 1 && nums[k] == nums[k + 1]) {
                    k--;
                    continue;
                }

                if (nums[i] + nums[j] + nums[k] > 0) {
                    k--;
                } else if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                } else {
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(nums[k]);
                    result.add(l);
                    j++;
                    k--;
                }
            }
        }

        return result;
    }
}
