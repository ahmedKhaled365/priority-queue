public class testPriorityQueue {
    public static void main(String[] args) {
        myPriorityQueue<Integer> pq = new myPriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(5);
        pq.add(15);

        pq.printQueue();

        System.out.println("Min Element: " + pq.peek());

        System.out.println("Removed: " + pq.remove());
        pq.printQueue();

        System.out.println("Removed: " + pq.remove());
        pq.printQueue();
    }
}
