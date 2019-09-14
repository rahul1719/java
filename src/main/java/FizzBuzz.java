import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FizzBuzz {

    public static void main(String[] args) throws IOException {
        /*BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input =in.readLine();
        System.out.println(input);
        */
        fizzBuzz();
    }

    private static void fizzBuzz() {
        for (int i=0;i<=100 ;i ++){
            Object number = i%3  == 0 ? (i%5 == 0 ? "Fizz Buzz" : "Fizz")  : (1%5 == 0 ? "Buzz" : i);
            System.out.println(number.toString());
        }
    }
}
