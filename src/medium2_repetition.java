import java.util.*;
public class medium2_repetition {
    public static ArrayList<Integer> repetition(int [] nums ){

        // frequency of elements
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i< nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],1);
            }else{
                hm.put(nums[i],(hm.get(nums[i]))+1);
            }
        }

        // final elements in arrayList
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(hm.get(nums[i])> nums.length/3 ){
                al.add(nums[i]);
                hm.put(nums[i],-1);
            }
        }

        return al;
    }
    public static void main(String [] args){
        // input test cases
        int [] nums = new int []{3,2,3};
        List<Integer> result = repetition(nums);
        System.out.println(result);

        int [] nums2 = new int []{1};
        List<Integer> result2 = repetition(nums2);
        System.out.println(result2);

        int [] nums3 = new int []{1,2};
        List<Integer> result3 = repetition(nums3);
        System.out.println(result3);

        // extra test case
        int [] nums4 = new int []{1,1,2,3,1,4,5,5,5,5,5,1,1};
        repetition(nums4);
        //Solution solution = new Solution();
        List<Integer> result4 = repetition(nums4);
        System.out.println(result4);
    }
}
