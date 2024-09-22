import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        short[] z = new short[6];
        for (int i = 0; i < z.length; i++) {
            z[i] = (short)(15 - i*2);
        }

        System.out.println("Task 1");
        System.out.println(Arrays.toString(z));
        System.out.println(" ");


        float[] x = new float[13];
        double max = 4.0;
        double min = -13.0;

        for (int i = 0; i < 13; i++) {
            double num = min + (Math.random() * (max - min));
            x[i] = (float)(num);
        }

        System.out.println("Task 2");
        System.out.println(Arrays.toString(x));
        System.out.println(" ");


        System.out.println("Task 3");

        double[][] w = new double[6][13];

        for (int i = 0; i < w.length; i++) {
            for (int j = 0; j < w[i].length; j++) {
                w[i][j] = calculate(i, j, z, x);
            }
        }
    }

    public static double calculate(int i, int j, short[] z, float[] x) {
        short[] numbers = {5, 7, 15};
        int index = Arrays.binarySearch(numbers, z[i]);

        if (z[i] == 9) {
            return Math.log(Math.cos(Math.pow(x[j], 2)));
        } else if (index >= 0) {
            return Math.tan(Math.pow(1, Math.sin(x[j])));
        }
        return 0;
    }
}
