public class ConstractorParameter {
    String name;
    int age;

    public ConstractorParameter(String a, int b){
        name = a;
        age = b;
    }

    public static void main(String[] args){
        ConstractorParameter Soaif = new ConstractorParameter("Soaif Ikbal Mondal", 24 );
        System.out.println("Name is " + Soaif.name +" and age is "+ Soaif.age);

    }
    
}
