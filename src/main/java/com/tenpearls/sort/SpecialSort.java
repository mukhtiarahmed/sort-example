package com.tenpearls.sort;


public class SpecialSort {

    /**
     * Odd numbers are sorted before even numbers, and relative order is preserved
     * @param numbers
     */
     public static void sortOddEven(int numbers[]) {

        if (null == numbers || numbers.length <= 1) return;

        int length = numbers.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (compare(numbers[j], numbers[j + 1]) > 0) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

    }

    private static int compare(int o1, int o2) {

        if ((o1 % 2 == 0 && o2 % 2 == 0) || (o1 % 2 == 1 && o2 % 2 == 1))
            return o1 - o2;

        if (o1 % 2 == 0)
            return 1;
        else {
            return  -1;
        }

    }


};
