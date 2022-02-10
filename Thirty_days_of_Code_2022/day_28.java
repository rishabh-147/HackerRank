package Thirty_days_of_Code_2022;
import java.util.*;

public class day_28 {

    public static int minimum_index(int[] seq) {
        if (seq.length == 0) {
            throw new IllegalArgumentException("Cannot get the minimum value index from an empty sequence");
        }
        int min_idx = 0;
        for (int i = 1; i < seq.length; ++i) {
            if (seq[i] < seq[min_idx]) {
                min_idx = i;
            }
        }
        return min_idx;
    }
class TestDataEmptyArray {
    public static int[] get_array() {
        int[] a = { 8, 7, 9, 4, 2, 1, 6, 8, 5 };
        return a;
    }
}

 class TestDataExactlyTwoDifferentMinimums {
    public static int[] get_array() {
        int[] a = { 8, 7, 9, 7, 2, 1, 6, 8, 5 };
        return a;
    }

    public static int get_expected_result() {
        return 1;
    }
}

 class TestDataUniqueValues {
    public static int[] get_array() {
        int[] a = { 8, 7, 9, 4, 2, 1, 6, 8, 5 };
        return a;
    }

    public static int get_expected_result() {
        return 5;
    }
}    
}