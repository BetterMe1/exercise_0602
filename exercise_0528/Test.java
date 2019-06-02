package exercise.exercise_0528;

import java.lang.reflect.Array;
import java.util.Arrays;

import static java.util.Arrays.*;

public class Test {
    public static void main(String[] args) {
        /*int[] A = {5,6,7};
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));*/
        GrayCode grayCode = new GrayCode();
        System.out.println(Arrays.toString(grayCode.getGray(3)));

    }
}
