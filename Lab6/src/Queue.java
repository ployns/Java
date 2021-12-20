

import java.util.Arrays;

public class Queue {
    private int elements[] = new int[8];
    private int size = 0;

    Queue() {

    }

    public void enqueue(int v) {
        if (size >= elements.length) {
            elements = Arrays.copyOf(elements, 2 * elements.length);
        }
        elements[size] = v;
        size++;
    }

    public void dequeue() {
        for (int i = 0; i < size; i++) {
            if (i>=size-1) {
                elements[i] = 0;
            } else {
                elements[i] = elements[i + 1];
            }
        }
        if (size>0) {
            size--;
        }else{
            System.out.println("no member in the Queue");
        }
        if (size <= elements.length / 2 && size >= 8) {
            elements = Arrays.copyOf(elements, elements.length / 2);
        }
    }
    public void empty() {
        int resetElements[] = new int[8];
        elements = resetElements;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void displayElements() {
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }
}

