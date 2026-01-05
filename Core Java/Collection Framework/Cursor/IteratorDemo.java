package Cursor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

    public static void main(String[] args) {

        List l = new ArrayList();
        l.add(10);
        l.add("deepak");
        l.add("rahul");

        Iterator itr = l.iterator();
        
//        while(itr.hasNext()) {
//        	System.out.println(itr.next());
//        }
        
        // remove
        while (itr.hasNext()) {
            Object obj = itr.next();
            if (obj.equals("deepak")) {
                itr.remove();   
            }
        }

        System.out.println(l);
    }
}
