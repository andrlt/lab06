package it.unibo.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/**
 * Example class using {@link List} and {@link Map}.
 *
 */
public final class UseListsAndMaps {

    private UseListsAndMaps() {
    }

    /**
     * @param s
     *            unused
     */
    public static void main(final String... s) {
        /*
         * 1) Create a new ArrayList<Integer>, and populate it with the numbers
         * from 1000 (included) to 2000 (excluded).
         */

        final int START = 1000;
        final int FINISH = 2000;

        ArrayList<Integer> l = new ArrayList<Integer>();
        for (int i = START; i < FINISH; i++) {
            l.addLast(i);
        }

        /*
         * 2) Create a new LinkedList<Integer> and, in a single line of code
         * without using any looping construct (for, while), populate it with
         * the same contents of the list of point 1.
         */
        List<Integer> l2 = new LinkedList<Integer>(List.copyOf(l));

        /*
         * 3) Using "set" and "get" and "size" methods, swap the first and last
         * element of the first list. You can not use any "magic number".
         * (Suggestion: use a temporary variable)
         */
        int tmp = l2.get(0);
        l2.set (0, l2.get(FINISH - START - 1));
        l2.set (l2.size() - 1, tmp);
        System.out.println(l2);

        /*
         * 4) Using a single for-each, print the contents of the arraylist.
         */
        for (int el: l2) {
            System.out.println(el);
        }

        /*
         * 5) Measure the performance of inserting new elements in the head of
         * the collection: measure the time required to add 100.000 elements as
         * first element of the collection for both ArrayList and LinkedList,
         * using the previous lists. In order to measure times, use as example
         * TestPerformance.java.
         */

        /*
         * 6) Measure the performance of reading 1000 times an element whose
         * position is in the middle of the collection for both ArrayList and
         * LinkedList, using the collections of point 5. In order to measure
         * times, use as example TestPerformance.java.
         */
        /*
         * 7) Build a new Map that associates to each continent's name its
         * population:
         *
         * Africa -> 1,110,635,000
         *
         * Americas -> 972,005,000
         *
         * Antarctica -> 0
         *
         * Asia -> 4,298,723,000
         *
         * Europe -> 742,452,000
         *
         * Oceania -> 38,304,000
         */
        final Map <String, Long> map = new HashMap<>();
        map.put("Africa", 1110635000L);
        map.put("Americas",972005000L);
        map.put("Antarctica",0L);
        map.put("Asia", 4298723000L);
        map.put("Europe", 742452000L);
        map.put("Oceania", 38304000L);
    

        /*
         * 8) Compute the population of the world
         */
    }
}
