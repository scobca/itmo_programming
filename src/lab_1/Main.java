package lab_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        short[] z = new short[6];
        float[] x = new float[13];
        double[][] w = new double[6][13];

        // filling in the array z
        for (int i = 0; i < z.length; i++) {
            z[i] = (short) (15 - i * 2);
        }


        // setting the framework of randomness
        double max = 4.0;
        double min = -13.0;

        // filling in the array x
        for (int i = 0; i < 13; i++) {
            double num = min + (Math.random() * (max - min));
            x[i] = (float) (num);
        }

        // filling in the array w
        for (int i = 0; i < w.length; i++) {
            for (int j = 0; j < w[i].length; j++) {
                w[i][j] = calculate(i, j, z, x);
            }
        }

        output(w);
    }

    public static double calculate(int i, int j, short[] z, float[] x) {
        short[] numbers = {5, 7, 15};
        double w;

        if (z[i] == 9) {
            w = Math.log(Math.cos(Math.pow(x[j], 2)));
        } else if (Arrays.binarySearch(numbers, z[i]) >= 0) {
            w = Math.tan(Math.pow((Math.pow(x[j], x[j] * (x[j] + 1)) / 2) / 3, Math.sin(x[j])));
        } else {
            w = Math.sin(Math.cbrt(Math.cbrt(Math.cos(x[j]))));
        }

        return w;
    }

    public static void output(double[][] arr) {
        for (double[] doubles : arr) {
            for (double aDouble : doubles) {
                System.out.printf("%-12.5f", aDouble);
            }
            System.out.println();
        }
    }
}
