import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int opc=0;
        Stack stack = new Stack();
        Scanner sc = new Scanner(System.in);
        stack.push(9); 
        stack.push(6); 
        stack.push(1); 
        stack.push(3); 
        stack.push(8); 
        stack.push(2); 
        stack.push(4); 
        stack.push(5); 

        do{
            System.out.println("Elija una opción:");
            System.out.println("1. Bubble sort");
            System.out.println("2. Selection sort");
            System.out.println("3. Insertion sort");
            System.out.println("4. Desordenar el stack");
            System.out.println("0. Salir del programa");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    stack.show();
                    stack.bubbleSort();
                    stack.show();
                    break;
                case 2:
                    stack.show();
                    stack.selectionSort();
                    stack.show();
                    break;
                case 3:
                    stack.show();
                    stack.insertionSort();
                    stack.show();
                    break;
                case 4:
                    stack.clear();
                    stack.push(9); 
                    stack.push(6); 
                    stack.push(1); 
                    stack.push(3); 
                    stack.push(8); 
                    stack.push(2); 
                    stack.push(4); 
                    stack.push(5); 
                    break;
                case 0:
                default:
                    break;
            }
        }while(opc!=0);
    }


    
}
