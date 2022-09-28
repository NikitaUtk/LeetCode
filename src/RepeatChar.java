import java.util.HashSet;
import java.util.Set;

public class RepeatChar {
    public static void main(String[] args) {
        System.out.println(RepChar.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(RepChar.lengthOfLongestSubstring("pwwkew"));
        System.out.println(RepChar.lengthOfLongestSubstring(""));



    }
}

class RepChar {
    public static int lengthOfLongestSubstring(String s) {
        /**Мое решение (Не совсем верное)*/
      /*  if(s.isEmpty()) return 0;
        char[]newArr = s.toCharArray();
        int count = 0;
        int resCount = 0;
        int bf = 0;
        for(int i = 1; i < newArr.length; i ++){
            //count =0;
            for(int j = bf; j < i; j++){

                if(newArr[i] == newArr[j]) {
                    bf = i;
                    if(count > resCount) resCount = count;

                    count = 0;
                    break;
                }

                if(newArr[i] != newArr[j]) count++;
                if(j == i-1) {
                    resCount = count+1;
                    count = 0;
                }
            }
        }
        if( resCount == 0) return 1;
        return resCount;*/

        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        //System.out.println(ans);
        return ans;

    }

}
