import java.util.Arrays;

public class SearchAlgorithms {
    public static void main(String[] args) {
        Integer[] list = {54, 12, 3, 23, 14, 64, 34, 1, 5, 0};

        int result = applyBinarySearch(applyBubbleSort(list.clone()), 5);
        if (result != -1) {
            System.out.println("Index Number of the value in sorted list " + result);
        }

        Integer linerSearch = applyLinerSearch(list.clone(), 34);
        if (linerSearch != -1) {
            System.out.println("Index Number of the value in unsorted list " + linerSearch);
        }
    }

    /*
     * best case O(1)
     * worse case O(log n)
     * Avg case O(log n)
     * */
    private static int applyBinarySearch(Integer[] integers, int element) {
        int elementPos = -1;
        int lowIndex = 0;
        int highIndex = integers.length - 1;

        while (lowIndex <= highIndex) {
            int midIndex = (lowIndex + highIndex) / 2;
            if (element == integers[midIndex]) {
                elementPos = midIndex;
                break;
            } else if (element < integers[midIndex]) {
                highIndex = midIndex - 1;
            } else if (element > integers[midIndex]) {
                lowIndex = midIndex + 1;
            }
        }
        return elementPos;
    }

    private static Integer applyLinerSearch(Integer[] integers, int data) {
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] == data) {
                return i;
            }
        }
        return -1;
    }


    public static Integer[] applyBubbleSort(Integer[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        System.out.println("bubble sort: " + Arrays.toString(list));
        return list;
    }
}
