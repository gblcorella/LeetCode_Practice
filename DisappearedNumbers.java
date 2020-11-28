import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums){
        List<Integer> result = new ArrayList<Integer>();
        int[] temp = new int[nums.length + 1];

        for(int i = 0; i < nums.length; i++){
            temp[nums[i]]++;
        }
        for(int i = 1; i <= temp.length; i++){
            if(temp[i] == 0){
                result.add(i);
            }
        }
        return result;
    }
}
