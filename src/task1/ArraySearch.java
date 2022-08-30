package task1;

import java.util.Arrays;

public class ArraySearch {

    public static void main(String[] args) {

        int[][] array = fillRandom();

        System.out.println(Arrays.deepToString(array)+"\n");

        minAvgMaxArray(array);

    }

    // Заполение массива случайными числами
    private static int[][] fillRandom(){
        int[][] array = new int[5][5];
        int min = 0;
        int max = 20;

        for (int i = 0; i < array.length; i++) {
            for (int j = array[i].length -1 ; j >= 0; j--) {
                array[i][j] = min  + (int) (Math.random()* max);
            }
        }
        return array;
    }
    // Поиск в массиве минимального, среднего и максимального значений
    private static void minAvgMaxArray(int[][] array){
        int min = array[0][0];
        int max = array[0][0];
        int sum = 0;

        for (int[] ints : array) {
            for (int j = ints.length - 1; j >= 0; j--) {
                if (min > ints[j]) min = ints[j];
                if (max < ints[j]) max = ints[j];
                sum += ints[j];
            }
        }
        int avg = sum / (array.length * array[0].length);

        System.out.println("min: "+ min
                + "; average: "+ avg + "; max: " + max);
    }
}
