// Schnittstelle für die Sortierstrategie
interface SortStrategy {
    void sort(int[] array);
}

// Konkrete Strategie: Bubble Sort
class BubbleSort implements SortStrategy {
    @Override
    public void sort(int[] array) {
        // Implementierung des Bubble Sort Algorithmus
        // ...
        System.out.println("Bubble Sort angewendet.");
    }
}

// Konkrete Strategie: Quick Sort
class QuickSort implements SortStrategy {
    @Override
    public void sort(int[] array) {
        // Implementierung des Quick Sort Algorithmus
        // ...
        System.out.println("Quick Sort angewendet.");
    }
}

// Kontext, der die Sortierstrategie verwendet
class SortContext {
    private SortStrategy strategy;

    public SortContext(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeSort(int[] array) {
        strategy.sort(array);
    }
}

public class Main {
    public static void main(String[] args) {
        int[] data = { 8, 3, 1, 6, 4 };

        SortContext context = new SortContext(new BubbleSort());
        context.executeSort(data);  // Bubble Sort angewendet

        context.setStrategy(new QuickSort());
        context.executeSort(data);  // Quick Sort angewendet
    }
}
