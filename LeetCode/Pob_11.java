// 11. Container With Most Water
public class Pob_11 {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(mostWater(height));
    }
    public static int mostWater(int[] height){
        int low=0;
        int high=height.length-1;
        int ans=0;
        while(low<high){
            int width=high-low;
            int length=Math.min(height[low],height[high]);
            int area=length*width;
            if(height[low]>height[high]){
                high--;
            }else{
                low++;
            }

            ans=Math.max(ans, area);
        }
        return ans;
    }
}
