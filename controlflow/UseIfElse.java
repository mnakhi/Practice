package controlflow;

import com.sun.security.jgss.GSSUtil;

public class UseIfElse {
    public static void main(String[] args) {
        int number = 50;
        if(number == 50){
            System.out.println("Number is 50");
        } else{
            System.out.println("Number is not 50");
        }

        int age = 18;
        if (age>18){
            System.out.println("You are Adult");
        }else{
            System.out.println("You are not Adult");
        }

    }

}
