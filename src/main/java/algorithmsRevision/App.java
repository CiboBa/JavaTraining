package algorithmsRevision;

public class App {

    public static void main(String[] args) {

        int[] numbers = {10, 22, 13, 4, 25, 21, 0, 12};
        int[] sortedNumbers = {1, 3, 5, 8, 9, 11, 13, 15, 19, 20, 21, 26, 28, 35, 48, 55};

        //Call the linear search method that searches for number 22
        int position = Search.linearSearch(numbers, 21);
        System.out.println("Target found at position: " + position);

        //Call the binary search
        int index = Search.binarySearch(sortedNumbers, 55, 0, sortedNumbers.length - 1);
        System.out.println("Target found at position: " + index);

        //Call the bubble sort
        Sort.bubbleSort(numbers);
    }
}
