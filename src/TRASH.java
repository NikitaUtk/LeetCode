import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TRASH {
    public static void main(String[] args) {
        int [] arr = {2,1,5};
        int k = 806;
        System.out.println(addToArrayForm(arr, k));
        //System.out.println(1000%10);
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList();
        int bf = 0;
        if(num.length == 1 ){
            k+= num[0];
            while(k > 0){

                result.add(k%10);
                k /= 10;
            }

        } else {
            for (int i = num.length - 1; i >= 0; i--) {
                int j = 0;
                if (k < 10 && k != 0) {
                    j = k;
                    k /= 10;
                } else {
                    j = k % 10;
                    k /= 10;
                }
                if (num[i] + j + bf >= 10) {
                    result.add((num[i] + j + bf) % 10);
                    bf = (num[i] + j + bf) / 10;
                } else {
                    result.add((num[i] + j + bf));
                    bf = 0;

                }

            }
        }

        if(bf != 0 && k == 0) {
            result.add(bf);
        }else {
            k += bf;
            while (k > 0) {
                if (k >= 10) {
                    //if(k%10 == 0) k/=10;
                    result.add(k % 10);
                } else {
                    result.add(k);

                }

                k /= 10;
            }
        }

        List<Integer> reverse = new ArrayList<>(result);
        Collections.reverse(reverse);
        return reverse;
    }
    public static<T> List<T> reverseList(List<T> list)
    {
        List<T> reverse = new ArrayList<>(list);
        Collections.reverse(reverse);
        return reverse;
    }
}
