/**
 *
 * @author yetki
 */
public class Node<T> {
   
    T value;
    Node<T> next;
    Node<T> prev;
    public Node(T value, Node<T> prev,Node<T> next){
        this.value = value;
        this.prev = prev;
        this.next = next;
    }
 
    public Node(){
        
    }
}
