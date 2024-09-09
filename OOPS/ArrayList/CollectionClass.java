package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionClass {

    public static void main(String[] args){

        ArrayList<String> names = new ArrayList<String>();

        names.add("Soaif");
        names.add("Asif");
        names.add("Ram");

        Collections.sort(names);
        System.out.println(names);

        Collections.sort(names, Collections.reverseOrder());
        System.out.println(names);
    }
    
}
