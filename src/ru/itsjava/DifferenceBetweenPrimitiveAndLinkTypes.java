package ru.itsjava;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Nezhinskij VV on 09.10.2019.
 */
public class DifferenceBetweenPrimitiveAndLinkTypes {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3};
        int[] array2 = array;

        array2[0] = 5;

        System.out.println(Arrays.toString(array));
        int[] array3 = new int[]{-3, 0, 5, 2, -7};
        Arrays.sort(array3);
        List list = Arrays.asList(array3);

    }
}
