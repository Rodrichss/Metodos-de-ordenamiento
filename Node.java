public class Node {
    private int value;
    private Node prev, next;

    public Node(int value){
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    public int getValue(){
        return this.value;
    }
    public void setValue(int value){
        this.value = value;
    }
    public Node getNext(){
        return this.next;
    }
    public void setNext(Node next){
        this.next = next;
    }
    public Node getPrev(){
        return this.prev;
    }
    public void setPrev(Node prev){
        this.prev = prev;
    }
}