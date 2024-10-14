import java.util.Scanner;

public class counting_occurences {
    public static void main(String[] args) {
        // counting the same number 5 in input.
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        while ( n > 0){
            int rem = n % 10;
            if (rem == 5){
                count++;
            }
            n = n/10;
        }

        System.out.println(count);
    }
}
