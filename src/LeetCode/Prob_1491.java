// 1491. Average Salary Excluding the Minimum and Maximum Salary
public class Prob_1491 {
    public static void main(String[] args) {
        int[] salary = {4000,3000,1000,2000};
        System.out.println(avgsalary(salary));
    }
    public static double avgsalary(int[] sal){
        double max=sal[0];
        double min=sal[0];
        double sum=0;
        double ans=0.0000f;
        for (int i = 0; i < sal.length; i++) {
            if(max<sal[i]){
                max=sal[i];
            }
            if(min>sal[i]){
                min=sal[i];
            }
            sum+=sal[i];
        }
        sum=sum-(min+max);
        ans=sum/(sal.length-2);
        return ans;
    }
}
