package algorithms;

import strategy.SortStrategy;

// Kontext, der die Sortierstrategie verwendet
public class SortContext {
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
