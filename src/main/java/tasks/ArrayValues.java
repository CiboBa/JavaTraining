package tasks;

public class ArrayValues {

    public static void main(String[] args) {

        /*Write 3 functions that take an array as a parameter and return the minimum,
        average, and maximum values of that array.
        Hint: this should be static functions with a return type of the same data type as the array
        declaration*/

        int[] values = {1, 3, 6, 9, 23, 5, 23, 16, 17, 9, 4, 0};

        int maxValue = values[0];
        maxValue = getMaxValue(values, maxValue);
        System.out.println(maxValue);

        int minValue = values[0];
        minValue = getMinValue(values, minValue);
        System.out.println(minValue);

        int averageValue;
        averageValue = getAverageValue(values);
        System.out.println(averageValue);
    }

    private static int getAverageValue(int[] values) {
        int averageValue;
        int sumValues = 0;
        for (int i = 0; i < values.length; i++) {
            sumValues += values[i];
        }
        averageValue = sumValues / values.length;
        return averageValue;
    }

    private static int getMinValue(int[] values, int minValue) {
        for (int i = 0; i < values.length; i++) {
            if (i == 0) {
                continue;
            } else if ((values[i] < values[i - 1]) && (values[i] < minValue)) {
                minValue = values[i];
            } continue;
        }
        return minValue;
    }

    private static int getMaxValue(int[] values, int maxValue) {
        for (int i = 0; i < values.length; i++) {
            if (i == 0) {
                continue;
            } else if ((values[i] > values[i - 1]) && (values[i] > maxValue)) {
                maxValue = values[i];
            } continue;
        }
        return maxValue;
    }
}
