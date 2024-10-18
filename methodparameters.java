import java.util.Scanner;

public class methodparameters {
    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);

        //for add
//        int ans = add(23,22);
//        System.out.println(ans);

        //for greeting
        String message = greeting("Pankaj");
        System.out.println(message);

    }

    static int add(int a, int b){

        int sum = a + b;
        return sum;

    }

    static String greeting(String name){
        String greeting = "Hello " + name;
        return greeting;
    }
}
