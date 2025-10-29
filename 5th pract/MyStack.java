import java.util.ArrayList;

public class MyStack<E> extends ArrayList<E> {

    public MyStack(){
        super();
    }

    public boolean isEmpty(){
        return super.isEmpty();
    }

    public int getSize(){
        return super.size();
    }

    public E peek(){
        return super.get(getSize() - 1);
    }

    public E pop(){
        E a = peek();
        super.remove(getSize() - 1);
        return a;
    }

    public void push(E o){
        super.add(o);
    }

}
