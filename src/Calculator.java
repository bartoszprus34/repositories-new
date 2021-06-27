import java.awt.*;
import java.util.Scanner;

public class Calculator {
    public static double plus(double a, double b){
        return a+b;
    }
    public static double minus(double a, double b){
        return a-b;
    }
    public static double multiply(double a, double b){
        return a*b;
    }
    public static double divide(double a, double b){
        return a/b;
    }

    public static void main(String args[]){
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        System.out.println("What do you want to do?");
        char chosenAction;
        chosenAction=scanner.next().charAt(0);
        System.out.println("Give me first number");
        a=scanner.nextDouble();
        System.out.println("Give me second number");
        b=scanner.nextDouble();
        switch (chosenAction) {
            case '+':
                System.out.println("a+b="+plus(a,b));
                break;
            case '-':
                System.out.println("a-b="+minus(a,b));
                break;
            case '*':
                System.out.println("a+b="+multiply(a,b));
                break;
            case '/':
                System.out.println("a+b="+divide(a,b));
                break;
        }
    }
}
