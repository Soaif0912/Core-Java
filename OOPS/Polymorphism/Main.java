package Polymorphism;
class Animal{
    public void animalMakeSound(){
        System.out.println("Animal make a sound");
    }
}

class Dog extends Animal{
    public void animalMakeSound(){
        System.out.println("Dog make sound: \"bow bow\" ");
    }
}

class Cat extends Animal{
    public void animalMakeSound(){
        System.out.println("Cat make sound: \"meow meow\"");
    }
}
public class Main {
    public static void main(String[] args){
        Animal MyAnimal = new Animal();
        Dog MyDog = new Dog();
        Cat MyCat = new Cat();

        MyAnimal.animalMakeSound();
        MyDog.animalMakeSound();
        MyCat.animalMakeSound();

    }
    
}
