package operator;

public class UseConditionalOperator {

    //Conditional Operator
    //And: &&
    //OR: ||

    public static void main(String[] args) {
        int value1 = 25;
        int value2 = 26;
        if ((value1 == 12) && (value2 == 26)){
            System.out.println("Value1 is 12 and Value2 is 26");
        }
        if ((value1 == 27) || (value2 == 26)){
            System.out.println("Value1 is 27 and Value2 is 26");
        }
    }
}
