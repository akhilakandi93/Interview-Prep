package CTCI;

import java.lang.reflect.Field;
import java.util.*;

//import java.text.DateFormat.Field;

public class A {
    private final Character m_value = 'a';
    
    public String toString() { return "" + m_value; }

    public static void main(String[] args) {
    	final List<Integer> list = new ArrayList<Integer>();

        Collections.addAll(list, 1, 5, 2, 3, 7, 3, 8, 9);

        final Integer pos = Integer.valueOf(3);

        list.remove(pos);

        System.out.println(list);


    }
}