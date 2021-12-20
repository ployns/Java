
public class Lab03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue queue_01 = new Queue();

        queue_01.enqueue(1);
        queue_01.enqueue(2);
        queue_01.enqueue(3);
        queue_01.enqueue(1);
        queue_01.enqueue(2);
        queue_01.enqueue(3);
        queue_01.enqueue(1);
        queue_01.enqueue(2);
        queue_01.displayElements();
        queue_01.enqueue(3);
        queue_01.displayElements();

        queue_01.dequeue();
        queue_01.displayElements();

        queue_01.empty();
        queue_01.displayElements();

        queue_01.dequeue();
        queue_01.displayElements();
        
        queue_01.enqueue(1);
        queue_01.enqueue(2);
        queue_01.displayElements();

    }
    
}
