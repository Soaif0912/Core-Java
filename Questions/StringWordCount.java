package Questions;

public class StringWordCount {
    public static void main(String[] args){
        String myStr = "Hi good morning";

        int strLen = myStr.split("\\s").length;

        System.out.println(myStr.length());
        System.out.println(strLen);
    }
}
