import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] orginal = {1,2,3,4};
        int[] nums = {2, 3, -4, 5}; // -60, -40, 30, -24
        int[] caserzero = {0, 0};
        System.out.println(Arrays.toString(arrayexceptself((nums))));
        System.out.println(Arrays.toString(arrayexceptself((caserzero))));
        System.out.println(Arrays.toString(arrayexceptself((orginal))));
    }

    public static int[] arrayexceptself(int[] nums) {
        int[] output = new int[nums.length];
        int[] ltor = new int[nums.length];
        int[] rtol = new int[nums.length];
        int temp = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                ltor[i] = 1;
                temp = 1;
            } else {
                ltor[i] = temp * nums[i - 1];
                temp = temp * nums[i - 1];
            }
        }
        System.err.println(Arrays.toString(ltor));
        for (int j = nums.length-1; j >= 0; j--) {
            if (j == nums.length-1) {
                rtol[j] = 1;
                temp = 1;
            } else {
                rtol[j] = temp * nums[j + 1];
                temp = temp * nums[j + 1];
            }

        }

        for (int k = 0; k < output.length; k++) {
            output[k] = ltor[k]*rtol[k];
        }
        System.err.println(Arrays.toString(rtol));
        return output;
    }
}