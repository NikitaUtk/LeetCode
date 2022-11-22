public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[]arr = {"flower","flow","f"};
        System.out.println(longestCommonPrefix(arr));
    }
    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        if(strs.length == 0 || strs[0].isEmpty()){
            return result;
        }
        int newLength = strs[0].length();
        for(String s : strs){
            if(s.length() < newLength) newLength = s.length();
        }
        for(int i = 0; i < newLength ; i++){
            Boolean bf = true;
            for(int j =0; j < strs.length-1; j++ ){
                if(strs[j].charAt(i) != strs[j+1].charAt(i)){
                    bf = false;
                    break;
                }else{
                    bf = true;
                }
            }
            if(bf) {
                result+=strs[0].charAt(i);
            }else{
                break;
            }
        }

        return result;
    }
}
