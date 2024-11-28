public class ListNode<T> {
    private T data;
    @SuppressWarnings("rawtypes")
    private ListNode next;
    
    // Constructor: No reference to next node provided so make it null 
    public ListNode( T nodeData ) {
        this( nodeData, null);
    }
    
    // Constructor: Set data and reference to next node.
    @SuppressWarnings("rawtypes")
    public ListNode( T nodeData, ListNode nodeNext ) {
        data = nodeData;
        next = nodeNext;
    }
    
    // Accessor: Return the data for current ListNode object
    public T getData() {
        return data;
    }
    
    // Accessor: Return reference to next ListNode object
    @SuppressWarnings("rawtypes")
    public ListNode getNext() {
        return next;
    }
    
    // Mutator: Set new data for current ListNode object
    public void setData( T newData ) {
        data = newData;
    } 
    
    // Mutator: Set new reference to the next node object
    @SuppressWarnings("rawtypes")
    public void setNext( ListNode newNext ) {
        next = newNext;
    }
}