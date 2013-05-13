package idea;

import java.util.Iterator;

public class IteratorUtil {
    public static <T> void each(Iterator<T> iterator, Visitor<T> visitor) {
        visitor.beforeFirst();

        if (iterator.hasNext()) {
            visitor.item(iterator.next());
        }
        while (iterator.hasNext()) {
            visitor.between();
            visitor.item(iterator.next());
        }
        visitor.afterLast();
    }
}
