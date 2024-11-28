public class DynamicQueue<T> implements QueueADT<T> {
    private LinkedList<T> LinkedList = new LinkedList<T>();

    @Override
    public void enqueue(T element) {
        LinkedList.addLast(element);
    }

    @Override
    public T dequeue() {
        return LinkedList.removeFirst();
    }

    @Override
    public T peek() {
        return LinkedList.peekFirst();
    }

    @Override
    public boolean isEmpty() {
        return LinkedList.isEmpty();
    }

    @Override
    public int size() {
        return LinkedList.size();
    }

    @Override
    public void clear() {
        LinkedList.clear();
    }
    
}
