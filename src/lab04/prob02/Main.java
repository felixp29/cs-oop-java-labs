package lab04.prob02;

public class Main {

    public static void main(String[] args) {

        SortedArray sortedArray = new SortedArray();
        MyStack stack = new MyStack();

        System.out.println("Array-ul sortat: ");
        sortedArray.addElement(147);
        sortedArray.addElement(2);
        sortedArray.addElement(61);
        sortedArray.addElement(30);
        sortedArray.addElement(5);
        sortedArray.addElement(44);
        System.out.println(sortedArray);
        System.out.println();


        stack.push(341);
        stack.push(10);
        stack.push(29);
        stack.push(3);
        stack.push(26);
        System.out.println("Stiva:");
        System.out.println(stack);
        System.out.println("Elementul eliminat: " + stack.pop());
        System.out.println("Stiva dupa pop():");
        System.out.println(stack);
        System.out.println("Elementul eliminat: " + stack.pop());
        System.out.println("Stiva dupa inca un pop():");
        System.out.println(stack);


    }
}
