<h1>Priority Queue in Java</h1>
<p>
    This project implements a <strong>priority queue</strong> data structure using a <strong>binary heap</strong> in Java. 
    It provides the basic operations for managing a priority queue, including adding elements, removing elements, 
    and peeking at the minimum element.
</p>

<h2>Features</h2>
<ul>
    <li><strong>Efficient Insertion:</strong> Adds elements in <code>O(log n)</code> time.</li>
    <li><strong>Efficient Removal:</strong> Removes the minimum element in <code>O(log n)</code> time.</li>
    <li><strong>Dynamic Resizing:</strong> Automatically resizes the underlying array when the queue reaches its capacity.</li>
    <li><strong>Heap Property:</strong> Maintains the min-heap property, ensuring the smallest element is always at the root.</li>
</ul>

<h2>Installation</h2>
<ol>
    <li>Clone the repository:
        <pre><code>git clone https://github.com/your-username/priority-queue.git</code></pre>
    </li>
    <li>Navigate to the project directory:
        <pre><code>cd priority-queue</code></pre>
    </li>
    <li>Compile and run the project:
        <pre><code>javac IntPriorityQueue.java
java IntPriorityQueue</code></pre>
    </li>
</ol>

<h2>Methods</h2>
<ul>
    <li><code>add(int element)</code>: Adds an element to the priority queue.</li>
    <li><code>peek()</code>: Returns the smallest element without removing it.</li>
    <li><code>remove()</code>: Removes and returns the smallest element.</li>
    <li><code>size()</code>: Returns the current size of the priority queue.</li>
    <li><code>isEmpty()</code>: Returns true if the priority queue is empty, otherwise false.</li>
</ul>

<h2>Notes</h2>
<ul>
    <li>This implementation uses a <strong>min-heap</strong> structure, where the smallest element is always at the root.</li>
    <li>The priority queue dynamically resizes when its capacity is exceeded.</li>
</ul>
