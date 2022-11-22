import java.util.ArrayList;
import java.util.List;

public class PlusOne {
    public static void main(String[] args) {
        int [] arr = {1,2,4};
        int[] newArr = plusOne(arr);
        for(Integer i : newArr){
            System.out.println(i);
        }
    }
    static public int[] plusOne(int[] digits) {
        List<Integer> newList= new ArrayList<>();
        if(digits.length == 1 && digits[0] == 0){
            return digits;
        }
        for(int i = 0; i <= digits.length-1; i++){
            if(digits.length == 1 && digits[i] == 9 ) {
                newList.add(1);
                newList.add(0);
                break;
            }
            if(i == digits.length-2){
                if(digits[i+1] == 9) {
                    digits[i+1] = 0;
                    digits[i] += 1;
                    newList.add(digits[i]);
                    newList.add(digits[i+1]);
                    break;
                }
                digits[i+1]+=1;
            }
            newList.add(digits[i]);
        }
        int [] arr = newList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return arr;
    }
}
