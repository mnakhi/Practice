package operator;

public class UseEqualityOperator {

    // == equal to
    // != not equal to
    // > greater than
    // >= greater than or equal to
    // < less than
    // less than or equal to


    public static void main(String[] args) {

        int number1 = 40;
        int number2 = 50;

        if (number1==number2){
            System.out.println("Number 1 is equal to Number two");

        }
        if (number1!=number2){
            System.out.println("Number 1 is not equal to Number two");

        }
        if (number1>number2){
            System.out.println("Number one is greater than Number two");

        }
        if (number1>=number2){
            System.out.println("Number one is greater than equal to Number two");

        }
        if (number1<number2){
            System.out.println("Number one is less than Number two");

        }
        if (number1<=number2){
            System.out.println("Number one is less than equal Number two");

        }
    }

}
