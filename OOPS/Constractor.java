public class Constractor {
    int x;

    // constractor name must match class name and it can't have a return type like void.
    public Constractor(){
        x = 5;
    }
    public static void main(String[] args){
        Constractor myObj = new Constractor();
        System.out.println(myObj.x);
    }
}
