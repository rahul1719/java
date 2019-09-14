import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LeftRotate {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int counter = 0;
        d = d % a.length;
        if (d > 0) {
            int[] tmp = new int[a.length];
            for (int i = d; i <= a.length - 1; i++) {
                tmp[counter] = a[i];
                counter++;
            }
            for (int i = 0; i < d; i++) {
                tmp[counter] = a[i];
                counter++;
            }
            return tmp;

        } else {
            return a;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] nd = bufferedReader.readLine().split(" ");
        int n = Integer.parseInt(nd[0]);
        int d = Integer.parseInt(nd[1]);
        int[] a = new int[n];
        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
        int[] result = rotLeft(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        bufferedReader.close();
        scanner.close();
    }
}
