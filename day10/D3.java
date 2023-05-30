import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class D3 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();  // ArrayList<E> implements List<E>
        List<Integer> l2 = new Vector<>();
        AbstractList<Integer> al1 = new ArrayList<>();  // ArrayList<E> is inherited from AbstractList<E>
        AbstractList<Integer> al2 = new Vector<>();

        Serializable s = new ArrayList<>();

        for (Collection<Integer> l : List.of(al1, al2, l1, l2)) {  // List<E> is inherited from Collection<E>
            l.add(1);
        }

        for (List<Integer> l : List.of(al1, al2, l1, l2)) {
            l.add(2);
        }

        // for (AbstractList<Integer> l : List.of(al1, al2, l1, l2)) {  // error: incompatible types: List<Integer> cannot be converted to AbstractList<Integer>
        //     l.add(1);
        // }
    }
}
