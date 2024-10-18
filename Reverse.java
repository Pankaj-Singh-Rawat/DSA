import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // enter a numer and print the reverse of that number
//        for eg : input = 5678 then output = 8765;
        int n = in.nextInt();
        int res = 0;
        while(n>0){
            int rem = n % 10; //rem = 5678 % 10 = 8
            res = res * 10 ; // res = 0 * 10
            res = res + rem; // res = 0 + rem = 8
            n = n / 10 ; // n = 5678/10 = 567
        }
        System.out.println(res);
    }
}
