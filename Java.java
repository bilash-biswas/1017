import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int a,b;
    Scanner input = new Scanner(System.in);
    a = input.nextInt();
    b = input.nextInt();
    System.out.printf("%.3f\n", a * (b / 12.0));
  }
}
