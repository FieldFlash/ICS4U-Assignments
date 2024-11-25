public class StaticQueue<T> implements QueueADT<T> {
    private int front;
    private int last;
    private int size;
    private T[] queueArray;
    private final int MAX_SIZE;

    @SuppressWarnings("unchecked")
    public StaticQueue(int maxSize) {
        this.MAX_SIZE = maxSize;
        this.queueArray = (T[]) new Object[MAX_SIZE];
        this.front = 0;
        this.last = 0;
        this.size = 0;
    }

    @Override
    public void enqueue(T element) {
        if (size == MAX_SIZE) {
            System.err.println("Queue is full.");
        } else{
            queueArray[last] = element;
            last = (last + 1) % MAX_SIZE;
            size++;
        }
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            System.err.println("Queue is empty.");
            return null;
        }
        T element = queueArray[front];
        front = (front + 1) % MAX_SIZE;
        size--;
        return element;
    }

    @Override
    public T peek() {
        return queueArray[front];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        for (int i = 0; i < MAX_SIZE; i++) {
            queueArray[i] = null;
        }
        front = 0;
        last = 0;
        size = 0;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(queueArray[(front + i) % MAX_SIZE]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
