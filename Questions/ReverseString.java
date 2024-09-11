package Questions;

public class ReverseString {
    public static void main(String[] args){

        String name = "Hello";
        String reversedString = "";

        for(int i =0; i<name.length(); i++){
            reversedString = name.charAt(i) + reversedString;
        }

        System.out.println(reversedString);
    }
}
