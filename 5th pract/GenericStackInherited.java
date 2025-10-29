import java.util.ArrayList;

public class GenericStackInherited<E> extends ArrayList<E> {

    public GenericStackInherited() {
        super();
    }

    public GenericStackInherited(int initialCapacity) {
        super(initialCapacity);
    }

    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return get(size() - 1);
    }

    public void push(E o) {
        add(o);
    }

    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return remove(size() - 1);
    }

    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public String toString() {
        return "стек: " + super.toString();
    }
}