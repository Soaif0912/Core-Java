package ArrayList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Honda");
        cars.add("Suzuki");
        cars.add("Tesla");

        for(int i = 0; i< cars.size(); i++){
            System.out.println(cars.get(i));
        }
    }
}
