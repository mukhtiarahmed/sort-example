package com.tenpearls.sort;

import java.util.Arrays;

public class SpecialSort {

    /**
     * Odd numbers are sorted before even numbers, and relative order is preserved
     * @param numbers
     */
    public static void sortOddEven(int numbers[]) {

        if(null == numbers || 0 == numbers.length) return;

        int length = numbers.length;
        int left = 0;
        int right =  length - 1;
        int rightCount = 0;
        do {


            while (numbers[right] % 2 == 0 && left < right) {
                right--;
                rightCount++;
            }


            while (left < length && numbers[left] % 2 == 1) {
                left++;
            }


            if (left < right) {
                int temp = numbers[left];
                numbers[left] = numbers[right];
                numbers[right] = temp;
            }
        } while (left < right);

        Arrays.sort(numbers, 0, length - rightCount);
        Arrays.sort(numbers, length - rightCount,  length);

    }

}
