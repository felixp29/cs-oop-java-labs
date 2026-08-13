package lab04.prob02;

public class MyStack {

    private Array array;

    public MyStack() {
        array = new Array();
    }

    public void push(Integer x) {
        array.addElement(x);
    }

    public Integer pop() {
        if (array.getSize() == 0) {
            return null;
        }
        return array.remove(array.getSize() - 1);
    }

    @Override
    public String toString() {
        String result = "\t";
        for (int i = 0; i < array.getSize(); i++) {
            result = result + array.get(i) + "\n" + "\t";
        }
        return result;
    }
}
