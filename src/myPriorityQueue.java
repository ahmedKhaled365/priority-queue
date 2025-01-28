import java.util.NoSuchElementException;

class myPriorityQueue<G extends Comparable<G>> {
    private G[] priorityQueue;
    private int size;
    private int capacity;

    public myPriorityQueue() {
        this.capacity = 16;
        this.priorityQueue = (G[]) new Comparable[capacity];
        this.size = 0;
    }

    private int parent(int idx) {
        return (idx - 1) / 2;
    }

    private int left(int idx) {
        return idx * 2 + 1;
    }

    private int right(int idx) {
        return idx * 2 + 2;
    }

    private void swap(int i, int j) {
        G temp = priorityQueue[i];
        priorityQueue[i] = priorityQueue[j];
        priorityQueue[j] = temp;
    }

    private void HeapifyUp(int idx) {
        // as long as the top element is not the smallest.
        while (idx > 0 && priorityQueue[parent(idx)].compareTo(priorityQueue[idx]) > 0) {
            swap(parent(idx), idx);
            idx = parent(idx);
        }
    }

    private void HeapifyDown(int idx) {
        swap(0, size - 1);
        int left = left(idx);
        int right = right(idx);
        int min = idx;
        if (left < size && priorityQueue[min].compareTo(priorityQueue[left]) > 0) {
            min = left;
        }
        if (right < size && priorityQueue[min].compareTo(priorityQueue[right]) > 0) {
            min = right;
        }
        if (idx != min) {
            swap(min, idx);
            HeapifyDown(min);
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public G peek() {
        return priorityQueue[0];
    }

    public void add(G item) {
        if (size == capacity) {
            capacity *= 2;
            G[] newPriorityQueue = (G[]) new Comparable[capacity];
            System.arraycopy(priorityQueue, 0, newPriorityQueue, 0, size);
            priorityQueue = newPriorityQueue;
        }
        priorityQueue[size] = item;
        HeapifyUp(size++);
    }

    public G remove() {
        if (size == 0) {
            throw new NoSuchElementException("PriorityQueue is empty");
        }
        G item = priorityQueue[0];
        swap(0, size - 1);
        size--;
        HeapifyDown(0);
        return item;
    }

    void printQueue() {
        for (int i = 0; i < size; i++) {
            System.out.print(priorityQueue[i] + " ");
        }
        System.out.println();
    }

}
