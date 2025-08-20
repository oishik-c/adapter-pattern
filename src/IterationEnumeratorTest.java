import com.example.adapter.IteratorEnumeration;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class IterationEnumeratorTest {
    public static void main(String[] args){
//        Initialising an ArrayList object to test Iterator interface
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            arr.add(i);
        }

//        Iterating through arr with an Iterator object
        System.out.println("\nArrayList elements using Iterator");
        Iterator<Integer> it= arr.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

//        Enumeration<Integer> EnumTest = new Enumeration<Integer>(arr.iterator());


//        Iterating through arr with an Enumeration object
        System.out.println("\nArrayList elements using Enumeration");
        Enumeration<Integer> Enum = new IteratorEnumeration<Integer>(arr.iterator());
        while(Enum.hasMoreElements()){
            System.out.println(Enum.nextElement());
        }
    }
}
