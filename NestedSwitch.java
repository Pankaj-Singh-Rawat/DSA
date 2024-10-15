import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter empID and Department: ");

        int empID = in.nextInt();
        String department = in.next();

        //Modern switch
        switch (empID) {
            case 1 -> {
                System.out.println("Pankaj Singh Rawat");
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("Enter a valid department.");
                        break;
                }
            }
            case 2 -> {
                System.out.println("Mr. X");
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("Enter a valid department.");
                        break;
                }
            }
            case 3 -> {
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("Enter a valid department.");
                        break;
                }
            }
            default -> System.out.println("Enter a valid empID");
        }

//classic switch
//        switch(empID){
//            case 1:
//                System.out.println("Pankaj Singh Rawat");
//                switch(department){
//                    case "IT":
//                        System.out.println("IT department");
//                        break;
//                    case "Management":
//                        System.out.println("Management department");
//                        break;
//                    default:
//                        System.out.println("Enter a valid department.");
//                        break;
//                }
//                break;
//            case 2:
//                System.out.println("Mr. X");
//                switch(department){
//                    case "IT":
//                        System.out.println("IT department");
//                        break;
//                    case "Management":
//                        System.out.println("Management department");
//                        break;
//                    default:
//                        System.out.println("Enter a valid department.");
//                        break;
//                }
//                break;
//            case 3:
//                switch(department){
//                    case "IT":
//                        System.out.println("IT department");
//                        break;
//                    case "Management":
//                        System.out.println("Management department");
//                        break;
//                    default:
//                        System.out.println("Enter a valid department.");
//                        break;
//                }
//                break;
//            default:
//                System.out.println("Enter a valid empID");
//                break;
//        }
    }
}
