public class ZeroOneTriangle {
    public static void main(String[] args){
        int v = 5;
        for(int i = 1; i <= v; i++){
            for(int j = 1; j<= i; j++){

                if((i+j) % 2 == 0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
               
            }
            System.out.println();
        }
    }
}

// Testing asif
