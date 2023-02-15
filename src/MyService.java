
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.*;

public class MyService {

    String  myLogic() {
        MyInterface myClass = new MyClass();

        List<String> list =  myClass.getSet(); // SORTED LIST
        list.add("b");
        list.add("a");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");

        return list.get(Collections.binarySearch(list, "a")); // error
    }
}
