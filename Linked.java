import java.util.*;

public class Linked {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();
        cars.add("Volvo"); // adding elements to the Linked List
        cars.addFirst("Ford"); // Adding an element at the beginning
        cars.addLast("BMW");
        System.out.println("First car:" + cars.getFirst());
        System.out.println("Last Car:" + cars.getLast());
        System.out.println("Cars:" + cars);

        System.out.println("peek element:" + cars.peek());
        System.out.println("Cars after peek operation:" + cars);
        System.out.println("poll elememt:" + cars.poll());
        System.out.println("cars after the poll operation:" + cars);
        System.out.println("peek last elenment :" + cars.peekLast());
        System.out.println("Cars after peek last operation:" + cars);
        System.out.println("Poll last element:" + cars.pollLast());
        System.out.println("Cars after poll last operation:" + cars);

    }
}
