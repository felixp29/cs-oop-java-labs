package lab03.prob03;

public class MyQueue {

    private MyArray obiect = new MyArray();
    private final int INFINIT;
    private int firstIndex;
    private int lastIndex;
    private int numarElemente;

    MyQueue() {
        this.INFINIT = 9500;
        this.firstIndex = 0;
        this.lastIndex = 0;
        this.numarElemente = 0;
    }

    int getSize() {
        return numarElemente;
    }

    void enqueue(int value) {
        obiect.set(lastIndex, value);
        lastIndex++;
        numarElemente++;
    }

    public boolean isEmpty() {
        /*
        if (numarElemente == 0) {
            return true;
        }
        else {
            return false;
        }
        */
        return numarElemente == 0;
    }

    int dequeue() {
        if (isEmpty()) {
            return INFINIT;
        }
        else {
            int valueOfFirstIndex = obiect.get(firstIndex);
            firstIndex++;
            numarElemente--;
            return valueOfFirstIndex;
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = firstIndex; i <= lastIndex - 1; i++) {
            result = result + obiect.get(i) + " ";
        }
        return "[ " + result + "]";
    }
}
