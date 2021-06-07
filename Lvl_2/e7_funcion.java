package Lvl_2;

import java.util.Arrays;

public class e7_funcion {

    public static void main(String[] args) {

        String[] arr = fizzBuzz(1, 13);
        System.out.print((Arrays.toString(arr)));
        
    }

    public static String[] fizzBuzz(int x, int y) {

        String[] arr = new String[y - 1];
        arr[0] = "1";

        for (int i = 1; i < arr.length; i++) {

            if (((x + i) % 2 == 0) && ((x + i) % 3 == 0)) {

                arr[i] = "FizzBuzz";

            } else if ((x + i) % 2 == 0) {

                arr[i] = "Fizz";

            } else if ((x + i) % 3 == 0) {

                arr[i] = "Buzz";

            } else {

                arr[i] = Integer.toString(i + 1);
            }
        }
        return arr;
    }
}
