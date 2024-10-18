import java.util.Scanner;
public class temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temp in C: ");

        float temmpC = input.nextFloat();
        float tempF = (temmpC * 9/5) + 32;
        System.out.println(tempF);

//        System.out.println("Pankaj");
    }
}
