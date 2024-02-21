import java.util.Scanner;

public class Stack {
    private Node head;
    private int value;
    private int size;

    public Stack(){
        this.value = -1;
        this.head = null;
        this.size = 0;
    }

    public void bubbleSort(){
        boolean exchange = true;
        while (exchange) {
            exchange = false;
            Node current = head;
            while (current != null && current.getNext() != null) {
                if (current.getValue() > current.getNext().getValue()) {
                    // Intercambiar los valores de los nodos
                    int temp = current.getValue();
                    current.setValue(current.getNext().getValue());
                    current.getNext().setValue(temp);
                    exchange = true;
                }
                current = current.getNext();
            }
        }
    }

    public void selectionSort(){
        if (head == null || head.getNext() == null) {
            return;
        }
        
        Node current = head;
        while (current!=null) {
            Node min = current;
            Node aux = current.getNext();
            while(aux!=null){
                if(min.getValue() > aux.getValue()){
                    min = aux;
                }
                aux=aux.getNext();
            }
            int temp = current.getValue();
            current.setValue(min.getValue());
            min.setValue(temp);

            current = current.getNext();
        }
    }

    public void insertionSort(){
        if (head == null || head.getNext() == null) {
            return;
        }
        Node sorted = null;
        Node current = head;

        while(current!=null){
            Node next = current.getNext();
            if(sorted == null || current.getValue() <= sorted.getValue()){
                current.setNext(sorted);
                current.setPrev(null);
                if(sorted!=null){
                    sorted.setPrev(current);
                }
                sorted = current;
            }else{
                Node aux = sorted;
                while(aux.getNext()!=null && aux.getNext().getValue() < current.getValue()){
                    aux = aux.getNext();
                }
                current.setPrev(aux);
                current.setNext(aux.getNext());
                if(aux.getNext()!=null){
                    aux.getNext().setPrev(current);
                }
                aux.setNext(current);
            }
            current = next;
            
        }
        while(sorted.getPrev()!=null){
            sorted = sorted.getPrev();
        }
        head = sorted;

    }



    public void push(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese  el valor a insertar: ");
        value = sc.nextInt();
        Node node = new Node(value);
        if(head==null){
            head = node;
            
        }else{
            Node aux = head;
            while(aux.getNext()!=null){
                aux = aux.getNext();
            }
            aux.setNext(node);
            node.setPrev(aux);
        }
        this.size++;
        show();
    }

    public void push(int value){
        Node node = new Node(value);
        if(head==null){
            head = node;
            
        }else{
            Node aux = head;
            while(aux.getNext()!=null){
                aux = aux.getNext();
            }
            aux.setNext(node);
            node.setPrev(aux);
        }
        this.size++;
    }
    

    
    public void pop(){
        if(head==null){
            System.out.println("La pila esta vacia");
        }else if(head.getNext() == null){
            System.out.println( "Elemento eliminado: "+ head.getValue());
            head = null;
            
        }else{
            Node aux = head;
            while(aux.getNext().getNext()!=null){
                aux=aux.getNext();
            }
            
            System.out.println("Elemento eliminado: "+ aux.getNext().getValue());
            aux.setNext(null);
        }
        this.size--;
        show();
    }

    public void show(){
        if(head==null){
            System.out.println("No hay elementos");
        }else{
            Node aux = head;
            while (aux!=null){
                System.out.print(aux.getValue()+" ");
                aux = aux.getNext();
            }
        }
        System.out.println();
    }

    public void clear(){
        this.head=null;
        this.size=0;
    }
}