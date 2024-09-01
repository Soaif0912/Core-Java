class InvertedHalfPiramidWithNumber {
    public static void main(String[] args){

        // for(int f=5; f>=1; f--){
        //     for(int j =1; j<=f; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        for(int f=1; f<=5; f++){
            for(int j =1; j<= 5 -f+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
