public class FinalAttri {
    final int age = 24;
    public static void main(String[] args){
        FinalAttri obj = new FinalAttri();
        //obj.age = 30; // IT generate an error
        System.out.println(obj.age);

    }
}
