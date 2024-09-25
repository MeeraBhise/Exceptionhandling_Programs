package Exceptionhandling;

import java.util.HashSet;
import java.util.Hashtable;
/*
import java.util.Set;

public class NoSuchMethodException {
    // Java program to demonstrate NoSuchElementException


        public static void main(String[] args)
        {

            Set exampleleSet = new HashSet();

            Hashtable exampleTable = new Hashtable();

          //  exampleleSet.iterator().next();
            //accessing Set

            exampleTable.elements().nextElement();
            //accessing Hashtable

            // This throws a NoSuchElementException as there are
            // no elements in Set and HashTable and we are
            // trying to access elements
        }
    }


<iframe width="1366" height="768" src="https://www.youtube.com/embed/RLInHtq9j2w?list=PLlhM4lkb2sEjaU-JAASDG4Tdwpf-JFARN" title="Difference Between final finally and finalize in Java (Hindi)" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>

*/

public class NoSuchMethodException{
    private void method1()
    {

    }
    public static void main(String[] args) {
        NoSuchMethodException as=new NoSuchMethodException();
        as.method1();
        as.method1();
    }
}


