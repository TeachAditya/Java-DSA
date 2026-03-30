package Lec22_ExamQu;
public class MajorityElement {
    public int majorityElement(int[] nums) {   
        int count = 0;
        int candidate = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
            }
    
            return candidate;
        }
    
    public static void main(String[] args) {
        MajorityElement me = new MajorityElement();
        int[] arr = {2,2,1,1,1,2,2};
        int result = me.majorityElement(arr);
        System.out.println("The majority element is: " + result);
    }
}
