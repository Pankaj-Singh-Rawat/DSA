public class conditionals {
    public static void main(String[] args) {
//       if statement

        int salary = 15000;
        int price = 1000;
        if (salary > 18000){
            salary = salary + 2000;
        } else if(price < 2000){
            salary = salary + 1000;
        } else{
            System.out.println("Better luck next time.");
        }
        System.out.println(salary);
    }

}