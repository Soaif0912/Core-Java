public class StaticPublicMethod {
    static void Func1(){
        System.out.println("Good Morning");
    }

    public void Func2(){
        System.out.println("Good Night");
    }

    public static void main(String[] args){
        Func1();
        //Func2();  //It show error, have to create object to call this function
        StaticPublicMethod myObj = new StaticPublicMethod();
        myObj.Func2();
    }
}
