package lab1tasks;

public class ArrayValues {

    public static void main(String[] args) {

        /*Write 3 functions that take an array as a parameter and return the minimum,
        average, and maximum values of that array.
        Hint: this should be static functions with a return type of the same data type as the array
        declaration*/

        int[] values = {1, 3, 6, 9, 23, 5, 23, 16, 17, 9, 4, 0};

        int maxValue = values[0];
        System.out.println(getMaxValue(values, maxValue));

        int minValue = values[0];
        System.out.println(getMinValue(values, minValue));

        System.out.println(getAvgValue(values));
    }

    private static int getAvgValue(int[] values) {
        int sumValues = 0;
        for (int i = 0; i < values.length; i++) {
            sumValues += values[i];
        }
        return sumValues / values.length;
    }

    private static int getMinValue(int[] values, int minValue) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] < minValue) {
                minValue = values[i];
            }
        }
        return minValue;
    }

    private static int getMaxValue(int[] values, int maxValue) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] > maxValue) {
                maxValue = values[i];
            }
        }
        return maxValue;
    }
}
