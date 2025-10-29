import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(5);
        a.add(5);
        a.add(5);
        a.add(5);
        a.add(5);
        a.add(6);
        a.add(6);
        ArrayList<Integer> b = toSet(a);
        System.out.println(b);
        System.out.println(linearSearch(a, 6));
        System.out.println(linearSearch(a, 7));
        ArrayList<Circle> circles = new ArrayList<>();
        circles.add(new Circle(5));
        circles.add(new Circle(6));
        circles.add(new Circle(7));
        circles.add(new Circle(3));
        circles.add(new Circle(2));
        circles.add(new Circle(9));
        System.out.println(maxElement(circles).Radius);
        ArrayList<ArrayList<Integer>> d = new ArrayList<>();
        for(int i = 0; i < 10; ++i){
            ArrayList<Integer> e = new ArrayList<>();
            for(int j = 0; j < 10; ++ j){
                e.add(10 * i + j);
            }
            d.add(e);
        }
        System.out.println(maxElementMatrix(d));
        Scanner scanner = new Scanner(System.in);
        testArrayStack(scanner);
        testInheritedStack(scanner);
        testMyStack(scanner);
        scanner.close();
    }

    public static <T> ArrayList<T> toSet(ArrayList<T> Arr) {
        ArrayList<T> newArr = new ArrayList<>();
        for(T obj : Arr){
            if (!newArr.contains(obj)) {
                newArr.add(obj);
            }
        }
        return newArr;
    }

    public static <T> int linearSearch(ArrayList<T> Arr, T obj){
        for(int i = 0; i < Arr.size(); ++i){
            if(obj.equals(Arr.get(i))){
                return i;
            }
        }
        return -1;
    }

    public static <T extends Comparable<T>> T maxElementMatrix(ArrayList<ArrayList<T>> arr){
        T max = arr.getFirst().getFirst();
        for(int i = 1; i < arr.size(); ++i) {
            for (int j = 1; j < arr.get(i).size(); ++j) {
                if (max.compareTo(arr.get(i).get(j)) < 0) {
                    max = arr.get(i).get(j);
                }
            }
        }
        return max;
    }

    public static <T extends Comparable<T>> T maxElement(ArrayList<T> arr){
        T max = arr.getFirst();
        for(int i = 1; i < arr.size(); ++i){
            if(max.compareTo(arr.get(i)) < 0){
                max = arr.get(i);
            }
        }
        return max;
    }
    static class Circle implements Comparable<Circle>{
        Integer Radius = 0;
        Circle(int R){
            Radius = R;
        }
        @Override
        public int compareTo(Circle o) {
            return Radius - o.Radius;
        }
    }
    private static void testArrayStack(Scanner scanner) {
        GenericStack<String> stack = new GenericStack<>(3); // Маленькая емкость для демонстрации

        System.out.println("Введите 5 строк:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            String input = scanner.nextLine();
            stack.push(input);
            System.out.println("Текущий стек: " + stack);
            System.out.println("Емкость массива: " + stack.getCapacity());
        }

        System.out.println("\nСтроки в обратном порядке:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    private static void testInheritedStack(Scanner scanner) {
        GenericStackInherited<String> stack = new GenericStackInherited<>();

        System.out.println("Введите 5 строк:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            String input = scanner.nextLine();
            stack.push(input);
            System.out.println("Текущий стек: " + stack);
        }

        System.out.println("\nСтроки в обратном порядке:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    private static void testMyStack(Scanner scanner){
        MyStack<String> stack = new MyStack<>();

        System.out.println("Введите 5 строк:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            String input = scanner.nextLine();
            stack.push(input);
            System.out.println("Текущий стек: " + stack);
            System.out.println("Добавленный элемент: " + stack.peek());
        }

        System.out.println("\nСтроки в обратном порядке:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

