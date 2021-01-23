public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> array_integer = new ArrayList<Integer>(new Integer[10]);
        array_integer.insert(9, array_integer.getLast());
        array_integer.insert(9, array_integer.getLast());
        array_integer.insert(6, array_integer.getLast());
        array_integer.insert(5, array_integer.getLast());
        array_integer.insert(3, array_integer.getLast());
        array_integer.insert(6, array_integer.getLast());
        array_integer.print();
        System.out.println("Позиция последнего в списке элемента "+array_integer.getLast());
        removeDoubles(array_integer);
        array_integer.print();
        System.out.println("Позиция последнего в списке элемента "+array_integer.getLast());
        System.out.println();

        ArrayList<Rational> array_rational = new ArrayList<Rational>(new Rational[10]);
        array_rational.insert(new Rational(-3, 4), array_rational.getLast());
        array_rational.insert(new Rational(-6, 3), array_rational.getLast());
        array_rational.insert(new Rational(-1, 2), array_rational.getLast());
        array_rational.insert(new Rational(-9, 2), array_rational.getLast());
        array_rational.insert(new Rational(-9, 2), array_rational.getLast());
        array_rational.print();
        System.out.println("Позиция последнего в списке элемента "+array_rational.getLast());
        removeDoubles(array_rational);
        array_rational.print();
        array_rational.makeNull();
        System.out.println("Позиция последнего в списке элемента "+array_integer.getLast());
        System.out.println();


        ArrayList<String> array_string = new ArrayList<String>(new String[10]);
        array_string.insert("лошадь", array_string.getLast());
        array_string.insert("собака", array_string.getLast());
        array_string.insert("кот", array_string.getLast());
        array_string.insert("попугай", array_string.getLast());
        array_string.insert("кот", array_string.getLast());
        array_string.insert("тигр", array_string.getLast());
        array_string.insert("собака", array_string.getLast());
        array_string.insert("тигр", array_string.getLast());
        array_string.print();
        System.out.println("Позиция последнего в списке элемента "+array_string.getLast());
        removeDoubles(array_string);
        array_string.print();
        System.out.println("Позиция последнего в списке элемента "+array_integer.getLast());
    }

    static <T extends Comparable<T>> void removeDoubles(ArrayList<T> array) {
        if (array.getLast() == -1) { throw new IndexOutOfBoundsException(); }
        int i = array.first();
        int j;
        while (i != array.getLast()) {
            j = array.next(i);
            T c = array.retrieve(i);
            while (j != array.getLast()) {
                if (c.compareTo(array.retrieve(j)) == 0) {
                    array.delete(j);
                } else
                    j = array.next(j);
            }
            i = array.next(i);
        }
    }

}
