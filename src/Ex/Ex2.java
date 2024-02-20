package Ex;

import java.util.HashSet;
import java.util.Iterator;

public class Ex2 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()){
            int num = iter.next();
            System.out.println(num);
        }
    }
}
