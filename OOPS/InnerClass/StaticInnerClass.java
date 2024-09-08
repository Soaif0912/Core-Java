package InnerClass;

class OutterClass{
    int x = 10;

    static class innerClass{
        int y = 5;
    }
}

public class StaticInnerClass {
    public static void main(String[] args){

        OutterClass.innerClass myInnerClass = new OutterClass.innerClass();

        System.out.println(myInnerClass.y);
    }
}
