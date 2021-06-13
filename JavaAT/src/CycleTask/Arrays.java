package CycleTask;

import java.util.Random;

public class Arrays {

    public static void main (String[] args) {
        Arrays arrays = new Arrays();
        arrays.foo();

    void foo() {
    int[] array;
    int[] array = new int[7];
    Random random = new Random();

    for (int i = 0; i < array.length; i++); {
        array[i] = Random.nextInt (7);
    }

    System.out.print("Initial arrays: ");
        for (int i : array) {
            System.out.println(i + " ");
        }

        System.out.println();
        int avg = 0;
        for (int i = 0; i < array.length; i++) {
            avg += array[i];
        }

        System.out.println("Average value is: " + avg);
        }
    }
    }

