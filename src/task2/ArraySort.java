package task2;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] number = new int[]{5, 6, 3, 2, 5, 1, 4, 9};

        sort(number);
    }

    private static void sort(int[] number) {
        for (int left = 0; left < number.length; left++){
            int value = number[left];
            int i = left - 1;

            for(; i >= 0; i--){
                if (value < number[i]){
                    number[i+1] = number[i];
                } else {
                    break;
                }
            }
            number[i + 1] = value;

        }
        System.out.println(Arrays.toString(number));
    }
}
