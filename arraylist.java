import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("volvo"); // Adding elements to the ArrayList
        cars.add("BMW");
        System.out.println(cars);
        cars.add(0, "ford"); // Adding an element at a specific index
        // System.out.println(cars);
        System.out.println(cars.get(1)); // Accessing an element at a specific index
        System.out.println(cars.size()); // Getting the size of the ArrayList
        System.out.println(cars.remove(1)); // Removing an element at a specific index
        System.out.println(cars);
        Collections.sort(cars); // Sorting the ArrayList
        System.out.println("Sorted " + cars);
        Collections.sort(cars, Collections.reverseOrder());
        System.out.println("Reverse Sorted " + cars);
        System.out.println(cars);
        System.out.println(cars.contains("volvo"));

        System.out.println("Finally sorted list " + cars);
        // array list of integers
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(15);
        numbers.add(20);
        numbers.add(34);
        numbers.add(8);
        numbers.add(12);
        numbers.add(33);
        System.out.println(numbers);
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
            sum += numbers.get(i); // Calculating the sum of elements
        }
        System.out.println("Sum :" + sum);
        int sum2 = 0;
        for (int i : numbers) { // Using enhanced for loop to iterate through the ArrayList
            System.out.println(i); // Printing each element
            sum2 += i; // Calculating the sum of elements
        }
        System.out.println("Sum2 :" + sum2); // Printing the sum of elements

        System.out.println(cars);
    }
}