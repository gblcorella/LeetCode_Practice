import java.util.*;
import java.util.List;

public class MissingRanges {
     public String getRange(int n1, int n2){
        return n1 == n2 ? String.valueOf(n1) : String.format("%d->%d",n1,n2);
    }
    
    public List<String> missingRanges(int[] nums, int lower, int higher){
        List<String> result = new ArrayList<>();

        if(nums.length == 0 || nums == null){
            return result;
        }
        int next = lower;
        for(int i =0; i < nums.length;i++){
            if(nums[i] < next){
                continue;
            }
            if(nums[i] == next){
                next++;
                continue;
            }
            result.add(getRange(next, nums[i] - 1));
            next = nums[i] + 1;

        }
        if(next <= higher){
            getRange(next,higher);
        }
        return result;
    }

   
}
