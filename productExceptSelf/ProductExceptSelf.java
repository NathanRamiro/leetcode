import java.util.Arrays;

public class ProductExceptSelf {
    /*
     * too slow.
     * Make two arrays, one in which every element is the
     * product of all the elements on the left and another one with the
     * opposite
     */
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int productOuter = 1;
        int productInner = 1;
        int indexLeft = 0;
        int indexRight = nums.length - 1;

        while (indexRight - indexLeft > 0) {

            for (int indexInner = indexLeft + 1; indexInner < indexRight; indexInner++) {
                productInner *= nums[indexInner];
            }

            result[indexLeft] = productOuter * productInner * nums[indexRight];
            result[indexRight] = productOuter * productInner * nums[indexLeft];

            productOuter *= nums[indexLeft] * nums[indexRight];

            productInner = 1;
            indexLeft++;
            indexRight--;
        }

        if (indexLeft == indexRight) {
            result[indexLeft] = productOuter;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[] { -1, 1, 0, -3, 3 })));
    }
}