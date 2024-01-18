import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DisappearedNumbers {

    public static List<Integer> findMissingNumbers(int[] nums){
        HashSet<Integer> temp = new HashSet<>();

        for (int i=0; i<nums.length; i++){
            temp.add(nums[i]);
        }
        List<Integer> out = new ArrayList<>();
        for (int i=1; i<=nums.length; i++){
            if (!temp.contains(i)){
                out.add(i);
            }
        }
        return out;
    }

    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.println(findMissingNumbers(nums));
    }
}
