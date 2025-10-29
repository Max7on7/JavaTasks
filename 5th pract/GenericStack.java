public class GenericStack<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private E[] elements;
    private int size;

    public GenericStack() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public GenericStack(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("Начальная емкость должна быть положительной");
        }
        elements = (E[]) new Object[initialCapacity];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return elements[size - 1];
    }

    public void push(E o) {
        // Проверяем, нужно ли увеличить массив
        if (size == elements.length) {
            resizeArray();
        }
        elements[size++] = o;
    }

    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        E o = elements[--size];
        elements[size] = null;
        return o;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void resizeArray() {
        int newCapacity = elements.length * 2;
        E[] newArray = (E[]) new Object[newCapacity];
        System.arraycopy(elements, 0, newArray, 0, size);
        elements = newArray;
        System.out.println("Массив увеличен до " + newCapacity + " элементов");
    }

    public int getCapacity() {
        return elements.length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("стек: [");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}