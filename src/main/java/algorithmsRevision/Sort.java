package algorithmsRevision;

class Sort {

    static void bubbleSort(int[] dataSet) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < dataSet.length - 1; i++) {
                if (dataSet[i] > dataSet[i + 1]) {
                    int temp = dataSet[i];
                    dataSet[i] = dataSet[i + 1];
                    dataSet[i + 1] = temp;
                    printArray(dataSet);
                    swapped = true;
                }
            }
        }
        while (swapped);
    }

    private static void printArray(int[] array) {
        for (int field : array) {
            System.out.print(field + " ");
        }
        System.out.println();
    }
}
