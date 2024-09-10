package HasMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){

        HashMap<String, Integer> people = new HashMap<String, Integer>();

        people.put("Soaif", 25);
        people.put("Jojo", 28);
        people.put("Akram", 31);

        System.out.println(people);

        for(String i : people.keySet()){
            System.out.println("The name is " + i + " and age is " + people.get(i));
        }

    }
}
