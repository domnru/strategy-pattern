# Schnittstelle für die Sortierstrategie
class SortStrategy:
    def sort(self, array):
        pass

# Konkrete Strategie: Bubble Sort
class BubbleSort(SortStrategy):
    def sort(self, array):
        # Implementierung des Bubble Sort Algorithmus
        # ...
        print("Bubble Sort angewendet.")

# Konkrete Strategie: Quick Sort
class QuickSort(SortStrategy):
    def sort(self, array):
        # Implementierung des Quick Sort Algorithmus
        # ...
        print("Quick Sort angewendet.")

# Kontext, der die Sortierstrategie verwendet
class SortContext:
    def __init__(self, strategy):
        self.strategy = strategy

    def set_strategy(self, strategy):
        self.strategy = strategy

    def execute_sort(self, array):
        self.strategy.sort(array)

def main():
    data = [8, 3, 1, 6, 4]

    context = SortContext(BubbleSort())
    context.execute_sort(data)  # Bubble Sort angewendet

    context.set_strategy(QuickSort())
    context.execute_sort(data)  # Quick Sort angewendet

if __name__ == "__main__":
    main()
