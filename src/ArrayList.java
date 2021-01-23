public class ArrayList<T extends Comparable<T>> {

    private T[] array;
    private int last = 0; //первый пустой

    public ArrayList(T[] ar) {
        array = ar;
    }

    public int getLast() { return last; }

    public void insert(T obj, int position) {
        if (position > last || position < 0)
            return;
        for (int i = last; i > position; i--)
            array[i] = array[i - 1];
        array[position] = obj;
        last++;
    }

    public T retrieve(int position) {
        if (position > last || position < 0)
            throw new IndexOutOfBoundsException();
        return (array[position]);
    }

    public void delete(int position) {
        if (position > last || position < 0)
            return;
        for (int i = position; i < last - 1; i++)
            array[i] = array[i + 1];
        last--;
    }

    public int next(int position) {
        if (position > last || position < 0)
            throw new IndexOutOfBoundsException();
        return position + 1;
    }

    public void print() {
        System.out.print("Длина списка = " + last + " Элементы списка  ");
        for (int i = 0; i < last; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public int previous(int position) {
        if (position > last || position < 1)
            throw new IndexOutOfBoundsException();
        return position - 1;
    }

    public int locate(T t) {
        for (int i = 0; i < last; i++)
            if (t.compareTo(array[i]) == 0)
                return i;
        return last;
    }

    public void makeNull() { last = -1; }

    public int first() { return 0; }
}
