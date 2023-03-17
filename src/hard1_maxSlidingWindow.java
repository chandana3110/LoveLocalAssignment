import java.util.*;
public class hard1_maxSlidingWindow {
    public static int[] maxSlidingWindow(int []nums , int k){
        int n= nums.length;
        if(n==0 || k>n || k==0){
            return new int[0];
        }
        int [] result = new int[n-k+1];
        Deque<Integer> deque = new LinkedList<>();
        int max=nums[0];
        for(int i=1;i<k;i++){
            max= Math.max(nums[i],max);
        }
        deque.addLast(max);
        int idx=0;
        for(int i=k;i<n;i++){
            if(deque.peek() < nums[i]){
                deque.addLast(nums[i]);
            }else{
                deque.addLast(deque.peek());
            }
        }
        for(int i=0;i<n-k+1 ;i++){
              int x= deque.peek();
            deque.removeFirst();
           result[i]=x;
        }
        return result;
    }
    public static void main(String [] args){
        int [] nums = new int[]{1,3,-1,-3,5,3,6,7};
        int k=3;
        int []result = maxSlidingWindow(nums , k);
        System.out.println(Arrays.toString(result));

        int [] nums2 = new int[]{1};
         k=1;
        int []result2 = maxSlidingWindow(nums2 , k);
        System.out.println(Arrays.toString(result2));
    }
}
