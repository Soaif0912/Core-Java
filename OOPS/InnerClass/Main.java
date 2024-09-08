package InnerClass;

class OutterClass{
    int x = 10;

    class InnerClass{
        int n = 5;

        public int display(){
            return x;
        }
    }

}

class Main{
    public static void main(String[] args){
        OutterClass myOutterClass = new OutterClass();
        OutterClass.InnerClass myInnerClass = myOutterClass.new InnerClass();

        System.out.println(myOutterClass.x);
        System.out.println(myInnerClass.n);
        System.out.println(myInnerClass.display());
    }
    
}