package Interface;

interface Animal{
    public void sleep();
    public void sound();
}

class dog implements Animal{
    public void sleep(){
        System.out.println("Zzz");
    }
    public void sound(){
        System.out.println("Bow Bow");
    }
}

public class Main {
    public static void main(String[] args){
        dog myDog = new dog();

        myDog.sleep();
        myDog.sound();
    }
}
