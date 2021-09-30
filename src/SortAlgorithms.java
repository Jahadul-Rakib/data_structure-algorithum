import java.util.Arrays;

public class SortAlgorithms {

    public static void main(String[] args) {
        Integer[] list = {54, 12, 3, 23, 14, 0, 64, 34, 1, 5, 19};
        applyBubbleSort(list.clone());
        applySelectionSort(list.clone());
        applyQuickSort(list.clone());
    }

    public static void applyQuickSort(Integer[] listOfInteger) {
        quickSort(listOfInteger, 0, listOfInteger.length - 1);
        System.out.println("QuickSort: " + Arrays.toString(listOfInteger));
    }

    private static void quickSort(Integer[] listOfInteger, int begin, int end) {
        if (begin < end) {
            int partition = applyPartition(listOfInteger, begin, end);
            quickSort(listOfInteger, begin, partition - 1);
            quickSort(listOfInteger, partition + 1, end);
        }
    }

    private static int applyPartition(Integer[] listOfInteger, int begin, int end) {
        int pivot = listOfInteger[end];
        int i = (begin - 1);
        for (int j = begin; j < end; j++) {
            if (listOfInteger[j] <= pivot) {
                i++;
                int tempData = listOfInteger[i];
                listOfInteger[i] = listOfInteger[j];
                listOfInteger[j] = tempData;
            }
        }
        int tempData = listOfInteger[i + 1];
        listOfInteger[i + 1] = listOfInteger[end];
        listOfInteger[end] = tempData;
        return i + 1;
    }

    public static void applyBubbleSort(Integer[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    swap(list, i, j);
                }
            }
        }
        System.out.println("bubble sort: " + Arrays.toString(list));
    }

    public static void applySelectionSort(Integer[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = i; j < list.length; j++) {
                if (list[i] > list[j]) {
                    swap(list, i, j);
                }
            }
        }
        System.out.println("selection sort: " + Arrays.toString(list));
    }

    private static synchronized void swap(Integer[] list, int indexA, int indexB) {
        int tempData = list[indexA];
        list[indexA] = list[indexB];
        list[indexB] = tempData;
    }
}
