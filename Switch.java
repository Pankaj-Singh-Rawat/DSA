import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        String a = "Pankaj";
//        String b = "Pankaj";
//
//        System.out.println( a == b);
        // if both variables are pointing towards the same string then a == b gives true

//        System.out.println("Enter a valid input:");
//        String fruit = in.next();

//        if (fruit.equals("mango")){
//            System.out.println("King of fruits.");
//        }
//
//        if (fruit.equals("apple")){
//            System.out.println("A sweet red fruit.");
//        }

        // Rather than using this method repeatedly we use switch statements.

//        switch (fruit) {
//            case "mango" -> System.out.println("King of fruits.");
//            case "apple" -> System.out.println("A red sweet fruit.");
//            case "orange" -> System.out.println("A round fruit");
//            case "Grapes" -> System.out.println("Small green fruit.");
//            default -> System.out.println("Please enter a valid fruit.");
//        }

        // classic switch method
//        switch (fruit){
//            case "mango":
//                System.out.println("King of fruits.");
//                break;
//            case "apple":
//                System.out.println("A red sweet fruit.");
//                break;
//            case "orange":
//                System.out.println("A round fruit");
//                break;
//            case "Grapes":
//                System.out.println("Small green fruit.");
//                break;
//            default:
//                System.out.println("Please enter a valid fruit.");
//                break;
//        }


        // another example of modern switch case;
        System.out.println("Enter a valid input: ");
        int day = in.nextInt();
//
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//
//        }

        switch (day){
            case 1 , 2 , 3 , 4 , 5  -> System.out.println("Weekday");
            case 6 , 7 -> System.out.println("Weekend");
        }
    }
}