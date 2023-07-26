import java.util.Random;
import java.util.RandomAccess;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        for (int a = 1; a < 100; a++) {
          if (a % 2 == 0)
            System.out.println(a + ", ");
          continue;
        }
        byte[] par = new byte[99];
        par[0] = 2;
    }
}