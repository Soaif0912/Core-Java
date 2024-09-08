package Inheritance;

public class Vehicle {
    protected String brandName = "Ford";

    public void honk(){
        System.out.println("pom pom");
    }
}

class Car extends Vehicle{
    private String carName = "Mastang";
    public static void main(String[] orgs){

        Car myCar = new Car();

        System.out.println("Brand name is " + myCar.brandName + ", and the car name is " + myCar.carName);
    }

}
