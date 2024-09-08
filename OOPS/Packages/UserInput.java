package Packages;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        try{
            System.out.println("Enter your name");

            String name = myObj.nextLine();
            System.out.println("User name is " + name);
        }finally{
            myObj.close();
            
        }

    }
}
