import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
//        Q: take input of 2 numbers and print the sum using methods(functions);

//        greeting();
//        sum();

        //for sum2
//        int ans = sum2();
//        System.out.println(ans);

        //for greet
        String message = greet();
        System.out.println(message);


    }

    static void sum() {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter num1: ");
        int num1 = in.nextInt();

        System.out.println("Enter num2: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("sum = " + sum);

}

    static void greeting(){
        System.out.println("Hello World!");
    }

    //return value
    static int sum2(){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter num1: ");
        int num1 = in.nextInt();

        System.out.println("Enter num2: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
//        System.out.println("sum = " + sum);
        return sum;
    }

    static String greet(){

        String greeting = "How are you?";
        return greeting;
    }
}
