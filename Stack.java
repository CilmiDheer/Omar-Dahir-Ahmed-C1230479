import java.util.Arrays;
import java.util.EmptyStackException;

public class SmartStackDemo {
    public static void main(String[] args) {
        // Samee stack cusub
        FlexiStack<Integer> tiroStack = new FlexiStack<>();

        // Ku dar waxyaabo
        tiroStack.pushItem(100);
        tiroStack.pushItem(200);
        tiroStack.pushItem(300);

        // Muuji stack-ka
        tiroStack.displayItems();

        // Daawo waxa ugu sareeya
        System.out.println("Waxa ugu sareeya: " + tiroStack.peekItem());

        // Ka saar hal shay
        System.out.println("Shay laga saaray: " + tiroStack.popItem());

        // Muuji mar kale
        tiroStack.displayItems();

        // Ku dar wax kale
        tiroStack.pushItem(400);
        tiroStack.pushItem(500);

        // Muuji stack-ka ugu dambeeya
        tiroStack.displayItems();

        // Tirada guud
        System.out.println("Tirada guud ee stack-ka: " + tiroStack.sizeCount());

        // Hubi haddii uu madhan yahay
        System.out.println("Miyaan madhanahay? " + tiroStack.isEmptyStack());
    }
}

class FlexiStack<T> {
    private static final int INITIAL_CAPACITY = 2;
    private int topIndex;
    private T[] stackArray;

    // Constructor aan argument lahayn
    FlexiStack() {
        this(INITIAL_CAPACITY);
    }

    // Constructor leh capacity
    FlexiStack(int capacity) {
        topIndex = 0;
        stackArray = (T[]) (new Object[capacity]);
    }

    // sizeCount (tirada waxyaabaha)
    public int sizeCount() {
        return topIndex;
    }

    // pushItem (ku dar)
    public void pushItem(T item) {
        if (sizeCount() == stackArray.length)
            expandStack();
        stackArray[topIndex] = item;
        topIndex++;
    }

    // popItem (ka saar)
    public T popItem() {
        if (isEmptyStack())
            throw new EmptyStackException();
        T removed = stackArray[--topIndex];
        stackArray[topIndex] = null;
        return removed;
    }

    // peekItem (eeg waxa ugu sareeya)
    public T peekItem() {
        if (isEmptyStack())
            throw new EmptyStackException();
        return stackArray[topIndex - 1];
    }

    // isEmptyStack (hubi madhnaanta)
    public boolean isEmptyStack() {
        return topIndex == 0;
    }

    // expandStack (balaadhi xadka)
    private void expandStack() {
        stackArray = Arrays.copyOf(stackArray, stackArray.length * 2);
    }

    // displayItems (muuji waxyaabaha)
    public void displayItems() {
        if (isEmptyStack())
            throw new EmptyStackException();
        System.out.println("Waxyaabaha ku jira stack-ka waa:");
        for (int i = 0; i < topIndex; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}
