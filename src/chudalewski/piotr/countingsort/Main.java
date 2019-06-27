package chudalewski.piotr.countingsort;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Integer[] sortArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        countingSort(sortArray, Collections.min(Arrays.asList(sortArray)),Collections.max(Arrays.asList(sortArray)));

        for (int i = 0; i < sortArray.length;i++ ) {
            System.out.println(sortArray[i]);
        }
    }

    public static void  countingSort(Integer[] input, int min, int max) {
        int[] countArray = new int[(max-min) + 1];

        for (int i = 0; i < input.length; i++) {
            countArray[input[i]-min]++;
        }

        int j = 0;
        for (int i=min; i<=max;i++) {
            while (countArray[i-min] > 0) {
                input[j++] = i;
                countArray[i-min]--;
            }
        }
    }

}
