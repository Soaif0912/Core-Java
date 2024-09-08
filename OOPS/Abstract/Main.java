package Abstract;

abstract class Animal{
    public abstract void animalSound();

    public void animalSleep(){
        System.out.println("Zzz");
    }
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("Bow bow");
    }
}

public class Main {
    public static void main(String[] args){

        Dog myDog = new Dog();

        myDog.animalSleep();;
        myDog.animalSound();
    }
    
}
