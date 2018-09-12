package ru.innopolis.stc13.exeption.homework_2_QuickSort;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] array, int first, int last) {
        if (array.length == 0) {
            return;
        }
        if (first >= last) {
            return;
        }
        int middle = first + (last - first) / 2;
        int prop = array[middle];
        int i = first, j = last;
        while (i <= j) {
            while (array[i] < prop) {
                i++;
            }

            while (array[j] > prop) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (first < j)
            quickSort(array, first, j);

        if (last > i)
            quickSort(array, i, last);
    }

    public static void main(String[] args) {
        int[] x = {5, 7, 9, -2, 5, 8, 3, 5, 78, 9, 3, -5};
        System.out.println("It was");
        System.out.println(Arrays.toString(x));

        int first = 0;
        int last = x.length - 1;

        quickSort(x, first, last);
        System.out.println("It became");
        System.out.println(Arrays.toString(x));
    }
}
