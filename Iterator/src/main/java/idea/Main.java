package idea;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        IteratorUtil.each(list.iterator(), new Visitor<String>() {
            void beforeFirst() {
                System.out.print("{");
            }

            void item(String item) {
                System.out.print(item);
            }

            void between() {
                System.out.print(", ");
            }

            void afterLast() {
                System.out.println("}");
            }
        });

        final StringBuilder concatString = new StringBuilder();

        IteratorUtil.each(list.iterator(), new Visitor<String>() {
            void item(String item) {
                concatString.append(item);
            }
        });
        System.out.println(concatString);
    }
}
