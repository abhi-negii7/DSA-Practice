// 42. Trapping Rain Water
// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
// Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
// Output: 6
public class _1TrappingWater {
    public static void main(String[] args) {
        int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

        System.out.println(trap(height));
    }

    public static int trap(int[] height) {

        int n = height.length;
        int[] leftL = new int[n];
        int[] rightL = new int[n];

        int waterTrap = 0;

        // Find the Left largest element for each element
        leftL[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftL[i] = Math.max(leftL[i - 1], height[i]);
        }

        // Find the right largest element for each element
        rightL[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightL[i] = Math.max(rightL[i + 1], height[i]);
        }

        //Calculate Water Trap
        for (int i = 0; i < n; i++) {
            waterTrap += (Math.min(leftL[i], rightL[i]) - height[i]);
        }
        return waterTrap;
    }
}
