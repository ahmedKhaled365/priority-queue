import java.util.NoSuchElementException;

class myPriorityQueue {
    private int[] priorityQueue;
    private int size;
    private int capacity;

    public myPriorityQueue() {
        this.capacity = 16;
        this.priorityQueue = new int[capacity];
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
        int temp = priorityQueue[i];
        priorityQueue[i] = priorityQueue[j];
        priorityQueue[j] = temp;
    }

    private void HeapifyUp(int idx) {
        // as long as the top element is not the smallest.
        while (idx > 0 && priorityQueue[parent(idx)] > priorityQueue[idx]) {
            swap(parent(idx), idx);
            idx = parent(idx);
        }
    }

    private void HeapifyDown(int idx) {
        swap(0, size - 1);
        int left = left(idx);
        int right = right(idx);
        int min = idx;
        if (left < size && priorityQueue[min] > priorityQueue[left]) {
            min = left;
        }
        if (right < size && priorityQueue[min] > priorityQueue[right]) {
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

    public int peek() {
        return priorityQueue[0];
    }

    public void add(int item) {
        if (size == capacity) {
            capacity *= 2;
            int[] newPriorityQueue = new int[capacity];
            System.arraycopy(priorityQueue, 0, newPriorityQueue, 0, size);
            priorityQueue = newPriorityQueue;
        }
        priorityQueue[size] = item;
        HeapifyUp(size++);
    }

    public int remove() {
        if (size == 0) {
            throw new NoSuchElementException("PriorityQueue is empty");
        }
        int item = priorityQueue[0];
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
