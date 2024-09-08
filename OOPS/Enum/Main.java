package Enum;

interface Printable{
    void print();
}

enum Today implements Printable{
    MONDAY{
        public void print(){
            System.out.println("Today is monday!. Start of week");
        }
    },
    TUESDAY{
        public void print(){
            System.out.println("TOday is tuesday!. Second day of the week");
        }
    },
    WEDNESDAY{
        public void print(){
            System.out.println("TOday is wednesday!.");
        }
    },
    THURSDAY {
        @Override
        public void print() {
            System.out.println("It's Thursday! Almost there.");
        }
    },
    FRIDAY {
        public void print() {
            System.out.println("It's Friday! End of the work week.");
        }
    },
    SATURDAY {
        public void print() {
            System.out.println("It's Saturday! Relax.");
        }
    },
    SUNDAY {
        public void print() {
            System.out.println("It's Sunday! Prepare for the new week.");
        }
    }
}

public class Main {
    public static void main(String[] args){
        for( Today myDay : Today.values()){
            System.out.println("Today is " + myDay);
            myDay.print();
        }
    }
};
