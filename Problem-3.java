
import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int length = (a % 2 == 0) ? a - 1 : a;
        for (int i = 1; i <= length * 2; i += 2) {
            System.out.print(i + " ");
        }
    }
}
