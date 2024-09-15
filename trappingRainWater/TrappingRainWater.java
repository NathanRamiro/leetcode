package trappingRainWater;

/**
 * TrappingRainWater
 * 
 * Given n non-negative integers representing an elevation map where the width
 * of each bar is 1, compute how much water it can trap after raining.
 *
 */
public class TrappingRainWater {

    public static int trap(int[] height) {

        int[] leftHighest = new int[height.length];
        int[] rightHighest = new int[height.length];

        leftHighest[0] = 0;

        for (int i = 1; i < height.length; i++) {
            leftHighest[i] = Math.max(
                    height[i - 1], leftHighest[i - 1]);
        }

        rightHighest[height.length - 1] = 0;

        for (int i = height.length - 2; i >= 0; i--) {
            rightHighest[i] = Math.max(
                    height[i + 1], rightHighest[i + 1]);
        }

        int result = 0;

        for (int i = 0; i < height.length; i++) {

            int water = Math.min(
                    leftHighest[i], rightHighest[i])
                    - height[i];

            result += Math.max(water, 0);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(trap(new int[] {
                0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1
        }));// 6
        System.out.println(trap(new int[] {
                4, 2, 0, 3, 2, 5
        }));// 9
    }
}
