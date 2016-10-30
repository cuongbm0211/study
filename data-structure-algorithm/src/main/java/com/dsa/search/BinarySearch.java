package com.dsa.search;

/**
 * Created by CuongBM on 10/30/2016.
 */
public class BinarySearch {
    private int[] arrays = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

    private void traverse() {
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + ", ");
        }
        System.out.println();
    }

    private int search(int searchValue) {
        int position = 0;

        // Get middle position
        int startPosition = 0;
        int endPosition = arrays.length;

        while (true) {
            int middlePosition = (startPosition + endPosition) / 2;
            System.out.println("startPosition: " + startPosition);

            if (searchValue == arrays[middlePosition]) {
                return middlePosition;
            } else if (searchValue < arrays[middlePosition]) {
                endPosition = middlePosition + 1;
            } else {
                startPosition = middlePosition - 1;
            }
        }
    }

    private int searchRecursive(int searchValue, int startPosition, int endPosition) {
        int middlePosition = (startPosition + endPosition) / 2;
        System.out.println("searchValue = [" + searchValue + "], startPosition = [" + startPosition + "], endPosition = [" + endPosition + "]");

        if (searchValue == arrays[middlePosition]) {
            return middlePosition;
        } else if (searchValue < arrays[middlePosition]) {
            endPosition = middlePosition + 1;
        } else {
            startPosition = middlePosition - 1;
        }

        return searchRecursive(searchValue, startPosition, endPosition);
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.traverse();
        int positionIndex = binarySearch.search(9);
        System.out.println("positionIndex: " + positionIndex);

        System.out.println("SEARCH RECURSIVE");
        int resultRecursive = binarySearch.searchRecursive(9, 0, 19);
        System.out.println("resultRecursive: " + resultRecursive);
    }
}
