package algorithmsRevision;

class Search {

    //Linear Search- iterate through dataSet searching for target
    static int linearSearch(int[] dataSet, int target) {
        for (int i = 0; i < dataSet.length; i++) {
            if (dataSet[i] == target) {
                return i;
            }
        }
        return -1;
    }

    //BinarySearch assumes a sorted array and can therefore continually split our search domain in half
    static int binarySearch(int[] dataSet, int target, int start, int end) {
        int midpoint = (int) Math.floor((start + end) / 2);
        int value = dataSet[midpoint];

        if (target > value) {
            System.out.println(target + " > " + value);
            return binarySearch(dataSet, target, midpoint + 1, end);
        } else if (target < value) {
            System.out.println(target + " < " + value);
            return binarySearch(dataSet, target, start, midpoint - 1);
        }
        System.out.println(target + " = " + value);
        return midpoint;
    }
}
