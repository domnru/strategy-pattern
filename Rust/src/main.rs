// Schnittstelle für die Sortierstrategie
trait SortStrategy {
    fn sort(&self, array: &mut [i32]);
}

// Konkrete Strategie: Bubble Sort
struct BubbleSort;
impl SortStrategy for BubbleSort {
    fn sort(&self, array: &mut [i32]) {
        // Implementierung des Bubble Sort Algorithmus
        // ...
        println!("Bubble Sort angewendet.");
    }
}

// Konkrete Strategie: Quick Sort
struct QuickSort;
impl SortStrategy for QuickSort {
    fn sort(&self, array: &mut [i32]) {
        // Implementierung des Quick Sort Algorithmus
        // ...
        println!("Quick Sort angewendet.");
    }
}

// Kontext, der die Sortierstrategie verwendet
struct SortContext {
    strategy: Box<dyn SortStrategy>,
}

impl SortContext {
    fn new(strategy: Box<dyn SortStrategy>) -> Self {
        SortContext { strategy }
    }

    fn set_strategy(&mut self, strategy: Box<dyn SortStrategy>) {
        self.strategy = strategy;
    }

    fn execute_sort(&self, array: &mut [i32]) {
        self.strategy.sort(array);
    }
}

fn main() {
    let mut data = vec![8, 3, 1, 6, 4];

    let mut context = SortContext::new(Box::new(BubbleSort));
    context.execute_sort(&mut data); // Bubble Sort angewendet

    context.set_strategy(Box::new(QuickSort));
    context.execute_sort(&mut data); // Quick Sort angewendet
}
