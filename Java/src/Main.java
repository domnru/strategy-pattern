import algorithms.BubbleSort;
import algorithms.QuickSort;
import algorithms.SortContext;

public class Main {
    public static void main(String[] args) {
        int[] data = { 8, 3, 1, 6, 4 };

        SortContext context = new SortContext(new BubbleSort());
        context.executeSort(data);  // Bubble Sort angewendet

        context.setStrategy(new QuickSort());
        context.executeSort(data);  // Quick Sort angewendet
    }
}
