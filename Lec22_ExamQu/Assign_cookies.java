package Lec22_ExamQu;

public class Assign_cookies {
    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {1,1};
        int count = 0;
        for(int i=0; i<g.length; i++){
            for(int j=0; j<s.length; j++){
                if(g[i] <= s[j]){
                    count++;
                    s[j] = 0;
                    break;
                }
            }
        }
        System.out.println("Number of children that can be content: " + count);
    }
}
